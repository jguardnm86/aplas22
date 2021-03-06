/*
 * XML Type:  CT_StrokeChild
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTStrokeChild
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_StrokeChild(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTStrokeChildImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CTStrokeChild {
    private static final long serialVersionUID = 1L;

    public CTStrokeChildImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "ext"),
        new QName("", "on"),
        new QName("", "weight"),
        new QName("", "color"),
        new QName("", "color2"),
        new QName("", "opacity"),
        new QName("", "linestyle"),
        new QName("", "miterlimit"),
        new QName("", "joinstyle"),
        new QName("", "endcap"),
        new QName("", "dashstyle"),
        new QName("", "insetpen"),
        new QName("", "filltype"),
        new QName("", "src"),
        new QName("", "imageaspect"),
        new QName("", "imagesize"),
        new QName("", "imagealignshape"),
        new QName("", "startarrow"),
        new QName("", "startarrowwidth"),
        new QName("", "startarrowlength"),
        new QName("", "endarrow"),
        new QName("", "endarrowwidth"),
        new QName("", "endarrowlength"),
        new QName("urn:schemas-microsoft-com:office:office", "href"),
        new QName("urn:schemas-microsoft-com:office:office", "althref"),
        new QName("urn:schemas-microsoft-com:office:office", "title"),
        new QName("urn:schemas-microsoft-com:office:office", "forcedash"),
    };


    /**
     * Gets the "ext" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STExt.Enum getExt() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STExt.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "ext" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STExt xgetExt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STExt target = null;
            target = (com.microsoft.schemas.vml.STExt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "ext" attribute
     */
    @Override
    public boolean isSetExt() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "ext" attribute
     */
    @Override
    public void setExt(com.microsoft.schemas.vml.STExt.Enum ext) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(ext);
        }
    }

    /**
     * Sets (as xml) the "ext" attribute
     */
    @Override
    public void xsetExt(com.microsoft.schemas.vml.STExt ext) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STExt target = null;
            target = (com.microsoft.schemas.vml.STExt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STExt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(ext);
        }
    }

    /**
     * Unsets the "ext" attribute
     */
    @Override
    public void unsetExt() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "on" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOn() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "on" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOn() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "on" attribute
     */
    @Override
    public boolean isSetOn() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "on" attribute
     */
    @Override
    public void setOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum on) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(on);
        }
    }

    /**
     * Sets (as xml) the "on" attribute
     */
    @Override
    public void xsetOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse on) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(on);
        }
    }

    /**
     * Unsets the "on" attribute
     */
    @Override
    public void unsetOn() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "weight" attribute
     */
    @Override
    public java.lang.String getWeight() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "weight" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetWeight() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "weight" attribute
     */
    @Override
    public boolean isSetWeight() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "weight" attribute
     */
    @Override
    public void setWeight(java.lang.String weight) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(weight);
        }
    }

    /**
     * Sets (as xml) the "weight" attribute
     */
    @Override
    public void xsetWeight(org.apache.xmlbeans.XmlString weight) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(weight);
        }
    }

    /**
     * Unsets the "weight" attribute
     */
    @Override
    public void unsetWeight() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "color" attribute
     */
    @Override
    public java.lang.String getColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "color" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "color" attribute
     */
    @Override
    public boolean isSetColor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "color" attribute
     */
    @Override
    public void setColor(java.lang.String color) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(color);
        }
    }

    /**
     * Sets (as xml) the "color" attribute
     */
    @Override
    public void xsetColor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType color) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(color);
        }
    }

    /**
     * Unsets the "color" attribute
     */
    @Override
    public void unsetColor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "color2" attribute
     */
    @Override
    public java.lang.String getColor2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "color2" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetColor2() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "color2" attribute
     */
    @Override
    public boolean isSetColor2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "color2" attribute
     */
    @Override
    public void setColor2(java.lang.String color2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(color2);
        }
    }

    /**
     * Sets (as xml) the "color2" attribute
     */
    @Override
    public void xsetColor2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType color2) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(color2);
        }
    }

    /**
     * Unsets the "color2" attribute
     */
    @Override
    public void unsetColor2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "opacity" attribute
     */
    @Override
    public java.lang.String getOpacity() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "opacity" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetOpacity() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "opacity" attribute
     */
    @Override
    public boolean isSetOpacity() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "opacity" attribute
     */
    @Override
    public void setOpacity(java.lang.String opacity) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(opacity);
        }
    }

    /**
     * Sets (as xml) the "opacity" attribute
     */
    @Override
    public void xsetOpacity(org.apache.xmlbeans.XmlString opacity) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(opacity);
        }
    }

    /**
     * Unsets the "opacity" attribute
     */
    @Override
    public void unsetOpacity() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "linestyle" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeLineStyle.Enum getLinestyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STStrokeLineStyle.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "linestyle" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeLineStyle xgetLinestyle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeLineStyle target = null;
            target = (com.microsoft.schemas.vml.STStrokeLineStyle)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "linestyle" attribute
     */
    @Override
    public boolean isSetLinestyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "linestyle" attribute
     */
    @Override
    public void setLinestyle(com.microsoft.schemas.vml.STStrokeLineStyle.Enum linestyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setEnumValue(linestyle);
        }
    }

    /**
     * Sets (as xml) the "linestyle" attribute
     */
    @Override
    public void xsetLinestyle(com.microsoft.schemas.vml.STStrokeLineStyle linestyle) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeLineStyle target = null;
            target = (com.microsoft.schemas.vml.STStrokeLineStyle)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STStrokeLineStyle)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(linestyle);
        }
    }

    /**
     * Unsets the "linestyle" attribute
     */
    @Override
    public void unsetLinestyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "miterlimit" attribute
     */
    @Override
    public java.math.BigDecimal getMiterlimit() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getBigDecimalValue();
        }
    }

    /**
     * Gets (as xml) the "miterlimit" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDecimal xgetMiterlimit() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "miterlimit" attribute
     */
    @Override
    public boolean isSetMiterlimit() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "miterlimit" attribute
     */
    @Override
    public void setMiterlimit(java.math.BigDecimal miterlimit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setBigDecimalValue(miterlimit);
        }
    }

    /**
     * Sets (as xml) the "miterlimit" attribute
     */
    @Override
    public void xsetMiterlimit(org.apache.xmlbeans.XmlDecimal miterlimit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(miterlimit);
        }
    }

    /**
     * Unsets the "miterlimit" attribute
     */
    @Override
    public void unsetMiterlimit() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "joinstyle" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeJoinStyle.Enum getJoinstyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STStrokeJoinStyle.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "joinstyle" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeJoinStyle xgetJoinstyle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeJoinStyle target = null;
            target = (com.microsoft.schemas.vml.STStrokeJoinStyle)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "joinstyle" attribute
     */
    @Override
    public boolean isSetJoinstyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "joinstyle" attribute
     */
    @Override
    public void setJoinstyle(com.microsoft.schemas.vml.STStrokeJoinStyle.Enum joinstyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setEnumValue(joinstyle);
        }
    }

    /**
     * Sets (as xml) the "joinstyle" attribute
     */
    @Override
    public void xsetJoinstyle(com.microsoft.schemas.vml.STStrokeJoinStyle joinstyle) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeJoinStyle target = null;
            target = (com.microsoft.schemas.vml.STStrokeJoinStyle)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STStrokeJoinStyle)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(joinstyle);
        }
    }

    /**
     * Unsets the "joinstyle" attribute
     */
    @Override
    public void unsetJoinstyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "endcap" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeEndCap.Enum getEndcap() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STStrokeEndCap.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "endcap" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeEndCap xgetEndcap() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeEndCap target = null;
            target = (com.microsoft.schemas.vml.STStrokeEndCap)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "endcap" attribute
     */
    @Override
    public boolean isSetEndcap() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "endcap" attribute
     */
    @Override
    public void setEndcap(com.microsoft.schemas.vml.STStrokeEndCap.Enum endcap) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setEnumValue(endcap);
        }
    }

    /**
     * Sets (as xml) the "endcap" attribute
     */
    @Override
    public void xsetEndcap(com.microsoft.schemas.vml.STStrokeEndCap endcap) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeEndCap target = null;
            target = (com.microsoft.schemas.vml.STStrokeEndCap)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STStrokeEndCap)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(endcap);
        }
    }

    /**
     * Unsets the "endcap" attribute
     */
    @Override
    public void unsetEndcap() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "dashstyle" attribute
     */
    @Override
    public java.lang.String getDashstyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "dashstyle" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDashstyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "dashstyle" attribute
     */
    @Override
    public boolean isSetDashstyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "dashstyle" attribute
     */
    @Override
    public void setDashstyle(java.lang.String dashstyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setStringValue(dashstyle);
        }
    }

    /**
     * Sets (as xml) the "dashstyle" attribute
     */
    @Override
    public void xsetDashstyle(org.apache.xmlbeans.XmlString dashstyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(dashstyle);
        }
    }

    /**
     * Unsets the "dashstyle" attribute
     */
    @Override
    public void unsetDashstyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "insetpen" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getInsetpen() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "insetpen" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetInsetpen() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "insetpen" attribute
     */
    @Override
    public boolean isSetInsetpen() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "insetpen" attribute
     */
    @Override
    public void setInsetpen(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum insetpen) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setEnumValue(insetpen);
        }
    }

    /**
     * Sets (as xml) the "insetpen" attribute
     */
    @Override
    public void xsetInsetpen(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse insetpen) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(insetpen);
        }
    }

    /**
     * Unsets the "insetpen" attribute
     */
    @Override
    public void unsetInsetpen() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "filltype" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STFillType.Enum getFilltype() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STFillType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "filltype" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STFillType xgetFilltype() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STFillType target = null;
            target = (com.microsoft.schemas.vml.STFillType)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "filltype" attribute
     */
    @Override
    public boolean isSetFilltype() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "filltype" attribute
     */
    @Override
    public void setFilltype(com.microsoft.schemas.vml.STFillType.Enum filltype) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setEnumValue(filltype);
        }
    }

    /**
     * Sets (as xml) the "filltype" attribute
     */
    @Override
    public void xsetFilltype(com.microsoft.schemas.vml.STFillType filltype) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STFillType target = null;
            target = (com.microsoft.schemas.vml.STFillType)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STFillType)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(filltype);
        }
    }

    /**
     * Unsets the "filltype" attribute
     */
    @Override
    public void unsetFilltype() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "src" attribute
     */
    @Override
    public java.lang.String getSrc() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "src" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSrc() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "src" attribute
     */
    @Override
    public boolean isSetSrc() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "src" attribute
     */
    @Override
    public void setSrc(java.lang.String src) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setStringValue(src);
        }
    }

    /**
     * Sets (as xml) the "src" attribute
     */
    @Override
    public void xsetSrc(org.apache.xmlbeans.XmlString src) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(src);
        }
    }

    /**
     * Unsets the "src" attribute
     */
    @Override
    public void unsetSrc() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "imageaspect" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STImageAspect.Enum getImageaspect() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STImageAspect.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "imageaspect" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STImageAspect xgetImageaspect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STImageAspect target = null;
            target = (com.microsoft.schemas.vml.STImageAspect)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "imageaspect" attribute
     */
    @Override
    public boolean isSetImageaspect() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "imageaspect" attribute
     */
    @Override
    public void setImageaspect(com.microsoft.schemas.vml.STImageAspect.Enum imageaspect) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setEnumValue(imageaspect);
        }
    }

    /**
     * Sets (as xml) the "imageaspect" attribute
     */
    @Override
    public void xsetImageaspect(com.microsoft.schemas.vml.STImageAspect imageaspect) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STImageAspect target = null;
            target = (com.microsoft.schemas.vml.STImageAspect)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STImageAspect)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(imageaspect);
        }
    }

    /**
     * Unsets the "imageaspect" attribute
     */
    @Override
    public void unsetImageaspect() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Gets the "imagesize" attribute
     */
    @Override
    public java.lang.String getImagesize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "imagesize" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetImagesize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * True if has "imagesize" attribute
     */
    @Override
    public boolean isSetImagesize() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
        }
    }

    /**
     * Sets the "imagesize" attribute
     */
    @Override
    public void setImagesize(java.lang.String imagesize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.setStringValue(imagesize);
        }
    }

    /**
     * Sets (as xml) the "imagesize" attribute
     */
    @Override
    public void xsetImagesize(org.apache.xmlbeans.XmlString imagesize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.set(imagesize);
        }
    }

    /**
     * Unsets the "imagesize" attribute
     */
    @Override
    public void unsetImagesize() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Gets the "imagealignshape" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getImagealignshape() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "imagealignshape" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetImagealignshape() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * True if has "imagealignshape" attribute
     */
    @Override
    public boolean isSetImagealignshape() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[16]) != null;
        }
    }

    /**
     * Sets the "imagealignshape" attribute
     */
    @Override
    public void setImagealignshape(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum imagealignshape) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.setEnumValue(imagealignshape);
        }
    }

    /**
     * Sets (as xml) the "imagealignshape" attribute
     */
    @Override
    public void xsetImagealignshape(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse imagealignshape) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.set(imagealignshape);
        }
    }

    /**
     * Unsets the "imagealignshape" attribute
     */
    @Override
    public void unsetImagealignshape() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Gets the "startarrow" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowType.Enum getStartarrow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STStrokeArrowType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "startarrow" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowType xgetStartarrow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowType target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowType)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * True if has "startarrow" attribute
     */
    @Override
    public boolean isSetStartarrow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[17]) != null;
        }
    }

    /**
     * Sets the "startarrow" attribute
     */
    @Override
    public void setStartarrow(com.microsoft.schemas.vml.STStrokeArrowType.Enum startarrow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.setEnumValue(startarrow);
        }
    }

    /**
     * Sets (as xml) the "startarrow" attribute
     */
    @Override
    public void xsetStartarrow(com.microsoft.schemas.vml.STStrokeArrowType startarrow) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowType target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowType)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STStrokeArrowType)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.set(startarrow);
        }
    }

    /**
     * Unsets the "startarrow" attribute
     */
    @Override
    public void unsetStartarrow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Gets the "startarrowwidth" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowWidth.Enum getStartarrowwidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STStrokeArrowWidth.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "startarrowwidth" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowWidth xgetStartarrowwidth() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowWidth target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowWidth)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * True if has "startarrowwidth" attribute
     */
    @Override
    public boolean isSetStartarrowwidth() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[18]) != null;
        }
    }

    /**
     * Sets the "startarrowwidth" attribute
     */
    @Override
    public void setStartarrowwidth(com.microsoft.schemas.vml.STStrokeArrowWidth.Enum startarrowwidth) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[18]);
            }
            target.setEnumValue(startarrowwidth);
        }
    }

    /**
     * Sets (as xml) the "startarrowwidth" attribute
     */
    @Override
    public void xsetStartarrowwidth(com.microsoft.schemas.vml.STStrokeArrowWidth startarrowwidth) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowWidth target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowWidth)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STStrokeArrowWidth)get_store().add_attribute_user(PROPERTY_QNAME[18]);
            }
            target.set(startarrowwidth);
        }
    }

    /**
     * Unsets the "startarrowwidth" attribute
     */
    @Override
    public void unsetStartarrowwidth() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[18]);
        }
    }

    /**
     * Gets the "startarrowlength" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowLength.Enum getStartarrowlength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[19]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STStrokeArrowLength.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "startarrowlength" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowLength xgetStartarrowlength() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowLength target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowLength)get_store().find_attribute_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * True if has "startarrowlength" attribute
     */
    @Override
    public boolean isSetStartarrowlength() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[19]) != null;
        }
    }

    /**
     * Sets the "startarrowlength" attribute
     */
    @Override
    public void setStartarrowlength(com.microsoft.schemas.vml.STStrokeArrowLength.Enum startarrowlength) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[19]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[19]);
            }
            target.setEnumValue(startarrowlength);
        }
    }

    /**
     * Sets (as xml) the "startarrowlength" attribute
     */
    @Override
    public void xsetStartarrowlength(com.microsoft.schemas.vml.STStrokeArrowLength startarrowlength) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowLength target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowLength)get_store().find_attribute_user(PROPERTY_QNAME[19]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STStrokeArrowLength)get_store().add_attribute_user(PROPERTY_QNAME[19]);
            }
            target.set(startarrowlength);
        }
    }

    /**
     * Unsets the "startarrowlength" attribute
     */
    @Override
    public void unsetStartarrowlength() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[19]);
        }
    }

    /**
     * Gets the "endarrow" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowType.Enum getEndarrow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STStrokeArrowType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "endarrow" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowType xgetEndarrow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowType target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowType)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * True if has "endarrow" attribute
     */
    @Override
    public boolean isSetEndarrow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[20]) != null;
        }
    }

    /**
     * Sets the "endarrow" attribute
     */
    @Override
    public void setEndarrow(com.microsoft.schemas.vml.STStrokeArrowType.Enum endarrow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[20]);
            }
            target.setEnumValue(endarrow);
        }
    }

    /**
     * Sets (as xml) the "endarrow" attribute
     */
    @Override
    public void xsetEndarrow(com.microsoft.schemas.vml.STStrokeArrowType endarrow) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowType target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowType)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STStrokeArrowType)get_store().add_attribute_user(PROPERTY_QNAME[20]);
            }
            target.set(endarrow);
        }
    }

    /**
     * Unsets the "endarrow" attribute
     */
    @Override
    public void unsetEndarrow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[20]);
        }
    }

    /**
     * Gets the "endarrowwidth" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowWidth.Enum getEndarrowwidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STStrokeArrowWidth.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "endarrowwidth" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowWidth xgetEndarrowwidth() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowWidth target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowWidth)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            return target;
        }
    }

    /**
     * True if has "endarrowwidth" attribute
     */
    @Override
    public boolean isSetEndarrowwidth() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[21]) != null;
        }
    }

    /**
     * Sets the "endarrowwidth" attribute
     */
    @Override
    public void setEndarrowwidth(com.microsoft.schemas.vml.STStrokeArrowWidth.Enum endarrowwidth) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[21]);
            }
            target.setEnumValue(endarrowwidth);
        }
    }

    /**
     * Sets (as xml) the "endarrowwidth" attribute
     */
    @Override
    public void xsetEndarrowwidth(com.microsoft.schemas.vml.STStrokeArrowWidth endarrowwidth) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowWidth target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowWidth)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STStrokeArrowWidth)get_store().add_attribute_user(PROPERTY_QNAME[21]);
            }
            target.set(endarrowwidth);
        }
    }

    /**
     * Unsets the "endarrowwidth" attribute
     */
    @Override
    public void unsetEndarrowwidth() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[21]);
        }
    }

    /**
     * Gets the "endarrowlength" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowLength.Enum getEndarrowlength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[22]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STStrokeArrowLength.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "endarrowlength" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STStrokeArrowLength xgetEndarrowlength() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowLength target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowLength)get_store().find_attribute_user(PROPERTY_QNAME[22]);
            return target;
        }
    }

    /**
     * True if has "endarrowlength" attribute
     */
    @Override
    public boolean isSetEndarrowlength() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[22]) != null;
        }
    }

    /**
     * Sets the "endarrowlength" attribute
     */
    @Override
    public void setEndarrowlength(com.microsoft.schemas.vml.STStrokeArrowLength.Enum endarrowlength) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[22]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[22]);
            }
            target.setEnumValue(endarrowlength);
        }
    }

    /**
     * Sets (as xml) the "endarrowlength" attribute
     */
    @Override
    public void xsetEndarrowlength(com.microsoft.schemas.vml.STStrokeArrowLength endarrowlength) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STStrokeArrowLength target = null;
            target = (com.microsoft.schemas.vml.STStrokeArrowLength)get_store().find_attribute_user(PROPERTY_QNAME[22]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STStrokeArrowLength)get_store().add_attribute_user(PROPERTY_QNAME[22]);
            }
            target.set(endarrowlength);
        }
    }

    /**
     * Unsets the "endarrowlength" attribute
     */
    @Override
    public void unsetEndarrowlength() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[22]);
        }
    }

    /**
     * Gets the "href" attribute
     */
    @Override
    public java.lang.String getHref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[23]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "href" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetHref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[23]);
            return target;
        }
    }

    /**
     * True if has "href" attribute
     */
    @Override
    public boolean isSetHref() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[23]) != null;
        }
    }

    /**
     * Sets the "href" attribute
     */
    @Override
    public void setHref(java.lang.String href) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[23]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[23]);
            }
            target.setStringValue(href);
        }
    }

    /**
     * Sets (as xml) the "href" attribute
     */
    @Override
    public void xsetHref(org.apache.xmlbeans.XmlString href) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[23]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[23]);
            }
            target.set(href);
        }
    }

    /**
     * Unsets the "href" attribute
     */
    @Override
    public void unsetHref() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[23]);
        }
    }

    /**
     * Gets the "althref" attribute
     */
    @Override
    public java.lang.String getAlthref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[24]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "althref" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAlthref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[24]);
            return target;
        }
    }

    /**
     * True if has "althref" attribute
     */
    @Override
    public boolean isSetAlthref() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[24]) != null;
        }
    }

    /**
     * Sets the "althref" attribute
     */
    @Override
    public void setAlthref(java.lang.String althref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[24]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[24]);
            }
            target.setStringValue(althref);
        }
    }

    /**
     * Sets (as xml) the "althref" attribute
     */
    @Override
    public void xsetAlthref(org.apache.xmlbeans.XmlString althref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[24]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[24]);
            }
            target.set(althref);
        }
    }

    /**
     * Unsets the "althref" attribute
     */
    @Override
    public void unsetAlthref() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[24]);
        }
    }

    /**
     * Gets the "title" attribute
     */
    @Override
    public java.lang.String getTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[25]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "title" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[25]);
            return target;
        }
    }

    /**
     * True if has "title" attribute
     */
    @Override
    public boolean isSetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[25]) != null;
        }
    }

    /**
     * Sets the "title" attribute
     */
    @Override
    public void setTitle(java.lang.String title) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[25]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[25]);
            }
            target.setStringValue(title);
        }
    }

    /**
     * Sets (as xml) the "title" attribute
     */
    @Override
    public void xsetTitle(org.apache.xmlbeans.XmlString title) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[25]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[25]);
            }
            target.set(title);
        }
    }

    /**
     * Unsets the "title" attribute
     */
    @Override
    public void unsetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[25]);
        }
    }

    /**
     * Gets the "forcedash" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getForcedash() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "forcedash" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetForcedash() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            return target;
        }
    }

    /**
     * True if has "forcedash" attribute
     */
    @Override
    public boolean isSetForcedash() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[26]) != null;
        }
    }

    /**
     * Sets the "forcedash" attribute
     */
    @Override
    public void setForcedash(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum forcedash) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[26]);
            }
            target.setEnumValue(forcedash);
        }
    }

    /**
     * Sets (as xml) the "forcedash" attribute
     */
    @Override
    public void xsetForcedash(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse forcedash) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[26]);
            }
            target.set(forcedash);
        }
    }

    /**
     * Unsets the "forcedash" attribute
     */
    @Override
    public void unsetForcedash() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[26]);
        }
    }
}
