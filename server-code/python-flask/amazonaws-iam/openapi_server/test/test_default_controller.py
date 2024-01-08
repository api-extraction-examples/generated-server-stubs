import unittest

from flask import json

from openapi_server.models.add_client_idto_open_id_connect_provider_request import AddClientIDToOpenIDConnectProviderRequest  # noqa: E501
from openapi_server.models.add_role_to_instance_profile_request import AddRoleToInstanceProfileRequest  # noqa: E501
from openapi_server.models.add_user_to_group_request import AddUserToGroupRequest  # noqa: E501
from openapi_server.models.attach_group_policy_request import AttachGroupPolicyRequest  # noqa: E501
from openapi_server.models.attach_role_policy_request import AttachRolePolicyRequest  # noqa: E501
from openapi_server.models.attach_user_policy_request import AttachUserPolicyRequest  # noqa: E501
from openapi_server.models.change_password_request import ChangePasswordRequest  # noqa: E501
from openapi_server.models.context_entry import ContextEntry  # noqa: E501
from openapi_server.models.create_access_key_request import CreateAccessKeyRequest  # noqa: E501
from openapi_server.models.create_access_key_response import CreateAccessKeyResponse  # noqa: E501
from openapi_server.models.create_account_alias_request import CreateAccountAliasRequest  # noqa: E501
from openapi_server.models.create_group_request import CreateGroupRequest  # noqa: E501
from openapi_server.models.create_group_response import CreateGroupResponse  # noqa: E501
from openapi_server.models.create_instance_profile_request import CreateInstanceProfileRequest  # noqa: E501
from openapi_server.models.create_instance_profile_response import CreateInstanceProfileResponse  # noqa: E501
from openapi_server.models.create_login_profile_request import CreateLoginProfileRequest  # noqa: E501
from openapi_server.models.create_login_profile_response import CreateLoginProfileResponse  # noqa: E501
from openapi_server.models.create_open_id_connect_provider_request import CreateOpenIDConnectProviderRequest  # noqa: E501
from openapi_server.models.create_open_id_connect_provider_response import CreateOpenIDConnectProviderResponse  # noqa: E501
from openapi_server.models.create_policy_request import CreatePolicyRequest  # noqa: E501
from openapi_server.models.create_policy_response import CreatePolicyResponse  # noqa: E501
from openapi_server.models.create_policy_version_request import CreatePolicyVersionRequest  # noqa: E501
from openapi_server.models.create_policy_version_response import CreatePolicyVersionResponse  # noqa: E501
from openapi_server.models.create_role_request import CreateRoleRequest  # noqa: E501
from openapi_server.models.create_role_response import CreateRoleResponse  # noqa: E501
from openapi_server.models.create_saml_provider_request import CreateSAMLProviderRequest  # noqa: E501
from openapi_server.models.create_saml_provider_response import CreateSAMLProviderResponse  # noqa: E501
from openapi_server.models.create_service_linked_role_request import CreateServiceLinkedRoleRequest  # noqa: E501
from openapi_server.models.create_service_linked_role_response import CreateServiceLinkedRoleResponse  # noqa: E501
from openapi_server.models.create_service_specific_credential_request import CreateServiceSpecificCredentialRequest  # noqa: E501
from openapi_server.models.create_service_specific_credential_response import CreateServiceSpecificCredentialResponse  # noqa: E501
from openapi_server.models.create_user_request import CreateUserRequest  # noqa: E501
from openapi_server.models.create_user_response import CreateUserResponse  # noqa: E501
from openapi_server.models.create_virtual_mfa_device_request import CreateVirtualMFADeviceRequest  # noqa: E501
from openapi_server.models.create_virtual_mfa_device_response import CreateVirtualMFADeviceResponse  # noqa: E501
from openapi_server.models.deactivate_mfa_device_request import DeactivateMFADeviceRequest  # noqa: E501
from openapi_server.models.delete_access_key_request import DeleteAccessKeyRequest  # noqa: E501
from openapi_server.models.delete_account_alias_request import DeleteAccountAliasRequest  # noqa: E501
from openapi_server.models.delete_group_policy_request import DeleteGroupPolicyRequest  # noqa: E501
from openapi_server.models.delete_group_request import DeleteGroupRequest  # noqa: E501
from openapi_server.models.delete_instance_profile_request import DeleteInstanceProfileRequest  # noqa: E501
from openapi_server.models.delete_login_profile_request import DeleteLoginProfileRequest  # noqa: E501
from openapi_server.models.delete_open_id_connect_provider_request import DeleteOpenIDConnectProviderRequest  # noqa: E501
from openapi_server.models.delete_policy_request import DeletePolicyRequest  # noqa: E501
from openapi_server.models.delete_policy_version_request import DeletePolicyVersionRequest  # noqa: E501
from openapi_server.models.delete_role_permissions_boundary_request import DeleteRolePermissionsBoundaryRequest  # noqa: E501
from openapi_server.models.delete_role_policy_request import DeleteRolePolicyRequest  # noqa: E501
from openapi_server.models.delete_role_request import DeleteRoleRequest  # noqa: E501
from openapi_server.models.delete_saml_provider_request import DeleteSAMLProviderRequest  # noqa: E501
from openapi_server.models.delete_ssh_public_key_request import DeleteSSHPublicKeyRequest  # noqa: E501
from openapi_server.models.delete_server_certificate_request import DeleteServerCertificateRequest  # noqa: E501
from openapi_server.models.delete_service_linked_role_request import DeleteServiceLinkedRoleRequest  # noqa: E501
from openapi_server.models.delete_service_linked_role_response import DeleteServiceLinkedRoleResponse  # noqa: E501
from openapi_server.models.delete_service_specific_credential_request import DeleteServiceSpecificCredentialRequest  # noqa: E501
from openapi_server.models.delete_signing_certificate_request import DeleteSigningCertificateRequest  # noqa: E501
from openapi_server.models.delete_user_permissions_boundary_request import DeleteUserPermissionsBoundaryRequest  # noqa: E501
from openapi_server.models.delete_user_policy_request import DeleteUserPolicyRequest  # noqa: E501
from openapi_server.models.delete_user_request import DeleteUserRequest  # noqa: E501
from openapi_server.models.delete_virtual_mfa_device_request import DeleteVirtualMFADeviceRequest  # noqa: E501
from openapi_server.models.detach_group_policy_request import DetachGroupPolicyRequest  # noqa: E501
from openapi_server.models.detach_role_policy_request import DetachRolePolicyRequest  # noqa: E501
from openapi_server.models.detach_user_policy_request import DetachUserPolicyRequest  # noqa: E501
from openapi_server.models.enable_mfa_device_request import EnableMFADeviceRequest  # noqa: E501
from openapi_server.models.entity_type import EntityType  # noqa: E501
from openapi_server.models.generate_credential_report_response import GenerateCredentialReportResponse  # noqa: E501
from openapi_server.models.generate_organizations_access_report_request import GenerateOrganizationsAccessReportRequest  # noqa: E501
from openapi_server.models.generate_organizations_access_report_response import GenerateOrganizationsAccessReportResponse  # noqa: E501
from openapi_server.models.generate_service_last_accessed_details_request import GenerateServiceLastAccessedDetailsRequest  # noqa: E501
from openapi_server.models.generate_service_last_accessed_details_response import GenerateServiceLastAccessedDetailsResponse  # noqa: E501
from openapi_server.models.get_access_key_last_used_request import GetAccessKeyLastUsedRequest  # noqa: E501
from openapi_server.models.get_access_key_last_used_response import GetAccessKeyLastUsedResponse  # noqa: E501
from openapi_server.models.get_account_authorization_details_request import GetAccountAuthorizationDetailsRequest  # noqa: E501
from openapi_server.models.get_account_authorization_details_response import GetAccountAuthorizationDetailsResponse  # noqa: E501
from openapi_server.models.get_account_password_policy_response import GetAccountPasswordPolicyResponse  # noqa: E501
from openapi_server.models.get_account_summary_response import GetAccountSummaryResponse  # noqa: E501
from openapi_server.models.get_context_keys_for_custom_policy_request import GetContextKeysForCustomPolicyRequest  # noqa: E501
from openapi_server.models.get_context_keys_for_policy_response import GetContextKeysForPolicyResponse  # noqa: E501
from openapi_server.models.get_context_keys_for_principal_policy_request import GetContextKeysForPrincipalPolicyRequest  # noqa: E501
from openapi_server.models.get_credential_report_response import GetCredentialReportResponse  # noqa: E501
from openapi_server.models.get_group_policy_request import GetGroupPolicyRequest  # noqa: E501
from openapi_server.models.get_group_policy_response import GetGroupPolicyResponse  # noqa: E501
from openapi_server.models.get_group_request import GetGroupRequest  # noqa: E501
from openapi_server.models.get_group_response import GetGroupResponse  # noqa: E501
from openapi_server.models.get_instance_profile_request import GetInstanceProfileRequest  # noqa: E501
from openapi_server.models.get_instance_profile_response import GetInstanceProfileResponse  # noqa: E501
from openapi_server.models.get_login_profile_request import GetLoginProfileRequest  # noqa: E501
from openapi_server.models.get_login_profile_response import GetLoginProfileResponse  # noqa: E501
from openapi_server.models.get_mfa_device_request import GetMFADeviceRequest  # noqa: E501
from openapi_server.models.get_mfa_device_response import GetMFADeviceResponse  # noqa: E501
from openapi_server.models.get_open_id_connect_provider_request import GetOpenIDConnectProviderRequest  # noqa: E501
from openapi_server.models.get_open_id_connect_provider_response import GetOpenIDConnectProviderResponse  # noqa: E501
from openapi_server.models.get_organizations_access_report_request import GetOrganizationsAccessReportRequest  # noqa: E501
from openapi_server.models.get_organizations_access_report_response import GetOrganizationsAccessReportResponse  # noqa: E501
from openapi_server.models.get_policy_request import GetPolicyRequest  # noqa: E501
from openapi_server.models.get_policy_response import GetPolicyResponse  # noqa: E501
from openapi_server.models.get_policy_version_request import GetPolicyVersionRequest  # noqa: E501
from openapi_server.models.get_policy_version_response import GetPolicyVersionResponse  # noqa: E501
from openapi_server.models.get_role_policy_request import GetRolePolicyRequest  # noqa: E501
from openapi_server.models.get_role_policy_response import GetRolePolicyResponse  # noqa: E501
from openapi_server.models.get_role_request import GetRoleRequest  # noqa: E501
from openapi_server.models.get_role_response import GetRoleResponse  # noqa: E501
from openapi_server.models.get_saml_provider_request import GetSAMLProviderRequest  # noqa: E501
from openapi_server.models.get_saml_provider_response import GetSAMLProviderResponse  # noqa: E501
from openapi_server.models.get_ssh_public_key_request import GetSSHPublicKeyRequest  # noqa: E501
from openapi_server.models.get_ssh_public_key_response import GetSSHPublicKeyResponse  # noqa: E501
from openapi_server.models.get_server_certificate_request import GetServerCertificateRequest  # noqa: E501
from openapi_server.models.get_server_certificate_response import GetServerCertificateResponse  # noqa: E501
from openapi_server.models.get_service_last_accessed_details_request import GetServiceLastAccessedDetailsRequest  # noqa: E501
from openapi_server.models.get_service_last_accessed_details_response import GetServiceLastAccessedDetailsResponse  # noqa: E501
from openapi_server.models.get_service_last_accessed_details_with_entities_request import GetServiceLastAccessedDetailsWithEntitiesRequest  # noqa: E501
from openapi_server.models.get_service_last_accessed_details_with_entities_response import GetServiceLastAccessedDetailsWithEntitiesResponse  # noqa: E501
from openapi_server.models.get_service_linked_role_deletion_status_request import GetServiceLinkedRoleDeletionStatusRequest  # noqa: E501
from openapi_server.models.get_service_linked_role_deletion_status_response import GetServiceLinkedRoleDeletionStatusResponse  # noqa: E501
from openapi_server.models.get_user_policy_request import GetUserPolicyRequest  # noqa: E501
from openapi_server.models.get_user_policy_response import GetUserPolicyResponse  # noqa: E501
from openapi_server.models.get_user_request import GetUserRequest  # noqa: E501
from openapi_server.models.get_user_response import GetUserResponse  # noqa: E501
from openapi_server.models.list_access_keys_request import ListAccessKeysRequest  # noqa: E501
from openapi_server.models.list_access_keys_response import ListAccessKeysResponse  # noqa: E501
from openapi_server.models.list_account_aliases_request import ListAccountAliasesRequest  # noqa: E501
from openapi_server.models.list_account_aliases_response import ListAccountAliasesResponse  # noqa: E501
from openapi_server.models.list_attached_group_policies_request import ListAttachedGroupPoliciesRequest  # noqa: E501
from openapi_server.models.list_attached_group_policies_response import ListAttachedGroupPoliciesResponse  # noqa: E501
from openapi_server.models.list_attached_role_policies_request import ListAttachedRolePoliciesRequest  # noqa: E501
from openapi_server.models.list_attached_role_policies_response import ListAttachedRolePoliciesResponse  # noqa: E501
from openapi_server.models.list_attached_user_policies_request import ListAttachedUserPoliciesRequest  # noqa: E501
from openapi_server.models.list_attached_user_policies_response import ListAttachedUserPoliciesResponse  # noqa: E501
from openapi_server.models.list_entities_for_policy_request import ListEntitiesForPolicyRequest  # noqa: E501
from openapi_server.models.list_entities_for_policy_response import ListEntitiesForPolicyResponse  # noqa: E501
from openapi_server.models.list_group_policies_request import ListGroupPoliciesRequest  # noqa: E501
from openapi_server.models.list_group_policies_response import ListGroupPoliciesResponse  # noqa: E501
from openapi_server.models.list_groups_for_user_request import ListGroupsForUserRequest  # noqa: E501
from openapi_server.models.list_groups_for_user_response import ListGroupsForUserResponse  # noqa: E501
from openapi_server.models.list_groups_request import ListGroupsRequest  # noqa: E501
from openapi_server.models.list_groups_response import ListGroupsResponse  # noqa: E501
from openapi_server.models.list_instance_profile_tags_request import ListInstanceProfileTagsRequest  # noqa: E501
from openapi_server.models.list_instance_profile_tags_response import ListInstanceProfileTagsResponse  # noqa: E501
from openapi_server.models.list_instance_profiles_for_role_request import ListInstanceProfilesForRoleRequest  # noqa: E501
from openapi_server.models.list_instance_profiles_for_role_response import ListInstanceProfilesForRoleResponse  # noqa: E501
from openapi_server.models.list_instance_profiles_request import ListInstanceProfilesRequest  # noqa: E501
from openapi_server.models.list_instance_profiles_response import ListInstanceProfilesResponse  # noqa: E501
from openapi_server.models.list_mfa_device_tags_request import ListMFADeviceTagsRequest  # noqa: E501
from openapi_server.models.list_mfa_device_tags_response import ListMFADeviceTagsResponse  # noqa: E501
from openapi_server.models.list_mfa_devices_request import ListMFADevicesRequest  # noqa: E501
from openapi_server.models.list_mfa_devices_response import ListMFADevicesResponse  # noqa: E501
from openapi_server.models.list_open_id_connect_provider_tags_request import ListOpenIDConnectProviderTagsRequest  # noqa: E501
from openapi_server.models.list_open_id_connect_provider_tags_response import ListOpenIDConnectProviderTagsResponse  # noqa: E501
from openapi_server.models.list_open_id_connect_providers_response import ListOpenIDConnectProvidersResponse  # noqa: E501
from openapi_server.models.list_policies_granting_service_access_request import ListPoliciesGrantingServiceAccessRequest  # noqa: E501
from openapi_server.models.list_policies_granting_service_access_response import ListPoliciesGrantingServiceAccessResponse  # noqa: E501
from openapi_server.models.list_policies_request import ListPoliciesRequest  # noqa: E501
from openapi_server.models.list_policies_response import ListPoliciesResponse  # noqa: E501
from openapi_server.models.list_policy_tags_request import ListPolicyTagsRequest  # noqa: E501
from openapi_server.models.list_policy_tags_response import ListPolicyTagsResponse  # noqa: E501
from openapi_server.models.list_policy_versions_request import ListPolicyVersionsRequest  # noqa: E501
from openapi_server.models.list_policy_versions_response import ListPolicyVersionsResponse  # noqa: E501
from openapi_server.models.list_role_policies_request import ListRolePoliciesRequest  # noqa: E501
from openapi_server.models.list_role_policies_response import ListRolePoliciesResponse  # noqa: E501
from openapi_server.models.list_role_tags_request import ListRoleTagsRequest  # noqa: E501
from openapi_server.models.list_role_tags_response import ListRoleTagsResponse  # noqa: E501
from openapi_server.models.list_roles_request import ListRolesRequest  # noqa: E501
from openapi_server.models.list_roles_response import ListRolesResponse  # noqa: E501
from openapi_server.models.list_saml_provider_tags_request import ListSAMLProviderTagsRequest  # noqa: E501
from openapi_server.models.list_saml_provider_tags_response import ListSAMLProviderTagsResponse  # noqa: E501
from openapi_server.models.list_saml_providers_response import ListSAMLProvidersResponse  # noqa: E501
from openapi_server.models.list_ssh_public_keys_request import ListSSHPublicKeysRequest  # noqa: E501
from openapi_server.models.list_ssh_public_keys_response import ListSSHPublicKeysResponse  # noqa: E501
from openapi_server.models.list_server_certificate_tags_request import ListServerCertificateTagsRequest  # noqa: E501
from openapi_server.models.list_server_certificate_tags_response import ListServerCertificateTagsResponse  # noqa: E501
from openapi_server.models.list_server_certificates_request import ListServerCertificatesRequest  # noqa: E501
from openapi_server.models.list_server_certificates_response import ListServerCertificatesResponse  # noqa: E501
from openapi_server.models.list_service_specific_credentials_request import ListServiceSpecificCredentialsRequest  # noqa: E501
from openapi_server.models.list_service_specific_credentials_response import ListServiceSpecificCredentialsResponse  # noqa: E501
from openapi_server.models.list_signing_certificates_request import ListSigningCertificatesRequest  # noqa: E501
from openapi_server.models.list_signing_certificates_response import ListSigningCertificatesResponse  # noqa: E501
from openapi_server.models.list_user_policies_request import ListUserPoliciesRequest  # noqa: E501
from openapi_server.models.list_user_policies_response import ListUserPoliciesResponse  # noqa: E501
from openapi_server.models.list_user_tags_request import ListUserTagsRequest  # noqa: E501
from openapi_server.models.list_user_tags_response import ListUserTagsResponse  # noqa: E501
from openapi_server.models.list_users_request import ListUsersRequest  # noqa: E501
from openapi_server.models.list_users_response import ListUsersResponse  # noqa: E501
from openapi_server.models.list_virtual_mfa_devices_request import ListVirtualMFADevicesRequest  # noqa: E501
from openapi_server.models.list_virtual_mfa_devices_response import ListVirtualMFADevicesResponse  # noqa: E501
from openapi_server.models.put_group_policy_request import PutGroupPolicyRequest  # noqa: E501
from openapi_server.models.put_role_permissions_boundary_request import PutRolePermissionsBoundaryRequest  # noqa: E501
from openapi_server.models.put_role_policy_request import PutRolePolicyRequest  # noqa: E501
from openapi_server.models.put_user_permissions_boundary_request import PutUserPermissionsBoundaryRequest  # noqa: E501
from openapi_server.models.put_user_policy_request import PutUserPolicyRequest  # noqa: E501
from openapi_server.models.remove_client_id_from_open_id_connect_provider_request import RemoveClientIDFromOpenIDConnectProviderRequest  # noqa: E501
from openapi_server.models.remove_role_from_instance_profile_request import RemoveRoleFromInstanceProfileRequest  # noqa: E501
from openapi_server.models.remove_user_from_group_request import RemoveUserFromGroupRequest  # noqa: E501
from openapi_server.models.reset_service_specific_credential_request import ResetServiceSpecificCredentialRequest  # noqa: E501
from openapi_server.models.reset_service_specific_credential_response import ResetServiceSpecificCredentialResponse  # noqa: E501
from openapi_server.models.resync_mfa_device_request import ResyncMFADeviceRequest  # noqa: E501
from openapi_server.models.set_default_policy_version_request import SetDefaultPolicyVersionRequest  # noqa: E501
from openapi_server.models.set_security_token_service_preferences_request import SetSecurityTokenServicePreferencesRequest  # noqa: E501
from openapi_server.models.simulate_custom_policy_request import SimulateCustomPolicyRequest  # noqa: E501
from openapi_server.models.simulate_policy_response import SimulatePolicyResponse  # noqa: E501
from openapi_server.models.simulate_principal_policy_request import SimulatePrincipalPolicyRequest  # noqa: E501
from openapi_server.models.tag import Tag  # noqa: E501
from openapi_server.models.tag_instance_profile_request import TagInstanceProfileRequest  # noqa: E501
from openapi_server.models.tag_mfa_device_request import TagMFADeviceRequest  # noqa: E501
from openapi_server.models.tag_open_id_connect_provider_request import TagOpenIDConnectProviderRequest  # noqa: E501
from openapi_server.models.tag_policy_request import TagPolicyRequest  # noqa: E501
from openapi_server.models.tag_role_request import TagRoleRequest  # noqa: E501
from openapi_server.models.tag_saml_provider_request import TagSAMLProviderRequest  # noqa: E501
from openapi_server.models.tag_server_certificate_request import TagServerCertificateRequest  # noqa: E501
from openapi_server.models.tag_user_request import TagUserRequest  # noqa: E501
from openapi_server.models.untag_instance_profile_request import UntagInstanceProfileRequest  # noqa: E501
from openapi_server.models.untag_mfa_device_request import UntagMFADeviceRequest  # noqa: E501
from openapi_server.models.untag_open_id_connect_provider_request import UntagOpenIDConnectProviderRequest  # noqa: E501
from openapi_server.models.untag_policy_request import UntagPolicyRequest  # noqa: E501
from openapi_server.models.untag_role_request import UntagRoleRequest  # noqa: E501
from openapi_server.models.untag_saml_provider_request import UntagSAMLProviderRequest  # noqa: E501
from openapi_server.models.untag_server_certificate_request import UntagServerCertificateRequest  # noqa: E501
from openapi_server.models.untag_user_request import UntagUserRequest  # noqa: E501
from openapi_server.models.update_access_key_request import UpdateAccessKeyRequest  # noqa: E501
from openapi_server.models.update_account_password_policy_request import UpdateAccountPasswordPolicyRequest  # noqa: E501
from openapi_server.models.update_assume_role_policy_request import UpdateAssumeRolePolicyRequest  # noqa: E501
from openapi_server.models.update_group_request import UpdateGroupRequest  # noqa: E501
from openapi_server.models.update_login_profile_request import UpdateLoginProfileRequest  # noqa: E501
from openapi_server.models.update_open_id_connect_provider_thumbprint_request import UpdateOpenIDConnectProviderThumbprintRequest  # noqa: E501
from openapi_server.models.update_role_description_request import UpdateRoleDescriptionRequest  # noqa: E501
from openapi_server.models.update_role_description_response import UpdateRoleDescriptionResponse  # noqa: E501
from openapi_server.models.update_role_request import UpdateRoleRequest  # noqa: E501
from openapi_server.models.update_saml_provider_request import UpdateSAMLProviderRequest  # noqa: E501
from openapi_server.models.update_saml_provider_response import UpdateSAMLProviderResponse  # noqa: E501
from openapi_server.models.update_ssh_public_key_request import UpdateSSHPublicKeyRequest  # noqa: E501
from openapi_server.models.update_server_certificate_request import UpdateServerCertificateRequest  # noqa: E501
from openapi_server.models.update_service_specific_credential_request import UpdateServiceSpecificCredentialRequest  # noqa: E501
from openapi_server.models.update_signing_certificate_request import UpdateSigningCertificateRequest  # noqa: E501
from openapi_server.models.update_user_request import UpdateUserRequest  # noqa: E501
from openapi_server.models.upload_ssh_public_key_request import UploadSSHPublicKeyRequest  # noqa: E501
from openapi_server.models.upload_ssh_public_key_response import UploadSSHPublicKeyResponse  # noqa: E501
from openapi_server.models.upload_server_certificate_request import UploadServerCertificateRequest  # noqa: E501
from openapi_server.models.upload_server_certificate_response import UploadServerCertificateResponse  # noqa: E501
from openapi_server.models.upload_signing_certificate_request import UploadSigningCertificateRequest  # noqa: E501
from openapi_server.models.upload_signing_certificate_response import UploadSigningCertificateResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_add_client_idto_open_id_connect_provider(self):
        """Test case for get_add_client_idto_open_id_connect_provider

        
        """
        query_string = [('OpenIDConnectProviderArn', 'open_id_connect_provider_arn_example'),
                        ('ClientID', 'client_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AddClientIDToOpenIDConnectProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_add_role_to_instance_profile(self):
        """Test case for get_add_role_to_instance_profile

        
        """
        query_string = [('InstanceProfileName', 'instance_profile_name_example'),
                        ('RoleName', 'role_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AddRoleToInstanceProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_add_user_to_group(self):
        """Test case for get_add_user_to_group

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('UserName', 'user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AddUserToGroup',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attach_group_policy(self):
        """Test case for get_attach_group_policy

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('PolicyArn', 'policy_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AttachGroupPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attach_role_policy(self):
        """Test case for get_attach_role_policy

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('PolicyArn', 'policy_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AttachRolePolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attach_user_policy(self):
        """Test case for get_attach_user_policy

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('PolicyArn', 'policy_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AttachUserPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_change_password(self):
        """Test case for get_change_password

        
        """
        query_string = [('OldPassword', 'old_password_example'),
                        ('NewPassword', 'new_password_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ChangePassword',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_access_key(self):
        """Test case for get_create_access_key

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateAccessKey',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_account_alias(self):
        """Test case for get_create_account_alias

        
        """
        query_string = [('AccountAlias', 'account_alias_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateAccountAlias',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_group(self):
        """Test case for get_create_group

        
        """
        query_string = [('Path', 'path_example'),
                        ('GroupName', 'group_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateGroup',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_instance_profile(self):
        """Test case for get_create_instance_profile

        
        """
        query_string = [('InstanceProfileName', 'instance_profile_name_example'),
                        ('Path', 'path_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateInstanceProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_login_profile(self):
        """Test case for get_create_login_profile

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Password', 'password_example'),
                        ('PasswordResetRequired', True),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateLoginProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_open_id_connect_provider(self):
        """Test case for get_create_open_id_connect_provider

        
        """
        query_string = [('Url', 'url_example'),
                        ('ClientIDList', ['client_id_list_example']),
                        ('ThumbprintList', ['thumbprint_list_example']),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateOpenIDConnectProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_policy(self):
        """Test case for get_create_policy

        
        """
        query_string = [('PolicyName', 'policy_name_example'),
                        ('Path', 'path_example'),
                        ('PolicyDocument', 'policy_document_example'),
                        ('Description', 'description_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreatePolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_policy_version(self):
        """Test case for get_create_policy_version

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('PolicyDocument', 'policy_document_example'),
                        ('SetAsDefault', True),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreatePolicyVersion',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_role(self):
        """Test case for get_create_role

        
        """
        query_string = [('Path', 'path_example'),
                        ('RoleName', 'role_name_example'),
                        ('AssumeRolePolicyDocument', 'assume_role_policy_document_example'),
                        ('Description', 'description_example'),
                        ('MaxSessionDuration', 56),
                        ('PermissionsBoundary', 'permissions_boundary_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateRole',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_saml_provider(self):
        """Test case for get_create_saml_provider

        
        """
        query_string = [('SAMLMetadataDocument', 'saml_metadata_document_example'),
                        ('Name', 'name_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateSAMLProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_service_linked_role(self):
        """Test case for get_create_service_linked_role

        
        """
        query_string = [('AWSServiceName', 'aws_service_name_example'),
                        ('Description', 'description_example'),
                        ('CustomSuffix', 'custom_suffix_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateServiceLinkedRole',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_service_specific_credential(self):
        """Test case for get_create_service_specific_credential

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('ServiceName', 'service_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateServiceSpecificCredential',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_user(self):
        """Test case for get_create_user

        
        """
        query_string = [('Path', 'path_example'),
                        ('UserName', 'user_name_example'),
                        ('PermissionsBoundary', 'permissions_boundary_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateUser',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_virtual_mfa_device(self):
        """Test case for get_create_virtual_mfa_device

        
        """
        query_string = [('Path', 'path_example'),
                        ('VirtualMFADeviceName', 'virtual_mfa_device_name_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateVirtualMFADevice',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_deactivate_mfa_device(self):
        """Test case for get_deactivate_mfa_device

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('SerialNumber', 'serial_number_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeactivateMFADevice',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_access_key(self):
        """Test case for get_delete_access_key

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('AccessKeyId', 'access_key_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteAccessKey',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_account_alias(self):
        """Test case for get_delete_account_alias

        
        """
        query_string = [('AccountAlias', 'account_alias_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteAccountAlias',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_account_password_policy(self):
        """Test case for get_delete_account_password_policy

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteAccountPasswordPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_group(self):
        """Test case for get_delete_group

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteGroup',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_group_policy(self):
        """Test case for get_delete_group_policy

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('PolicyName', 'policy_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteGroupPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_instance_profile(self):
        """Test case for get_delete_instance_profile

        
        """
        query_string = [('InstanceProfileName', 'instance_profile_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteInstanceProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_login_profile(self):
        """Test case for get_delete_login_profile

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteLoginProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_open_id_connect_provider(self):
        """Test case for get_delete_open_id_connect_provider

        
        """
        query_string = [('OpenIDConnectProviderArn', 'open_id_connect_provider_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteOpenIDConnectProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_policy(self):
        """Test case for get_delete_policy

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeletePolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_policy_version(self):
        """Test case for get_delete_policy_version

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('VersionId', 'version_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeletePolicyVersion',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_role(self):
        """Test case for get_delete_role

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteRole',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_role_permissions_boundary(self):
        """Test case for get_delete_role_permissions_boundary

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteRolePermissionsBoundary',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_role_policy(self):
        """Test case for get_delete_role_policy

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('PolicyName', 'policy_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteRolePolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_saml_provider(self):
        """Test case for get_delete_saml_provider

        
        """
        query_string = [('SAMLProviderArn', 'saml_provider_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteSAMLProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_server_certificate(self):
        """Test case for get_delete_server_certificate

        
        """
        query_string = [('ServerCertificateName', 'server_certificate_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteServerCertificate',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_service_linked_role(self):
        """Test case for get_delete_service_linked_role

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteServiceLinkedRole',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_service_specific_credential(self):
        """Test case for get_delete_service_specific_credential

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('ServiceSpecificCredentialId', 'service_specific_credential_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteServiceSpecificCredential',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_signing_certificate(self):
        """Test case for get_delete_signing_certificate

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('CertificateId', 'certificate_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteSigningCertificate',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_ssh_public_key(self):
        """Test case for get_delete_ssh_public_key

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('SSHPublicKeyId', 'ssh_public_key_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteSSHPublicKey',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_user(self):
        """Test case for get_delete_user

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteUser',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_user_permissions_boundary(self):
        """Test case for get_delete_user_permissions_boundary

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteUserPermissionsBoundary',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_user_policy(self):
        """Test case for get_delete_user_policy

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('PolicyName', 'policy_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteUserPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delete_virtual_mfa_device(self):
        """Test case for get_delete_virtual_mfa_device

        
        """
        query_string = [('SerialNumber', 'serial_number_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteVirtualMFADevice',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_detach_group_policy(self):
        """Test case for get_detach_group_policy

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('PolicyArn', 'policy_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DetachGroupPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_detach_role_policy(self):
        """Test case for get_detach_role_policy

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('PolicyArn', 'policy_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DetachRolePolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_detach_user_policy(self):
        """Test case for get_detach_user_policy

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('PolicyArn', 'policy_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DetachUserPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_enable_mfa_device(self):
        """Test case for get_enable_mfa_device

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('SerialNumber', 'serial_number_example'),
                        ('AuthenticationCode1', 'authentication_code1_example'),
                        ('AuthenticationCode2', 'authentication_code2_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=EnableMFADevice',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_generate_credential_report(self):
        """Test case for get_generate_credential_report

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GenerateCredentialReport',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_generate_organizations_access_report(self):
        """Test case for get_generate_organizations_access_report

        
        """
        query_string = [('EntityPath', 'entity_path_example'),
                        ('OrganizationsPolicyId', 'organizations_policy_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GenerateOrganizationsAccessReport',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_generate_service_last_accessed_details(self):
        """Test case for get_generate_service_last_accessed_details

        
        """
        query_string = [('Arn', 'arn_example'),
                        ('Granularity', 'granularity_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GenerateServiceLastAccessedDetails',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_access_key_last_used(self):
        """Test case for get_get_access_key_last_used

        
        """
        query_string = [('AccessKeyId', 'access_key_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetAccessKeyLastUsed',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_account_authorization_details(self):
        """Test case for get_get_account_authorization_details

        
        """
        query_string = [('Filter', [openapi_server.EntityType()]),
                        ('MaxItems', 56),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetAccountAuthorizationDetails',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_account_password_policy(self):
        """Test case for get_get_account_password_policy

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetAccountPasswordPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_account_summary(self):
        """Test case for get_get_account_summary

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetAccountSummary',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_context_keys_for_custom_policy(self):
        """Test case for get_get_context_keys_for_custom_policy

        
        """
        query_string = [('PolicyInputList', ['policy_input_list_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetContextKeysForCustomPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_context_keys_for_principal_policy(self):
        """Test case for get_get_context_keys_for_principal_policy

        
        """
        query_string = [('PolicySourceArn', 'policy_source_arn_example'),
                        ('PolicyInputList', ['policy_input_list_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetContextKeysForPrincipalPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_credential_report(self):
        """Test case for get_get_credential_report

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetCredentialReport',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_group(self):
        """Test case for get_get_group

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetGroup',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_group_policy(self):
        """Test case for get_get_group_policy

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('PolicyName', 'policy_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetGroupPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_instance_profile(self):
        """Test case for get_get_instance_profile

        
        """
        query_string = [('InstanceProfileName', 'instance_profile_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetInstanceProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_login_profile(self):
        """Test case for get_get_login_profile

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetLoginProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_mfa_device(self):
        """Test case for get_get_mfa_device

        
        """
        query_string = [('SerialNumber', 'serial_number_example'),
                        ('UserName', 'user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetMFADevice',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_open_id_connect_provider(self):
        """Test case for get_get_open_id_connect_provider

        
        """
        query_string = [('OpenIDConnectProviderArn', 'open_id_connect_provider_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetOpenIDConnectProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_organizations_access_report(self):
        """Test case for get_get_organizations_access_report

        
        """
        query_string = [('JobId', 'job_id_example'),
                        ('MaxItems', 56),
                        ('Marker', 'marker_example'),
                        ('SortKey', 'sort_key_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetOrganizationsAccessReport',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_policy(self):
        """Test case for get_get_policy

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_policy_version(self):
        """Test case for get_get_policy_version

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('VersionId', 'version_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetPolicyVersion',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_role(self):
        """Test case for get_get_role

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetRole',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_role_policy(self):
        """Test case for get_get_role_policy

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('PolicyName', 'policy_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetRolePolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_saml_provider(self):
        """Test case for get_get_saml_provider

        
        """
        query_string = [('SAMLProviderArn', 'saml_provider_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetSAMLProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_server_certificate(self):
        """Test case for get_get_server_certificate

        
        """
        query_string = [('ServerCertificateName', 'server_certificate_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetServerCertificate',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_service_last_accessed_details(self):
        """Test case for get_get_service_last_accessed_details

        
        """
        query_string = [('JobId', 'job_id_example'),
                        ('MaxItems', 56),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetServiceLastAccessedDetails',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_service_last_accessed_details_with_entities(self):
        """Test case for get_get_service_last_accessed_details_with_entities

        
        """
        query_string = [('JobId', 'job_id_example'),
                        ('ServiceNamespace', 'service_namespace_example'),
                        ('MaxItems', 56),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetServiceLastAccessedDetailsWithEntities',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_service_linked_role_deletion_status(self):
        """Test case for get_get_service_linked_role_deletion_status

        
        """
        query_string = [('DeletionTaskId', 'deletion_task_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetServiceLinkedRoleDeletionStatus',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_ssh_public_key(self):
        """Test case for get_get_ssh_public_key

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('SSHPublicKeyId', 'ssh_public_key_id_example'),
                        ('Encoding', 'encoding_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetSSHPublicKey',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_user(self):
        """Test case for get_get_user

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetUser',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get_user_policy(self):
        """Test case for get_get_user_policy

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('PolicyName', 'policy_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetUserPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_access_keys(self):
        """Test case for get_list_access_keys

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAccessKeys',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_account_aliases(self):
        """Test case for get_list_account_aliases

        
        """
        query_string = [('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAccountAliases',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_attached_group_policies(self):
        """Test case for get_list_attached_group_policies

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('PathPrefix', 'path_prefix_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAttachedGroupPolicies',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_attached_role_policies(self):
        """Test case for get_list_attached_role_policies

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('PathPrefix', 'path_prefix_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAttachedRolePolicies',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_attached_user_policies(self):
        """Test case for get_list_attached_user_policies

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('PathPrefix', 'path_prefix_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAttachedUserPolicies',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_entities_for_policy(self):
        """Test case for get_list_entities_for_policy

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('EntityFilter', 'entity_filter_example'),
                        ('PathPrefix', 'path_prefix_example'),
                        ('PolicyUsageFilter', 'policy_usage_filter_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListEntitiesForPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_group_policies(self):
        """Test case for get_list_group_policies

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListGroupPolicies',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_groups(self):
        """Test case for get_list_groups

        
        """
        query_string = [('PathPrefix', 'path_prefix_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListGroups',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_groups_for_user(self):
        """Test case for get_list_groups_for_user

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListGroupsForUser',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_instance_profile_tags(self):
        """Test case for get_list_instance_profile_tags

        
        """
        query_string = [('InstanceProfileName', 'instance_profile_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListInstanceProfileTags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_instance_profiles(self):
        """Test case for get_list_instance_profiles

        
        """
        query_string = [('PathPrefix', 'path_prefix_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListInstanceProfiles',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_instance_profiles_for_role(self):
        """Test case for get_list_instance_profiles_for_role

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListInstanceProfilesForRole',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_mfa_device_tags(self):
        """Test case for get_list_mfa_device_tags

        
        """
        query_string = [('SerialNumber', 'serial_number_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListMFADeviceTags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_mfa_devices(self):
        """Test case for get_list_mfa_devices

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListMFADevices',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_open_id_connect_provider_tags(self):
        """Test case for get_list_open_id_connect_provider_tags

        
        """
        query_string = [('OpenIDConnectProviderArn', 'open_id_connect_provider_arn_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListOpenIDConnectProviderTags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_open_id_connect_providers(self):
        """Test case for get_list_open_id_connect_providers

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListOpenIDConnectProviders',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_policies(self):
        """Test case for get_list_policies

        
        """
        query_string = [('Scope', 'scope_example'),
                        ('OnlyAttached', True),
                        ('PathPrefix', 'path_prefix_example'),
                        ('PolicyUsageFilter', 'policy_usage_filter_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListPolicies',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_policies_granting_service_access(self):
        """Test case for get_list_policies_granting_service_access

        
        """
        query_string = [('Marker', 'marker_example'),
                        ('Arn', 'arn_example'),
                        ('ServiceNamespaces', ['service_namespaces_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListPoliciesGrantingServiceAccess',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_policy_tags(self):
        """Test case for get_list_policy_tags

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListPolicyTags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_policy_versions(self):
        """Test case for get_list_policy_versions

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListPolicyVersions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_role_policies(self):
        """Test case for get_list_role_policies

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListRolePolicies',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_role_tags(self):
        """Test case for get_list_role_tags

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListRoleTags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_roles(self):
        """Test case for get_list_roles

        
        """
        query_string = [('PathPrefix', 'path_prefix_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListRoles',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_saml_provider_tags(self):
        """Test case for get_list_saml_provider_tags

        
        """
        query_string = [('SAMLProviderArn', 'saml_provider_arn_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListSAMLProviderTags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_saml_providers(self):
        """Test case for get_list_saml_providers

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListSAMLProviders',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_server_certificate_tags(self):
        """Test case for get_list_server_certificate_tags

        
        """
        query_string = [('ServerCertificateName', 'server_certificate_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListServerCertificateTags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_server_certificates(self):
        """Test case for get_list_server_certificates

        
        """
        query_string = [('PathPrefix', 'path_prefix_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListServerCertificates',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_service_specific_credentials(self):
        """Test case for get_list_service_specific_credentials

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('ServiceName', 'service_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListServiceSpecificCredentials',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_signing_certificates(self):
        """Test case for get_list_signing_certificates

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListSigningCertificates',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_ssh_public_keys(self):
        """Test case for get_list_ssh_public_keys

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListSSHPublicKeys',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_user_policies(self):
        """Test case for get_list_user_policies

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListUserPolicies',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_user_tags(self):
        """Test case for get_list_user_tags

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListUserTags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_users(self):
        """Test case for get_list_users

        
        """
        query_string = [('PathPrefix', 'path_prefix_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListUsers',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_list_virtual_mfa_devices(self):
        """Test case for get_list_virtual_mfa_devices

        
        """
        query_string = [('AssignmentStatus', 'assignment_status_example'),
                        ('Marker', 'marker_example'),
                        ('MaxItems', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListVirtualMFADevices',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_put_group_policy(self):
        """Test case for get_put_group_policy

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('PolicyName', 'policy_name_example'),
                        ('PolicyDocument', 'policy_document_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutGroupPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_put_role_permissions_boundary(self):
        """Test case for get_put_role_permissions_boundary

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('PermissionsBoundary', 'permissions_boundary_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutRolePermissionsBoundary',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_put_role_policy(self):
        """Test case for get_put_role_policy

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('PolicyName', 'policy_name_example'),
                        ('PolicyDocument', 'policy_document_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutRolePolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_put_user_permissions_boundary(self):
        """Test case for get_put_user_permissions_boundary

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('PermissionsBoundary', 'permissions_boundary_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutUserPermissionsBoundary',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_put_user_policy(self):
        """Test case for get_put_user_policy

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('PolicyName', 'policy_name_example'),
                        ('PolicyDocument', 'policy_document_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutUserPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remove_client_id_from_open_id_connect_provider(self):
        """Test case for get_remove_client_id_from_open_id_connect_provider

        
        """
        query_string = [('OpenIDConnectProviderArn', 'open_id_connect_provider_arn_example'),
                        ('ClientID', 'client_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=RemoveClientIDFromOpenIDConnectProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remove_role_from_instance_profile(self):
        """Test case for get_remove_role_from_instance_profile

        
        """
        query_string = [('InstanceProfileName', 'instance_profile_name_example'),
                        ('RoleName', 'role_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=RemoveRoleFromInstanceProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remove_user_from_group(self):
        """Test case for get_remove_user_from_group

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('UserName', 'user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=RemoveUserFromGroup',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_reset_service_specific_credential(self):
        """Test case for get_reset_service_specific_credential

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('ServiceSpecificCredentialId', 'service_specific_credential_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ResetServiceSpecificCredential',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_resync_mfa_device(self):
        """Test case for get_resync_mfa_device

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('SerialNumber', 'serial_number_example'),
                        ('AuthenticationCode1', 'authentication_code1_example'),
                        ('AuthenticationCode2', 'authentication_code2_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ResyncMFADevice',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_set_default_policy_version(self):
        """Test case for get_set_default_policy_version

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('VersionId', 'version_id_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=SetDefaultPolicyVersion',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_set_security_token_service_preferences(self):
        """Test case for get_set_security_token_service_preferences

        
        """
        query_string = [('GlobalEndpointTokenVersion', 'global_endpoint_token_version_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=SetSecurityTokenServicePreferences',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_simulate_custom_policy(self):
        """Test case for get_simulate_custom_policy

        
        """
        query_string = [('PolicyInputList', ['policy_input_list_example']),
                        ('PermissionsBoundaryPolicyInputList', ['permissions_boundary_policy_input_list_example']),
                        ('ActionNames', ['action_names_example']),
                        ('ResourceArns', ['resource_arns_example']),
                        ('ResourcePolicy', 'resource_policy_example'),
                        ('ResourceOwner', 'resource_owner_example'),
                        ('CallerArn', 'caller_arn_example'),
                        ('ContextEntries', [openapi_server.ContextEntry()]),
                        ('ResourceHandlingOption', 'resource_handling_option_example'),
                        ('MaxItems', 56),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=SimulateCustomPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_simulate_principal_policy(self):
        """Test case for get_simulate_principal_policy

        
        """
        query_string = [('PolicySourceArn', 'policy_source_arn_example'),
                        ('PolicyInputList', ['policy_input_list_example']),
                        ('PermissionsBoundaryPolicyInputList', ['permissions_boundary_policy_input_list_example']),
                        ('ActionNames', ['action_names_example']),
                        ('ResourceArns', ['resource_arns_example']),
                        ('ResourcePolicy', 'resource_policy_example'),
                        ('ResourceOwner', 'resource_owner_example'),
                        ('CallerArn', 'caller_arn_example'),
                        ('ContextEntries', [openapi_server.ContextEntry()]),
                        ('ResourceHandlingOption', 'resource_handling_option_example'),
                        ('MaxItems', 56),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=SimulatePrincipalPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_instance_profile(self):
        """Test case for get_tag_instance_profile

        
        """
        query_string = [('InstanceProfileName', 'instance_profile_name_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagInstanceProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_mfa_device(self):
        """Test case for get_tag_mfa_device

        
        """
        query_string = [('SerialNumber', 'serial_number_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagMFADevice',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_open_id_connect_provider(self):
        """Test case for get_tag_open_id_connect_provider

        
        """
        query_string = [('OpenIDConnectProviderArn', 'open_id_connect_provider_arn_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagOpenIDConnectProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_policy(self):
        """Test case for get_tag_policy

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_role(self):
        """Test case for get_tag_role

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagRole',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_saml_provider(self):
        """Test case for get_tag_saml_provider

        
        """
        query_string = [('SAMLProviderArn', 'saml_provider_arn_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagSAMLProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_server_certificate(self):
        """Test case for get_tag_server_certificate

        
        """
        query_string = [('ServerCertificateName', 'server_certificate_name_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagServerCertificate',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_user(self):
        """Test case for get_tag_user

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagUser',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_untag_instance_profile(self):
        """Test case for get_untag_instance_profile

        
        """
        query_string = [('InstanceProfileName', 'instance_profile_name_example'),
                        ('TagKeys', ['tag_keys_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagInstanceProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_untag_mfa_device(self):
        """Test case for get_untag_mfa_device

        
        """
        query_string = [('SerialNumber', 'serial_number_example'),
                        ('TagKeys', ['tag_keys_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagMFADevice',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_untag_open_id_connect_provider(self):
        """Test case for get_untag_open_id_connect_provider

        
        """
        query_string = [('OpenIDConnectProviderArn', 'open_id_connect_provider_arn_example'),
                        ('TagKeys', ['tag_keys_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagOpenIDConnectProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_untag_policy(self):
        """Test case for get_untag_policy

        
        """
        query_string = [('PolicyArn', 'policy_arn_example'),
                        ('TagKeys', ['tag_keys_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_untag_role(self):
        """Test case for get_untag_role

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('TagKeys', ['tag_keys_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagRole',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_untag_saml_provider(self):
        """Test case for get_untag_saml_provider

        
        """
        query_string = [('SAMLProviderArn', 'saml_provider_arn_example'),
                        ('TagKeys', ['tag_keys_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagSAMLProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_untag_server_certificate(self):
        """Test case for get_untag_server_certificate

        
        """
        query_string = [('ServerCertificateName', 'server_certificate_name_example'),
                        ('TagKeys', ['tag_keys_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagServerCertificate',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_untag_user(self):
        """Test case for get_untag_user

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('TagKeys', ['tag_keys_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagUser',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_access_key(self):
        """Test case for get_update_access_key

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('AccessKeyId', 'access_key_id_example'),
                        ('Status', 'status_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateAccessKey',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_account_password_policy(self):
        """Test case for get_update_account_password_policy

        
        """
        query_string = [('MinimumPasswordLength', 56),
                        ('RequireSymbols', True),
                        ('RequireNumbers', True),
                        ('RequireUppercaseCharacters', True),
                        ('RequireLowercaseCharacters', True),
                        ('AllowUsersToChangePassword', True),
                        ('MaxPasswordAge', 56),
                        ('PasswordReusePrevention', 56),
                        ('HardExpiry', True),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateAccountPasswordPolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_assume_role_policy(self):
        """Test case for get_update_assume_role_policy

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('PolicyDocument', 'policy_document_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateAssumeRolePolicy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_group(self):
        """Test case for get_update_group

        
        """
        query_string = [('GroupName', 'group_name_example'),
                        ('NewPath', 'new_path_example'),
                        ('NewGroupName', 'new_group_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateGroup',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_login_profile(self):
        """Test case for get_update_login_profile

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('Password', 'password_example'),
                        ('PasswordResetRequired', True),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateLoginProfile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_open_id_connect_provider_thumbprint(self):
        """Test case for get_update_open_id_connect_provider_thumbprint

        
        """
        query_string = [('OpenIDConnectProviderArn', 'open_id_connect_provider_arn_example'),
                        ('ThumbprintList', ['thumbprint_list_example']),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateOpenIDConnectProviderThumbprint',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_role(self):
        """Test case for get_update_role

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Description', 'description_example'),
                        ('MaxSessionDuration', 56),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateRole',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_role_description(self):
        """Test case for get_update_role_description

        
        """
        query_string = [('RoleName', 'role_name_example'),
                        ('Description', 'description_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateRoleDescription',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_saml_provider(self):
        """Test case for get_update_saml_provider

        
        """
        query_string = [('SAMLMetadataDocument', 'saml_metadata_document_example'),
                        ('SAMLProviderArn', 'saml_provider_arn_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateSAMLProvider',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_server_certificate(self):
        """Test case for get_update_server_certificate

        
        """
        query_string = [('ServerCertificateName', 'server_certificate_name_example'),
                        ('NewPath', 'new_path_example'),
                        ('NewServerCertificateName', 'new_server_certificate_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateServerCertificate',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_service_specific_credential(self):
        """Test case for get_update_service_specific_credential

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('ServiceSpecificCredentialId', 'service_specific_credential_id_example'),
                        ('Status', 'status_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateServiceSpecificCredential',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_signing_certificate(self):
        """Test case for get_update_signing_certificate

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('CertificateId', 'certificate_id_example'),
                        ('Status', 'status_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateSigningCertificate',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_ssh_public_key(self):
        """Test case for get_update_ssh_public_key

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('SSHPublicKeyId', 'ssh_public_key_id_example'),
                        ('Status', 'status_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateSSHPublicKey',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_update_user(self):
        """Test case for get_update_user

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('NewPath', 'new_path_example'),
                        ('NewUserName', 'new_user_name_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateUser',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_upload_server_certificate(self):
        """Test case for get_upload_server_certificate

        
        """
        query_string = [('Path', 'path_example'),
                        ('ServerCertificateName', 'server_certificate_name_example'),
                        ('CertificateBody', 'certificate_body_example'),
                        ('PrivateKey', 'private_key_example'),
                        ('CertificateChain', 'certificate_chain_example'),
                        ('Tags', [openapi_server.Tag()]),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UploadServerCertificate',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_upload_signing_certificate(self):
        """Test case for get_upload_signing_certificate

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('CertificateBody', 'certificate_body_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UploadSigningCertificate',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_upload_ssh_public_key(self):
        """Test case for get_upload_ssh_public_key

        
        """
        query_string = [('UserName', 'user_name_example'),
                        ('SSHPublicKeyBody', 'ssh_public_key_body_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UploadSSHPublicKey',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_add_client_idto_open_id_connect_provider(self):
        """Test case for post_add_client_idto_open_id_connect_provider

        
        """
        add_client_idto_open_id_connect_provider_request = openapi_server.AddClientIDToOpenIDConnectProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AddClientIDToOpenIDConnectProvider',
            method='POST',
            headers=headers,
            data=json.dumps(add_client_idto_open_id_connect_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_add_role_to_instance_profile(self):
        """Test case for post_add_role_to_instance_profile

        
        """
        add_role_to_instance_profile_request = openapi_server.AddRoleToInstanceProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AddRoleToInstanceProfile',
            method='POST',
            headers=headers,
            data=json.dumps(add_role_to_instance_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_add_user_to_group(self):
        """Test case for post_add_user_to_group

        
        """
        add_user_to_group_request = openapi_server.AddUserToGroupRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AddUserToGroup',
            method='POST',
            headers=headers,
            data=json.dumps(add_user_to_group_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_attach_group_policy(self):
        """Test case for post_attach_group_policy

        
        """
        attach_group_policy_request = openapi_server.AttachGroupPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AttachGroupPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(attach_group_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_attach_role_policy(self):
        """Test case for post_attach_role_policy

        
        """
        attach_role_policy_request = openapi_server.AttachRolePolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AttachRolePolicy',
            method='POST',
            headers=headers,
            data=json.dumps(attach_role_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_attach_user_policy(self):
        """Test case for post_attach_user_policy

        
        """
        attach_user_policy_request = openapi_server.AttachUserPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=AttachUserPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(attach_user_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_change_password(self):
        """Test case for post_change_password

        
        """
        change_password_request = openapi_server.ChangePasswordRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ChangePassword',
            method='POST',
            headers=headers,
            data=json.dumps(change_password_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_access_key(self):
        """Test case for post_create_access_key

        
        """
        create_access_key_request = openapi_server.CreateAccessKeyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateAccessKey',
            method='POST',
            headers=headers,
            data=json.dumps(create_access_key_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_account_alias(self):
        """Test case for post_create_account_alias

        
        """
        create_account_alias_request = openapi_server.CreateAccountAliasRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateAccountAlias',
            method='POST',
            headers=headers,
            data=json.dumps(create_account_alias_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_group(self):
        """Test case for post_create_group

        
        """
        create_group_request = openapi_server.CreateGroupRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateGroup',
            method='POST',
            headers=headers,
            data=json.dumps(create_group_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_instance_profile(self):
        """Test case for post_create_instance_profile

        
        """
        create_instance_profile_request = openapi_server.CreateInstanceProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateInstanceProfile',
            method='POST',
            headers=headers,
            data=json.dumps(create_instance_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_login_profile(self):
        """Test case for post_create_login_profile

        
        """
        create_login_profile_request = openapi_server.CreateLoginProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateLoginProfile',
            method='POST',
            headers=headers,
            data=json.dumps(create_login_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_open_id_connect_provider(self):
        """Test case for post_create_open_id_connect_provider

        
        """
        create_open_id_connect_provider_request = openapi_server.CreateOpenIDConnectProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateOpenIDConnectProvider',
            method='POST',
            headers=headers,
            data=json.dumps(create_open_id_connect_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_policy(self):
        """Test case for post_create_policy

        
        """
        create_policy_request = openapi_server.CreatePolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreatePolicy',
            method='POST',
            headers=headers,
            data=json.dumps(create_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_policy_version(self):
        """Test case for post_create_policy_version

        
        """
        create_policy_version_request = openapi_server.CreatePolicyVersionRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreatePolicyVersion',
            method='POST',
            headers=headers,
            data=json.dumps(create_policy_version_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_role(self):
        """Test case for post_create_role

        
        """
        create_role_request = openapi_server.CreateRoleRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateRole',
            method='POST',
            headers=headers,
            data=json.dumps(create_role_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_saml_provider(self):
        """Test case for post_create_saml_provider

        
        """
        create_saml_provider_request = openapi_server.CreateSAMLProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateSAMLProvider',
            method='POST',
            headers=headers,
            data=json.dumps(create_saml_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_service_linked_role(self):
        """Test case for post_create_service_linked_role

        
        """
        create_service_linked_role_request = openapi_server.CreateServiceLinkedRoleRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateServiceLinkedRole',
            method='POST',
            headers=headers,
            data=json.dumps(create_service_linked_role_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_service_specific_credential(self):
        """Test case for post_create_service_specific_credential

        
        """
        create_service_specific_credential_request = openapi_server.CreateServiceSpecificCredentialRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateServiceSpecificCredential',
            method='POST',
            headers=headers,
            data=json.dumps(create_service_specific_credential_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_user(self):
        """Test case for post_create_user

        
        """
        create_user_request = openapi_server.CreateUserRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateUser',
            method='POST',
            headers=headers,
            data=json.dumps(create_user_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_create_virtual_mfa_device(self):
        """Test case for post_create_virtual_mfa_device

        
        """
        create_virtual_mfa_device_request = openapi_server.CreateVirtualMFADeviceRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=CreateVirtualMFADevice',
            method='POST',
            headers=headers,
            data=json.dumps(create_virtual_mfa_device_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_deactivate_mfa_device(self):
        """Test case for post_deactivate_mfa_device

        
        """
        deactivate_mfa_device_request = openapi_server.DeactivateMFADeviceRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeactivateMFADevice',
            method='POST',
            headers=headers,
            data=json.dumps(deactivate_mfa_device_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_access_key(self):
        """Test case for post_delete_access_key

        
        """
        delete_access_key_request = openapi_server.DeleteAccessKeyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteAccessKey',
            method='POST',
            headers=headers,
            data=json.dumps(delete_access_key_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_account_alias(self):
        """Test case for post_delete_account_alias

        
        """
        delete_account_alias_request = openapi_server.DeleteAccountAliasRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteAccountAlias',
            method='POST',
            headers=headers,
            data=json.dumps(delete_account_alias_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_delete_account_password_policy(self):
        """Test case for post_delete_account_password_policy

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteAccountPasswordPolicy',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_group(self):
        """Test case for post_delete_group

        
        """
        delete_group_request = openapi_server.DeleteGroupRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteGroup',
            method='POST',
            headers=headers,
            data=json.dumps(delete_group_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_group_policy(self):
        """Test case for post_delete_group_policy

        
        """
        delete_group_policy_request = openapi_server.DeleteGroupPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteGroupPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(delete_group_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_instance_profile(self):
        """Test case for post_delete_instance_profile

        
        """
        delete_instance_profile_request = openapi_server.DeleteInstanceProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteInstanceProfile',
            method='POST',
            headers=headers,
            data=json.dumps(delete_instance_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_login_profile(self):
        """Test case for post_delete_login_profile

        
        """
        delete_login_profile_request = openapi_server.DeleteLoginProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteLoginProfile',
            method='POST',
            headers=headers,
            data=json.dumps(delete_login_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_open_id_connect_provider(self):
        """Test case for post_delete_open_id_connect_provider

        
        """
        delete_open_id_connect_provider_request = openapi_server.DeleteOpenIDConnectProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteOpenIDConnectProvider',
            method='POST',
            headers=headers,
            data=json.dumps(delete_open_id_connect_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_policy(self):
        """Test case for post_delete_policy

        
        """
        delete_policy_request = openapi_server.DeletePolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeletePolicy',
            method='POST',
            headers=headers,
            data=json.dumps(delete_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_policy_version(self):
        """Test case for post_delete_policy_version

        
        """
        delete_policy_version_request = openapi_server.DeletePolicyVersionRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeletePolicyVersion',
            method='POST',
            headers=headers,
            data=json.dumps(delete_policy_version_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_role(self):
        """Test case for post_delete_role

        
        """
        delete_role_request = openapi_server.DeleteRoleRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteRole',
            method='POST',
            headers=headers,
            data=json.dumps(delete_role_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_role_permissions_boundary(self):
        """Test case for post_delete_role_permissions_boundary

        
        """
        delete_role_permissions_boundary_request = openapi_server.DeleteRolePermissionsBoundaryRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteRolePermissionsBoundary',
            method='POST',
            headers=headers,
            data=json.dumps(delete_role_permissions_boundary_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_role_policy(self):
        """Test case for post_delete_role_policy

        
        """
        delete_role_policy_request = openapi_server.DeleteRolePolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteRolePolicy',
            method='POST',
            headers=headers,
            data=json.dumps(delete_role_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_saml_provider(self):
        """Test case for post_delete_saml_provider

        
        """
        delete_saml_provider_request = openapi_server.DeleteSAMLProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteSAMLProvider',
            method='POST',
            headers=headers,
            data=json.dumps(delete_saml_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_server_certificate(self):
        """Test case for post_delete_server_certificate

        
        """
        delete_server_certificate_request = openapi_server.DeleteServerCertificateRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteServerCertificate',
            method='POST',
            headers=headers,
            data=json.dumps(delete_server_certificate_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_service_linked_role(self):
        """Test case for post_delete_service_linked_role

        
        """
        delete_service_linked_role_request = openapi_server.DeleteServiceLinkedRoleRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteServiceLinkedRole',
            method='POST',
            headers=headers,
            data=json.dumps(delete_service_linked_role_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_service_specific_credential(self):
        """Test case for post_delete_service_specific_credential

        
        """
        delete_service_specific_credential_request = openapi_server.DeleteServiceSpecificCredentialRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteServiceSpecificCredential',
            method='POST',
            headers=headers,
            data=json.dumps(delete_service_specific_credential_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_signing_certificate(self):
        """Test case for post_delete_signing_certificate

        
        """
        delete_signing_certificate_request = openapi_server.DeleteSigningCertificateRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteSigningCertificate',
            method='POST',
            headers=headers,
            data=json.dumps(delete_signing_certificate_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_ssh_public_key(self):
        """Test case for post_delete_ssh_public_key

        
        """
        delete_ssh_public_key_request = openapi_server.DeleteSSHPublicKeyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteSSHPublicKey',
            method='POST',
            headers=headers,
            data=json.dumps(delete_ssh_public_key_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_user(self):
        """Test case for post_delete_user

        
        """
        delete_user_request = openapi_server.DeleteUserRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteUser',
            method='POST',
            headers=headers,
            data=json.dumps(delete_user_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_user_permissions_boundary(self):
        """Test case for post_delete_user_permissions_boundary

        
        """
        delete_user_permissions_boundary_request = openapi_server.DeleteUserPermissionsBoundaryRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteUserPermissionsBoundary',
            method='POST',
            headers=headers,
            data=json.dumps(delete_user_permissions_boundary_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_user_policy(self):
        """Test case for post_delete_user_policy

        
        """
        delete_user_policy_request = openapi_server.DeleteUserPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteUserPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(delete_user_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_delete_virtual_mfa_device(self):
        """Test case for post_delete_virtual_mfa_device

        
        """
        delete_virtual_mfa_device_request = openapi_server.DeleteVirtualMFADeviceRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DeleteVirtualMFADevice',
            method='POST',
            headers=headers,
            data=json.dumps(delete_virtual_mfa_device_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_detach_group_policy(self):
        """Test case for post_detach_group_policy

        
        """
        detach_group_policy_request = openapi_server.DetachGroupPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DetachGroupPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(detach_group_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_detach_role_policy(self):
        """Test case for post_detach_role_policy

        
        """
        detach_role_policy_request = openapi_server.DetachRolePolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DetachRolePolicy',
            method='POST',
            headers=headers,
            data=json.dumps(detach_role_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_detach_user_policy(self):
        """Test case for post_detach_user_policy

        
        """
        detach_user_policy_request = openapi_server.DetachUserPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=DetachUserPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(detach_user_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_enable_mfa_device(self):
        """Test case for post_enable_mfa_device

        
        """
        enable_mfa_device_request = openapi_server.EnableMFADeviceRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=EnableMFADevice',
            method='POST',
            headers=headers,
            data=json.dumps(enable_mfa_device_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_generate_credential_report(self):
        """Test case for post_generate_credential_report

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GenerateCredentialReport',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_generate_organizations_access_report(self):
        """Test case for post_generate_organizations_access_report

        
        """
        generate_organizations_access_report_request = openapi_server.GenerateOrganizationsAccessReportRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GenerateOrganizationsAccessReport',
            method='POST',
            headers=headers,
            data=json.dumps(generate_organizations_access_report_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_generate_service_last_accessed_details(self):
        """Test case for post_generate_service_last_accessed_details

        
        """
        generate_service_last_accessed_details_request = openapi_server.GenerateServiceLastAccessedDetailsRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GenerateServiceLastAccessedDetails',
            method='POST',
            headers=headers,
            data=json.dumps(generate_service_last_accessed_details_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_access_key_last_used(self):
        """Test case for post_get_access_key_last_used

        
        """
        get_access_key_last_used_request = openapi_server.GetAccessKeyLastUsedRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetAccessKeyLastUsed',
            method='POST',
            headers=headers,
            data=json.dumps(get_access_key_last_used_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_account_authorization_details(self):
        """Test case for post_get_account_authorization_details

        
        """
        get_account_authorization_details_request = openapi_server.GetAccountAuthorizationDetailsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetAccountAuthorizationDetails',
            method='POST',
            headers=headers,
            data=json.dumps(get_account_authorization_details_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_get_account_password_policy(self):
        """Test case for post_get_account_password_policy

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetAccountPasswordPolicy',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_get_account_summary(self):
        """Test case for post_get_account_summary

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetAccountSummary',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_context_keys_for_custom_policy(self):
        """Test case for post_get_context_keys_for_custom_policy

        
        """
        get_context_keys_for_custom_policy_request = openapi_server.GetContextKeysForCustomPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetContextKeysForCustomPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(get_context_keys_for_custom_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_context_keys_for_principal_policy(self):
        """Test case for post_get_context_keys_for_principal_policy

        
        """
        get_context_keys_for_principal_policy_request = openapi_server.GetContextKeysForPrincipalPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetContextKeysForPrincipalPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(get_context_keys_for_principal_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_get_credential_report(self):
        """Test case for post_get_credential_report

        
        """
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetCredentialReport',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_group(self):
        """Test case for post_get_group

        
        """
        get_group_request = openapi_server.GetGroupRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetGroup',
            method='POST',
            headers=headers,
            data=json.dumps(get_group_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_group_policy(self):
        """Test case for post_get_group_policy

        
        """
        get_group_policy_request = openapi_server.GetGroupPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetGroupPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(get_group_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_instance_profile(self):
        """Test case for post_get_instance_profile

        
        """
        get_instance_profile_request = openapi_server.GetInstanceProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetInstanceProfile',
            method='POST',
            headers=headers,
            data=json.dumps(get_instance_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_login_profile(self):
        """Test case for post_get_login_profile

        
        """
        get_login_profile_request = openapi_server.GetLoginProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetLoginProfile',
            method='POST',
            headers=headers,
            data=json.dumps(get_login_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_mfa_device(self):
        """Test case for post_get_mfa_device

        
        """
        get_mfa_device_request = openapi_server.GetMFADeviceRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetMFADevice',
            method='POST',
            headers=headers,
            data=json.dumps(get_mfa_device_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_open_id_connect_provider(self):
        """Test case for post_get_open_id_connect_provider

        
        """
        get_open_id_connect_provider_request = openapi_server.GetOpenIDConnectProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetOpenIDConnectProvider',
            method='POST',
            headers=headers,
            data=json.dumps(get_open_id_connect_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_organizations_access_report(self):
        """Test case for post_get_organizations_access_report

        
        """
        get_organizations_access_report_request = openapi_server.GetOrganizationsAccessReportRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetOrganizationsAccessReport',
            method='POST',
            headers=headers,
            data=json.dumps(get_organizations_access_report_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_policy(self):
        """Test case for post_get_policy

        
        """
        get_policy_request = openapi_server.GetPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(get_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_policy_version(self):
        """Test case for post_get_policy_version

        
        """
        get_policy_version_request = openapi_server.GetPolicyVersionRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetPolicyVersion',
            method='POST',
            headers=headers,
            data=json.dumps(get_policy_version_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_role(self):
        """Test case for post_get_role

        
        """
        get_role_request = openapi_server.GetRoleRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetRole',
            method='POST',
            headers=headers,
            data=json.dumps(get_role_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_role_policy(self):
        """Test case for post_get_role_policy

        
        """
        get_role_policy_request = openapi_server.GetRolePolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetRolePolicy',
            method='POST',
            headers=headers,
            data=json.dumps(get_role_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_saml_provider(self):
        """Test case for post_get_saml_provider

        
        """
        get_saml_provider_request = openapi_server.GetSAMLProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetSAMLProvider',
            method='POST',
            headers=headers,
            data=json.dumps(get_saml_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_server_certificate(self):
        """Test case for post_get_server_certificate

        
        """
        get_server_certificate_request = openapi_server.GetServerCertificateRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetServerCertificate',
            method='POST',
            headers=headers,
            data=json.dumps(get_server_certificate_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_service_last_accessed_details(self):
        """Test case for post_get_service_last_accessed_details

        
        """
        get_service_last_accessed_details_request = openapi_server.GetServiceLastAccessedDetailsRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetServiceLastAccessedDetails',
            method='POST',
            headers=headers,
            data=json.dumps(get_service_last_accessed_details_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_service_last_accessed_details_with_entities(self):
        """Test case for post_get_service_last_accessed_details_with_entities

        
        """
        get_service_last_accessed_details_with_entities_request = openapi_server.GetServiceLastAccessedDetailsWithEntitiesRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetServiceLastAccessedDetailsWithEntities',
            method='POST',
            headers=headers,
            data=json.dumps(get_service_last_accessed_details_with_entities_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_service_linked_role_deletion_status(self):
        """Test case for post_get_service_linked_role_deletion_status

        
        """
        get_service_linked_role_deletion_status_request = openapi_server.GetServiceLinkedRoleDeletionStatusRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetServiceLinkedRoleDeletionStatus',
            method='POST',
            headers=headers,
            data=json.dumps(get_service_linked_role_deletion_status_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_ssh_public_key(self):
        """Test case for post_get_ssh_public_key

        
        """
        get_ssh_public_key_request = openapi_server.GetSSHPublicKeyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetSSHPublicKey',
            method='POST',
            headers=headers,
            data=json.dumps(get_ssh_public_key_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_user(self):
        """Test case for post_get_user

        
        """
        get_user_request = openapi_server.GetUserRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetUser',
            method='POST',
            headers=headers,
            data=json.dumps(get_user_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_get_user_policy(self):
        """Test case for post_get_user_policy

        
        """
        get_user_policy_request = openapi_server.GetUserPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=GetUserPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(get_user_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_access_keys(self):
        """Test case for post_list_access_keys

        
        """
        list_access_keys_request = openapi_server.ListAccessKeysRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAccessKeys',
            method='POST',
            headers=headers,
            data=json.dumps(list_access_keys_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_account_aliases(self):
        """Test case for post_list_account_aliases

        
        """
        list_account_aliases_request = openapi_server.ListAccountAliasesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAccountAliases',
            method='POST',
            headers=headers,
            data=json.dumps(list_account_aliases_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_attached_group_policies(self):
        """Test case for post_list_attached_group_policies

        
        """
        list_attached_group_policies_request = openapi_server.ListAttachedGroupPoliciesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAttachedGroupPolicies',
            method='POST',
            headers=headers,
            data=json.dumps(list_attached_group_policies_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_attached_role_policies(self):
        """Test case for post_list_attached_role_policies

        
        """
        list_attached_role_policies_request = openapi_server.ListAttachedRolePoliciesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAttachedRolePolicies',
            method='POST',
            headers=headers,
            data=json.dumps(list_attached_role_policies_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_attached_user_policies(self):
        """Test case for post_list_attached_user_policies

        
        """
        list_attached_user_policies_request = openapi_server.ListAttachedUserPoliciesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListAttachedUserPolicies',
            method='POST',
            headers=headers,
            data=json.dumps(list_attached_user_policies_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_entities_for_policy(self):
        """Test case for post_list_entities_for_policy

        
        """
        list_entities_for_policy_request = openapi_server.ListEntitiesForPolicyRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListEntitiesForPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(list_entities_for_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_group_policies(self):
        """Test case for post_list_group_policies

        
        """
        list_group_policies_request = openapi_server.ListGroupPoliciesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListGroupPolicies',
            method='POST',
            headers=headers,
            data=json.dumps(list_group_policies_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_groups(self):
        """Test case for post_list_groups

        
        """
        list_groups_request = openapi_server.ListGroupsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListGroups',
            method='POST',
            headers=headers,
            data=json.dumps(list_groups_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_groups_for_user(self):
        """Test case for post_list_groups_for_user

        
        """
        list_groups_for_user_request = openapi_server.ListGroupsForUserRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListGroupsForUser',
            method='POST',
            headers=headers,
            data=json.dumps(list_groups_for_user_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_instance_profile_tags(self):
        """Test case for post_list_instance_profile_tags

        
        """
        list_instance_profile_tags_request = openapi_server.ListInstanceProfileTagsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListInstanceProfileTags',
            method='POST',
            headers=headers,
            data=json.dumps(list_instance_profile_tags_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_instance_profiles(self):
        """Test case for post_list_instance_profiles

        
        """
        list_instance_profiles_request = openapi_server.ListInstanceProfilesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListInstanceProfiles',
            method='POST',
            headers=headers,
            data=json.dumps(list_instance_profiles_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_instance_profiles_for_role(self):
        """Test case for post_list_instance_profiles_for_role

        
        """
        list_instance_profiles_for_role_request = openapi_server.ListInstanceProfilesForRoleRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListInstanceProfilesForRole',
            method='POST',
            headers=headers,
            data=json.dumps(list_instance_profiles_for_role_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_mfa_device_tags(self):
        """Test case for post_list_mfa_device_tags

        
        """
        list_mfa_device_tags_request = openapi_server.ListMFADeviceTagsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListMFADeviceTags',
            method='POST',
            headers=headers,
            data=json.dumps(list_mfa_device_tags_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_mfa_devices(self):
        """Test case for post_list_mfa_devices

        
        """
        list_mfa_devices_request = openapi_server.ListMFADevicesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListMFADevices',
            method='POST',
            headers=headers,
            data=json.dumps(list_mfa_devices_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_open_id_connect_provider_tags(self):
        """Test case for post_list_open_id_connect_provider_tags

        
        """
        list_open_id_connect_provider_tags_request = openapi_server.ListOpenIDConnectProviderTagsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListOpenIDConnectProviderTags',
            method='POST',
            headers=headers,
            data=json.dumps(list_open_id_connect_provider_tags_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_open_id_connect_providers(self):
        """Test case for post_list_open_id_connect_providers

        
        """
        body = None
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListOpenIDConnectProviders',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_policies(self):
        """Test case for post_list_policies

        
        """
        list_policies_request = openapi_server.ListPoliciesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListPolicies',
            method='POST',
            headers=headers,
            data=json.dumps(list_policies_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_policies_granting_service_access(self):
        """Test case for post_list_policies_granting_service_access

        
        """
        list_policies_granting_service_access_request = openapi_server.ListPoliciesGrantingServiceAccessRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListPoliciesGrantingServiceAccess',
            method='POST',
            headers=headers,
            data=json.dumps(list_policies_granting_service_access_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_policy_tags(self):
        """Test case for post_list_policy_tags

        
        """
        list_policy_tags_request = openapi_server.ListPolicyTagsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListPolicyTags',
            method='POST',
            headers=headers,
            data=json.dumps(list_policy_tags_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_policy_versions(self):
        """Test case for post_list_policy_versions

        
        """
        list_policy_versions_request = openapi_server.ListPolicyVersionsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListPolicyVersions',
            method='POST',
            headers=headers,
            data=json.dumps(list_policy_versions_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_role_policies(self):
        """Test case for post_list_role_policies

        
        """
        list_role_policies_request = openapi_server.ListRolePoliciesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListRolePolicies',
            method='POST',
            headers=headers,
            data=json.dumps(list_role_policies_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_role_tags(self):
        """Test case for post_list_role_tags

        
        """
        list_role_tags_request = openapi_server.ListRoleTagsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListRoleTags',
            method='POST',
            headers=headers,
            data=json.dumps(list_role_tags_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_roles(self):
        """Test case for post_list_roles

        
        """
        list_roles_request = openapi_server.ListRolesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListRoles',
            method='POST',
            headers=headers,
            data=json.dumps(list_roles_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_saml_provider_tags(self):
        """Test case for post_list_saml_provider_tags

        
        """
        list_saml_provider_tags_request = openapi_server.ListSAMLProviderTagsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListSAMLProviderTags',
            method='POST',
            headers=headers,
            data=json.dumps(list_saml_provider_tags_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_saml_providers(self):
        """Test case for post_list_saml_providers

        
        """
        body = None
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListSAMLProviders',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_server_certificate_tags(self):
        """Test case for post_list_server_certificate_tags

        
        """
        list_server_certificate_tags_request = openapi_server.ListServerCertificateTagsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListServerCertificateTags',
            method='POST',
            headers=headers,
            data=json.dumps(list_server_certificate_tags_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_server_certificates(self):
        """Test case for post_list_server_certificates

        
        """
        list_server_certificates_request = openapi_server.ListServerCertificatesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListServerCertificates',
            method='POST',
            headers=headers,
            data=json.dumps(list_server_certificates_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_service_specific_credentials(self):
        """Test case for post_list_service_specific_credentials

        
        """
        list_service_specific_credentials_request = openapi_server.ListServiceSpecificCredentialsRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListServiceSpecificCredentials',
            method='POST',
            headers=headers,
            data=json.dumps(list_service_specific_credentials_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_signing_certificates(self):
        """Test case for post_list_signing_certificates

        
        """
        list_signing_certificates_request = openapi_server.ListSigningCertificatesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListSigningCertificates',
            method='POST',
            headers=headers,
            data=json.dumps(list_signing_certificates_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_ssh_public_keys(self):
        """Test case for post_list_ssh_public_keys

        
        """
        list_ssh_public_keys_request = openapi_server.ListSSHPublicKeysRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListSSHPublicKeys',
            method='POST',
            headers=headers,
            data=json.dumps(list_ssh_public_keys_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_user_policies(self):
        """Test case for post_list_user_policies

        
        """
        list_user_policies_request = openapi_server.ListUserPoliciesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListUserPolicies',
            method='POST',
            headers=headers,
            data=json.dumps(list_user_policies_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_user_tags(self):
        """Test case for post_list_user_tags

        
        """
        list_user_tags_request = openapi_server.ListUserTagsRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListUserTags',
            method='POST',
            headers=headers,
            data=json.dumps(list_user_tags_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_users(self):
        """Test case for post_list_users

        
        """
        list_users_request = openapi_server.ListUsersRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListUsers',
            method='POST',
            headers=headers,
            data=json.dumps(list_users_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_list_virtual_mfa_devices(self):
        """Test case for post_list_virtual_mfa_devices

        
        """
        list_virtual_mfa_devices_request = openapi_server.ListVirtualMFADevicesRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ListVirtualMFADevices',
            method='POST',
            headers=headers,
            data=json.dumps(list_virtual_mfa_devices_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_put_group_policy(self):
        """Test case for post_put_group_policy

        
        """
        put_group_policy_request = openapi_server.PutGroupPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutGroupPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(put_group_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_put_role_permissions_boundary(self):
        """Test case for post_put_role_permissions_boundary

        
        """
        put_role_permissions_boundary_request = openapi_server.PutRolePermissionsBoundaryRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutRolePermissionsBoundary',
            method='POST',
            headers=headers,
            data=json.dumps(put_role_permissions_boundary_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_put_role_policy(self):
        """Test case for post_put_role_policy

        
        """
        put_role_policy_request = openapi_server.PutRolePolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutRolePolicy',
            method='POST',
            headers=headers,
            data=json.dumps(put_role_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_put_user_permissions_boundary(self):
        """Test case for post_put_user_permissions_boundary

        
        """
        put_user_permissions_boundary_request = openapi_server.PutUserPermissionsBoundaryRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutUserPermissionsBoundary',
            method='POST',
            headers=headers,
            data=json.dumps(put_user_permissions_boundary_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_put_user_policy(self):
        """Test case for post_put_user_policy

        
        """
        put_user_policy_request = openapi_server.PutUserPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=PutUserPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(put_user_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_remove_client_id_from_open_id_connect_provider(self):
        """Test case for post_remove_client_id_from_open_id_connect_provider

        
        """
        remove_client_id_from_open_id_connect_provider_request = openapi_server.RemoveClientIDFromOpenIDConnectProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=RemoveClientIDFromOpenIDConnectProvider',
            method='POST',
            headers=headers,
            data=json.dumps(remove_client_id_from_open_id_connect_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_remove_role_from_instance_profile(self):
        """Test case for post_remove_role_from_instance_profile

        
        """
        remove_role_from_instance_profile_request = openapi_server.RemoveRoleFromInstanceProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=RemoveRoleFromInstanceProfile',
            method='POST',
            headers=headers,
            data=json.dumps(remove_role_from_instance_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_remove_user_from_group(self):
        """Test case for post_remove_user_from_group

        
        """
        remove_user_from_group_request = openapi_server.RemoveUserFromGroupRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=RemoveUserFromGroup',
            method='POST',
            headers=headers,
            data=json.dumps(remove_user_from_group_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_reset_service_specific_credential(self):
        """Test case for post_reset_service_specific_credential

        
        """
        reset_service_specific_credential_request = openapi_server.ResetServiceSpecificCredentialRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ResetServiceSpecificCredential',
            method='POST',
            headers=headers,
            data=json.dumps(reset_service_specific_credential_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_resync_mfa_device(self):
        """Test case for post_resync_mfa_device

        
        """
        resync_mfa_device_request = openapi_server.ResyncMFADeviceRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=ResyncMFADevice',
            method='POST',
            headers=headers,
            data=json.dumps(resync_mfa_device_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_set_default_policy_version(self):
        """Test case for post_set_default_policy_version

        
        """
        set_default_policy_version_request = openapi_server.SetDefaultPolicyVersionRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=SetDefaultPolicyVersion',
            method='POST',
            headers=headers,
            data=json.dumps(set_default_policy_version_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_set_security_token_service_preferences(self):
        """Test case for post_set_security_token_service_preferences

        
        """
        set_security_token_service_preferences_request = openapi_server.SetSecurityTokenServicePreferencesRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=SetSecurityTokenServicePreferences',
            method='POST',
            headers=headers,
            data=json.dumps(set_security_token_service_preferences_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_simulate_custom_policy(self):
        """Test case for post_simulate_custom_policy

        
        """
        simulate_custom_policy_request = openapi_server.SimulateCustomPolicyRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=SimulateCustomPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(simulate_custom_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_simulate_principal_policy(self):
        """Test case for post_simulate_principal_policy

        
        """
        simulate_principal_policy_request = openapi_server.SimulatePrincipalPolicyRequest()
        query_string = [('MaxItems', 'max_items_example'),
                        ('Marker', 'marker_example'),
                        ('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=SimulatePrincipalPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(simulate_principal_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_tag_instance_profile(self):
        """Test case for post_tag_instance_profile

        
        """
        tag_instance_profile_request = openapi_server.TagInstanceProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagInstanceProfile',
            method='POST',
            headers=headers,
            data=json.dumps(tag_instance_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_tag_mfa_device(self):
        """Test case for post_tag_mfa_device

        
        """
        tag_mfa_device_request = openapi_server.TagMFADeviceRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagMFADevice',
            method='POST',
            headers=headers,
            data=json.dumps(tag_mfa_device_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_tag_open_id_connect_provider(self):
        """Test case for post_tag_open_id_connect_provider

        
        """
        tag_open_id_connect_provider_request = openapi_server.TagOpenIDConnectProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagOpenIDConnectProvider',
            method='POST',
            headers=headers,
            data=json.dumps(tag_open_id_connect_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_tag_policy(self):
        """Test case for post_tag_policy

        
        """
        tag_policy_request = openapi_server.TagPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(tag_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_tag_role(self):
        """Test case for post_tag_role

        
        """
        tag_role_request = openapi_server.TagRoleRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagRole',
            method='POST',
            headers=headers,
            data=json.dumps(tag_role_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_tag_saml_provider(self):
        """Test case for post_tag_saml_provider

        
        """
        tag_saml_provider_request = openapi_server.TagSAMLProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagSAMLProvider',
            method='POST',
            headers=headers,
            data=json.dumps(tag_saml_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_tag_server_certificate(self):
        """Test case for post_tag_server_certificate

        
        """
        tag_server_certificate_request = openapi_server.TagServerCertificateRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagServerCertificate',
            method='POST',
            headers=headers,
            data=json.dumps(tag_server_certificate_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_tag_user(self):
        """Test case for post_tag_user

        
        """
        tag_user_request = openapi_server.TagUserRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=TagUser',
            method='POST',
            headers=headers,
            data=json.dumps(tag_user_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_untag_instance_profile(self):
        """Test case for post_untag_instance_profile

        
        """
        untag_instance_profile_request = openapi_server.UntagInstanceProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagInstanceProfile',
            method='POST',
            headers=headers,
            data=json.dumps(untag_instance_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_untag_mfa_device(self):
        """Test case for post_untag_mfa_device

        
        """
        untag_mfa_device_request = openapi_server.UntagMFADeviceRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagMFADevice',
            method='POST',
            headers=headers,
            data=json.dumps(untag_mfa_device_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_untag_open_id_connect_provider(self):
        """Test case for post_untag_open_id_connect_provider

        
        """
        untag_open_id_connect_provider_request = openapi_server.UntagOpenIDConnectProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagOpenIDConnectProvider',
            method='POST',
            headers=headers,
            data=json.dumps(untag_open_id_connect_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_untag_policy(self):
        """Test case for post_untag_policy

        
        """
        untag_policy_request = openapi_server.UntagPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(untag_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_untag_role(self):
        """Test case for post_untag_role

        
        """
        untag_role_request = openapi_server.UntagRoleRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagRole',
            method='POST',
            headers=headers,
            data=json.dumps(untag_role_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_untag_saml_provider(self):
        """Test case for post_untag_saml_provider

        
        """
        untag_saml_provider_request = openapi_server.UntagSAMLProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagSAMLProvider',
            method='POST',
            headers=headers,
            data=json.dumps(untag_saml_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_untag_server_certificate(self):
        """Test case for post_untag_server_certificate

        
        """
        untag_server_certificate_request = openapi_server.UntagServerCertificateRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagServerCertificate',
            method='POST',
            headers=headers,
            data=json.dumps(untag_server_certificate_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_untag_user(self):
        """Test case for post_untag_user

        
        """
        untag_user_request = openapi_server.UntagUserRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UntagUser',
            method='POST',
            headers=headers,
            data=json.dumps(untag_user_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_access_key(self):
        """Test case for post_update_access_key

        
        """
        update_access_key_request = openapi_server.UpdateAccessKeyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateAccessKey',
            method='POST',
            headers=headers,
            data=json.dumps(update_access_key_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_account_password_policy(self):
        """Test case for post_update_account_password_policy

        
        """
        update_account_password_policy_request = openapi_server.UpdateAccountPasswordPolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateAccountPasswordPolicy',
            method='POST',
            headers=headers,
            data=json.dumps(update_account_password_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_assume_role_policy(self):
        """Test case for post_update_assume_role_policy

        
        """
        update_assume_role_policy_request = openapi_server.UpdateAssumeRolePolicyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateAssumeRolePolicy',
            method='POST',
            headers=headers,
            data=json.dumps(update_assume_role_policy_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_group(self):
        """Test case for post_update_group

        
        """
        update_group_request = openapi_server.UpdateGroupRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateGroup',
            method='POST',
            headers=headers,
            data=json.dumps(update_group_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_login_profile(self):
        """Test case for post_update_login_profile

        
        """
        update_login_profile_request = openapi_server.UpdateLoginProfileRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateLoginProfile',
            method='POST',
            headers=headers,
            data=json.dumps(update_login_profile_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_open_id_connect_provider_thumbprint(self):
        """Test case for post_update_open_id_connect_provider_thumbprint

        
        """
        update_open_id_connect_provider_thumbprint_request = openapi_server.UpdateOpenIDConnectProviderThumbprintRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateOpenIDConnectProviderThumbprint',
            method='POST',
            headers=headers,
            data=json.dumps(update_open_id_connect_provider_thumbprint_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_role(self):
        """Test case for post_update_role

        
        """
        update_role_request = openapi_server.UpdateRoleRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateRole',
            method='POST',
            headers=headers,
            data=json.dumps(update_role_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_role_description(self):
        """Test case for post_update_role_description

        
        """
        update_role_description_request = openapi_server.UpdateRoleDescriptionRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateRoleDescription',
            method='POST',
            headers=headers,
            data=json.dumps(update_role_description_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_saml_provider(self):
        """Test case for post_update_saml_provider

        
        """
        update_saml_provider_request = openapi_server.UpdateSAMLProviderRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateSAMLProvider',
            method='POST',
            headers=headers,
            data=json.dumps(update_saml_provider_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_server_certificate(self):
        """Test case for post_update_server_certificate

        
        """
        update_server_certificate_request = openapi_server.UpdateServerCertificateRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateServerCertificate',
            method='POST',
            headers=headers,
            data=json.dumps(update_server_certificate_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_service_specific_credential(self):
        """Test case for post_update_service_specific_credential

        
        """
        update_service_specific_credential_request = openapi_server.UpdateServiceSpecificCredentialRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateServiceSpecificCredential',
            method='POST',
            headers=headers,
            data=json.dumps(update_service_specific_credential_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_signing_certificate(self):
        """Test case for post_update_signing_certificate

        
        """
        update_signing_certificate_request = openapi_server.UpdateSigningCertificateRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateSigningCertificate',
            method='POST',
            headers=headers,
            data=json.dumps(update_signing_certificate_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_ssh_public_key(self):
        """Test case for post_update_ssh_public_key

        
        """
        update_ssh_public_key_request = openapi_server.UpdateSSHPublicKeyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateSSHPublicKey',
            method='POST',
            headers=headers,
            data=json.dumps(update_ssh_public_key_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_update_user(self):
        """Test case for post_update_user

        
        """
        update_user_request = openapi_server.UpdateUserRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UpdateUser',
            method='POST',
            headers=headers,
            data=json.dumps(update_user_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_upload_server_certificate(self):
        """Test case for post_upload_server_certificate

        
        """
        upload_server_certificate_request = openapi_server.UploadServerCertificateRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UploadServerCertificate',
            method='POST',
            headers=headers,
            data=json.dumps(upload_server_certificate_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_upload_signing_certificate(self):
        """Test case for post_upload_signing_certificate

        
        """
        upload_signing_certificate_request = openapi_server.UploadSigningCertificateRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UploadSigningCertificate',
            method='POST',
            headers=headers,
            data=json.dumps(upload_signing_certificate_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("text/xml not supported by Connexion")
    def test_post_upload_ssh_public_key(self):
        """Test case for post_upload_ssh_public_key

        
        """
        upload_ssh_public_key_request = openapi_server.UploadSSHPublicKeyRequest()
        query_string = [('Action', 'action_example'),
                        ('Version', 'version_example')]
        headers = { 
            'Accept': 'text/xml',
            'Content-Type': 'text/xml',
            'x_amz_content_sha256': 'x_amz_content_sha256_example',
            'x_amz_date': 'x_amz_date_example',
            'x_amz_algorithm': 'x_amz_algorithm_example',
            'x_amz_credential': 'x_amz_credential_example',
            'x_amz_security_token': 'x_amz_security_token_example',
            'x_amz_signature': 'x_amz_signature_example',
            'x_amz_signed_headers': 'x_amz_signed_headers_example',
            'hmac': 'special-key',
        }
        response = self.client.open(
            '/#Action=UploadSSHPublicKey',
            method='POST',
            headers=headers,
            data=json.dumps(upload_ssh_public_key_request),
            content_type='text/xml',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
