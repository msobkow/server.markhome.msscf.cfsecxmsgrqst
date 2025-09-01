
// Description: Java 11 XML Message SAX Response Delete By Index Element  for SecDevice

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecXMsgRqst;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.xml.sax.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfsec.CFSecXMsg.*;

/*
 *	CFSecXMsgRqstSecDeviceRdBy XML SAX Element  implementation
 *	for SecDevice.
 */
public class CFSecXMsgRqstSecDeviceRdByNameIdx
	extends CFLibXmlCoreElementHandler
{
	public CFSecXMsgRqstSecDeviceRdByNameIdx( CFSecXMsgRqst xmsgRqst ) {
		super( xmsgRqst );
	}

	public void startElement(
		String		uri,
		String		localName,
		String		qName,
		Attributes	attrs )
	throws SAXException
	{
		CFSecXMsgSchemaMessageFormatter schemaFormatter = null;
		try {
			// Common XML Attributes
			String	attrId = null;
			String attrSecUserId = null;
			String attrDevName = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RqstSecDeviceRdByNameIdx" );

			CFSecXMsgRqst xmsgRqst = (CFSecXMsgRqst)getParser();
			if( xmsgRqst == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			schemaFormatter = xmsgRqst.getSchemaMessageFormatter();

			ICFSecSchemaObj schemaObj = xmsgRqst.getSchemaObj();
			if( schemaObj == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getSchemaObj()" );
			}

			// Extract Attributes
			numAttrs = attrs.getLength();
			for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
				attrLocalName = attrs.getLocalName( idxAttr );
				if( attrLocalName.equals( "Id" ) ) {
					if( attrId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "SecUserId" ) ) {
					if( attrSecUserId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecUserId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "DevName" ) ) {
					if( attrDevName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDevName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else {
					throw new CFLibUnrecognizedAttributeException( getClass(),
						S_ProcName,
						getParser().getLocationInfo(),
						attrLocalName );
				}
			}

			// Ensure that required attributes have values
			if( ( attrSecUserId == null ) || ( attrSecUserId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SecUserId" );
			}
			if( attrDevName == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"DevName" );
			}

			// Save named attributes to context
			CFLibXmlCoreContext curContext = getParser().getCurContext();
			// Convert string attributes to native Java types
			// and apply the converted attributes to the editBuff.

			UUID natSecUserId;
			if( ( attrSecUserId == null ) || ( attrSecUserId.length() <= 0 ) ) {
				natSecUserId = null;
			}
			else {
				natSecUserId = UUID.fromString( attrSecUserId );
			}

			String natDevName;
			natDevName = attrDevName;

			// Read the object
			ICFSecSecDeviceObj read = ((ICFSecSecDeviceObj)schemaObj.getSecDeviceTableObj().readSecDeviceByNameIdx( natSecUserId,
				natDevName,
				true ));
			if( read != null ) {
				String response = schemaFormatter.formatRspnXmlPreamble() + "\n"
					+	"\t" + CFSecXMsgSecDeviceMessageFormatter.formatSecDeviceRspnSingleOpenTag()
					+	CFSecXMsgSecDeviceMessageFormatter.formatSecDeviceRspnDerivedRec( "\n\t\t", read.getSecDeviceBuff() ) + "\n"
					+	"\t" + CFSecXMsgSecDeviceMessageFormatter.formatSecDeviceRspnSingleCloseTag()
					+	schemaFormatter.formatRspnXmlPostamble();
				((CFSecXMsgRqst)getParser()).appendResponse( response );
			}
			else {
				String response = schemaFormatter.formatRspnXmlPreamble() + "\n"
					+	"\t" + CFSecXMsgSchemaMessageFormatter.formatRspnNoDataFound() + "\n"
					+	schemaFormatter.formatRspnXmlPostamble();
				xmsgRqst.appendResponse( response );
			}
		}
		catch( RuntimeException e ) {
			CFSecXMsgRqst xmsgRqst = ((CFSecXMsgRqst)getParser());
			schemaFormatter = xmsgRqst.getSchemaMessageFormatter();
			String response = schemaFormatter.formatRspnXmlPreamble() + "\n"
				+	"\t" + CFSecXMsgSchemaMessageFormatter.formatRspnException( "\n\t\t\t", e )
				+	"\n"
				+	schemaFormatter.formatRspnXmlPostamble();
			xmsgRqst.resetResponse();
			xmsgRqst.appendResponse( response );
			xmsgRqst.setCaughtException( true );
		}
		catch( Error e ) {
			CFSecXMsgRqst xmsgRqst = ((CFSecXMsgRqst)getParser());
			schemaFormatter = xmsgRqst.getSchemaMessageFormatter();
			String response = schemaFormatter.formatRspnXmlPreamble() + "\n"
				+	"\t" + CFSecXMsgSchemaMessageFormatter.formatRspnException( "\n\t\t\t", e )
				+	"\n"
				+	schemaFormatter.formatRspnXmlPostamble();
			xmsgRqst.resetResponse();
			xmsgRqst.appendResponse( response );
			xmsgRqst.setCaughtException( true );
		}
	}

	public void endElement(
		String		uri,
		String		localName,
		String		qName )
	throws SAXException
	{
	}
}
