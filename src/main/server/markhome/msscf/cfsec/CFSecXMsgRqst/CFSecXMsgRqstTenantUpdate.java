
// Description: Java 11 XML Message SAX Response Record Element  for Tenant

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
 *	CFSecXMsgRqstTenantUpdate XML SAX Element  implementation
 *	for Tenant.
 */
public class CFSecXMsgRqstTenantUpdate
	extends CFLibXmlCoreElementHandler
{
	public CFSecXMsgRqstTenantUpdate( CFSecXMsgRqst xmsgRqst ) {
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
			// Tenant Attributes
			String	attrClusterId = null;
			String	attrTenantName = null;
			String attrCreatedAt = null;
			String attrCreatedBy = null;
			String attrUpdatedAt = null;
			String attrUpdatedBy = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RqstTenantUpdate" );

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
				else if( attrLocalName.equals( "Revision" ) ) {
					if( attrRevision != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrRevision = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CreatedAt" ) ) {
					if( attrCreatedAt != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCreatedAt = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CreatedBy" ) ) {
					if( attrCreatedBy != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCreatedBy = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "UpdatedAt" ) ) {
					if( attrUpdatedAt != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrUpdatedAt = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "UpdatedBy" ) ) {
					if( attrUpdatedBy != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrUpdatedBy = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ClusterId" ) ) {
					if( attrClusterId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrClusterId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "TenantName" ) ) {
					if( attrTenantName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrTenantName = attrs.getValue( idxAttr );
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
			if( ( attrClusterId == null ) || ( attrClusterId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"ClusterId" );
			}
			if( ( attrId == null ) || ( attrId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Id" );
			}
			if( attrTenantName == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"TenantName" );
			}
			if( ( attrRevision == null ) || ( attrRevision.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Revision" );
			}
			if( ( attrCreatedAt == null ) || ( attrCreatedAt.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"CreatedAt" );
			}
			if( ( attrCreatedBy == null ) || ( attrCreatedBy.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"CreatedBy" );
			}
			if( ( attrUpdatedAt == null ) || ( attrUpdatedAt.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"UpdatedAt" );
			}
			if( ( attrUpdatedBy == null ) || ( attrUpdatedBy.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"UpdatedBy" );
			}

			// Save named attributes to context
			CFLibXmlCoreContext curContext = getParser().getCurContext();

			// Instantiate a PKey buffer for the parsed information
			CFSecTenantPKey pkey = ((ICFSecSchema)schemaObj.getBackingStore()).getFactoryTenant().newPKey();

			long natId;
				natId = Long.parseLong( attrId );
			pkey.setRequiredId( natId );
			// Read the instance
			ICFSecTenantObj origBuff = ((ICFSecTenantObj)schemaObj.getTenantTableObj().readTenant( pkey ));
			if( origBuff == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getTenantTableObj().readTenant()" );
			}
			else {
				// Edit the instance
				ICFSecTenantEditObj editBuff = (ICFSecTenantEditObj)origBuff.beginEdit();
				CFSecTenantBuff dataBuff = editBuff.getTenantBuff();
				// Convert string attributes to native Java types
				// and apply the converted attributes to the editBuff.
			long natClusterId = Long.parseLong( attrClusterId );

			dataBuff.setRequiredClusterId( natClusterId );

			String natTenantName = attrTenantName;

			dataBuff.setRequiredTenantName( natTenantName );

				int natRevision = Integer.parseInt( attrRevision );
				dataBuff.setRequiredRevision( natRevision );
			UUID createdBy = null;
			if( attrCreatedBy != null ) {
				createdBy = UUID.fromString( attrCreatedBy );
			}
			Calendar createdAt = null;
			if( attrCreatedAt != null ) {
				createdAt = CFLibXmlUtil.parseTimestamp( attrCreatedAt );
			}
			UUID updatedBy = null;
			if( attrUpdatedBy != null ) {
				updatedBy = UUID.fromString( attrUpdatedBy );
			}
			Calendar updatedAt = null;
			if( attrUpdatedAt != null ) {
				updatedAt = CFLibXmlUtil.parseTimestamp( attrUpdatedAt );
			}
			if( createdBy != null ) {
				dataBuff.setCreatedByUserId( createdBy );
			}
			if( createdAt != null ) {
				dataBuff.setCreatedAt( createdAt );
			}
			if( updatedBy != null ) {
				dataBuff.setUpdatedByUserId( updatedBy );
			}
			if( updatedAt != null ) {
				dataBuff.setUpdatedAt( updatedAt );
			}
				//	Attempt the update
				editBuff.update();
				editBuff = null;
				String response = schemaFormatter.formatRspnXmlPreamble() + "\n"
					+	"\t" + CFSecXMsgTenantMessageFormatter.formatTenantRspnUpdated( "\n\t\t\t", origBuff.getTenantBuff() )
					+	"\n"
					+	schemaFormatter.formatRspnXmlPostamble();
				((CFSecXMsgRqst)getParser()).appendResponse( response );
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
