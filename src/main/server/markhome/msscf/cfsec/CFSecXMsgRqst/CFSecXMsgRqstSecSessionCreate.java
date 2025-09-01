
// Description: Java 11 XML Message SAX Response Record Element  for SecSession

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
 *	CFSecXMsgRqstSecSessionCreate XML SAX Element  implementation
 *	for SecSession.
 */
public class CFSecXMsgRqstSecSessionCreate
	extends CFLibXmlCoreElementHandler
{
	public CFSecXMsgRqstSecSessionCreate( CFSecXMsgRqst xmsgRqst ) {
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
			String	attrRevision = null;
			// SecSession Attributes
			String	attrSecSessionId = null;
			String	attrSecUserId = null;
			String	attrSecDevName = null;
			String	attrStart = null;
			String	attrFinish = null;
			String	attrSecProxyId = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RqstSecSessionCreate" );

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

			// Instantiate an edit buffer for the parsed information
			ICFSecSecSessionEditObj editBuff = (ICFSecSecSessionEditObj)schemaObj.getSecSessionTableObj().newInstance().beginEdit();
			CFSecSecSessionBuff dataBuff = (CFSecSecSessionBuff)editBuff.getSecSessionBuff();
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
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else if( attrLocalName.equals( "Revision" ) ) {
					if( attrRevision != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrRevision = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "SecSessionId" ) ) {
					if( attrSecSessionId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecSessionId = attrs.getValue( idxAttr );
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
				else if( attrLocalName.equals( "SecDevName" ) ) {
					if( attrSecDevName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecDevName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Start" ) ) {
					if( attrStart != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrStart = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Finish" ) ) {
					if( attrFinish != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrFinish = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "SecProxyId" ) ) {
					if( attrSecProxyId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecProxyId = attrs.getValue( idxAttr );
				}
				else {
					throw new CFLibUnrecognizedAttributeException( getClass(),
						S_ProcName,
						getParser().getLocationInfo(),
						attrLocalName );
				}
			}

			// Ensure that required attributes have values
			if( ( attrSecSessionId == null ) || ( attrSecSessionId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SecSessionId" );
			}
			if( ( attrSecUserId == null ) || ( attrSecUserId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SecUserId" );
			}
			if( ( attrStart == null ) || ( attrStart.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Start" );
			}

			// Save named attributes to context
			CFLibXmlCoreContext curContext = getParser().getCurContext();

			// Convert string attributes to native Java types
			// and apply the converted attributes to the editBuff.
			UUID natSecUserId = UUID.fromString( attrSecUserId );

			dataBuff.setRequiredSecUserId( natSecUserId );

			String natSecDevName = attrSecDevName;

			dataBuff.setOptionalSecDevName( natSecDevName );

			Calendar natStart;
			try {
				natStart = CFLibXmlUtil.parseTimestamp( attrStart );
			}
			catch( RuntimeException e ) {
				throw new CFLibInvalidArgumentException( getClass(),
					S_ProcName,
					0,
					"Start",
					attrStart,
					e );
			}

			dataBuff.setRequiredStart( natStart );

			Calendar natFinish;
			if( ( attrFinish == null ) || ( attrFinish.length() <= 0 ) ) {
				natFinish = null;
			}
			else {
				try {
					natFinish = CFLibXmlUtil.parseTimestamp( attrFinish );
				}
				catch( RuntimeException e ) {
					throw new CFLibInvalidArgumentException( getClass(),
						S_ProcName,
						0,
						"Finish",
						attrFinish,
						e );
				}
			}

			dataBuff.setOptionalFinish( natFinish );

			UUID natSecProxyId;
			if( ( attrSecProxyId == null ) || ( attrSecProxyId.length() <= 0 ) ) {
				natSecProxyId = null;
			}
			else {
				natSecProxyId = UUID.fromString( attrSecProxyId );
			}

			dataBuff.setOptionalSecProxyId( natSecProxyId );

			//	Attempt the create
			editBuff.copyBuffToPKey();	// Allow for predefined ids
			ICFSecSecSessionObj created = (ICFSecSecSessionObj)editBuff.create();
			editBuff = null;
			String response = schemaFormatter.formatRspnXmlPreamble() + "\n"
				+	"\t" + CFSecXMsgSecSessionMessageFormatter.formatSecSessionRspnCreated( "\n\t\t\t", created.getSecSessionBuff() )
				+	"\n"
				+	schemaFormatter.formatRspnXmlPostamble();
			((CFSecXMsgRqst)getParser()).appendResponse( response );
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
