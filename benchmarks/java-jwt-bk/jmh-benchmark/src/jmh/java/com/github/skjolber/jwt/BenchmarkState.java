package com.github.skjolber.jwt;

import com.auth0.jwt.Auth0TokenVerifier;
import com.github.skjolber.bench.fusionauth.FusionAuthJsonWebTokenVerifier;
import com.github.skjolber.bench.jjwt.JavaJsonWebTokenVerifier;
import com.github.skjolber.bench.nimbus.NimbusJsonWebTokenVerifier;
import com.github.skjolber.bench.okta.OktaJsonWebTokenVerifier;
import com.github.skjolber.bench.utils.JsonWebTokenGenerator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.security.Provider;
import java.security.Security;
import java.util.HashMap;
import java.util.Map;

@State(Scope.Thread)
public class BenchmarkState {
    static {
        ProviderSetup.setup();
    }

    private String token;

    private FusionAuthJsonWebTokenVerifier fusionAuthJsonWebTokenVerifier;
    private OktaJsonWebTokenVerifier oktaJsonWebTokenVerifier;
    private JavaJsonWebTokenVerifier javaJsonWebTokenVerifier;
    private Auth0TokenVerifier auth0TokenVerifier;
    private NimbusJsonWebTokenVerifier nimbusTokenVerifier;

    @Setup(Level.Trial)
    public void init() throws Exception {
        for (final Provider provider : Security.getProviders()) {
            JsonWebTokenGenerator generator = new JsonWebTokenGenerator();

            Map<String, Object> map = new HashMap<>();
            map.put("test", "value");

            String issuer = "https://test";
            String audience = "https://audience";

            token = generator.createJsonWebToken(map, issuer, audience);

            oktaJsonWebTokenVerifier = new OktaJsonWebTokenVerifier(generator.getKeyPair(), issuer, audience);

            fusionAuthJsonWebTokenVerifier = new FusionAuthJsonWebTokenVerifier(generator.getKeyPair(), issuer, audience);
            javaJsonWebTokenVerifier = new JavaJsonWebTokenVerifier(generator.getKeyPair(), issuer, audience);
            auth0TokenVerifier = new Auth0TokenVerifier(generator.getKeyPair(), issuer, audience);
            nimbusTokenVerifier = new NimbusJsonWebTokenVerifier(generator.getKeyPair(), issuer, audience);
        }
    }

    public Auth0TokenVerifier getAuth0TokenVerifier() {
        return auth0TokenVerifier;
    }

    public JavaJsonWebTokenVerifier getJavaJsonWebTokenVerifier() {
        return javaJsonWebTokenVerifier;
    }

    public OktaJsonWebTokenVerifier getOktaJsonWebTokenVerifier() {
        return oktaJsonWebTokenVerifier;
    }

    public FusionAuthJsonWebTokenVerifier getFusionAuthJsonWebTokenVerifier() {
        return fusionAuthJsonWebTokenVerifier;
    }

    public String getToken() {
        return token;
    }

    public NimbusJsonWebTokenVerifier getNimbusTokenVerifier() {
        return nimbusTokenVerifier;
    }
}
