
// Description: Java 11 XML Message SAX Response Delete By Index Element  for TSecGrpInc

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
 *	CFSecXMsgRqstTSecGrpIncPageBy XML SAX Element  implementation
 *	for TSecGrpInc.
 */
public class CFSecXMsgRqstTSecGrpIncPageByIncludeIdx
	extends CFLibXmlCoreElementHandler
{
	public CFSecXMsgRqstTSecGrpIncPageByIncludeIdx( CFSecXMsgRqst xmsgRqst ) {
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
			String attrTenantId = null;
			String attrIncludeGroupId = null;
			String attrPriorTenantId = null;
			String attrPriorTSecGrpIncId = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RqstTSecGrpIncPageByIncludeIdx" );

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
				else if( attrLocalName.equals( "TenantId" ) ) {
					if( attrTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IncludeGroupId" ) ) {
					if( attrIncludeGroupId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIncludeGroupId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PriorTenantId" ) ) {
					if( attrPriorTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPriorTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PriorTSecGrpIncId" ) ) {
					if( attrPriorTSecGrpIncId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPriorTSecGrpIncId = attrs.getValue( idxAttr );
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
			if( ( attrTenantId == null ) || ( attrTenantId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"TenantId" );
			}
			if( ( attrIncludeGroupId == null ) || ( attrIncludeGroupId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IncludeGroupId" );
			}

			// Save named attributes to context
			CFLibXmlCoreContext curContext = getParser().getCurContext();
			// Convert string attributes to native Java types
			// and apply the converted attributes to the editBuff.

			long natTenantId;
			natTenantId = Long.parseLong( attrTenantId );

			int natIncludeGroupId;
			natIncludeGroupId = Integer.parseInt( attrIncludeGroupId );

			Long natPriorTenantId;
			if( ( attrPriorTenantId == null ) || ( attrPriorTenantId.length() <= 0 ) ) {
				natPriorTenantId = null;
			}
			else {
				natPriorTenantId = Long.valueOf( Long.parseLong( attrPriorTenantId ) );
			}

			Long natPriorTSecGrpIncId;
			if( ( attrPriorTSecGrpIncId == null ) || ( attrPriorTSecGrpIncId.length() <= 0 ) ) {
				natPriorTSecGrpIncId = null;
			}
			else {
				natPriorTSecGrpIncId = Long.valueOf( Long.parseLong( attrPriorTSecGrpIncId ) );
			}

			// Page the objects
			List<ICFSecTSecGrpIncObj> list = schemaObj.getTSecGrpIncTableObj().pageTSecGrpIncByIncludeIdx( natTenantId,
				natIncludeGroupId,
				natPriorTenantId,
				natPriorTSecGrpIncId );
			String responseOpening = schemaFormatter.formatRspnXmlPreamble() + "\n"
				+	"\t" + CFSecXMsgTSecGrpIncMessageFormatter.formatTSecGrpIncRspnListOpenTag();
			xmsgRqst.appendResponse( responseOpening );
			Iterator<ICFSecTSecGrpIncObj> iter = list.iterator();
			ICFSecTSecGrpIncObj cur;
			String subxml;
			while( iter.hasNext() ) {
				cur = iter.next();
				subxml = CFSecXMsgTSecGrpIncMessageFormatter.formatTSecGrpIncRspnDerivedRec( "\n\t\t", cur.getTSecGrpIncBuff() );
				xmsgRqst.appendResponse( subxml );
			}
			String responseClosing =
				 	"\n"
				+	"\t" + CFSecXMsgTSecGrpIncMessageFormatter.formatTSecGrpIncRspnListCloseTag()
				+	schemaFormatter.formatRspnXmlPostamble();
			xmsgRqst.appendResponse( responseClosing );
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
