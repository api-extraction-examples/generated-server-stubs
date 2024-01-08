import connexion
from typing import Dict
from typing import Tuple
from typing import Union

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
from openapi_server import util


def get_add_client_idto_open_id_connect_provider(open_id_connect_provider_arn, client_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_add_client_idto_open_id_connect_provider

    &lt;p&gt;Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource.&lt;/p&gt; &lt;p&gt;This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.&lt;/p&gt; # noqa: E501

    :param open_id_connect_provider_arn: The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC) provider resource to add the client ID to. You can get a list of OIDC provider ARNs by using the &lt;a&gt;ListOpenIDConnectProviders&lt;/a&gt; operation.
    :type open_id_connect_provider_arn: str
    :param client_id: The client ID (also known as audience) to add to the IAM OpenID Connect provider resource.
    :type client_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_add_role_to_instance_profile(instance_profile_name, role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_add_role_to_instance_profile

    &lt;p&gt;Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this quota cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of Amazon Web Services because of &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Eventual_consistency\&quot;&gt;eventual consistency&lt;/a&gt;. To force the change, you must &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateIamInstanceProfile.html\&quot;&gt;disassociate the instance profile&lt;/a&gt; and then &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateIamInstanceProfile.html\&quot;&gt;associate the instance profile&lt;/a&gt;, or you can stop your instance and then restart it.&lt;/p&gt; &lt;note&gt; &lt;p&gt;The caller of this operation must be granted the &lt;code&gt;PassRole&lt;/code&gt; permission on the IAM role by a permissions policy.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param instance_profile_name: &lt;p&gt;The name of the instance profile to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type instance_profile_name: str
    :param role_name: &lt;p&gt;The name of the role to add.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_add_user_to_group(group_name, user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_add_user_to_group

    Adds the specified user to the specified group. # noqa: E501

    :param group_name: &lt;p&gt;The name of the group to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param user_name: &lt;p&gt;The name of the user to add.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_attach_group_policy(group_name, policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_attach_group_policy

    &lt;p&gt;Attaches the specified managed policy to the specified IAM group.&lt;/p&gt; &lt;p&gt;You use this operation to attach a managed policy to a group. To embed an inline policy in a group, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutGroupPolicy.html\&quot;&gt; &lt;code&gt;PutGroupPolicy&lt;/code&gt; &lt;/a&gt;.&lt;/p&gt; &lt;p&gt;As a best practice, you can validate your IAM policies. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\&quot;&gt;Validating IAM policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param group_name: &lt;p&gt;The name (friendly name, not ARN) of the group to attach the policy to.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy you want to attach.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_attach_role_policy(role_name, policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_attach_role_policy

    &lt;p&gt;Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role&#39;s permission (access) policy.&lt;/p&gt; &lt;note&gt; &lt;p&gt;You cannot use a managed policy as the role&#39;s trust policy. The role&#39;s trust policy is created at the same time as the role, using &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html\&quot;&gt; &lt;code&gt;CreateRole&lt;/code&gt; &lt;/a&gt;. You can update a role&#39;s trust policy using &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html\&quot;&gt; &lt;code&gt;UpdateAssumerolePolicy&lt;/code&gt; &lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;Use this operation to attach a &lt;i&gt;managed&lt;/i&gt; policy to a role. To embed an inline policy in a role, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutRolePolicy.html\&quot;&gt; &lt;code&gt;PutRolePolicy&lt;/code&gt; &lt;/a&gt;. For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;As a best practice, you can validate your IAM policies. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\&quot;&gt;Validating IAM policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name (friendly name, not ARN) of the role to attach the policy to.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy you want to attach.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_attach_user_policy(user_name, policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_attach_user_policy

    &lt;p&gt;Attaches the specified managed policy to the specified user.&lt;/p&gt; &lt;p&gt;You use this operation to attach a &lt;i&gt;managed&lt;/i&gt; policy to a user. To embed an inline policy in a user, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutUserPolicy.html\&quot;&gt; &lt;code&gt;PutUserPolicy&lt;/code&gt; &lt;/a&gt;.&lt;/p&gt; &lt;p&gt;As a best practice, you can validate your IAM policies. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\&quot;&gt;Validating IAM policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name (friendly name, not ARN) of the IAM user to attach the policy to.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy you want to attach.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_change_password(old_password, new_password, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_change_password

    &lt;p&gt;Changes the password of the IAM user who is calling this operation. This operation can be performed using the CLI, the Amazon Web Services API, or the &lt;b&gt;My Security Credentials&lt;/b&gt; page in the Amazon Web Services Management Console. The Amazon Web Services account root user password is not affected by this operation.&lt;/p&gt; &lt;p&gt;Use &lt;a&gt;UpdateLoginProfile&lt;/a&gt; to use the CLI, the Amazon Web Services API, or the &lt;b&gt;Users&lt;/b&gt; page in the IAM console to change the password for any IAM user. For more information about modifying passwords, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\&quot;&gt;Managing passwords&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param old_password: The IAM user&#39;s current password.
    :type old_password: str
    :param new_password: &lt;p&gt;The new password. The new password must conform to the Amazon Web Services account&#39;s password policy, if one exists.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range (&lt;code&gt;\\u00FF&lt;/code&gt;). You can also include the tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;) characters. Any of these characters are valid in a password. However, many tools, such as the Amazon Web Services Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.&lt;/p&gt;
    :type new_password: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_create_access_key(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_create_access_key

    &lt;p&gt; Creates a new Amazon Web Services secret access key and corresponding Amazon Web Services access key ID for the specified user. The default status for new keys is &lt;code&gt;Active&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials. This is true even if the Amazon Web Services account has no associated users.&lt;/p&gt; &lt;p&gt; For information about quotas on the number of keys you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt;To ensure the security of your Amazon Web Services account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the IAM user that the new key will belong to.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[CreateAccessKeyResponse, Tuple[CreateAccessKeyResponse, int], Tuple[CreateAccessKeyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_create_account_alias(account_alias, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_create_account_alias

    Creates an alias for your Amazon Web Services account. For information about using an Amazon Web Services account alias, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\&quot;&gt;Creating, deleting, and listing an Amazon Web Services account alias&lt;/a&gt; in the &lt;i&gt;Amazon Web Services Sign-In User Guide&lt;/i&gt;. # noqa: E501

    :param account_alias: &lt;p&gt;The account alias to create.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.&lt;/p&gt;
    :type account_alias: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_create_group(group_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path=None):  # noqa: E501
    """get_create_group

    &lt;p&gt;Creates a new group.&lt;/p&gt; &lt;p&gt; For information about the number of groups you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param group_name: &lt;p&gt;The name of the group to create. Do not include the path in this value.&lt;/p&gt; &lt;p&gt;IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \&quot;MyResource\&quot; and \&quot;myresource\&quot;.&lt;/p&gt;
    :type group_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path: &lt;p&gt; The path to the group. For more information about paths, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\&quot;&gt;IAM identifiers&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/).&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path: str

    :rtype: Union[CreateGroupResponse, Tuple[CreateGroupResponse, int], Tuple[CreateGroupResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_create_instance_profile(instance_profile_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path=None, tags=None):  # noqa: E501
    """get_create_instance_profile

    &lt;p&gt; Creates a new instance profile. For information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html\&quot;&gt;Using roles for applications on Amazon EC2&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;, and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/iam-roles-for-amazon-ec2.html#ec2-instance-profile\&quot;&gt;Instance profiles&lt;/a&gt; in the &lt;i&gt;Amazon EC2 User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; For information about the number of instance profiles you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM object quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param instance_profile_name: &lt;p&gt;The name of the instance profile to create.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type instance_profile_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path: &lt;p&gt; The path to the instance profile. For more information about paths, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\&quot;&gt;IAM Identifiers&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/).&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path: str
    :param tags: &lt;p&gt;A list of tags that you want to attach to the newly created IAM instance profile. Each tag consists of a key name and an associated value. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.&lt;/p&gt; &lt;/note&gt;
    :type tags: list | bytes

    :rtype: Union[CreateInstanceProfileResponse, Tuple[CreateInstanceProfileResponse, int], Tuple[CreateInstanceProfileResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_create_login_profile(user_name, password, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, password_reset_required=None):  # noqa: E501
    """get_create_login_profile

    &lt;p&gt;Creates a password for the specified IAM user. A password allows an IAM user to access Amazon Web Services services through the Amazon Web Services Management Console.&lt;/p&gt; &lt;p&gt;You can use the CLI, the Amazon Web Services API, or the &lt;b&gt;Users&lt;/b&gt; page in the IAM console to create a password for any IAM user. Use &lt;a&gt;ChangePassword&lt;/a&gt; to update your own existing password in the &lt;b&gt;My Security Credentials&lt;/b&gt; page in the Amazon Web Services Management Console.&lt;/p&gt; &lt;p&gt;For more information about managing passwords, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\&quot;&gt;Managing passwords&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user to create a password for. The user must already exist.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param password: &lt;p&gt;The new password for the user.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range (&lt;code&gt;\\u00FF&lt;/code&gt;). You can also include the tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;) characters. Any of these characters are valid in a password. However, many tools, such as the Amazon Web Services Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.&lt;/p&gt;
    :type password: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param password_reset_required: Specifies whether the user is required to set a new password on next sign-in.
    :type password_reset_required: bool

    :rtype: Union[CreateLoginProfileResponse, Tuple[CreateLoginProfileResponse, int], Tuple[CreateLoginProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_create_open_id_connect_provider(url, thumbprint_list, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, client_id_list=None, tags=None):  # noqa: E501
    """get_create_open_id_connect_provider

    &lt;p&gt;Creates an IAM entity to describe an identity provider (IdP) that supports &lt;a href&#x3D;\&quot;http://openid.net/connect/\&quot;&gt;OpenID Connect (OIDC)&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The OIDC provider that you create with this operation can be used as a principal in a role&#39;s trust policy. Such a policy establishes a trust relationship between Amazon Web Services and the OIDC provider.&lt;/p&gt; &lt;p&gt;If you are using an OIDC identity provider from Google, Facebook, or Amazon Cognito, you don&#39;t need to create a separate IAM identity provider. These OIDC identity providers are already built-in to Amazon Web Services and are available for your use. Instead, you can move directly to creating new roles using your identity provider. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_oidc.html\&quot;&gt;Creating a role for web identity or OpenID connect federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;When you create the IAM OIDC provider, you specify the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;The URL of the OIDC identity provider (IdP) to trust&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;A list of client IDs (also known as audiences) that identify the application or applications allowed to authenticate using the OIDC provider&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;A list of tags that are attached to the specified IAM OIDC provider&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;A list of thumbprints of one or more server certificates that the IdP uses&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;You get all of this information from the OIDC IdP you want to use to access Amazon Web Services.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Amazon Web Services secures communication with some OIDC identity providers (IdPs) through our library of trusted root certificate authorities (CAs) instead of using a certificate thumbprint to verify your IdP server certificate. These OIDC IdPs include Auth0, GitHub, Google, and those that use an Amazon S3 bucket to host a JSON Web Key Set (JWKS) endpoint. In these cases, your legacy thumbprint remains in your configuration, but is no longer used for validation.&lt;/p&gt; &lt;/note&gt; &lt;note&gt; &lt;p&gt;The trust for the OIDC provider is derived from the IAM provider that this operation creates. Therefore, it is best to limit access to the &lt;a&gt;CreateOpenIDConnectProvider&lt;/a&gt; operation to highly privileged users.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param url: &lt;p&gt;The URL of the identity provider. The URL must begin with &lt;code&gt;https://&lt;/code&gt; and should correspond to the &lt;code&gt;iss&lt;/code&gt; claim in the provider&#39;s OpenID Connect ID tokens. Per the OIDC standard, path components are allowed but query parameters are not. Typically the URL consists of only a hostname, like &lt;code&gt;https://server.example.org&lt;/code&gt; or &lt;code&gt;https://example.com&lt;/code&gt;. The URL should not contain a port number. &lt;/p&gt; &lt;p&gt;You cannot register the same provider multiple times in a single Amazon Web Services account. If you try to submit a URL that has already been used for an OpenID Connect provider in the Amazon Web Services account, you will get an error.&lt;/p&gt;
    :type url: str
    :param thumbprint_list: &lt;p&gt;A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider&#39;s server certificates. Typically this list includes only one entry. However, IAM lets you have up to five thumbprints for an OIDC provider. This lets you maintain multiple thumbprints if the identity provider is rotating certificates.&lt;/p&gt; &lt;p&gt;The server certificate thumbprint is the hex-encoded SHA-1 hash value of the X.509 certificate used by the domain where the OpenID Connect provider makes its keys available. It is always a 40-character string.&lt;/p&gt; &lt;p&gt;You must provide at least one thumbprint when creating an IAM OIDC provider. For example, assume that the OIDC provider is &lt;code&gt;server.example.com&lt;/code&gt; and the provider stores its keys at https://keys.server.example.com/openid-connect. In that case, the thumbprint string would be the hex-encoded SHA-1 hash value of the certificate used by &lt;code&gt;https://keys.server.example.com.&lt;/code&gt; &lt;/p&gt; &lt;p&gt;For more information about obtaining the OIDC provider thumbprint, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html\&quot;&gt;Obtaining the thumbprint for an OpenID Connect provider&lt;/a&gt; in the &lt;i&gt;IAM user Guide&lt;/i&gt;.&lt;/p&gt;
    :type thumbprint_list: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param client_id_list: &lt;p&gt;Provides a list of client IDs, also known as audiences. When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. This is the value that&#39;s sent as the &lt;code&gt;client_id&lt;/code&gt; parameter on OAuth requests.&lt;/p&gt; &lt;p&gt;You can register multiple client IDs with the same provider. For example, you might have multiple applications that use the same OIDC provider. You cannot register more than 100 client IDs with a single IAM OIDC provider.&lt;/p&gt; &lt;p&gt;There is no defined format for a client ID. The &lt;code&gt;CreateOpenIDConnectProviderRequest&lt;/code&gt; operation accepts client IDs up to 255 characters long.&lt;/p&gt;
    :type client_id_list: List[str]
    :param tags: &lt;p&gt;A list of tags that you want to attach to the new IAM OpenID Connect (OIDC) provider. Each tag consists of a key name and an associated value. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.&lt;/p&gt; &lt;/note&gt;
    :type tags: list | bytes

    :rtype: Union[CreateOpenIDConnectProviderResponse, Tuple[CreateOpenIDConnectProviderResponse, int], Tuple[CreateOpenIDConnectProviderResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_create_policy(policy_name, policy_document, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path=None, description=None, tags=None):  # noqa: E501
    """get_create_policy

    &lt;p&gt;Creates a new managed policy for your Amazon Web Services account.&lt;/p&gt; &lt;p&gt;This operation creates a policy version with a version identifier of &lt;code&gt;v1&lt;/code&gt; and sets v1 as the policy&#39;s default version. For more information about policy versions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;As a best practice, you can validate your IAM policies. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\&quot;&gt;Validating IAM policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about managed policies in general, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param policy_name: &lt;p&gt;The friendly name of the policy.&lt;/p&gt; &lt;p&gt;IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \&quot;MyResource\&quot; and \&quot;myresource\&quot;.&lt;/p&gt;
    :type policy_name: str
    :param policy_document: &lt;p&gt;The JSON policy document that you want to use as the content for the new policy.&lt;/p&gt; &lt;p&gt;You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.&lt;/p&gt; &lt;p&gt;The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\&quot;&gt;IAM and STS character quotas&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;To learn more about JSON policy grammar, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_grammar.html\&quot;&gt;Grammar of the IAM JSON policy language&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_document: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path: &lt;p&gt;The path for the policy.&lt;/p&gt; &lt;p&gt;For more information about paths, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\&quot;&gt;IAM identifiers&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/).&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt; &lt;note&gt; &lt;p&gt;You cannot use an asterisk (*) in the path name.&lt;/p&gt; &lt;/note&gt;
    :type path: str
    :param description: &lt;p&gt;A friendly description of the policy.&lt;/p&gt; &lt;p&gt;Typically used to store information about the permissions defined in the policy. For example, \&quot;Grants access to production DynamoDB tables.\&quot;&lt;/p&gt; &lt;p&gt;The policy description is immutable. After a value is assigned, it cannot be changed.&lt;/p&gt;
    :type description: str
    :param tags: &lt;p&gt;A list of tags that you want to attach to the new IAM customer managed policy. Each tag consists of a key name and an associated value. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.&lt;/p&gt; &lt;/note&gt;
    :type tags: list | bytes

    :rtype: Union[CreatePolicyResponse, Tuple[CreatePolicyResponse, int], Tuple[CreatePolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_create_policy_version(policy_arn, policy_document, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, set_as_default=None):  # noqa: E501
    """get_create_policy_version

    &lt;p&gt;Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using &lt;a&gt;DeletePolicyVersion&lt;/a&gt; before you create a new version.&lt;/p&gt; &lt;p&gt;Optionally, you can set the new version as the policy&#39;s default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached.&lt;/p&gt; &lt;p&gt;For more information about managed policy versions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param policy_document: &lt;p&gt;The JSON policy document that you want to use as the content for this new version of the policy.&lt;/p&gt; &lt;p&gt;You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.&lt;/p&gt; &lt;p&gt;The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\&quot;&gt;IAM and STS character quotas&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_document: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param set_as_default: &lt;p&gt;Specifies whether to set this version as the policy&#39;s default version.&lt;/p&gt; &lt;p&gt;When this parameter is &lt;code&gt;true&lt;/code&gt;, the new policy version becomes the operative version. That is, it becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached to.&lt;/p&gt; &lt;p&gt;For more information about managed policy versions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type set_as_default: bool

    :rtype: Union[CreatePolicyVersionResponse, Tuple[CreatePolicyVersionResponse, int], Tuple[CreatePolicyVersionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_create_role(role_name, assume_role_policy_document, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path=None, description=None, max_session_duration=None, permissions_boundary=None, tags=None):  # noqa: E501
    """get_create_role

    &lt;p&gt;Creates a new role for your Amazon Web Services account.&lt;/p&gt; &lt;p&gt; For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. For information about quotas for role names and the number of roles you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name of the role to create.&lt;/p&gt; &lt;p&gt;IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \&quot;MyResource\&quot; and \&quot;myresource\&quot;.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param assume_role_policy_document: &lt;p&gt;The trust relationship policy document that grants an entity permission to assume the role.&lt;/p&gt; &lt;p&gt;In IAM, you must provide a JSON policy that has been converted to a string. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; Upon success, the response includes the same trust policy in JSON format.&lt;/p&gt;
    :type assume_role_policy_document: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path: &lt;p&gt; The path to the role. For more information about paths, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\&quot;&gt;IAM Identifiers&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/).&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path: str
    :param description: A description of the role.
    :type description: str
    :param max_session_duration: &lt;p&gt;The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default value of one hour is applied. This setting can have a value from 1 hour to 12 hours.&lt;/p&gt; &lt;p&gt;Anyone who assumes the role from the CLI or API can use the &lt;code&gt;DurationSeconds&lt;/code&gt; API parameter or the &lt;code&gt;duration-seconds&lt;/code&gt; CLI parameter to request a longer session. The &lt;code&gt;MaxSessionDuration&lt;/code&gt; setting determines the maximum duration that can be requested using the &lt;code&gt;DurationSeconds&lt;/code&gt; parameter. If users don&#39;t specify a value for the &lt;code&gt;DurationSeconds&lt;/code&gt; parameter, their security credentials are valid for one hour by default. This applies when you use the &lt;code&gt;AssumeRole*&lt;/code&gt; API operations or the &lt;code&gt;assume-role*&lt;/code&gt; CLI operations but does not apply when you use those operations to create a console URL. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html\&quot;&gt;Using IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type max_session_duration: int
    :param permissions_boundary: &lt;p&gt;The ARN of the managed policy that is used to set the permissions boundary for the role.&lt;/p&gt; &lt;p&gt;A permissions boundary policy defines the maximum permissions that identity-based policies can grant to an entity, but does not grant permissions. Permissions boundaries do not define the maximum permissions that a resource-based policy can grant to an entity. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\&quot;&gt;Permissions boundaries for IAM entities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types\&quot;&gt;Policy types &lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type permissions_boundary: str
    :param tags: &lt;p&gt;A list of tags that you want to attach to the new role. Each tag consists of a key name and an associated value. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.&lt;/p&gt; &lt;/note&gt;
    :type tags: list | bytes

    :rtype: Union[CreateRoleResponse, Tuple[CreateRoleResponse, int], Tuple[CreateRoleResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_create_saml_provider(saml_metadata_document, name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, tags=None):  # noqa: E501
    """get_create_saml_provider

    &lt;p&gt;Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.&lt;/p&gt; &lt;p&gt;The SAML provider resource that you create with this operation can be used as a principal in an IAM role&#39;s trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the Amazon Web Services Management Console or one that supports API access to Amazon Web Services.&lt;/p&gt; &lt;p&gt;When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer&#39;s name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization&#39;s IdP.&lt;/p&gt; &lt;note&gt; &lt;p&gt; This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html\&quot;&gt;Enabling SAML 2.0 federated users to access the Amazon Web Services Management Console&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param saml_metadata_document: &lt;p&gt;An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer&#39;s name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization&#39;s IdP.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt; &lt;/p&gt;
    :type saml_metadata_document: str
    :param name: &lt;p&gt;The name of the provider to create.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param tags: &lt;p&gt;A list of tags that you want to attach to the new IAM SAML provider. Each tag consists of a key name and an associated value. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.&lt;/p&gt; &lt;/note&gt;
    :type tags: list | bytes

    :rtype: Union[CreateSAMLProviderResponse, Tuple[CreateSAMLProviderResponse, int], Tuple[CreateSAMLProviderResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_create_service_linked_role(aws_service_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, description=None, custom_suffix=None):  # noqa: E501
    """get_create_service_linked_role

    &lt;p&gt;Creates an IAM role that is linked to a specific Amazon Web Services service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your Amazon Web Services resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html\&quot;&gt;Using service-linked roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;p&gt;To attach a policy to this service-linked role, you must make the request using the Amazon Web Services service that depends on this role.&lt;/p&gt; # noqa: E501

    :param aws_service_name: &lt;p&gt;The service principal for the Amazon Web Services service to which this role is attached. You use a string similar to a URL but without the http:// in front. For example: &lt;code&gt;elasticbeanstalk.amazonaws.com&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;Service principals are unique and case-sensitive. To find the exact service principal for your service-linked role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html\&quot;&gt;Amazon Web Services services that work with IAM&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. Look for the services that have &lt;b&gt;Yes &lt;/b&gt;in the &lt;b&gt;Service-Linked Role&lt;/b&gt; column. Choose the &lt;b&gt;Yes&lt;/b&gt; link to view the service-linked role documentation for that service.&lt;/p&gt;
    :type aws_service_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param description: The description of the role.
    :type description: str
    :param custom_suffix: &lt;p/&gt; &lt;p&gt;A string that you provide, which is combined with the service-provided prefix to form the complete role name. If you make multiple requests for the same service, then you must supply a different &lt;code&gt;CustomSuffix&lt;/code&gt; for each request. Otherwise the request fails with a duplicate role name error. For example, you could add &lt;code&gt;-1&lt;/code&gt; or &lt;code&gt;-debug&lt;/code&gt; to the suffix.&lt;/p&gt; &lt;p&gt;Some services do not support the &lt;code&gt;CustomSuffix&lt;/code&gt; parameter. If you provide an optional suffix and the operation fails, try the operation again without the suffix.&lt;/p&gt;
    :type custom_suffix: str

    :rtype: Union[CreateServiceLinkedRoleResponse, Tuple[CreateServiceLinkedRoleResponse, int], Tuple[CreateServiceLinkedRoleResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_create_service_specific_credential(user_name, service_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_create_service_specific_credential

    &lt;p&gt;Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service. &lt;/p&gt; &lt;p&gt;You can have a maximum of two sets of service-specific credentials for each supported service per user.&lt;/p&gt; &lt;p&gt;You can create service-specific credentials for CodeCommit and Amazon Keyspaces (for Apache Cassandra).&lt;/p&gt; &lt;p&gt;You can reset the password to a new service-generated value by calling &lt;a&gt;ResetServiceSpecificCredential&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about service-specific credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_ssh-keys.html\&quot;&gt;Using IAM with CodeCommit: Git credentials, SSH keys, and Amazon Web Services access keys&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user that is to be associated with the credentials. The new service-specific credentials have the same permissions as the associated user except that they can be used only to access the specified service.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param service_name: The name of the Amazon Web Services service that is to be associated with the credentials. The service you specify here is the only service that can be accessed using these credentials.
    :type service_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[CreateServiceSpecificCredentialResponse, Tuple[CreateServiceSpecificCredentialResponse, int], Tuple[CreateServiceSpecificCredentialResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_create_user(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path=None, permissions_boundary=None, tags=None):  # noqa: E501
    """get_create_user

    &lt;p&gt;Creates a new IAM user for your Amazon Web Services account.&lt;/p&gt; &lt;p&gt; For information about quotas for the number of IAM users you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user to create.&lt;/p&gt; &lt;p&gt;IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \&quot;MyResource\&quot; and \&quot;myresource\&quot;.&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path: &lt;p&gt; The path for the user name. For more information about paths, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\&quot;&gt;IAM identifiers&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/).&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path: str
    :param permissions_boundary: &lt;p&gt;The ARN of the managed policy that is used to set the permissions boundary for the user.&lt;/p&gt; &lt;p&gt;A permissions boundary policy defines the maximum permissions that identity-based policies can grant to an entity, but does not grant permissions. Permissions boundaries do not define the maximum permissions that a resource-based policy can grant to an entity. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\&quot;&gt;Permissions boundaries for IAM entities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types\&quot;&gt;Policy types &lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type permissions_boundary: str
    :param tags: &lt;p&gt;A list of tags that you want to attach to the new user. Each tag consists of a key name and an associated value. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.&lt;/p&gt; &lt;/note&gt;
    :type tags: list | bytes

    :rtype: Union[CreateUserResponse, Tuple[CreateUserResponse, int], Tuple[CreateUserResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_create_virtual_mfa_device(virtual_mfa_device_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path=None, tags=None):  # noqa: E501
    """get_create_virtual_mfa_device

    &lt;p&gt;Creates a new virtual MFA device for the Amazon Web Services account. After creating the virtual MFA, use &lt;a&gt;EnableMFADevice&lt;/a&gt; to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\&quot;&gt;Using a virtual MFA device&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For information about the maximum number of MFA devices you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt;The seed information contained in the QR code and the Base32 string should be treated like any other secret access information. In other words, protect the seed information as you would your Amazon Web Services access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param virtual_mfa_device_name: &lt;p&gt;The name of the virtual MFA device, which must be unique. Use with path to uniquely identify a virtual MFA device.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type virtual_mfa_device_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path: &lt;p&gt; The path for the virtual MFA device. For more information about paths, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\&quot;&gt;IAM identifiers&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/).&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path: str
    :param tags: &lt;p&gt;A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name and an associated value. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.&lt;/p&gt; &lt;/note&gt;
    :type tags: list | bytes

    :rtype: Union[CreateVirtualMFADeviceResponse, Tuple[CreateVirtualMFADeviceResponse, int], Tuple[CreateVirtualMFADeviceResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_deactivate_mfa_device(user_name, serial_number, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_deactivate_mfa_device

    &lt;p&gt;Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.&lt;/p&gt; &lt;p&gt;For more information about creating and working with virtual MFA devices, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\&quot;&gt;Enabling a virtual multi-factor authentication (MFA) device&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user whose MFA device you want to deactivate.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param serial_number: &lt;p&gt;The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: &#x3D;,.@:/-&lt;/p&gt;
    :type serial_number: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_access_key(access_key_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_delete_access_key

    &lt;p&gt;Deletes the access key pair associated with the specified IAM user.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; # noqa: E501

    :param access_key_id: &lt;p&gt;The access key ID for the access key ID and secret access key you want to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type access_key_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the user whose access key pair you want to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_account_alias(account_alias, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_account_alias

     Deletes the specified Amazon Web Services account alias. For information about using an Amazon Web Services account alias, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\&quot;&gt;Creating, deleting, and listing an Amazon Web Services account alias&lt;/a&gt; in the &lt;i&gt;Amazon Web Services Sign-In User Guide&lt;/i&gt;. # noqa: E501

    :param account_alias: &lt;p&gt;The name of the account alias to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.&lt;/p&gt;
    :type account_alias: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_account_password_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_account_password_policy

    Deletes the password policy for the Amazon Web Services account. There are no parameters. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_group(group_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_group

    Deletes the specified IAM group. The group must not contain any users or have any attached policies. # noqa: E501

    :param group_name: &lt;p&gt;The name of the IAM group to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_group_policy(group_name, policy_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_group_policy

    &lt;p&gt;Deletes the specified inline policy that is embedded in the specified IAM group.&lt;/p&gt; &lt;p&gt;A group can also have managed policies attached to it. To detach a managed policy from a group, use &lt;a&gt;DetachGroupPolicy&lt;/a&gt;. For more information about policies, refer to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param group_name: &lt;p&gt;The name (friendly name, not ARN) identifying the group that the policy is embedded in.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param policy_name: &lt;p&gt;The name identifying the policy document to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_instance_profile(instance_profile_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_instance_profile

    &lt;p&gt;Deletes the specified instance profile. The instance profile must not have an associated role.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.&lt;/p&gt; &lt;/important&gt; &lt;p&gt;For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param instance_profile_name: &lt;p&gt;The name of the instance profile to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type instance_profile_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_login_profile(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_login_profile

    &lt;p&gt;Deletes the password for the specified IAM user, For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_passwords_admin-change-user.html\&quot;&gt;Managing passwords for IAM users&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;You can use the CLI, the Amazon Web Services API, or the &lt;b&gt;Users&lt;/b&gt; page in the IAM console to delete a password for any IAM user. You can use &lt;a&gt;ChangePassword&lt;/a&gt; to update, but not delete, your own password in the &lt;b&gt;My Security Credentials&lt;/b&gt; page in the Amazon Web Services Management Console.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Deleting a user&#39;s password does not prevent a user from accessing Amazon Web Services through the command line interface or the API. To prevent all user access, you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see &lt;a&gt;UpdateAccessKey&lt;/a&gt; and &lt;a&gt;DeleteAccessKey&lt;/a&gt;.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user whose password you want to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_open_id_connect_provider(open_id_connect_provider_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_open_id_connect_provider

    &lt;p&gt;Deletes an OpenID Connect identity provider (IdP) resource object in IAM.&lt;/p&gt; &lt;p&gt;Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails.&lt;/p&gt; &lt;p&gt;This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.&lt;/p&gt; # noqa: E501

    :param open_id_connect_provider_arn: The Amazon Resource Name (ARN) of the IAM OpenID Connect provider resource object to delete. You can get a list of OpenID Connect provider resource ARNs by using the &lt;a&gt;ListOpenIDConnectProviders&lt;/a&gt; operation.
    :type open_id_connect_provider_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_policy(policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_policy

    &lt;p&gt;Deletes the specified managed policy.&lt;/p&gt; &lt;p&gt;Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition, you must delete all the policy&#39;s versions. The following steps describe the process for deleting a managed policy:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Detach the policy from all users, groups, and roles that the policy is attached to, using &lt;a&gt;DetachUserPolicy&lt;/a&gt;, &lt;a&gt;DetachGroupPolicy&lt;/a&gt;, or &lt;a&gt;DetachRolePolicy&lt;/a&gt;. To list all the users, groups, and roles that a policy is attached to, use &lt;a&gt;ListEntitiesForPolicy&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Delete all versions of the policy using &lt;a&gt;DeletePolicyVersion&lt;/a&gt;. To list the policy&#39;s versions, use &lt;a&gt;ListPolicyVersions&lt;/a&gt;. You cannot use &lt;a&gt;DeletePolicyVersion&lt;/a&gt; to delete the version that is marked as the default version. You delete the policy&#39;s default version in the next step of the process.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Delete the policy (this automatically deletes the policy&#39;s default version) using this operation.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy you want to delete.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_policy_version(policy_arn, version_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_policy_version

    &lt;p&gt;Deletes the specified version from the specified managed policy.&lt;/p&gt; &lt;p&gt;You cannot delete the default version from a policy using this operation. To delete the default version from a policy, use &lt;a&gt;DeletePolicy&lt;/a&gt;. To find out which version of a policy is marked as the default version, use &lt;a&gt;ListPolicyVersions&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For information about versions for managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy from which you want to delete a version.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param version_id: &lt;p&gt;The policy version to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that consists of the lowercase letter &#39;v&#39; followed by one or two digits, and optionally followed by a period &#39;.&#39; and a string of letters and digits.&lt;/p&gt; &lt;p&gt;For more information about managed policy versions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type version_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_role(role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_role

    &lt;p&gt;Deletes the specified role. Unlike the Amazon Web Services Management Console, when you delete a role programmatically, you must delete the items attached to the role manually, or the deletion fails. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_manage_delete.html#roles-managingrole-deleting-cli\&quot;&gt;Deleting an IAM role&lt;/a&gt;. Before attempting to delete a role, remove the following attached items: &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Inline policies (&lt;a&gt;DeleteRolePolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Attached managed policies (&lt;a&gt;DetachRolePolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Instance profile (&lt;a&gt;RemoveRoleFromInstanceProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Optional – Delete instance profile after detaching from role for resource clean up (&lt;a&gt;DeleteInstanceProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;important&gt; &lt;p&gt;Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name of the role to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_role_permissions_boundary(role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_role_permissions_boundary

    &lt;p&gt;Deletes the permissions boundary for the specified IAM role. &lt;/p&gt; &lt;p&gt;You cannot set the boundary for a service-linked role.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Deleting the permissions boundary for a role might increase its permissions. For example, it might allow anyone who assumes the role to perform all the actions granted in its permissions policies.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param role_name: The name (friendly name, not ARN) of the IAM role from which you want to remove the permissions boundary.
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_role_policy(role_name, policy_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_role_policy

    &lt;p&gt;Deletes the specified inline policy that is embedded in the specified IAM role.&lt;/p&gt; &lt;p&gt;A role can also have managed policies attached to it. To detach a managed policy from a role, use &lt;a&gt;DetachRolePolicy&lt;/a&gt;. For more information about policies, refer to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name (friendly name, not ARN) identifying the role that the policy is embedded in.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param policy_name: &lt;p&gt;The name of the inline policy to delete from the specified IAM role.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_saml_provider(saml_provider_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_saml_provider

    &lt;p&gt;Deletes a SAML provider resource in IAM.&lt;/p&gt; &lt;p&gt;Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource&#39;s ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.&lt;/p&gt; &lt;note&gt; &lt;p&gt; This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param saml_provider_arn: The Amazon Resource Name (ARN) of the SAML provider to delete.
    :type saml_provider_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_server_certificate(server_certificate_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_server_certificate

    &lt;p&gt;Deletes the specified server certificate.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;important&gt; &lt;p&gt; If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn&#39;t detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html\&quot;&gt;DeleteLoadBalancerListeners&lt;/a&gt; in the &lt;i&gt;Elastic Load Balancing API Reference&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param server_certificate_name: &lt;p&gt;The name of the server certificate you want to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type server_certificate_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_service_linked_role(role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_service_linked_role

    &lt;p&gt;Submits a service-linked role deletion request and returns a &lt;code&gt;DeletionTaskId&lt;/code&gt;, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the &lt;code&gt;DeletionTaskId&lt;/code&gt; of the earlier request is returned.&lt;/p&gt; &lt;p&gt;If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the &lt;a&gt;GetServiceLinkedRoleDeletionStatus&lt;/a&gt; operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the &lt;a href&#x3D;\&quot;http://docs.aws.amazon.com/\&quot;&gt;Amazon Web Services documentation&lt;/a&gt; for your service.&lt;/p&gt; &lt;p&gt;For more information about service-linked roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role\&quot;&gt;Roles terms and concepts: Amazon Web Services service-linked role&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param role_name: The name of the service-linked role to be deleted.
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[DeleteServiceLinkedRoleResponse, Tuple[DeleteServiceLinkedRoleResponse, int], Tuple[DeleteServiceLinkedRoleResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_service_specific_credential(service_specific_credential_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_delete_service_specific_credential

    Deletes the specified service-specific credential. # noqa: E501

    :param service_specific_credential_id: &lt;p&gt;The unique identifier of the service-specific credential. You can get this value by calling &lt;a&gt;ListServiceSpecificCredentials&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type service_specific_credential_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the IAM user associated with the service-specific credential. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_signing_certificate(certificate_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_delete_signing_certificate

    &lt;p&gt;Deletes a signing certificate associated with the specified IAM user.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated IAM users.&lt;/p&gt; # noqa: E501

    :param certificate_id: &lt;p&gt;The ID of the signing certificate to delete.&lt;/p&gt; &lt;p&gt;The format of this parameter, as described by its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex&lt;/a&gt; pattern, is a string of characters that can be upper- or lower-cased letters or digits.&lt;/p&gt;
    :type certificate_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the user the signing certificate belongs to.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_ssh_public_key(user_name, ssh_public_key_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_ssh_public_key

    &lt;p&gt;Deletes the specified SSH public key.&lt;/p&gt; &lt;p&gt;The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user associated with the SSH public key.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param ssh_public_key_id: &lt;p&gt;The unique identifier for the SSH public key.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type ssh_public_key_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_user(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_user

    &lt;p&gt;Deletes the specified IAM user. Unlike the Amazon Web Services Management Console, when you delete a user programmatically, you must delete the items attached to the user manually, or the deletion fails. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_deleting_cli\&quot;&gt;Deleting an IAM user&lt;/a&gt;. Before attempting to delete a user, remove the following items:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Password (&lt;a&gt;DeleteLoginProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Access keys (&lt;a&gt;DeleteAccessKey&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Signing certificate (&lt;a&gt;DeleteSigningCertificate&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;SSH public key (&lt;a&gt;DeleteSSHPublicKey&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Git credentials (&lt;a&gt;DeleteServiceSpecificCredential&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Multi-factor authentication (MFA) device (&lt;a&gt;DeactivateMFADevice&lt;/a&gt;, &lt;a&gt;DeleteVirtualMFADevice&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Inline policies (&lt;a&gt;DeleteUserPolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Attached managed policies (&lt;a&gt;DetachUserPolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Group memberships (&lt;a&gt;RemoveUserFromGroup&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_user_permissions_boundary(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_user_permissions_boundary

    &lt;p&gt;Deletes the permissions boundary for the specified IAM user.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies. &lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param user_name: The name (friendly name, not ARN) of the IAM user from which you want to remove the permissions boundary.
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_user_policy(user_name, policy_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_user_policy

    &lt;p&gt;Deletes the specified inline policy that is embedded in the specified IAM user.&lt;/p&gt; &lt;p&gt;A user can also have managed policies attached to it. To detach a managed policy from a user, use &lt;a&gt;DetachUserPolicy&lt;/a&gt;. For more information about policies, refer to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name (friendly name, not ARN) identifying the user that the policy is embedded in.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param policy_name: &lt;p&gt;The name identifying the policy document to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_delete_virtual_mfa_device(serial_number, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_delete_virtual_mfa_device

    &lt;p&gt;Deletes a virtual MFA device.&lt;/p&gt; &lt;note&gt; &lt;p&gt; You must deactivate a user&#39;s virtual MFA device before you can delete it. For information about deactivating MFA devices, see &lt;a&gt;DeactivateMFADevice&lt;/a&gt;. &lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param serial_number: &lt;p&gt;The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the same as the ARN.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: &#x3D;,.@:/-&lt;/p&gt;
    :type serial_number: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_detach_group_policy(group_name, policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_detach_group_policy

    &lt;p&gt;Removes the specified managed policy from the specified IAM group.&lt;/p&gt; &lt;p&gt;A group can also have inline policies embedded with it. To delete an inline policy, use &lt;a&gt;DeleteGroupPolicy&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param group_name: &lt;p&gt;The name (friendly name, not ARN) of the IAM group to detach the policy from.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy you want to detach.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_detach_role_policy(role_name, policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_detach_role_policy

    &lt;p&gt;Removes the specified managed policy from the specified role.&lt;/p&gt; &lt;p&gt;A role can also have inline policies embedded with it. To delete an inline policy, use &lt;a&gt;DeleteRolePolicy&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name (friendly name, not ARN) of the IAM role to detach the policy from.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy you want to detach.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_detach_user_policy(user_name, policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_detach_user_policy

    &lt;p&gt;Removes the specified managed policy from the specified user.&lt;/p&gt; &lt;p&gt;A user can also have inline policies embedded with it. To delete an inline policy, use &lt;a&gt;DeleteUserPolicy&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name (friendly name, not ARN) of the IAM user to detach the policy from.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy you want to detach.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_enable_mfa_device(user_name, serial_number, authentication_code1, authentication_code2, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_enable_mfa_device

    Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device. # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user for whom you want to enable the MFA device.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param serial_number: &lt;p&gt;The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: &#x3D;,.@:/-&lt;/p&gt;
    :type serial_number: str
    :param authentication_code1: &lt;p&gt;An authentication code emitted by the device. &lt;/p&gt; &lt;p&gt;The format for this parameter is a string of six digits.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_mfa_sync.html\&quot;&gt;resync the device&lt;/a&gt;.&lt;/p&gt; &lt;/important&gt;
    :type authentication_code1: str
    :param authentication_code2: &lt;p&gt;A subsequent authentication code emitted by the device.&lt;/p&gt; &lt;p&gt;The format for this parameter is a string of six digits.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_mfa_sync.html\&quot;&gt;resync the device&lt;/a&gt;.&lt;/p&gt; &lt;/important&gt;
    :type authentication_code2: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_generate_credential_report(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_generate_credential_report

     Generates a credential report for the Amazon Web Services account. For more information about the credential report, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html\&quot;&gt;Getting credential reports&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GenerateCredentialReportResponse, Tuple[GenerateCredentialReportResponse, int], Tuple[GenerateCredentialReportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_generate_organizations_access_report(entity_path, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, organizations_policy_id=None):  # noqa: E501
    """get_generate_organizations_access_report

    &lt;p&gt;Generates a report for service last accessed data for Organizations. You can generate a report for any entities (organization root, organizational unit, or account) or policies in your organization.&lt;/p&gt; &lt;p&gt;To call this operation, you must be signed in using your Organizations management account credentials. You can use your long-term IAM user or root user credentials, or temporary credentials from assuming an IAM role. SCPs must be enabled for your organization root. You must have the required IAM and Organizations permissions. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Refining permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can generate a service last accessed data report for entities by specifying only the entity&#39;s path. This data includes a list of services that are allowed by any service control policies (SCPs) that apply to the entity.&lt;/p&gt; &lt;p&gt;You can generate a service last accessed data report for a policy by specifying an entity&#39;s path and an optional Organizations policy ID. This data includes a list of services that are allowed by the specified SCP.&lt;/p&gt; &lt;p&gt;For each service in both report types, the data includes the most recent account activity that the policy allows to account principals in the entity or the entity&#39;s children. For important information about the data, reporting period, permissions required, troubleshooting, and supported Regions see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt;The data includes all attempts to access Amazon Web Services, not just the successful ones. This includes all attempts that were made using the Amazon Web Services Management Console, the Amazon Web Services API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that an account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\&quot;&gt;Logging IAM events with CloudTrail&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;p&gt;This operation returns a &lt;code&gt;JobId&lt;/code&gt;. Use this parameter in the &lt;code&gt; &lt;a&gt;GetOrganizationsAccessReport&lt;/a&gt; &lt;/code&gt; operation to check the status of the report generation. To check the status of this request, use the &lt;code&gt;JobId&lt;/code&gt; parameter in the &lt;code&gt; &lt;a&gt;GetOrganizationsAccessReport&lt;/a&gt; &lt;/code&gt; operation and test the &lt;code&gt;JobStatus&lt;/code&gt; response parameter. When the job is complete, you can retrieve the report.&lt;/p&gt; &lt;p&gt;To generate a service last accessed data report for entities, specify an entity path without specifying the optional Organizations policy ID. The type of entity that you specify determines the data returned in the report.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Root&lt;/b&gt; – When you specify the organizations root as the entity, the resulting report lists all of the services allowed by SCPs that are attached to your root. For each service, the report includes data for all accounts in your organization except the management account, because the management account is not limited by SCPs.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;OU&lt;/b&gt; – When you specify an organizational unit (OU) as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the OU and its parents. For each service, the report includes data for all accounts in the OU or its children. This data excludes the management account, because the management account is not limited by SCPs.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;management account&lt;/b&gt; – When you specify the management account, the resulting report lists all Amazon Web Services services, because the management account is not limited by SCPs. For each service, the report includes data for only the management account.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Account&lt;/b&gt; – When you specify another account as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the account and its parents. For each service, the report includes data for only the specified account.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To generate a service last accessed data report for policies, specify an entity path and the optional Organizations policy ID. The type of entity that you specify determines the data returned for each service.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Root&lt;/b&gt; – When you specify the root entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in your organization to which the SCP applies. This data excludes the management account, because the management account is not limited by SCPs. If the SCP is not attached to any entities in the organization, then the report will return a list of services with no data.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;OU&lt;/b&gt; – When you specify an OU entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in the OU or its children to which the SCP applies. This means that other accounts outside the OU that are affected by the SCP might not be included in the data. This data excludes the management account, because the management account is not limited by SCPs. If the SCP is not attached to the OU or one of its children, the report will return a list of services with no data.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;management account&lt;/b&gt; – When you specify the management account, the resulting report lists all Amazon Web Services services, because the management account is not limited by SCPs. If you specify a policy ID in the CLI or API, the policy is ignored. For each service, the report includes data for only the management account.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Account&lt;/b&gt; – When you specify another account entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for only the specified account. This means that other accounts in the organization that are affected by the SCP might not be included in the data. If the SCP is not attached to the account, the report will return a list of services with no data.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;Service last accessed data does not use other policy types when determining whether a principal could access a service. These other policy types include identity-based policies, resource-based policies, access control lists, IAM permissions boundaries, and STS assume role policies. It only applies SCP logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;For more information about service last accessed data, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing policy scope by viewing user activity&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param entity_path: The path of the Organizations entity (root, OU, or account). You can build an entity path using the known structure of your organization. For example, assume that your account ID is &lt;code&gt;123456789012&lt;/code&gt; and its parent OU ID is &lt;code&gt;ou-rge0-awsabcde&lt;/code&gt;. The organization root ID is &lt;code&gt;r-f6g7h8i9j0example&lt;/code&gt; and your organization ID is &lt;code&gt;o-a1b2c3d4e5&lt;/code&gt;. Your entity path is &lt;code&gt;o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012&lt;/code&gt;.
    :type entity_path: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param organizations_policy_id: &lt;p&gt;The identifier of the Organizations service control policy (SCP). This parameter is optional.&lt;/p&gt; &lt;p&gt;This ID is used to generate information about when an account principal that is limited by the SCP attempted to access an Amazon Web Services service.&lt;/p&gt;
    :type organizations_policy_id: str

    :rtype: Union[GenerateOrganizationsAccessReportResponse, Tuple[GenerateOrganizationsAccessReportResponse, int], Tuple[GenerateOrganizationsAccessReportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_generate_service_last_accessed_details(arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, granularity=None):  # noqa: E501
    """get_generate_service_last_accessed_details

    &lt;p&gt;Generates a report that includes details about when an IAM resource (user, group, role, or policy) was last used in an attempt to access Amazon Web Services services. Recent activity usually appears within four hours. IAM reports activity for at least the last 400 days, or less if your Region began supporting this feature within the last year. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period\&quot;&gt;Regions where data is tracked&lt;/a&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt;The service last accessed data includes all attempts to access an Amazon Web Services API, not just the successful ones. This includes all attempts that were made using the Amazon Web Services Management Console, the Amazon Web Services API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that your account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\&quot;&gt;Logging IAM events with CloudTrail&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;p&gt;The &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; operation returns a &lt;code&gt;JobId&lt;/code&gt;. Use this parameter in the following operations to retrieve the following details from your report: &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;GetServiceLastAccessedDetails&lt;/a&gt; – Use this operation for users, groups, roles, or policies to list every Amazon Web Services service that the resource could access using permissions policies. For each service, the response includes information about the most recent access attempt.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;JobId&lt;/code&gt; returned by &lt;code&gt;GenerateServiceLastAccessedDetail&lt;/code&gt; must be used by the same role within a session, or by the same user when used to call &lt;code&gt;GetServiceLastAccessedDetail&lt;/code&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;GetServiceLastAccessedDetailsWithEntities&lt;/a&gt; – Use this operation for groups and policies to list information about the associated entities (users or roles) that attempted to access a specific Amazon Web Services service. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To check the status of the &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; request, use the &lt;code&gt;JobId&lt;/code&gt; parameter in the same operations and test the &lt;code&gt;JobStatus&lt;/code&gt; response parameter.&lt;/p&gt; &lt;p&gt;For additional information about the permissions policies that allow an identity (user, group, or role) to access specific services, use the &lt;a&gt;ListPoliciesGrantingServiceAccess&lt;/a&gt; operation.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;For more information about service and action last accessed data, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param arn: The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when the resource was last used in an attempt to access an Amazon Web Services service.
    :type arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param granularity: The level of detail that you want to generate. You can specify whether you want to generate information about the last attempt to access services or actions. If you specify service-level granularity, this operation generates only service data. If you specify action-level granularity, it generates service and action data. If you don&#39;t include this optional parameter, the operation generates service data.
    :type granularity: str

    :rtype: Union[GenerateServiceLastAccessedDetailsResponse, Tuple[GenerateServiceLastAccessedDetailsResponse, int], Tuple[GenerateServiceLastAccessedDetailsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_access_key_last_used(access_key_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_access_key_last_used

    Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the Amazon Web Services service and Region that were specified in the last request made with that key. # noqa: E501

    :param access_key_id: &lt;p&gt;The identifier of an access key.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type access_key_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetAccessKeyLastUsedResponse, Tuple[GetAccessKeyLastUsedResponse, int], Tuple[GetAccessKeyLastUsedResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_account_authorization_details(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, filter=None, max_items=None, marker=None):  # noqa: E501
    """get_get_account_authorization_details

    &lt;p&gt;Retrieves information about all IAM users, groups, roles, and policies in your Amazon Web Services account, including their relationships to one another. Use this operation to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can optionally filter the results using the &lt;code&gt;Filter&lt;/code&gt; parameter. You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param filter: &lt;p&gt;A list of entity types used to filter the results. Only the entities that match the types you specify are included in the output. Use the value &lt;code&gt;LocalManagedPolicy&lt;/code&gt; to include customer managed policies.&lt;/p&gt; &lt;p&gt;The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the list must be one of the valid values listed below.&lt;/p&gt;
    :type filter: list | bytes
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str

    :rtype: Union[GetAccountAuthorizationDetailsResponse, Tuple[GetAccountAuthorizationDetailsResponse, int], Tuple[GetAccountAuthorizationDetailsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        filter = [EntityType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_get_account_password_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_account_password_policy

    Retrieves the password policy for the Amazon Web Services account. This tells you the complexity requirements and mandatory rotation periods for the IAM user passwords in your account. For more information about using a password policy, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html\&quot;&gt;Managing an IAM password policy&lt;/a&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetAccountPasswordPolicyResponse, Tuple[GetAccountPasswordPolicyResponse, int], Tuple[GetAccountPasswordPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_account_summary(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_account_summary

    &lt;p&gt;Retrieves information about IAM entity usage and IAM quotas in the Amazon Web Services account.&lt;/p&gt; &lt;p&gt; For information about IAM quotas, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetAccountSummaryResponse, Tuple[GetAccountSummaryResponse, int], Tuple[GetAccountSummaryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_context_keys_for_custom_policy(policy_input_list, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_context_keys_for_custom_policy

    &lt;p&gt;Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use &lt;a&gt;GetContextKeysForPrincipalPolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use &lt;code&gt;GetContextKeysForCustomPolicy&lt;/code&gt; to understand what key names and values you must supply when you call &lt;a&gt;SimulateCustomPolicy&lt;/a&gt;. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.&lt;/p&gt; # noqa: E501

    :param policy_input_list: &lt;p&gt;A list of policies for which you want the list of context keys referenced in those policies. Each document is specified as a string containing the complete, valid JSON text of an IAM policy.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_input_list: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetContextKeysForPolicyResponse, Tuple[GetContextKeysForPolicyResponse, int], Tuple[GetContextKeysForPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_context_keys_for_principal_policy(policy_source_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, policy_input_list=None):  # noqa: E501
    """get_get_context_keys_for_principal_policy

    &lt;p&gt;Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of.&lt;/p&gt; &lt;p&gt;You can optionally include a list of one or more additional policies, specified as strings. If you want to include &lt;i&gt;only&lt;/i&gt; a list of policies by string, use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; This operation discloses information about the permissions granted to other users. If you do not want users to see other user&#39;s permissions, then consider allowing them to use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use &lt;a&gt;GetContextKeysForPrincipalPolicy&lt;/a&gt; to understand what key names and values you must supply when you call &lt;a&gt;SimulatePrincipalPolicy&lt;/a&gt;.&lt;/p&gt; # noqa: E501

    :param policy_source_arn: &lt;p&gt;The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a user, the list includes context keys that are found in all policies that are attached to the user. The list also includes all groups that the user is a member of. If you pick a group or a role, then it includes only those context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded form here for clarity, but must be URL encoded to be included as a part of a real HTML request.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_source_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param policy_input_list: &lt;p&gt;An optional list of additional policies for which you want the list of context keys that are referenced.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_input_list: List[str]

    :rtype: Union[GetContextKeysForPolicyResponse, Tuple[GetContextKeysForPolicyResponse, int], Tuple[GetContextKeysForPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_credential_report(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_credential_report

     Retrieves a credential report for the Amazon Web Services account. For more information about the credential report, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html\&quot;&gt;Getting credential reports&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetCredentialReportResponse, Tuple[GetCredentialReportResponse, int], Tuple[GetCredentialReportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_group(group_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_get_group

     Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. # noqa: E501

    :param group_name: &lt;p&gt;The name of the group.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[GetGroupResponse, Tuple[GetGroupResponse, int], Tuple[GetGroupResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_group_policy(group_name, policy_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_group_policy

    &lt;p&gt;Retrieves the specified inline policy document that is embedded in the specified IAM group.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use &lt;a&gt;GetPolicy&lt;/a&gt; to determine the policy&#39;s default version, then use &lt;a&gt;GetPolicyVersion&lt;/a&gt; to retrieve the policy document.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param group_name: &lt;p&gt;The name of the group the policy is associated with.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param policy_name: &lt;p&gt;The name of the policy document to get.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetGroupPolicyResponse, Tuple[GetGroupPolicyResponse, int], Tuple[GetGroupPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_instance_profile(instance_profile_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_instance_profile

     Retrieves information about the specified instance profile, including the instance profile&#39;s path, GUID, ARN, and role. For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param instance_profile_name: &lt;p&gt;The name of the instance profile to get information about.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type instance_profile_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetInstanceProfileResponse, Tuple[GetInstanceProfileResponse, int], Tuple[GetInstanceProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_login_profile(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_login_profile

    &lt;p&gt;Retrieves the user name for the specified IAM user. A login profile is created when you create a password for the user to access the Amazon Web Services Management Console. If the user does not exist or does not have a password, the operation returns a 404 (&lt;code&gt;NoSuchEntity&lt;/code&gt;) error.&lt;/p&gt; &lt;p&gt;If you create an IAM user with access to the console, the &lt;code&gt;CreateDate&lt;/code&gt; reflects the date you created the initial password for the user.&lt;/p&gt; &lt;p&gt;If you create an IAM user with programmatic access, and then later add a password for the user to access the Amazon Web Services Management Console, the &lt;code&gt;CreateDate&lt;/code&gt; reflects the initial password creation date. A user with programmatic access does not have a login profile unless you create a password for the user to access the Amazon Web Services Management Console.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user whose login profile you want to retrieve.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetLoginProfileResponse, Tuple[GetLoginProfileResponse, int], Tuple[GetLoginProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_mfa_device(serial_number, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_get_mfa_device

    Retrieves information about an MFA device for a specified user. # noqa: E501

    :param serial_number: Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html\&quot;&gt;ARNs&lt;/a&gt;.
    :type serial_number: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: The friendly name identifying the user.
    :type user_name: str

    :rtype: Union[GetMFADeviceResponse, Tuple[GetMFADeviceResponse, int], Tuple[GetMFADeviceResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_open_id_connect_provider(open_id_connect_provider_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_open_id_connect_provider

    Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM. # noqa: E501

    :param open_id_connect_provider_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the OIDC provider resource object in IAM to get information for. You can get a list of OIDC provider resource ARNs by using the &lt;a&gt;ListOpenIDConnectProviders&lt;/a&gt; operation.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type open_id_connect_provider_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetOpenIDConnectProviderResponse, Tuple[GetOpenIDConnectProviderResponse, int], Tuple[GetOpenIDConnectProviderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_organizations_access_report(job_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, sort_key=None):  # noqa: E501
    """get_get_organizations_access_report

    &lt;p&gt;Retrieves the service last accessed data report for Organizations that was previously generated using the &lt;code&gt; &lt;a&gt;GenerateOrganizationsAccessReport&lt;/a&gt; &lt;/code&gt; operation. This operation retrieves the status of your report job and the report contents.&lt;/p&gt; &lt;p&gt;Depending on the parameters that you passed when you generated the report, the data returned could include different information. For details, see &lt;a&gt;GenerateOrganizationsAccessReport&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;To call this operation, you must be signed in to the management account in your organization. SCPs must be enabled for your organization root. You must have permissions to perform this operation. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Refining permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For each service that principals in an account (root user, IAM users, or IAM roles) could access using SCPs, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, it returns the reason that it failed.&lt;/p&gt; &lt;p&gt;By default, the list is sorted by service namespace.&lt;/p&gt; # noqa: E501

    :param job_id: The identifier of the request generated by the &lt;a&gt;GenerateOrganizationsAccessReport&lt;/a&gt; operation.
    :type job_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param sort_key: The key that is used to sort the results. If you choose the namespace key, the results are returned in alphabetical order. If you choose the time key, the results are sorted numerically by the date and time.
    :type sort_key: str

    :rtype: Union[GetOrganizationsAccessReportResponse, Tuple[GetOrganizationsAccessReportResponse, int], Tuple[GetOrganizationsAccessReportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_policy(policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_policy

    &lt;p&gt;Retrieves information about the specified managed policy, including the policy&#39;s default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use &lt;a&gt;ListEntitiesForPolicy&lt;/a&gt;. This operation returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use &lt;a&gt;GetPolicyVersion&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;This operation retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use &lt;a&gt;GetUserPolicy&lt;/a&gt;, &lt;a&gt;GetGroupPolicy&lt;/a&gt;, or &lt;a&gt;GetRolePolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the managed policy that you want information about.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetPolicyResponse, Tuple[GetPolicyResponse, int], Tuple[GetPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_policy_version(policy_arn, version_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_policy_version

    &lt;p&gt;Retrieves information about the specified version of the specified managed policy, including the policy document.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;To list the available versions for a policy, use &lt;a&gt;ListPolicyVersions&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;This operation retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use &lt;a&gt;GetUserPolicy&lt;/a&gt;, &lt;a&gt;GetGroupPolicy&lt;/a&gt;, or &lt;a&gt;GetRolePolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about the types of policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about managed policy versions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the managed policy that you want information about.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param version_id: &lt;p&gt;Identifies the policy version to retrieve.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that consists of the lowercase letter &#39;v&#39; followed by one or two digits, and optionally followed by a period &#39;.&#39; and a string of letters and digits.&lt;/p&gt;
    :type version_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetPolicyVersionResponse, Tuple[GetPolicyVersionResponse, int], Tuple[GetPolicyVersionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_role(role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_role

    &lt;p&gt;Retrieves information about the specified role, including the role&#39;s path, GUID, ARN, and the role&#39;s trust policy that grants permission to assume the role. For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name of the IAM role to get information about.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetRoleResponse, Tuple[GetRoleResponse, int], Tuple[GetRoleResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_role_policy(role_name, policy_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_role_policy

    &lt;p&gt;Retrieves the specified inline policy document that is embedded with the specified IAM role.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use &lt;a&gt;GetPolicy&lt;/a&gt; to determine the policy&#39;s default version, then use &lt;a&gt;GetPolicyVersion&lt;/a&gt; to retrieve the policy document.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name of the role associated with the policy.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param policy_name: &lt;p&gt;The name of the policy document to get.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetRolePolicyResponse, Tuple[GetRolePolicyResponse, int], Tuple[GetRolePolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_saml_provider(saml_provider_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_saml_provider

    &lt;p&gt;Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.&lt;/p&gt; &lt;note&gt; &lt;p&gt;This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param saml_provider_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the SAML provider resource object in IAM to get information about.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type saml_provider_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetSAMLProviderResponse, Tuple[GetSAMLProviderResponse, int], Tuple[GetSAMLProviderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_server_certificate(server_certificate_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_server_certificate

    &lt;p&gt;Retrieves information about the specified server certificate stored in IAM.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; # noqa: E501

    :param server_certificate_name: &lt;p&gt;The name of the server certificate you want to retrieve information about.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type server_certificate_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetServerCertificateResponse, Tuple[GetServerCertificateResponse, int], Tuple[GetServerCertificateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_service_last_accessed_details(job_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None):  # noqa: E501
    """get_get_service_last_accessed_details

    &lt;p&gt;Retrieves a service last accessed report that was created using the &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; operation. You can use the &lt;code&gt;JobId&lt;/code&gt; parameter in &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of Amazon Web Services services that the resource (user, group, role, or managed policy) can access.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; operation returns the reason that it failed.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;User&lt;/b&gt; – Returns the user ARN that you used to generate the report&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Group&lt;/b&gt; – Returns the ARN of the group member (user) that last attempted to access the service&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Role&lt;/b&gt; – Returns the role ARN that you used to generate the report&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Policy&lt;/b&gt; – Returns the ARN of the user or role that last used the policy to attempt to access the service&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;By default, the list is sorted by service namespace.&lt;/p&gt; &lt;p&gt;If you specified &lt;code&gt;ACTION_LEVEL&lt;/code&gt; granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data.&lt;/p&gt; &lt;p&gt;For more information about service and action last accessed data, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param job_id: The ID of the request generated by the &lt;a&gt;GenerateServiceLastAccessedDetails&lt;/a&gt; operation. The &lt;code&gt;JobId&lt;/code&gt; returned by &lt;code&gt;GenerateServiceLastAccessedDetail&lt;/code&gt; must be used by the same role within a session, or by the same user when used to call &lt;code&gt;GetServiceLastAccessedDetail&lt;/code&gt;.
    :type job_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str

    :rtype: Union[GetServiceLastAccessedDetailsResponse, Tuple[GetServiceLastAccessedDetailsResponse, int], Tuple[GetServiceLastAccessedDetailsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_service_last_accessed_details_with_entities(job_id, service_namespace, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None):  # noqa: E501
    """get_get_service_last_accessed_details_with_entities

    &lt;p&gt;After you generate a group or policy report using the &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; operation, you can use the &lt;code&gt;JobId&lt;/code&gt; parameter in &lt;code&gt;GetServiceLastAccessedDetailsWithEntities&lt;/code&gt;. This operation retrieves the status of your report job and a list of entities that could have used group or policy permissions to access the specified service.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Group&lt;/b&gt; – For a group report, this operation returns a list of users in the group that could have used the group’s policies in an attempt to access the service.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Policy&lt;/b&gt; – For a policy report, this operation returns a list of entities (users or roles) that could have used the policy in an attempt to access the service.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;You can also use this operation for user or role reports to retrieve details about those entities.&lt;/p&gt; &lt;p&gt;If the operation fails, the &lt;code&gt;GetServiceLastAccessedDetailsWithEntities&lt;/code&gt; operation returns the reason that it failed.&lt;/p&gt; &lt;p&gt;By default, the list of associated entities is sorted by date, with the most recent access listed first.&lt;/p&gt; # noqa: E501

    :param job_id: The ID of the request generated by the &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; operation.
    :type job_id: str
    :param service_namespace: &lt;p&gt;The service namespace for an Amazon Web Services service. Provide the service namespace to learn when the IAM entity last attempted to access the specified service.&lt;/p&gt; &lt;p&gt;To learn the service namespace for a service, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html\&quot;&gt;Actions, resources, and condition keys for Amazon Web Services services&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, &lt;code&gt;(service prefix: a4b)&lt;/code&gt;. For more information about service namespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces\&quot;&gt;Amazon Web Services service namespaces&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type service_namespace: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str

    :rtype: Union[GetServiceLastAccessedDetailsWithEntitiesResponse, Tuple[GetServiceLastAccessedDetailsWithEntitiesResponse, int], Tuple[GetServiceLastAccessedDetailsWithEntitiesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_service_linked_role_deletion_status(deletion_task_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_service_linked_role_deletion_status

    Retrieves the status of your service-linked role deletion. After you use &lt;a&gt;DeleteServiceLinkedRole&lt;/a&gt; to submit a service-linked role for deletion, you can use the &lt;code&gt;DeletionTaskId&lt;/code&gt; parameter in &lt;code&gt;GetServiceLinkedRoleDeletionStatus&lt;/code&gt; to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service. # noqa: E501

    :param deletion_task_id: The deletion task identifier. This identifier is returned by the &lt;a&gt;DeleteServiceLinkedRole&lt;/a&gt; operation in the format &lt;code&gt;task/aws-service-role/&amp;lt;service-principal-name&amp;gt;/&amp;lt;role-name&amp;gt;/&amp;lt;task-uuid&amp;gt;&lt;/code&gt;.
    :type deletion_task_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetServiceLinkedRoleDeletionStatusResponse, Tuple[GetServiceLinkedRoleDeletionStatusResponse, int], Tuple[GetServiceLinkedRoleDeletionStatusResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_ssh_public_key(user_name, ssh_public_key_id, encoding, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_ssh_public_key

    &lt;p&gt;Retrieves the specified SSH public key, including metadata about the key.&lt;/p&gt; &lt;p&gt;The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user associated with the SSH public key.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param ssh_public_key_id: &lt;p&gt;The unique identifier for the SSH public key.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type ssh_public_key_id: str
    :param encoding: Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use &lt;code&gt;SSH&lt;/code&gt;. To retrieve the public key in PEM format, use &lt;code&gt;PEM&lt;/code&gt;.
    :type encoding: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetSSHPublicKeyResponse, Tuple[GetSSHPublicKeyResponse, int], Tuple[GetSSHPublicKeyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_user(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_get_user

    &lt;p&gt;Retrieves information about the specified IAM user, including the user&#39;s creation date, path, unique ID, and ARN.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID used to sign the request to this operation.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the user to get information about.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to the user making the request. This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[GetUserResponse, Tuple[GetUserResponse, int], Tuple[GetUserResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_get_user_policy(user_name, policy_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_get_user_policy

    &lt;p&gt;Retrieves the specified inline policy document that is embedded in the specified IAM user.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use &lt;a&gt;GetPolicy&lt;/a&gt; to determine the policy&#39;s default version. Then use &lt;a&gt;GetPolicyVersion&lt;/a&gt; to retrieve the policy document.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user who the policy is associated with.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param policy_name: &lt;p&gt;The name of the policy document to get.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetUserPolicyResponse, Tuple[GetUserPolicyResponse, int], Tuple[GetUserPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_access_keys(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None, marker=None, max_items=None):  # noqa: E501
    """get_list_access_keys

    &lt;p&gt;Returns information about the access key IDs associated with the specified IAM user. If there is none, the operation returns an empty list.&lt;/p&gt; &lt;p&gt;Although each user is limited to a small number of keys, you can still paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. If a temporary access key is used, then &lt;code&gt;UserName&lt;/code&gt; is required. If a long-term key is assigned to the user, then &lt;code&gt;UserName&lt;/code&gt; is not required. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; &lt;note&gt; &lt;p&gt;To ensure the security of your Amazon Web Services account, the secret access key is accessible only during key and user creation.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the user.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListAccessKeysResponse, Tuple[ListAccessKeysResponse, int], Tuple[ListAccessKeysResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_account_aliases(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_account_aliases

    Lists the account alias associated with the Amazon Web Services account (Note: you can have only one). For information about using an Amazon Web Services account alias, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\&quot;&gt;Creating, deleting, and listing an Amazon Web Services account alias&lt;/a&gt; in the &lt;i&gt;Amazon Web Services Sign-In User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListAccountAliasesResponse, Tuple[ListAccountAliasesResponse, int], Tuple[ListAccountAliasesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_attached_group_policies(group_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path_prefix=None, marker=None, max_items=None):  # noqa: E501
    """get_list_attached_group_policies

    &lt;p&gt;Lists all managed policies that are attached to the specified IAM group.&lt;/p&gt; &lt;p&gt;An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use &lt;a&gt;ListGroupPolicies&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. You can use the &lt;code&gt;PathPrefix&lt;/code&gt; parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param group_name: &lt;p&gt;The name (friendly name, not ARN) of the group to list attached policies for.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path_prefix: &lt;p&gt;The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path_prefix: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListAttachedGroupPoliciesResponse, Tuple[ListAttachedGroupPoliciesResponse, int], Tuple[ListAttachedGroupPoliciesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_attached_role_policies(role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path_prefix=None, marker=None, max_items=None):  # noqa: E501
    """get_list_attached_role_policies

    &lt;p&gt;Lists all managed policies that are attached to the specified IAM role.&lt;/p&gt; &lt;p&gt;An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use &lt;a&gt;ListRolePolicies&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. You can use the &lt;code&gt;PathPrefix&lt;/code&gt; parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name (friendly name, not ARN) of the role to list attached policies for.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path_prefix: &lt;p&gt;The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path_prefix: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListAttachedRolePoliciesResponse, Tuple[ListAttachedRolePoliciesResponse, int], Tuple[ListAttachedRolePoliciesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_attached_user_policies(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path_prefix=None, marker=None, max_items=None):  # noqa: E501
    """get_list_attached_user_policies

    &lt;p&gt;Lists all managed policies that are attached to the specified IAM user.&lt;/p&gt; &lt;p&gt;An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use &lt;a&gt;ListUserPolicies&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. You can use the &lt;code&gt;PathPrefix&lt;/code&gt; parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name (friendly name, not ARN) of the user to list attached policies for.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path_prefix: &lt;p&gt;The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path_prefix: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListAttachedUserPoliciesResponse, Tuple[ListAttachedUserPoliciesResponse, int], Tuple[ListAttachedUserPoliciesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_entities_for_policy(policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, entity_filter=None, path_prefix=None, policy_usage_filter=None, marker=None, max_items=None):  # noqa: E501
    """get_list_entities_for_policy

    &lt;p&gt;Lists all IAM users, groups, and roles that the specified managed policy is attached to.&lt;/p&gt; &lt;p&gt;You can use the optional &lt;code&gt;EntityFilter&lt;/code&gt; parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set &lt;code&gt;EntityFilter&lt;/code&gt; to &lt;code&gt;Role&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy for which you want the versions.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param entity_filter: &lt;p&gt;The entity type to use for filtering the results.&lt;/p&gt; &lt;p&gt;For example, when &lt;code&gt;EntityFilter&lt;/code&gt; is &lt;code&gt;Role&lt;/code&gt;, only the roles that are attached to the specified policy are returned. This parameter is optional. If it is not included, all attached entities (users, groups, and roles) are returned. The argument for this parameter must be one of the valid values listed below.&lt;/p&gt;
    :type entity_filter: str
    :param path_prefix: &lt;p&gt;The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all entities.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path_prefix: str
    :param policy_usage_filter: &lt;p&gt;The policy usage method to use for filtering the results.&lt;/p&gt; &lt;p&gt;To list only permissions policies, set &lt;code&gt;PolicyUsageFilter&lt;/code&gt; to &lt;code&gt;PermissionsPolicy&lt;/code&gt;. To list only the policies used to set permissions boundaries, set the value to &lt;code&gt;PermissionsBoundary&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, all policies are returned. &lt;/p&gt;
    :type policy_usage_filter: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListEntitiesForPolicyResponse, Tuple[ListEntitiesForPolicyResponse, int], Tuple[ListEntitiesForPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_group_policies(group_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_group_policies

    &lt;p&gt;Lists the names of the inline policies that are embedded in the specified IAM group.&lt;/p&gt; &lt;p&gt;An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use &lt;a&gt;ListAttachedGroupPolicies&lt;/a&gt;. For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param group_name: &lt;p&gt;The name of the group to list policies for.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListGroupPoliciesResponse, Tuple[ListGroupPoliciesResponse, int], Tuple[ListGroupPoliciesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_groups(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path_prefix=None, marker=None, max_items=None):  # noqa: E501
    """get_list_groups

    &lt;p&gt;Lists the IAM groups that have the specified path prefix.&lt;/p&gt; &lt;p&gt; You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path_prefix: &lt;p&gt; The path prefix for filtering the results. For example, the prefix &lt;code&gt;/division_abc/subdivision_xyz/&lt;/code&gt; gets all groups whose path starts with &lt;code&gt;/division_abc/subdivision_xyz/&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path_prefix: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListGroupsResponse, Tuple[ListGroupsResponse, int], Tuple[ListGroupsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_groups_for_user(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_groups_for_user

    &lt;p&gt;Lists the IAM groups that the specified IAM user belongs to.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user to list groups for.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListGroupsForUserResponse, Tuple[ListGroupsForUserResponse, int], Tuple[ListGroupsForUserResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_instance_profile_tags(instance_profile_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_instance_profile_tags

    Lists the tags that are attached to the specified IAM instance profile. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param instance_profile_name: &lt;p&gt;The name of the IAM instance profile whose tags you want to see.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type instance_profile_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListInstanceProfileTagsResponse, Tuple[ListInstanceProfileTagsResponse, int], Tuple[ListInstanceProfileTagsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_instance_profiles(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path_prefix=None, marker=None, max_items=None):  # noqa: E501
    """get_list_instance_profiles

    &lt;p&gt;Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for an instance profile, see &lt;a&gt;GetInstanceProfile&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path_prefix: &lt;p&gt; The path prefix for filtering the results. For example, the prefix &lt;code&gt;/application_abc/component_xyz/&lt;/code&gt; gets all instance profiles whose path starts with &lt;code&gt;/application_abc/component_xyz/&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/), listing all instance profiles. This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path_prefix: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListInstanceProfilesResponse, Tuple[ListInstanceProfilesResponse, int], Tuple[ListInstanceProfilesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_instance_profiles_for_role(role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_instance_profiles_for_role

    &lt;p&gt;Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name of the role to list instance profiles for.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListInstanceProfilesForRoleResponse, Tuple[ListInstanceProfilesForRoleResponse, int], Tuple[ListInstanceProfilesForRoleResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_mfa_device_tags(serial_number, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_mfa_device_tags

    Lists the tags that are attached to the specified IAM virtual multi-factor authentication (MFA) device. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param serial_number: &lt;p&gt;The unique identifier for the IAM virtual MFA device whose tags you want to see. For virtual MFA devices, the serial number is the same as the ARN.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type serial_number: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListMFADeviceTagsResponse, Tuple[ListMFADeviceTagsResponse, int], Tuple[ListMFADeviceTagsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_mfa_devices(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None, marker=None, max_items=None):  # noqa: E501
    """get_list_mfa_devices

    &lt;p&gt;Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request for this operation.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the user whose MFA devices you want to list.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListMFADevicesResponse, Tuple[ListMFADevicesResponse, int], Tuple[ListMFADevicesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_open_id_connect_provider_tags(open_id_connect_provider_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_open_id_connect_provider_tags

    &lt;p&gt;Lists the tags that are attached to the specified OpenID Connect (OIDC)-compatible identity provider. The returned list of tags is sorted by tag key. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param open_id_connect_provider_arn: &lt;p&gt;The ARN of the OpenID Connect (OIDC) identity provider whose tags you want to see.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type open_id_connect_provider_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListOpenIDConnectProviderTagsResponse, Tuple[ListOpenIDConnectProviderTagsResponse, int], Tuple[ListOpenIDConnectProviderTagsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_open_id_connect_providers(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_list_open_id_connect_providers

    &lt;p&gt;Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the Amazon Web Services account.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for an OIDC provider, see &lt;a&gt;GetOpenIDConnectProvider&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[ListOpenIDConnectProvidersResponse, Tuple[ListOpenIDConnectProvidersResponse, int], Tuple[ListOpenIDConnectProvidersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_policies(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, scope=None, only_attached=None, path_prefix=None, policy_usage_filter=None, marker=None, max_items=None):  # noqa: E501
    """get_list_policies

    &lt;p&gt;Lists all the managed policies that are available in your Amazon Web Services account, including your own customer-defined managed policies and all Amazon Web Services managed policies.&lt;/p&gt; &lt;p&gt;You can filter the list of policies that is returned using the optional &lt;code&gt;OnlyAttached&lt;/code&gt;, &lt;code&gt;Scope&lt;/code&gt;, and &lt;code&gt;PathPrefix&lt;/code&gt; parameters. For example, to list only the customer managed policies in your Amazon Web Services account, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;Local&lt;/code&gt;. To list only Amazon Web Services managed policies, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;AWS&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;For more information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a customer manged policy, see &lt;a&gt;GetPolicy&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param scope: &lt;p&gt;The scope to use for filtering the results.&lt;/p&gt; &lt;p&gt;To list only Amazon Web Services managed policies, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;AWS&lt;/code&gt;. To list only the customer managed policies in your Amazon Web Services account, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;Local&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, or if it is set to &lt;code&gt;All&lt;/code&gt;, all policies are returned.&lt;/p&gt;
    :type scope: str
    :param only_attached: &lt;p&gt;A flag to filter the results to only the attached policies.&lt;/p&gt; &lt;p&gt;When &lt;code&gt;OnlyAttached&lt;/code&gt; is &lt;code&gt;true&lt;/code&gt;, the returned list contains only the policies that are attached to an IAM user, group, or role. When &lt;code&gt;OnlyAttached&lt;/code&gt; is &lt;code&gt;false&lt;/code&gt;, or when the parameter is not included, all policies are returned.&lt;/p&gt;
    :type only_attached: bool
    :param path_prefix: The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies. This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.
    :type path_prefix: str
    :param policy_usage_filter: &lt;p&gt;The policy usage method to use for filtering the results.&lt;/p&gt; &lt;p&gt;To list only permissions policies, set &lt;code&gt;PolicyUsageFilter&lt;/code&gt; to &lt;code&gt;PermissionsPolicy&lt;/code&gt;. To list only the policies used to set permissions boundaries, set the value to &lt;code&gt;PermissionsBoundary&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, all policies are returned. &lt;/p&gt;
    :type policy_usage_filter: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListPoliciesResponse, Tuple[ListPoliciesResponse, int], Tuple[ListPoliciesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_policies_granting_service_access(arn, service_namespaces, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None):  # noqa: E501
    """get_list_policies_granting_service_access

    &lt;p&gt;Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified service.&lt;/p&gt; &lt;note&gt; &lt;p&gt;This operation does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;The list of policies returned by the operation depends on the ARN of the identity that you provide.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;User&lt;/b&gt; – The list of policies includes the managed and inline policies that are attached to the user directly. The list also includes any additional managed and inline policies that are attached to the group to which the user belongs. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Group&lt;/b&gt; – The list of policies includes only the managed and inline policies that are attached to the group directly. Policies that are attached to the group’s user are not included.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Role&lt;/b&gt; – The list of policies includes only the managed and inline policies that are attached to the role.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information about these policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed policy is currently used to set the permissions boundary for a user or role, use the &lt;a&gt;GetUser&lt;/a&gt; or &lt;a&gt;GetRole&lt;/a&gt; operations.&lt;/p&gt; # noqa: E501

    :param arn: The ARN of the IAM identity (user, group, or role) whose policies you want to list.
    :type arn: str
    :param service_namespaces: &lt;p&gt;The service namespace for the Amazon Web Services services whose policies you want to list.&lt;/p&gt; &lt;p&gt;To learn the service namespace for a service, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html\&quot;&gt;Actions, resources, and condition keys for Amazon Web Services services&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, &lt;code&gt;(service prefix: a4b)&lt;/code&gt;. For more information about service namespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces\&quot;&gt;Amazon Web Services service namespaces&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type service_namespaces: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str

    :rtype: Union[ListPoliciesGrantingServiceAccessResponse, Tuple[ListPoliciesGrantingServiceAccessResponse, int], Tuple[ListPoliciesGrantingServiceAccessResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_policy_tags(policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_policy_tags

    Lists the tags that are attached to the specified IAM customer managed policy. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param policy_arn: &lt;p&gt;The ARN of the IAM customer managed policy whose tags you want to see.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListPolicyTagsResponse, Tuple[ListPolicyTagsResponse, int], Tuple[ListPolicyTagsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_policy_versions(policy_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_policy_versions

    &lt;p&gt;Lists information about the versions of the specified managed policy, including the version that is currently set as the policy&#39;s default version.&lt;/p&gt; &lt;p&gt;For more information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy for which you want the versions.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListPolicyVersionsResponse, Tuple[ListPolicyVersionsResponse, int], Tuple[ListPolicyVersionsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_role_policies(role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_role_policies

    &lt;p&gt;Lists the names of the inline policies that are embedded in the specified IAM role.&lt;/p&gt; &lt;p&gt;An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use &lt;a&gt;ListAttachedRolePolicies&lt;/a&gt;. For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name of the role to list policies for.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListRolePoliciesResponse, Tuple[ListRolePoliciesResponse, int], Tuple[ListRolePoliciesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_role_tags(role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_role_tags

    Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param role_name: &lt;p&gt;The name of the IAM role for which you want to see the list of tags.&lt;/p&gt; &lt;p&gt;This parameter accepts (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListRoleTagsResponse, Tuple[ListRoleTagsResponse, int], Tuple[ListRoleTagsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_roles(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path_prefix=None, marker=None, max_items=None):  # noqa: E501
    """get_list_roles

    &lt;p&gt;Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. This operation does not return the following attributes, even though they are an attribute of the returned object:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;PermissionsBoundary&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;RoleLastUsed&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Tags&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To view all of the information for a role, see &lt;a&gt;GetRole&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path_prefix: &lt;p&gt; The path prefix for filtering the results. For example, the prefix &lt;code&gt;/application_abc/component_xyz/&lt;/code&gt; gets all roles whose path starts with &lt;code&gt;/application_abc/component_xyz/&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/), listing all roles. This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path_prefix: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListRolesResponse, Tuple[ListRolesResponse, int], Tuple[ListRolesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_saml_provider_tags(saml_provider_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_saml_provider_tags

    &lt;p&gt;Lists the tags that are attached to the specified Security Assertion Markup Language (SAML) identity provider. The returned list of tags is sorted by tag key. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param saml_provider_arn: &lt;p&gt;The ARN of the Security Assertion Markup Language (SAML) identity provider whose tags you want to see.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type saml_provider_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListSAMLProviderTagsResponse, Tuple[ListSAMLProviderTagsResponse, int], Tuple[ListSAMLProviderTagsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_saml_providers(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_list_saml_providers

    &lt;p&gt;Lists the SAML provider resource objects defined in IAM in the account. IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a SAML provider, see &lt;a&gt;GetSAMLProvider&lt;/a&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt; This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[ListSAMLProvidersResponse, Tuple[ListSAMLProvidersResponse, int], Tuple[ListSAMLProvidersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_server_certificate_tags(server_certificate_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_server_certificate_tags

    &lt;p&gt;Lists the tags that are attached to the specified IAM server certificate. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don&#39;t use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param server_certificate_name: &lt;p&gt;The name of the IAM server certificate whose tags you want to see.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type server_certificate_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListServerCertificateTagsResponse, Tuple[ListServerCertificateTagsResponse, int], Tuple[ListServerCertificateTagsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_server_certificates(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path_prefix=None, marker=None, max_items=None):  # noqa: E501
    """get_list_server_certificates

    &lt;p&gt;Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.&lt;/p&gt; &lt;p&gt; You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a servercertificate, see &lt;a&gt;GetServerCertificate&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path_prefix: &lt;p&gt; The path prefix for filtering the results. For example: &lt;code&gt;/company/servercerts&lt;/code&gt; would get all server certificates for which the path starts with &lt;code&gt;/company/servercerts&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/), listing all server certificates. This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path_prefix: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListServerCertificatesResponse, Tuple[ListServerCertificatesResponse, int], Tuple[ListServerCertificatesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_service_specific_credentials(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None, service_name=None):  # noqa: E501
    """get_list_service_specific_credentials

    Returns information about the service-specific credentials associated with the specified IAM user. If none exists, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an Amazon Web Services service, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-gc.html\&quot;&gt;Set up service-specific credentials&lt;/a&gt; in the CodeCommit User Guide. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the user whose service-specific credentials you want information about. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param service_name: Filters the returned results to only those for the specified Amazon Web Services service. If not specified, then Amazon Web Services returns service-specific credentials for all services.
    :type service_name: str

    :rtype: Union[ListServiceSpecificCredentialsResponse, Tuple[ListServiceSpecificCredentialsResponse, int], Tuple[ListServiceSpecificCredentialsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_signing_certificates(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None, marker=None, max_items=None):  # noqa: E501
    """get_list_signing_certificates

    &lt;p&gt;Returns information about the signing certificates associated with the specified IAM user. If none exists, the operation returns an empty list.&lt;/p&gt; &lt;p&gt;Although each user is limited to a small number of signing certificates, you can still paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; field is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request for this operation. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the IAM user whose signing certificates you want to examine.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListSigningCertificatesResponse, Tuple[ListSigningCertificatesResponse, int], Tuple[ListSigningCertificatesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_ssh_public_keys(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None, marker=None, max_items=None):  # noqa: E501
    """get_list_ssh_public_keys

    &lt;p&gt;Returns information about the SSH public keys associated with the specified IAM user. If none exists, the operation returns an empty list.&lt;/p&gt; &lt;p&gt;The SSH public keys returned by this operation are used only for authenticating the IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;Although each user is limited to a small number of keys, you can still paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the IAM user to list SSH public keys for. If none is specified, the &lt;code&gt;UserName&lt;/code&gt; field is determined implicitly based on the Amazon Web Services access key used to sign the request.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListSSHPublicKeysResponse, Tuple[ListSSHPublicKeysResponse, int], Tuple[ListSSHPublicKeysResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_user_policies(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_user_policies

    &lt;p&gt;Lists the names of the inline policies embedded in the specified IAM user.&lt;/p&gt; &lt;p&gt;An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use &lt;a&gt;ListAttachedUserPolicies&lt;/a&gt;. For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user to list policies for.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListUserPoliciesResponse, Tuple[ListUserPoliciesResponse, int], Tuple[ListUserPoliciesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_user_tags(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, marker=None, max_items=None):  # noqa: E501
    """get_list_user_tags

    Lists the tags that are attached to the specified IAM user. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user whose tags you want to see.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListUserTagsResponse, Tuple[ListUserTagsResponse, int], Tuple[ListUserTagsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_users(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path_prefix=None, marker=None, max_items=None):  # noqa: E501
    """get_list_users

    &lt;p&gt;Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the Amazon Web Services account. If there are none, the operation returns an empty list.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. This operation does not return the following attributes, even though they are an attribute of the returned object:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;PermissionsBoundary&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Tags&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To view all of the information for a user, see &lt;a&gt;GetUser&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path_prefix: &lt;p&gt; The path prefix for filtering the results. For example: &lt;code&gt;/division_abc/subdivision_xyz/&lt;/code&gt;, which would get all user names whose path starts with &lt;code&gt;/division_abc/subdivision_xyz/&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/), listing all user names. This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type path_prefix: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListUsersResponse, Tuple[ListUsersResponse, int], Tuple[ListUsersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_list_virtual_mfa_devices(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, assignment_status=None, marker=None, max_items=None):  # noqa: E501
    """get_list_virtual_mfa_devices

    &lt;p&gt;Lists the virtual MFA devices defined in the Amazon Web Services account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be &lt;code&gt;Assigned&lt;/code&gt;, &lt;code&gt;Unassigned&lt;/code&gt;, or &lt;code&gt;Any&lt;/code&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view tag information for a virtual MFA device, see &lt;a&gt;ListMFADeviceTags&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param assignment_status:  The status (&lt;code&gt;Unassigned&lt;/code&gt; or &lt;code&gt;Assigned&lt;/code&gt;) of the devices to list. If you do not specify an &lt;code&gt;AssignmentStatus&lt;/code&gt;, the operation defaults to &lt;code&gt;Any&lt;/code&gt;, which lists both assigned and unassigned virtual MFA devices.,
    :type assignment_status: str
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int

    :rtype: Union[ListVirtualMFADevicesResponse, Tuple[ListVirtualMFADevicesResponse, int], Tuple[ListVirtualMFADevicesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_put_group_policy(group_name, policy_name, policy_document, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_put_group_policy

    &lt;p&gt;Adds or updates an inline policy document that is embedded in the specified IAM group.&lt;/p&gt; &lt;p&gt;A user can also have managed policies attached to it. To attach a managed policy to a group, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachGroupPolicy.html\&quot;&gt; &lt;code&gt;AttachGroupPolicy&lt;/code&gt; &lt;/a&gt;. To create a new managed policy, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\&quot;&gt; &lt;code&gt;CreatePolicy&lt;/code&gt; &lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For information about the maximum number of inline policies that you can embed in a group, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because policy documents can be large, you should use POST rather than GET when calling &lt;code&gt;PutGroupPolicy&lt;/code&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\&quot;&gt;Making query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param group_name: &lt;p&gt;The name of the group to associate the policy with.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-.&lt;/p&gt;
    :type group_name: str
    :param policy_name: &lt;p&gt;The name of the policy document.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_name: str
    :param policy_document: &lt;p&gt;The policy document.&lt;/p&gt; &lt;p&gt;You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_document: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_put_role_permissions_boundary(role_name, permissions_boundary, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_put_role_permissions_boundary

    &lt;p&gt;Adds or updates the policy that is specified as the IAM role&#39;s permissions boundary. You can use an Amazon Web Services managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role.&lt;/p&gt; &lt;p&gt;You cannot set the boundary for a service-linked role.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html\&quot;&gt;IAM JSON policy evaluation logic&lt;/a&gt; in the IAM User Guide. &lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param role_name: The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
    :type role_name: str
    :param permissions_boundary: &lt;p&gt;The ARN of the managed policy that is used to set the permissions boundary for the role.&lt;/p&gt; &lt;p&gt;A permissions boundary policy defines the maximum permissions that identity-based policies can grant to an entity, but does not grant permissions. Permissions boundaries do not define the maximum permissions that a resource-based policy can grant to an entity. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\&quot;&gt;Permissions boundaries for IAM entities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types\&quot;&gt;Policy types &lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type permissions_boundary: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_put_role_policy(role_name, policy_name, policy_document, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_put_role_policy

    &lt;p&gt;Adds or updates an inline policy document that is embedded in the specified IAM role.&lt;/p&gt; &lt;p&gt;When you embed an inline policy in a role, the inline policy is used as part of the role&#39;s access (permissions) policy. The role&#39;s trust policy is created at the same time as the role, using &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html\&quot;&gt; &lt;code&gt;CreateRole&lt;/code&gt; &lt;/a&gt;. You can update a role&#39;s trust policy using &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html\&quot;&gt; &lt;code&gt;UpdateAssumeRolePolicy&lt;/code&gt; &lt;/a&gt;. For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;A role can also have a managed policy attached to it. To attach a managed policy to a role, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachRolePolicy.html\&quot;&gt; &lt;code&gt;AttachRolePolicy&lt;/code&gt; &lt;/a&gt;. To create a new managed policy, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\&quot;&gt; &lt;code&gt;CreatePolicy&lt;/code&gt; &lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For information about the maximum number of inline policies that you can embed with a role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because policy documents can be large, you should use POST rather than GET when calling &lt;code&gt;PutRolePolicy&lt;/code&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\&quot;&gt;Making query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name of the role to associate the policy with.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param policy_name: &lt;p&gt;The name of the policy document.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_name: str
    :param policy_document: &lt;p&gt;The policy document.&lt;/p&gt; &lt;p&gt;You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_document: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_put_user_permissions_boundary(user_name, permissions_boundary, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_put_user_permissions_boundary

    &lt;p&gt;Adds or updates the policy that is specified as the IAM user&#39;s permissions boundary. You can use an Amazon Web Services managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html\&quot;&gt;IAM JSON policy evaluation logic&lt;/a&gt; in the IAM User Guide. &lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param user_name: The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
    :type user_name: str
    :param permissions_boundary: &lt;p&gt;The ARN of the managed policy that is used to set the permissions boundary for the user.&lt;/p&gt; &lt;p&gt;A permissions boundary policy defines the maximum permissions that identity-based policies can grant to an entity, but does not grant permissions. Permissions boundaries do not define the maximum permissions that a resource-based policy can grant to an entity. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\&quot;&gt;Permissions boundaries for IAM entities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types\&quot;&gt;Policy types &lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type permissions_boundary: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_put_user_policy(user_name, policy_name, policy_document, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_put_user_policy

    &lt;p&gt;Adds or updates an inline policy document that is embedded in the specified IAM user.&lt;/p&gt; &lt;p&gt;An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachUserPolicy.html\&quot;&gt; &lt;code&gt;AttachUserPolicy&lt;/code&gt; &lt;/a&gt;. To create a new managed policy, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\&quot;&gt; &lt;code&gt;CreatePolicy&lt;/code&gt; &lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For information about the maximum number of inline policies that you can embed in a user, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because policy documents can be large, you should use POST rather than GET when calling &lt;code&gt;PutUserPolicy&lt;/code&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\&quot;&gt;Making query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user to associate the policy with.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param policy_name: &lt;p&gt;The name of the policy document.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_name: str
    :param policy_document: &lt;p&gt;The policy document.&lt;/p&gt; &lt;p&gt;You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_document: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_remove_client_id_from_open_id_connect_provider(open_id_connect_provider_arn, client_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_remove_client_id_from_open_id_connect_provider

    &lt;p&gt;Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object.&lt;/p&gt; &lt;p&gt;This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.&lt;/p&gt; # noqa: E501

    :param open_id_connect_provider_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get a list of OIDC provider ARNs by using the &lt;a&gt;ListOpenIDConnectProviders&lt;/a&gt; operation.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type open_id_connect_provider_arn: str
    :param client_id: The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information about client IDs, see &lt;a&gt;CreateOpenIDConnectProvider&lt;/a&gt;.
    :type client_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_remove_role_from_instance_profile(instance_profile_name, role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_remove_role_from_instance_profile

    &lt;p&gt;Removes the specified IAM role from the specified EC2 instance profile.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.&lt;/p&gt; &lt;/important&gt; &lt;p&gt; For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param instance_profile_name: &lt;p&gt;The name of the instance profile to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type instance_profile_name: str
    :param role_name: &lt;p&gt;The name of the role to remove.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_remove_user_from_group(group_name, user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_remove_user_from_group

    Removes the specified user from the specified group. # noqa: E501

    :param group_name: &lt;p&gt;The name of the group to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param user_name: &lt;p&gt;The name of the user to remove.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_reset_service_specific_credential(service_specific_credential_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_reset_service_specific_credential

    Resets the password for a service-specific credential. The new password is Amazon Web Services generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user. # noqa: E501

    :param service_specific_credential_id: &lt;p&gt;The unique identifier of the service-specific credential.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type service_specific_credential_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the IAM user associated with the service-specific credential. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[ResetServiceSpecificCredentialResponse, Tuple[ResetServiceSpecificCredentialResponse, int], Tuple[ResetServiceSpecificCredentialResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_resync_mfa_device(user_name, serial_number, authentication_code1, authentication_code2, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_resync_mfa_device

    &lt;p&gt;Synchronizes the specified MFA device with its IAM resource object on the Amazon Web Services servers.&lt;/p&gt; &lt;p&gt;For more information about creating and working with virtual MFA devices, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\&quot;&gt;Using a virtual MFA device&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user whose MFA device you want to resynchronize.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param serial_number: &lt;p&gt;Serial number that uniquely identifies the MFA device.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type serial_number: str
    :param authentication_code1: &lt;p&gt;An authentication code emitted by the device.&lt;/p&gt; &lt;p&gt;The format for this parameter is a sequence of six digits.&lt;/p&gt;
    :type authentication_code1: str
    :param authentication_code2: &lt;p&gt;A subsequent authentication code emitted by the device.&lt;/p&gt; &lt;p&gt;The format for this parameter is a sequence of six digits.&lt;/p&gt;
    :type authentication_code2: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_set_default_policy_version(policy_arn, version_id, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_set_default_policy_version

    &lt;p&gt;Sets the specified version of the specified policy as the policy&#39;s default (operative) version.&lt;/p&gt; &lt;p&gt;This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use &lt;a&gt;ListEntitiesForPolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param policy_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy whose default version you want to set.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_arn: str
    :param version_id: &lt;p&gt;The version of the policy to set as the default (operative) version.&lt;/p&gt; &lt;p&gt;For more information about managed policy versions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type version_id: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_set_security_token_service_preferences(global_endpoint_token_version, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_set_security_token_service_preferences

    &lt;p&gt;Sets the specified version of the global endpoint token as the token version used for the Amazon Web Services account.&lt;/p&gt; &lt;p&gt;By default, Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at &lt;code&gt;https://sts.amazonaws.com&lt;/code&gt;. Amazon Web Services recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/sts.html\&quot;&gt;Security Token Service endpoints and quotas&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\&quot;&gt;Activating and deactivating STS in an Amazon Web Services Region&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;To view the current session token version, see the &lt;code&gt;GlobalEndpointTokenVersion&lt;/code&gt; entry in the response of the &lt;a&gt;GetAccountSummary&lt;/a&gt; operation.&lt;/p&gt; # noqa: E501

    :param global_endpoint_token_version: &lt;p&gt;The version of the global endpoint token. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens.&lt;/p&gt; &lt;p&gt;For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\&quot;&gt;Activating and deactivating STS in an Amazon Web Services Region&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type global_endpoint_token_version: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_simulate_custom_policy(policy_input_list, action_names, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, permissions_boundary_policy_input_list=None, resource_arns=None, resource_policy=None, resource_owner=None, caller_arn=None, context_entries=None, resource_handling_option=None, max_items=None, marker=None):  # noqa: E501
    """get_simulate_custom_policy

    &lt;p&gt;Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and Amazon Web Services resources to determine the policies&#39; effective permissions. The policies are provided as strings.&lt;/p&gt; &lt;p&gt;The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. You can simulate resources that don&#39;t exist in your account.&lt;/p&gt; &lt;p&gt;If you want to simulate existing policies that are attached to an IAM user, group, or role, use &lt;a&gt;SimulatePrincipalPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Context keys are variables that are maintained by Amazon Web Services and its services and which provide details about the context of an API query request. You can use the &lt;code&gt;Condition&lt;/code&gt; element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;If the output is long, you can use &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters to paginate the results.&lt;/p&gt; &lt;note&gt; &lt;p&gt;The IAM policy simulator evaluates statements in the identity-based policy and the inputs that you provide during simulation. The policy simulator results can differ from your live Amazon Web Services environment. We recommend that you check your policies against your live Amazon Web Services environment after testing using the policy simulator to confirm that you have the desired results. For more information about using the policy simulator, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html\&quot;&gt;Testing IAM policies with the IAM policy simulator &lt;/a&gt;in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param policy_input_list: &lt;p&gt;A list of policy documents to include in the simulation. Each document is specified as a string containing the complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this parameter. Any resource-based policy must be submitted with the &lt;code&gt;ResourcePolicy&lt;/code&gt; parameter. The policies cannot be \&quot;scope-down\&quot; policies, such as you could include in a call to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html\&quot;&gt;GetFederationToken&lt;/a&gt; or one of the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html\&quot;&gt;AssumeRole&lt;/a&gt; API operations. In other words, do not use policies designed to restrict what a user can do while using the temporary credentials.&lt;/p&gt; &lt;p&gt;The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\&quot;&gt;IAM and STS character quotas&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_input_list: List[str]
    :param action_names: A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each resource. Each operation must include the service identifier, such as &lt;code&gt;iam:CreateUser&lt;/code&gt;. This operation does not support using wildcards (*) in an action name.
    :type action_names: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param permissions_boundary_policy_input_list: &lt;p&gt;The IAM permissions boundary policy to simulate. The permissions boundary sets the maximum permissions that an IAM entity can have. You can input only one permissions boundary when you pass a policy to this operation. For more information about permissions boundaries, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\&quot;&gt;Permissions boundaries for IAM entities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. The policy input is specified as a string that contains the complete, valid JSON text of a permissions boundary policy.&lt;/p&gt; &lt;p&gt;The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\&quot;&gt;IAM and STS character quotas&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type permissions_boundary_policy_input_list: List[str]
    :param resource_arns: &lt;p&gt;A list of ARNs of Amazon Web Services resources to include in the simulation. If this parameter is not provided, then the value defaults to &lt;code&gt;*&lt;/code&gt; (all resources). Each API in the &lt;code&gt;ActionNames&lt;/code&gt; parameter is evaluated for each resource in this list. The simulation determines the access result (allowed or denied) of each combination and reports it in the response. You can simulate resources that don&#39;t exist in your account.&lt;/p&gt; &lt;p&gt;The simulation does not automatically retrieve policies for the specified resources. If you want to include a resource policy in the simulation, then you must include the policy as a string in the &lt;code&gt;ResourcePolicy&lt;/code&gt; parameter.&lt;/p&gt; &lt;p&gt;If you include a &lt;code&gt;ResourcePolicy&lt;/code&gt;, then it must be applicable to all of the resources included in the simulation or you receive an invalid input error.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Simulation of resource-based policies isn&#39;t supported for IAM roles.&lt;/p&gt; &lt;/note&gt;
    :type resource_arns: List[str]
    :param resource_policy: &lt;p&gt;A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is treated as if it had this policy attached. You can include only one resource-based policy in a simulation.&lt;/p&gt; &lt;p&gt;The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\&quot;&gt;IAM and STS character quotas&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;Simulation of resource-based policies isn&#39;t supported for IAM roles.&lt;/p&gt; &lt;/note&gt;
    :type resource_policy: str
    :param resource_owner: &lt;p&gt;An ARN representing the Amazon Web Services account ID that specifies the owner of any simulated resource that does not identify its owner in the resource ARN. Examples of resource ARNs include an S3 bucket or object. If &lt;code&gt;ResourceOwner&lt;/code&gt; is specified, it is also used as the account owner of any &lt;code&gt;ResourcePolicy&lt;/code&gt; included in the simulation. If the &lt;code&gt;ResourceOwner&lt;/code&gt; parameter is not specified, then the owner of the resources and the resource policy defaults to the account of the identity provided in &lt;code&gt;CallerArn&lt;/code&gt;. This parameter is required only if you specify a resource-based policy and account that owns the resource is different from the account that owns the simulated calling user &lt;code&gt;CallerArn&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;The ARN for an account uses the following syntax: &lt;code&gt;arn:aws:iam::&lt;i&gt;AWS-account-ID&lt;/i&gt;:root&lt;/code&gt;. For example, to represent the account with the 112233445566 ID, use the following ARN: &lt;code&gt;arn:aws:iam::112233445566-ID:root&lt;/code&gt;. &lt;/p&gt;
    :type resource_owner: str
    :param caller_arn: &lt;p&gt;The ARN of the IAM user that you want to use as the simulated caller of the API operations. &lt;code&gt;CallerArn&lt;/code&gt; is required if you include a &lt;code&gt;ResourcePolicy&lt;/code&gt; so that the policy&#39;s &lt;code&gt;Principal&lt;/code&gt; element has a value to use in evaluating the policy.&lt;/p&gt; &lt;p&gt;You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a service principal.&lt;/p&gt;
    :type caller_arn: str
    :param context_entries: A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in one of the simulated IAM permissions policies, the corresponding value is supplied.
    :type context_entries: list | bytes
    :param resource_handling_option: &lt;p&gt;Specifies the type of simulation to run. Different API operations that support resource-based policies require different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does not match one of the following scenarios, then you can omit this parameter. The following list shows each of the supported scenario values and the resources that you must define to run the simulation.&lt;/p&gt; &lt;p&gt;Each of the EC2 scenarios requires that you specify instance, image, and security group resources. If your scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes VPC, then you must supply the network interface resource. If it includes an IP subnet, then you must specify the subnet resource. For more information on the EC2 scenario options, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html\&quot;&gt;Supported platforms&lt;/a&gt; in the &lt;i&gt;Amazon EC2 User Guide&lt;/i&gt;.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;EC2-VPC-InstanceStore&lt;/b&gt; &lt;/p&gt; &lt;p&gt;instance, image, security group, network interface&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;EC2-VPC-InstanceStore-Subnet&lt;/b&gt; &lt;/p&gt; &lt;p&gt;instance, image, security group, network interface, subnet&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;EC2-VPC-EBS&lt;/b&gt; &lt;/p&gt; &lt;p&gt;instance, image, security group, network interface, volume&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;EC2-VPC-EBS-Subnet&lt;/b&gt; &lt;/p&gt; &lt;p&gt;instance, image, security group, network interface, subnet, volume&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type resource_handling_option: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str

    :rtype: Union[SimulatePolicyResponse, Tuple[SimulatePolicyResponse, int], Tuple[SimulatePolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        context_entries = [ContextEntry.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_simulate_principal_policy(policy_source_arn, action_names, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, policy_input_list=None, permissions_boundary_policy_input_list=None, resource_arns=None, resource_policy=None, resource_owner=None, caller_arn=None, context_entries=None, resource_handling_option=None, max_items=None, marker=None):  # noqa: E501
    """get_simulate_principal_policy

    &lt;p&gt;Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and Amazon Web Services resources to determine the policies&#39; effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can simulate resources that don&#39;t exist in your account.&lt;/p&gt; &lt;p&gt;You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use &lt;a&gt;SimulateCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation for IAM users only.&lt;/p&gt; &lt;p&gt;The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; This operation discloses information about the permissions granted to other users. If you do not want users to see other user&#39;s permissions, then consider allowing them to use &lt;a&gt;SimulateCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. You can use the &lt;code&gt;Condition&lt;/code&gt; element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use &lt;a&gt;GetContextKeysForPrincipalPolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;If the output is long, you can use the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters to paginate the results.&lt;/p&gt; &lt;note&gt; &lt;p&gt;The IAM policy simulator evaluates statements in the identity-based policy and the inputs that you provide during simulation. The policy simulator results can differ from your live Amazon Web Services environment. We recommend that you check your policies against your live Amazon Web Services environment after testing using the policy simulator to confirm that you have the desired results. For more information about using the policy simulator, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html\&quot;&gt;Testing IAM policies with the IAM policy simulator &lt;/a&gt;in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param policy_source_arn: &lt;p&gt;The Amazon Resource Name (ARN) of a user, group, or role whose policies you want to include in the simulation. If you specify a user, group, or role, the simulation includes all policies that are associated with that entity. If you specify a user, the simulation also includes all policies that are attached to any groups the user belongs to.&lt;/p&gt; &lt;p&gt;The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\&quot;&gt;IAM and STS character quotas&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type policy_source_arn: str
    :param action_names: A list of names of API operations to evaluate in the simulation. Each operation is evaluated for each resource. Each operation must include the service identifier, such as &lt;code&gt;iam:CreateUser&lt;/code&gt;.
    :type action_names: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param policy_input_list: &lt;p&gt;An optional list of additional policy documents to include in the simulation. Each document is specified as a string containing the complete, valid JSON text of an IAM policy.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_input_list: List[str]
    :param permissions_boundary_policy_input_list: &lt;p&gt;The IAM permissions boundary policy to simulate. The permissions boundary sets the maximum permissions that the entity can have. You can input only one permissions boundary when you pass a policy to this operation. An IAM entity can only have one permissions boundary in effect at a time. For example, if a permissions boundary is attached to an entity and you pass in a different permissions boundary policy using this parameter, then the new permissions boundary policy is used for the simulation. For more information about permissions boundaries, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\&quot;&gt;Permissions boundaries for IAM entities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. The policy input is specified as a string containing the complete, valid JSON text of a permissions boundary policy.&lt;/p&gt; &lt;p&gt;The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\&quot;&gt;IAM and STS character quotas&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type permissions_boundary_policy_input_list: List[str]
    :param resource_arns: &lt;p&gt;A list of ARNs of Amazon Web Services resources to include in the simulation. If this parameter is not provided, then the value defaults to &lt;code&gt;*&lt;/code&gt; (all resources). Each API in the &lt;code&gt;ActionNames&lt;/code&gt; parameter is evaluated for each resource in this list. The simulation determines the access result (allowed or denied) of each combination and reports it in the response. You can simulate resources that don&#39;t exist in your account.&lt;/p&gt; &lt;p&gt;The simulation does not automatically retrieve policies for the specified resources. If you want to include a resource policy in the simulation, then you must include the policy as a string in the &lt;code&gt;ResourcePolicy&lt;/code&gt; parameter.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Simulation of resource-based policies isn&#39;t supported for IAM roles.&lt;/p&gt; &lt;/note&gt;
    :type resource_arns: List[str]
    :param resource_policy: &lt;p&gt;A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is treated as if it had this policy attached. You can include only one resource-based policy in a simulation.&lt;/p&gt; &lt;p&gt;The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\&quot;&gt;IAM and STS character quotas&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;Simulation of resource-based policies isn&#39;t supported for IAM roles.&lt;/p&gt; &lt;/note&gt;
    :type resource_policy: str
    :param resource_owner: An Amazon Web Services account ID that specifies the owner of any simulated resource that does not identify its owner in the resource ARN. Examples of resource ARNs include an S3 bucket or object. If &lt;code&gt;ResourceOwner&lt;/code&gt; is specified, it is also used as the account owner of any &lt;code&gt;ResourcePolicy&lt;/code&gt; included in the simulation. If the &lt;code&gt;ResourceOwner&lt;/code&gt; parameter is not specified, then the owner of the resources and the resource policy defaults to the account of the identity provided in &lt;code&gt;CallerArn&lt;/code&gt;. This parameter is required only if you specify a resource-based policy and account that owns the resource is different from the account that owns the simulated calling user &lt;code&gt;CallerArn&lt;/code&gt;.
    :type resource_owner: str
    :param caller_arn: &lt;p&gt;The ARN of the IAM user that you want to specify as the simulated caller of the API operations. If you do not specify a &lt;code&gt;CallerArn&lt;/code&gt;, it defaults to the ARN of the user that you specify in &lt;code&gt;PolicySourceArn&lt;/code&gt;, if you specified a user. If you include both a &lt;code&gt;PolicySourceArn&lt;/code&gt; (for example, &lt;code&gt;arn:aws:iam::123456789012:user/David&lt;/code&gt;) and a &lt;code&gt;CallerArn&lt;/code&gt; (for example, &lt;code&gt;arn:aws:iam::123456789012:user/Bob&lt;/code&gt;), the result is that you simulate calling the API operations as Bob, as if Bob had David&#39;s policies.&lt;/p&gt; &lt;p&gt;You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a service principal.&lt;/p&gt; &lt;p&gt; &lt;code&gt;CallerArn&lt;/code&gt; is required if you include a &lt;code&gt;ResourcePolicy&lt;/code&gt; and the &lt;code&gt;PolicySourceArn&lt;/code&gt; is not the ARN for an IAM user. This is required so that the resource-based policy&#39;s &lt;code&gt;Principal&lt;/code&gt; element has a value to use in evaluating the policy.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type caller_arn: str
    :param context_entries: A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in one of the simulated IAM permissions policies, the corresponding value is supplied.
    :type context_entries: list | bytes
    :param resource_handling_option: &lt;p&gt;Specifies the type of simulation to run. Different API operations that support resource-based policies require different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does not match one of the following scenarios, then you can omit this parameter. The following list shows each of the supported scenario values and the resources that you must define to run the simulation.&lt;/p&gt; &lt;p&gt;Each of the EC2 scenarios requires that you specify instance, image, and security group resources. If your scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes VPC, then you must supply the network interface resource. If it includes an IP subnet, then you must specify the subnet resource. For more information on the EC2 scenario options, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html\&quot;&gt;Supported platforms&lt;/a&gt; in the &lt;i&gt;Amazon EC2 User Guide&lt;/i&gt;.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;EC2-VPC-InstanceStore&lt;/b&gt; &lt;/p&gt; &lt;p&gt;instance, image, security group, network interface&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;EC2-VPC-InstanceStore-Subnet&lt;/b&gt; &lt;/p&gt; &lt;p&gt;instance, image, security group, network interface, subnet&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;EC2-VPC-EBS&lt;/b&gt; &lt;/p&gt; &lt;p&gt;instance, image, security group, network interface, volume&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;EC2-VPC-EBS-Subnet&lt;/b&gt; &lt;/p&gt; &lt;p&gt;instance, image, security group, network interface, subnet, volume&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type resource_handling_option: str
    :param max_items: &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt;
    :type max_items: int
    :param marker: Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start.
    :type marker: str

    :rtype: Union[SimulatePolicyResponse, Tuple[SimulatePolicyResponse, int], Tuple[SimulatePolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        context_entries = [ContextEntry.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_tag_instance_profile(instance_profile_name, tags, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_tag_instance_profile

    &lt;p&gt;Adds one or more tags to an IAM instance profile. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;Each tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM instance profile that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param instance_profile_name: &lt;p&gt;The name of the IAM instance profile to which you want to add tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type instance_profile_name: str
    :param tags: The list of tags that you want to attach to the IAM instance profile. Each tag consists of a key name and an associated value.
    :type tags: list | bytes
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_tag_mfa_device(serial_number, tags, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_tag_mfa_device

    &lt;p&gt;Adds one or more tags to an IAM virtual multi-factor authentication (MFA) device. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM virtual MFA device that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param serial_number: &lt;p&gt;The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA devices, the serial number is the same as the ARN.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type serial_number: str
    :param tags: The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name and an associated value.
    :type tags: list | bytes
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_tag_open_id_connect_provider(open_id_connect_provider_arn, tags, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_tag_open_id_connect_provider

    &lt;p&gt;Adds one or more tags to an OpenID Connect (OIDC)-compatible identity provider. For more information about these providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an OIDC provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param open_id_connect_provider_arn: &lt;p&gt;The ARN of the OIDC identity provider in IAM to which you want to add tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type open_id_connect_provider_arn: str
    :param tags: The list of tags that you want to attach to the OIDC identity provider in IAM. Each tag consists of a key name and an associated value.
    :type tags: list | bytes
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_tag_policy(policy_arn, tags, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_tag_policy

    &lt;p&gt;Adds one or more tags to an IAM customer managed policy. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM customer managed policy that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param policy_arn: &lt;p&gt;The ARN of the IAM customer managed policy to which you want to add tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_arn: str
    :param tags: The list of tags that you want to attach to the IAM customer managed policy. Each tag consists of a key name and an associated value.
    :type tags: list | bytes
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_tag_role(role_name, tags, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_tag_role

    &lt;p&gt;Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Cost allocation&lt;/b&gt; - Use tags to help track which individuals and teams are using which Amazon Web Services resources.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; &lt;p&gt;For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM identities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param role_name: &lt;p&gt;The name of the IAM role to which you want to add tags.&lt;/p&gt; &lt;p&gt;This parameter accepts (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param tags: The list of tags that you want to attach to the IAM role. Each tag consists of a key name and an associated value.
    :type tags: list | bytes
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_tag_saml_provider(saml_provider_arn, tags, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_tag_saml_provider

    &lt;p&gt;Adds one or more tags to a Security Assertion Markup Language (SAML) identity provider. For more information about these providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation &lt;/a&gt;. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only a SAML identity provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param saml_provider_arn: &lt;p&gt;The ARN of the SAML identity provider in IAM to which you want to add tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type saml_provider_arn: str
    :param tags: The list of tags that you want to attach to the SAML identity provider in IAM. Each tag consists of a key name and an associated value.
    :type tags: list | bytes
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_tag_server_certificate(server_certificate_name, tags, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_tag_server_certificate

    &lt;p&gt;Adds one or more tags to an IAM server certificate. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;note&gt; &lt;p&gt;For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don&#39;t use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only a server certificate that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Cost allocation&lt;/b&gt; - Use tags to help track which individuals and teams are using which Amazon Web Services resources.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param server_certificate_name: &lt;p&gt;The name of the IAM server certificate to which you want to add tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type server_certificate_name: str
    :param tags: The list of tags that you want to attach to the IAM server certificate. Each tag consists of a key name and an associated value.
    :type tags: list | bytes
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_tag_user(user_name, tags, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_tag_user

    &lt;p&gt;Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Cost allocation&lt;/b&gt; - Use tags to help track which individuals and teams are using which Amazon Web Services resources.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; &lt;p&gt;For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM identities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user to which you want to add tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param tags: The list of tags that you want to attach to the IAM user. Each tag consists of a key name and an associated value.
    :type tags: list | bytes
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_untag_instance_profile(instance_profile_name, tag_keys, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_untag_instance_profile

    Removes the specified tags from the IAM instance profile. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param instance_profile_name: &lt;p&gt;The name of the IAM instance profile from which you want to remove tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type instance_profile_name: str
    :param tag_keys: A list of key names as a simple array of strings. The tags with matching keys are removed from the specified instance profile.
    :type tag_keys: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_untag_mfa_device(serial_number, tag_keys, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_untag_mfa_device

    Removes the specified tags from the IAM virtual multi-factor authentication (MFA) device. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param serial_number: &lt;p&gt;The unique identifier for the IAM virtual MFA device from which you want to remove tags. For virtual MFA devices, the serial number is the same as the ARN.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type serial_number: str
    :param tag_keys: A list of key names as a simple array of strings. The tags with matching keys are removed from the specified instance profile.
    :type tag_keys: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_untag_open_id_connect_provider(open_id_connect_provider_arn, tag_keys, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_untag_open_id_connect_provider

    Removes the specified tags from the specified OpenID Connect (OIDC)-compatible identity provider in IAM. For more information about OIDC providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param open_id_connect_provider_arn: &lt;p&gt;The ARN of the OIDC provider in IAM from which you want to remove tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type open_id_connect_provider_arn: str
    :param tag_keys: A list of key names as a simple array of strings. The tags with matching keys are removed from the specified OIDC provider.
    :type tag_keys: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_untag_policy(policy_arn, tag_keys, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_untag_policy

    Removes the specified tags from the customer managed policy. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param policy_arn: &lt;p&gt;The ARN of the IAM customer managed policy from which you want to remove tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type policy_arn: str
    :param tag_keys: A list of key names as a simple array of strings. The tags with matching keys are removed from the specified policy.
    :type tag_keys: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_untag_role(role_name, tag_keys, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_untag_role

    Removes the specified tags from the role. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param role_name: &lt;p&gt;The name of the IAM role from which you want to remove tags.&lt;/p&gt; &lt;p&gt;This parameter accepts (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param tag_keys: A list of key names as a simple array of strings. The tags with matching keys are removed from the specified role.
    :type tag_keys: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_untag_saml_provider(saml_provider_arn, tag_keys, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_untag_saml_provider

    Removes the specified tags from the specified Security Assertion Markup Language (SAML) identity provider in IAM. For more information about these providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param saml_provider_arn: &lt;p&gt;The ARN of the SAML identity provider in IAM from which you want to remove tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type saml_provider_arn: str
    :param tag_keys: A list of key names as a simple array of strings. The tags with matching keys are removed from the specified SAML identity provider.
    :type tag_keys: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_untag_server_certificate(server_certificate_name, tag_keys, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_untag_server_certificate

    &lt;p&gt;Removes the specified tags from the IAM server certificate. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don&#39;t use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param server_certificate_name: &lt;p&gt;The name of the IAM server certificate from which you want to remove tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type server_certificate_name: str
    :param tag_keys: A list of key names as a simple array of strings. The tags with matching keys are removed from the specified IAM server certificate.
    :type tag_keys: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_untag_user(user_name, tag_keys, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_untag_user

    Removes the specified tags from the user. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user from which you want to remove tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param tag_keys: A list of key names as a simple array of strings. The tags with matching keys are removed from the specified user.
    :type tag_keys: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_access_key(access_key_id, status, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_update_access_key

    &lt;p&gt;Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user&#39;s key as part of a key rotation workflow.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. If a temporary access key is used, then &lt;code&gt;UserName&lt;/code&gt; is required. If a long-term key is assigned to the user, then &lt;code&gt;UserName&lt;/code&gt; is not required. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; &lt;p&gt;For information about rotating keys, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html\&quot;&gt;Managing keys and certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param access_key_id: &lt;p&gt;The access key ID of the secret access key you want to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type access_key_id: str
    :param status:  The status you want to assign to the secret access key. &lt;code&gt;Active&lt;/code&gt; means that the key can be used for programmatic calls to Amazon Web Services, while &lt;code&gt;Inactive&lt;/code&gt; means that the key cannot be used.
    :type status: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the user whose key you want to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_account_password_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, minimum_password_length=None, require_symbols=None, require_numbers=None, require_uppercase_characters=None, require_lowercase_characters=None, allow_users_to_change_password=None, max_password_age=None, password_reuse_prevention=None, hard_expiry=None):  # noqa: E501
    """get_update_account_password_policy

    &lt;p&gt;Updates the password policy settings for the Amazon Web Services account.&lt;/p&gt; &lt;note&gt; &lt;p&gt;This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter&#39;s value reverts to its default value. See the &lt;b&gt;Request Parameters&lt;/b&gt; section for each parameter&#39;s default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; For more information about using a password policy, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html\&quot;&gt;Managing an IAM password policy&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param minimum_password_length: &lt;p&gt;The minimum number of characters allowed in an IAM user password.&lt;/p&gt; &lt;p&gt;If you do not specify a value for this parameter, then the operation uses the default value of &lt;code&gt;6&lt;/code&gt;.&lt;/p&gt;
    :type minimum_password_length: int
    :param require_symbols: &lt;p&gt;Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:&lt;/p&gt; &lt;p&gt;! @ # $ % ^ &amp;amp; * ( ) _ + - &#x3D; [ ] { } | &#39;&lt;/p&gt; &lt;p&gt;If you do not specify a value for this parameter, then the operation uses the default value of &lt;code&gt;false&lt;/code&gt;. The result is that passwords do not require at least one symbol character.&lt;/p&gt;
    :type require_symbols: bool
    :param require_numbers: &lt;p&gt;Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).&lt;/p&gt; &lt;p&gt;If you do not specify a value for this parameter, then the operation uses the default value of &lt;code&gt;false&lt;/code&gt;. The result is that passwords do not require at least one numeric character.&lt;/p&gt;
    :type require_numbers: bool
    :param require_uppercase_characters: &lt;p&gt;Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z).&lt;/p&gt; &lt;p&gt;If you do not specify a value for this parameter, then the operation uses the default value of &lt;code&gt;false&lt;/code&gt;. The result is that passwords do not require at least one uppercase character.&lt;/p&gt;
    :type require_uppercase_characters: bool
    :param require_lowercase_characters: &lt;p&gt;Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin alphabet (a to z).&lt;/p&gt; &lt;p&gt;If you do not specify a value for this parameter, then the operation uses the default value of &lt;code&gt;false&lt;/code&gt;. The result is that passwords do not require at least one lowercase character.&lt;/p&gt;
    :type require_lowercase_characters: bool
    :param allow_users_to_change_password: &lt;p&gt; Allows all IAM users in your account to use the Amazon Web Services Management Console to change their own passwords. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_passwords_enable-user-change.html\&quot;&gt;Permitting IAM users to change their own passwords&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;If you do not specify a value for this parameter, then the operation uses the default value of &lt;code&gt;false&lt;/code&gt;. The result is that IAM users in the account do not automatically have permissions to change their own password.&lt;/p&gt;
    :type allow_users_to_change_password: bool
    :param max_password_age: &lt;p&gt;The number of days that an IAM user password is valid.&lt;/p&gt; &lt;p&gt;If you do not specify a value for this parameter, then the operation uses the default value of &lt;code&gt;0&lt;/code&gt;. The result is that IAM user passwords never expire.&lt;/p&gt;
    :type max_password_age: int
    :param password_reuse_prevention: &lt;p&gt;Specifies the number of previous passwords that IAM users are prevented from reusing.&lt;/p&gt; &lt;p&gt;If you do not specify a value for this parameter, then the operation uses the default value of &lt;code&gt;0&lt;/code&gt;. The result is that IAM users are not prevented from reusing previous passwords.&lt;/p&gt;
    :type password_reuse_prevention: int
    :param hard_expiry: &lt;p&gt; Prevents IAM users who are accessing the account via the Amazon Web Services Management Console from setting a new console password after their password has expired. The IAM user cannot access the console until an administrator resets the password.&lt;/p&gt; &lt;p&gt;If you do not specify a value for this parameter, then the operation uses the default value of &lt;code&gt;false&lt;/code&gt;. The result is that IAM users can change their passwords after they expire and continue to sign in as the user.&lt;/p&gt; &lt;note&gt; &lt;p&gt; In the Amazon Web Services Management Console, the custom password policy option &lt;b&gt;Allow users to change their own password&lt;/b&gt; gives IAM users permissions to &lt;code&gt;iam:ChangePassword&lt;/code&gt; for only their user and to the &lt;code&gt;iam:GetAccountPasswordPolicy&lt;/code&gt; action. This option does not attach a permissions policy to each user, rather the permissions are applied at the account-level for all users by IAM. IAM users with &lt;code&gt;iam:ChangePassword&lt;/code&gt; permission and active access keys can reset their own expired console password using the CLI or API.&lt;/p&gt; &lt;/note&gt;
    :type hard_expiry: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_assume_role_policy(role_name, policy_document, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_update_assume_role_policy

    Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the \&quot;role trust policy\&quot;. For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html\&quot;&gt;Using roles to delegate permissions and federate identities&lt;/a&gt;. # noqa: E501

    :param role_name: &lt;p&gt;The name of the role to update with the new policy.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type role_name: str
    :param policy_document: &lt;p&gt;The policy that grants an entity permission to assume the role.&lt;/p&gt; &lt;p&gt;You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type policy_document: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_group(group_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, new_path=None, new_group_name=None):  # noqa: E501
    """get_update_group

    &lt;p&gt;Updates the name and/or the path of the specified IAM group.&lt;/p&gt; &lt;important&gt; &lt;p&gt; You should understand the implications of changing a group&#39;s path or name. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html\&quot;&gt;Renaming users and groups&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;note&gt; &lt;p&gt;The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named &lt;code&gt;Managers&lt;/code&gt; to &lt;code&gt;MGRs&lt;/code&gt;, the principal must have a policy that allows them to update both groups. If the principal has permission to update the &lt;code&gt;Managers&lt;/code&gt; group, but not the &lt;code&gt;MGRs&lt;/code&gt; group, then the update fails. For more information about permissions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\&quot;&gt;Access management&lt;/a&gt;. &lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param group_name: &lt;p&gt;Name of the IAM group to update. If you&#39;re changing the name of the group, this is the original name.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type group_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param new_path: &lt;p&gt;New path for the IAM group. Only include this if changing the group&#39;s path.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type new_path: str
    :param new_group_name: &lt;p&gt;New name for the IAM group. Only include this if changing the group&#39;s name.&lt;/p&gt; &lt;p&gt;IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \&quot;MyResource\&quot; and \&quot;myresource\&quot;.&lt;/p&gt;
    :type new_group_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_login_profile(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, password=None, password_reset_required=None):  # noqa: E501
    """get_update_login_profile

    &lt;p&gt;Changes the password for the specified IAM user. You can use the CLI, the Amazon Web Services API, or the &lt;b&gt;Users&lt;/b&gt; page in the IAM console to change the password for any IAM user. Use &lt;a&gt;ChangePassword&lt;/a&gt; to change your own password in the &lt;b&gt;My Security Credentials&lt;/b&gt; page in the Amazon Web Services Management Console.&lt;/p&gt; &lt;p&gt;For more information about modifying passwords, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\&quot;&gt;Managing passwords&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the user whose password you want to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param password: &lt;p&gt;The new password for the specified IAM user.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;However, the format can be further restricted by the account administrator by setting a password policy on the Amazon Web Services account. For more information, see &lt;a&gt;UpdateAccountPasswordPolicy&lt;/a&gt;.&lt;/p&gt;
    :type password: str
    :param password_reset_required: Allows this new password to be used only once by requiring the specified IAM user to set a new password on next sign-in.
    :type password_reset_required: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_open_id_connect_provider_thumbprint(open_id_connect_provider_arn, thumbprint_list, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_update_open_id_connect_provider_thumbprint

    &lt;p&gt;Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints.&lt;/p&gt; &lt;p&gt;The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.)&lt;/p&gt; &lt;p&gt;Typically, you need to update a thumbprint only when the identity provider certificate changes, which occurs rarely. However, if the provider&#39;s certificate &lt;i&gt;does&lt;/i&gt; change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Amazon Web Services secures communication with some OIDC identity providers (IdPs) through our library of trusted root certificate authorities (CAs) instead of using a certificate thumbprint to verify your IdP server certificate. These OIDC IdPs include Auth0, GitHub, Google, and those that use an Amazon S3 bucket to host a JSON Web Key Set (JWKS) endpoint. In these cases, your legacy thumbprint remains in your configuration, but is no longer used for validation.&lt;/p&gt; &lt;/note&gt; &lt;note&gt; &lt;p&gt;Trust for the OIDC provider is derived from the provider certificate and is validated by the thumbprint. Therefore, it is best to limit access to the &lt;code&gt;UpdateOpenIDConnectProviderThumbprint&lt;/code&gt; operation to highly privileged users.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param open_id_connect_provider_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the thumbprint. You can get a list of OIDC provider ARNs by using the &lt;a&gt;ListOpenIDConnectProviders&lt;/a&gt; operation.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type open_id_connect_provider_arn: str
    :param thumbprint_list: A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more information, see &lt;a&gt;CreateOpenIDConnectProvider&lt;/a&gt;. 
    :type thumbprint_list: List[str]
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_role(role_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, description=None, max_session_duration=None):  # noqa: E501
    """get_update_role

    Updates the description or maximum session duration setting of a role. # noqa: E501

    :param role_name: The name of the role that you want to modify.
    :type role_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param description: The new description that you want to apply to the specified role.
    :type description: str
    :param max_session_duration: &lt;p&gt;The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default value of one hour is applied. This setting can have a value from 1 hour to 12 hours.&lt;/p&gt; &lt;p&gt;Anyone who assumes the role from the CLI or API can use the &lt;code&gt;DurationSeconds&lt;/code&gt; API parameter or the &lt;code&gt;duration-seconds&lt;/code&gt; CLI parameter to request a longer session. The &lt;code&gt;MaxSessionDuration&lt;/code&gt; setting determines the maximum duration that can be requested using the &lt;code&gt;DurationSeconds&lt;/code&gt; parameter. If users don&#39;t specify a value for the &lt;code&gt;DurationSeconds&lt;/code&gt; parameter, their security credentials are valid for one hour by default. This applies when you use the &lt;code&gt;AssumeRole*&lt;/code&gt; API operations or the &lt;code&gt;assume-role*&lt;/code&gt; CLI operations but does not apply when you use those operations to create a console URL. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html\&quot;&gt;Using IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
    :type max_session_duration: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_role_description(role_name, description, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_update_role_description

    &lt;p&gt;Use &lt;a&gt;UpdateRole&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Modifies only the description of a role. This operation performs the same function as the &lt;code&gt;Description&lt;/code&gt; parameter in the &lt;code&gt;UpdateRole&lt;/code&gt; operation.&lt;/p&gt; # noqa: E501

    :param role_name: The name of the role that you want to modify.
    :type role_name: str
    :param description: The new description that you want to apply to the specified role.
    :type description: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[UpdateRoleDescriptionResponse, Tuple[UpdateRoleDescriptionResponse, int], Tuple[UpdateRoleDescriptionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_saml_provider(saml_metadata_document, saml_provider_arn, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_update_saml_provider

    &lt;p&gt;Updates the metadata document for an existing SAML provider resource object.&lt;/p&gt; &lt;note&gt; &lt;p&gt;This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param saml_metadata_document: An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer&#39;s name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization&#39;s IdP.
    :type saml_metadata_document: str
    :param saml_provider_arn: &lt;p&gt;The Amazon Resource Name (ARN) of the SAML provider to update.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt;
    :type saml_provider_arn: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[UpdateSAMLProviderResponse, Tuple[UpdateSAMLProviderResponse, int], Tuple[UpdateSAMLProviderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_server_certificate(server_certificate_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, new_path=None, new_server_certificate_name=None):  # noqa: E501
    """get_update_server_certificate

    &lt;p&gt;Updates the name and/or the path of the specified server certificate stored in IAM.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;important&gt; &lt;p&gt;You should understand the implications of changing a server certificate&#39;s path or name. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts\&quot;&gt;Renaming a server certificate&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;note&gt; &lt;p&gt;The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named &lt;code&gt;ProductionCert&lt;/code&gt; to &lt;code&gt;ProdCert&lt;/code&gt;, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the &lt;code&gt;ProductionCert&lt;/code&gt; group, but not the &lt;code&gt;ProdCert&lt;/code&gt; certificate, then the update fails. For more information about permissions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\&quot;&gt;Access management&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param server_certificate_name: &lt;p&gt;The name of the server certificate that you want to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type server_certificate_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param new_path: &lt;p&gt;The new path for the server certificate. Include this only if you are updating the server certificate&#39;s path.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type new_path: str
    :param new_server_certificate_name: &lt;p&gt;The new name for the server certificate. Include this only if you are updating the server certificate&#39;s name. The name of the certificate cannot contain any spaces.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type new_server_certificate_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_service_specific_credential(service_specific_credential_id, status, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_update_service_specific_credential

    Sets the status of a service-specific credential to &lt;code&gt;Active&lt;/code&gt; or &lt;code&gt;Inactive&lt;/code&gt;. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user&#39;s service-specific credential as part of a credential rotation work flow. # noqa: E501

    :param service_specific_credential_id: &lt;p&gt;The unique identifier of the service-specific credential.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type service_specific_credential_id: str
    :param status: The status to be assigned to the service-specific credential.
    :type status: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the IAM user associated with the service-specific credential. If you do not specify this value, then the operation assumes the user whose credentials are used to call the operation.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_signing_certificate(certificate_id, status, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_update_signing_certificate

    &lt;p&gt;Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user&#39;s signing certificate as part of a certificate rotation work flow.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; field is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; # noqa: E501

    :param certificate_id: &lt;p&gt;The ID of the signing certificate you want to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type certificate_id: str
    :param status:  The status you want to assign to the certificate. &lt;code&gt;Active&lt;/code&gt; means that the certificate can be used for programmatic calls to Amazon Web Services &lt;code&gt;Inactive&lt;/code&gt; means that the certificate cannot be used.
    :type status: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the IAM user the signing certificate belongs to.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_ssh_public_key(user_name, ssh_public_key_id, status, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_update_ssh_public_key

    &lt;p&gt;Sets the status of an IAM user&#39;s SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user&#39;s SSH public key as part of a key rotation work flow.&lt;/p&gt; &lt;p&gt;The SSH public key affected by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user associated with the SSH public key.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param ssh_public_key_id: &lt;p&gt;The unique identifier for the SSH public key.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters that can consist of any upper or lowercased letter or digit.&lt;/p&gt;
    :type ssh_public_key_id: str
    :param status: The status to assign to the SSH public key. &lt;code&gt;Active&lt;/code&gt; means that the key can be used for authentication with an CodeCommit repository. &lt;code&gt;Inactive&lt;/code&gt; means that the key cannot be used.
    :type status: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_update_user(user_name, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, new_path=None, new_user_name=None):  # noqa: E501
    """get_update_user

    &lt;p&gt;Updates the name and/or the path of the specified IAM user.&lt;/p&gt; &lt;important&gt; &lt;p&gt; You should understand the implications of changing an IAM user&#39;s path or name. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming\&quot;&gt;Renaming an IAM user&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html\&quot;&gt;Renaming an IAM group&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;note&gt; &lt;p&gt; To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html\&quot;&gt;Permissions and policies&lt;/a&gt;. &lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param user_name: &lt;p&gt;Name of the user to update. If you&#39;re changing the name of the user, this is the original user name.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param new_path: &lt;p&gt;New path for the IAM user. Include this parameter only if you&#39;re changing the user&#39;s path.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt;
    :type new_path: str
    :param new_user_name: &lt;p&gt;New name for the user. Include this parameter only if you&#39;re changing the user&#39;s name.&lt;/p&gt; &lt;p&gt;IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \&quot;MyResource\&quot; and \&quot;myresource\&quot;.&lt;/p&gt;
    :type new_user_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_upload_server_certificate(server_certificate_name, certificate_body, private_key, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, path=None, certificate_chain=None, tags=None):  # noqa: E501
    """get_upload_server_certificate

    &lt;p&gt;Uploads a server certificate entity for the Amazon Web Services account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded.&lt;/p&gt; &lt;p&gt;We recommend that you use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/acm/\&quot;&gt;Certificate Manager&lt;/a&gt; to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to Amazon Web Services resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/acm/latest/userguide/\&quot;&gt;Certificate Manager User Guide&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;p&gt;For information about the number of server certificates you can upload, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling &lt;code&gt;UploadServerCertificate&lt;/code&gt;. For information about setting up signatures and authorization through the API, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html\&quot;&gt;Signing Amazon Web Services API requests&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html\&quot;&gt;Calling the API by making HTTP query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param server_certificate_name: &lt;p&gt;The name for the server certificate. Do not include the path in this value. The name of the certificate cannot contain any spaces.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type server_certificate_name: str
    :param certificate_body: &lt;p&gt;The contents of the public key certificate in PEM-encoded format.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type certificate_body: str
    :param private_key: &lt;p&gt;The contents of the private key in PEM-encoded format.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type private_key: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param path: &lt;p&gt;The path for the server certificate. For more information about paths, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\&quot;&gt;IAM identifiers&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt; &lt;note&gt; &lt;p&gt; If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you must specify a path using the &lt;code&gt;path&lt;/code&gt; parameter. The path must begin with &lt;code&gt;/cloudfront&lt;/code&gt; and must include a trailing slash (for example, &lt;code&gt;/cloudfront/test/&lt;/code&gt;).&lt;/p&gt; &lt;/note&gt;
    :type path: str
    :param certificate_chain: &lt;p&gt;The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key certificates of the chain.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type certificate_chain: str
    :param tags: &lt;p&gt;A list of tags that you want to attach to the new IAM server certificate resource. Each tag consists of a key name and an associated value. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.&lt;/p&gt; &lt;/note&gt;
    :type tags: list | bytes

    :rtype: Union[UploadServerCertificateResponse, Tuple[UploadServerCertificateResponse, int], Tuple[UploadServerCertificateResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tags = [Tag.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_upload_signing_certificate(certificate_body, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, user_name=None):  # noqa: E501
    """get_upload_signing_certificate

    &lt;p&gt;Uploads an X.509 signing certificate and associates it with the specified IAM user. Some Amazon Web Services services require you to use certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is &lt;code&gt;Active&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;For information about when you would use an X.509 signing certificate, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Managing server certificates in IAM&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; is not specified, the IAM user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling &lt;code&gt;UploadSigningCertificate&lt;/code&gt;. For information about setting up signatures and authorization through the API, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html\&quot;&gt;Signing Amazon Web Services API requests&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\&quot;&gt;Making query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param certificate_body: &lt;p&gt;The contents of the signing certificate.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type certificate_body: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param user_name: &lt;p&gt;The name of the user the signing certificate is for.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str

    :rtype: Union[UploadSigningCertificateResponse, Tuple[UploadSigningCertificateResponse, int], Tuple[UploadSigningCertificateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_upload_ssh_public_key(user_name, ssh_public_key_body, action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """get_upload_ssh_public_key

    &lt;p&gt;Uploads an SSH public key and associates it with the specified IAM user.&lt;/p&gt; &lt;p&gt;The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param user_name: &lt;p&gt;The name of the IAM user to associate the SSH public key with.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt;
    :type user_name: str
    :param ssh_public_key_body: &lt;p&gt;The SSH public key. The public key must be encoded in ssh-rsa format or PEM format. The minimum bit-length of the public key is 2048 bits. For example, you can generate a 2048-bit key, and the resulting PEM file is 1679 bytes long.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
    :type ssh_public_key_body: str
    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[UploadSSHPublicKeyResponse, Tuple[UploadSSHPublicKeyResponse, int], Tuple[UploadSSHPublicKeyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_add_client_idto_open_id_connect_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, add_client_idto_open_id_connect_provider_request=None):  # noqa: E501
    """post_add_client_idto_open_id_connect_provider

    &lt;p&gt;Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource.&lt;/p&gt; &lt;p&gt;This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param add_client_idto_open_id_connect_provider_request: 
    :type add_client_idto_open_id_connect_provider_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_client_idto_open_id_connect_provider_request = AddClientIDToOpenIDConnectProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_add_role_to_instance_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, add_role_to_instance_profile_request=None):  # noqa: E501
    """post_add_role_to_instance_profile

    &lt;p&gt;Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this quota cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of Amazon Web Services because of &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Eventual_consistency\&quot;&gt;eventual consistency&lt;/a&gt;. To force the change, you must &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateIamInstanceProfile.html\&quot;&gt;disassociate the instance profile&lt;/a&gt; and then &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateIamInstanceProfile.html\&quot;&gt;associate the instance profile&lt;/a&gt;, or you can stop your instance and then restart it.&lt;/p&gt; &lt;note&gt; &lt;p&gt;The caller of this operation must be granted the &lt;code&gt;PassRole&lt;/code&gt; permission on the IAM role by a permissions policy.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param add_role_to_instance_profile_request: 
    :type add_role_to_instance_profile_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_role_to_instance_profile_request = AddRoleToInstanceProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_add_user_to_group(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, add_user_to_group_request=None):  # noqa: E501
    """post_add_user_to_group

    Adds the specified user to the specified group. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param add_user_to_group_request: 
    :type add_user_to_group_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_user_to_group_request = AddUserToGroupRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_attach_group_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, attach_group_policy_request=None):  # noqa: E501
    """post_attach_group_policy

    &lt;p&gt;Attaches the specified managed policy to the specified IAM group.&lt;/p&gt; &lt;p&gt;You use this operation to attach a managed policy to a group. To embed an inline policy in a group, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutGroupPolicy.html\&quot;&gt; &lt;code&gt;PutGroupPolicy&lt;/code&gt; &lt;/a&gt;.&lt;/p&gt; &lt;p&gt;As a best practice, you can validate your IAM policies. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\&quot;&gt;Validating IAM policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param attach_group_policy_request: 
    :type attach_group_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        attach_group_policy_request = AttachGroupPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_attach_role_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, attach_role_policy_request=None):  # noqa: E501
    """post_attach_role_policy

    &lt;p&gt;Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role&#39;s permission (access) policy.&lt;/p&gt; &lt;note&gt; &lt;p&gt;You cannot use a managed policy as the role&#39;s trust policy. The role&#39;s trust policy is created at the same time as the role, using &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html\&quot;&gt; &lt;code&gt;CreateRole&lt;/code&gt; &lt;/a&gt;. You can update a role&#39;s trust policy using &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html\&quot;&gt; &lt;code&gt;UpdateAssumerolePolicy&lt;/code&gt; &lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;Use this operation to attach a &lt;i&gt;managed&lt;/i&gt; policy to a role. To embed an inline policy in a role, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutRolePolicy.html\&quot;&gt; &lt;code&gt;PutRolePolicy&lt;/code&gt; &lt;/a&gt;. For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;As a best practice, you can validate your IAM policies. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\&quot;&gt;Validating IAM policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param attach_role_policy_request: 
    :type attach_role_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        attach_role_policy_request = AttachRolePolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_attach_user_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, attach_user_policy_request=None):  # noqa: E501
    """post_attach_user_policy

    &lt;p&gt;Attaches the specified managed policy to the specified user.&lt;/p&gt; &lt;p&gt;You use this operation to attach a &lt;i&gt;managed&lt;/i&gt; policy to a user. To embed an inline policy in a user, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutUserPolicy.html\&quot;&gt; &lt;code&gt;PutUserPolicy&lt;/code&gt; &lt;/a&gt;.&lt;/p&gt; &lt;p&gt;As a best practice, you can validate your IAM policies. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\&quot;&gt;Validating IAM policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param attach_user_policy_request: 
    :type attach_user_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        attach_user_policy_request = AttachUserPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_change_password(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, change_password_request=None):  # noqa: E501
    """post_change_password

    &lt;p&gt;Changes the password of the IAM user who is calling this operation. This operation can be performed using the CLI, the Amazon Web Services API, or the &lt;b&gt;My Security Credentials&lt;/b&gt; page in the Amazon Web Services Management Console. The Amazon Web Services account root user password is not affected by this operation.&lt;/p&gt; &lt;p&gt;Use &lt;a&gt;UpdateLoginProfile&lt;/a&gt; to use the CLI, the Amazon Web Services API, or the &lt;b&gt;Users&lt;/b&gt; page in the IAM console to change the password for any IAM user. For more information about modifying passwords, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\&quot;&gt;Managing passwords&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param change_password_request: 
    :type change_password_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        change_password_request = ChangePasswordRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_access_key(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_access_key_request=None):  # noqa: E501
    """post_create_access_key

    &lt;p&gt; Creates a new Amazon Web Services secret access key and corresponding Amazon Web Services access key ID for the specified user. The default status for new keys is &lt;code&gt;Active&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials. This is true even if the Amazon Web Services account has no associated users.&lt;/p&gt; &lt;p&gt; For information about quotas on the number of keys you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt;To ensure the security of your Amazon Web Services account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_access_key_request: 
    :type create_access_key_request: dict | bytes

    :rtype: Union[CreateAccessKeyResponse, Tuple[CreateAccessKeyResponse, int], Tuple[CreateAccessKeyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_access_key_request = CreateAccessKeyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_account_alias(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_account_alias_request=None):  # noqa: E501
    """post_create_account_alias

    Creates an alias for your Amazon Web Services account. For information about using an Amazon Web Services account alias, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\&quot;&gt;Creating, deleting, and listing an Amazon Web Services account alias&lt;/a&gt; in the &lt;i&gt;Amazon Web Services Sign-In User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_account_alias_request: 
    :type create_account_alias_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_account_alias_request = CreateAccountAliasRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_group(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_group_request=None):  # noqa: E501
    """post_create_group

    &lt;p&gt;Creates a new group.&lt;/p&gt; &lt;p&gt; For information about the number of groups you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_group_request: 
    :type create_group_request: dict | bytes

    :rtype: Union[CreateGroupResponse, Tuple[CreateGroupResponse, int], Tuple[CreateGroupResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_group_request = CreateGroupRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_instance_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_instance_profile_request=None):  # noqa: E501
    """post_create_instance_profile

    &lt;p&gt; Creates a new instance profile. For information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html\&quot;&gt;Using roles for applications on Amazon EC2&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;, and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/iam-roles-for-amazon-ec2.html#ec2-instance-profile\&quot;&gt;Instance profiles&lt;/a&gt; in the &lt;i&gt;Amazon EC2 User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; For information about the number of instance profiles you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM object quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_instance_profile_request: 
    :type create_instance_profile_request: dict | bytes

    :rtype: Union[CreateInstanceProfileResponse, Tuple[CreateInstanceProfileResponse, int], Tuple[CreateInstanceProfileResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_instance_profile_request = CreateInstanceProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_login_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_login_profile_request=None):  # noqa: E501
    """post_create_login_profile

    &lt;p&gt;Creates a password for the specified IAM user. A password allows an IAM user to access Amazon Web Services services through the Amazon Web Services Management Console.&lt;/p&gt; &lt;p&gt;You can use the CLI, the Amazon Web Services API, or the &lt;b&gt;Users&lt;/b&gt; page in the IAM console to create a password for any IAM user. Use &lt;a&gt;ChangePassword&lt;/a&gt; to update your own existing password in the &lt;b&gt;My Security Credentials&lt;/b&gt; page in the Amazon Web Services Management Console.&lt;/p&gt; &lt;p&gt;For more information about managing passwords, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\&quot;&gt;Managing passwords&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_login_profile_request: 
    :type create_login_profile_request: dict | bytes

    :rtype: Union[CreateLoginProfileResponse, Tuple[CreateLoginProfileResponse, int], Tuple[CreateLoginProfileResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_login_profile_request = CreateLoginProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_open_id_connect_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_open_id_connect_provider_request=None):  # noqa: E501
    """post_create_open_id_connect_provider

    &lt;p&gt;Creates an IAM entity to describe an identity provider (IdP) that supports &lt;a href&#x3D;\&quot;http://openid.net/connect/\&quot;&gt;OpenID Connect (OIDC)&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The OIDC provider that you create with this operation can be used as a principal in a role&#39;s trust policy. Such a policy establishes a trust relationship between Amazon Web Services and the OIDC provider.&lt;/p&gt; &lt;p&gt;If you are using an OIDC identity provider from Google, Facebook, or Amazon Cognito, you don&#39;t need to create a separate IAM identity provider. These OIDC identity providers are already built-in to Amazon Web Services and are available for your use. Instead, you can move directly to creating new roles using your identity provider. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_oidc.html\&quot;&gt;Creating a role for web identity or OpenID connect federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;When you create the IAM OIDC provider, you specify the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;The URL of the OIDC identity provider (IdP) to trust&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;A list of client IDs (also known as audiences) that identify the application or applications allowed to authenticate using the OIDC provider&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;A list of tags that are attached to the specified IAM OIDC provider&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;A list of thumbprints of one or more server certificates that the IdP uses&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;You get all of this information from the OIDC IdP you want to use to access Amazon Web Services.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Amazon Web Services secures communication with some OIDC identity providers (IdPs) through our library of trusted root certificate authorities (CAs) instead of using a certificate thumbprint to verify your IdP server certificate. These OIDC IdPs include Auth0, GitHub, Google, and those that use an Amazon S3 bucket to host a JSON Web Key Set (JWKS) endpoint. In these cases, your legacy thumbprint remains in your configuration, but is no longer used for validation.&lt;/p&gt; &lt;/note&gt; &lt;note&gt; &lt;p&gt;The trust for the OIDC provider is derived from the IAM provider that this operation creates. Therefore, it is best to limit access to the &lt;a&gt;CreateOpenIDConnectProvider&lt;/a&gt; operation to highly privileged users.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_open_id_connect_provider_request: 
    :type create_open_id_connect_provider_request: dict | bytes

    :rtype: Union[CreateOpenIDConnectProviderResponse, Tuple[CreateOpenIDConnectProviderResponse, int], Tuple[CreateOpenIDConnectProviderResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_open_id_connect_provider_request = CreateOpenIDConnectProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_policy_request=None):  # noqa: E501
    """post_create_policy

    &lt;p&gt;Creates a new managed policy for your Amazon Web Services account.&lt;/p&gt; &lt;p&gt;This operation creates a policy version with a version identifier of &lt;code&gt;v1&lt;/code&gt; and sets v1 as the policy&#39;s default version. For more information about policy versions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;As a best practice, you can validate your IAM policies. To learn more, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\&quot;&gt;Validating IAM policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about managed policies in general, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_policy_request: 
    :type create_policy_request: dict | bytes

    :rtype: Union[CreatePolicyResponse, Tuple[CreatePolicyResponse, int], Tuple[CreatePolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_policy_request = CreatePolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_policy_version(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_policy_version_request=None):  # noqa: E501
    """post_create_policy_version

    &lt;p&gt;Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using &lt;a&gt;DeletePolicyVersion&lt;/a&gt; before you create a new version.&lt;/p&gt; &lt;p&gt;Optionally, you can set the new version as the policy&#39;s default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached.&lt;/p&gt; &lt;p&gt;For more information about managed policy versions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_policy_version_request: 
    :type create_policy_version_request: dict | bytes

    :rtype: Union[CreatePolicyVersionResponse, Tuple[CreatePolicyVersionResponse, int], Tuple[CreatePolicyVersionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_policy_version_request = CreatePolicyVersionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_role(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_role_request=None):  # noqa: E501
    """post_create_role

    &lt;p&gt;Creates a new role for your Amazon Web Services account.&lt;/p&gt; &lt;p&gt; For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. For information about quotas for role names and the number of roles you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_role_request: 
    :type create_role_request: dict | bytes

    :rtype: Union[CreateRoleResponse, Tuple[CreateRoleResponse, int], Tuple[CreateRoleResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_role_request = CreateRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_saml_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_saml_provider_request=None):  # noqa: E501
    """post_create_saml_provider

    &lt;p&gt;Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.&lt;/p&gt; &lt;p&gt;The SAML provider resource that you create with this operation can be used as a principal in an IAM role&#39;s trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the Amazon Web Services Management Console or one that supports API access to Amazon Web Services.&lt;/p&gt; &lt;p&gt;When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer&#39;s name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization&#39;s IdP.&lt;/p&gt; &lt;note&gt; &lt;p&gt; This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html\&quot;&gt;Enabling SAML 2.0 federated users to access the Amazon Web Services Management Console&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_saml_provider_request: 
    :type create_saml_provider_request: dict | bytes

    :rtype: Union[CreateSAMLProviderResponse, Tuple[CreateSAMLProviderResponse, int], Tuple[CreateSAMLProviderResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_saml_provider_request = CreateSAMLProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_service_linked_role(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_service_linked_role_request=None):  # noqa: E501
    """post_create_service_linked_role

    &lt;p&gt;Creates an IAM role that is linked to a specific Amazon Web Services service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your Amazon Web Services resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html\&quot;&gt;Using service-linked roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;p&gt;To attach a policy to this service-linked role, you must make the request using the Amazon Web Services service that depends on this role.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_service_linked_role_request: 
    :type create_service_linked_role_request: dict | bytes

    :rtype: Union[CreateServiceLinkedRoleResponse, Tuple[CreateServiceLinkedRoleResponse, int], Tuple[CreateServiceLinkedRoleResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_service_linked_role_request = CreateServiceLinkedRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_service_specific_credential(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_service_specific_credential_request=None):  # noqa: E501
    """post_create_service_specific_credential

    &lt;p&gt;Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service. &lt;/p&gt; &lt;p&gt;You can have a maximum of two sets of service-specific credentials for each supported service per user.&lt;/p&gt; &lt;p&gt;You can create service-specific credentials for CodeCommit and Amazon Keyspaces (for Apache Cassandra).&lt;/p&gt; &lt;p&gt;You can reset the password to a new service-generated value by calling &lt;a&gt;ResetServiceSpecificCredential&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about service-specific credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_ssh-keys.html\&quot;&gt;Using IAM with CodeCommit: Git credentials, SSH keys, and Amazon Web Services access keys&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_service_specific_credential_request: 
    :type create_service_specific_credential_request: dict | bytes

    :rtype: Union[CreateServiceSpecificCredentialResponse, Tuple[CreateServiceSpecificCredentialResponse, int], Tuple[CreateServiceSpecificCredentialResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_service_specific_credential_request = CreateServiceSpecificCredentialRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_user(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_user_request=None):  # noqa: E501
    """post_create_user

    &lt;p&gt;Creates a new IAM user for your Amazon Web Services account.&lt;/p&gt; &lt;p&gt; For information about quotas for the number of IAM users you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_user_request: 
    :type create_user_request: dict | bytes

    :rtype: Union[CreateUserResponse, Tuple[CreateUserResponse, int], Tuple[CreateUserResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_user_request = CreateUserRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_create_virtual_mfa_device(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, create_virtual_mfa_device_request=None):  # noqa: E501
    """post_create_virtual_mfa_device

    &lt;p&gt;Creates a new virtual MFA device for the Amazon Web Services account. After creating the virtual MFA, use &lt;a&gt;EnableMFADevice&lt;/a&gt; to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\&quot;&gt;Using a virtual MFA device&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For information about the maximum number of MFA devices you can create, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt;The seed information contained in the QR code and the Base32 string should be treated like any other secret access information. In other words, protect the seed information as you would your Amazon Web Services access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param create_virtual_mfa_device_request: 
    :type create_virtual_mfa_device_request: dict | bytes

    :rtype: Union[CreateVirtualMFADeviceResponse, Tuple[CreateVirtualMFADeviceResponse, int], Tuple[CreateVirtualMFADeviceResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_virtual_mfa_device_request = CreateVirtualMFADeviceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_deactivate_mfa_device(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, deactivate_mfa_device_request=None):  # noqa: E501
    """post_deactivate_mfa_device

    &lt;p&gt;Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.&lt;/p&gt; &lt;p&gt;For more information about creating and working with virtual MFA devices, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\&quot;&gt;Enabling a virtual multi-factor authentication (MFA) device&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param deactivate_mfa_device_request: 
    :type deactivate_mfa_device_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        deactivate_mfa_device_request = DeactivateMFADeviceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_access_key(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_access_key_request=None):  # noqa: E501
    """post_delete_access_key

    &lt;p&gt;Deletes the access key pair associated with the specified IAM user.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_access_key_request: 
    :type delete_access_key_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_access_key_request = DeleteAccessKeyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_account_alias(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_account_alias_request=None):  # noqa: E501
    """post_delete_account_alias

     Deletes the specified Amazon Web Services account alias. For information about using an Amazon Web Services account alias, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\&quot;&gt;Creating, deleting, and listing an Amazon Web Services account alias&lt;/a&gt; in the &lt;i&gt;Amazon Web Services Sign-In User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_account_alias_request: 
    :type delete_account_alias_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_account_alias_request = DeleteAccountAliasRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_account_password_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """post_delete_account_password_policy

    Deletes the password policy for the Amazon Web Services account. There are no parameters. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_delete_group(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_group_request=None):  # noqa: E501
    """post_delete_group

    Deletes the specified IAM group. The group must not contain any users or have any attached policies. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_group_request: 
    :type delete_group_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_group_request = DeleteGroupRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_group_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_group_policy_request=None):  # noqa: E501
    """post_delete_group_policy

    &lt;p&gt;Deletes the specified inline policy that is embedded in the specified IAM group.&lt;/p&gt; &lt;p&gt;A group can also have managed policies attached to it. To detach a managed policy from a group, use &lt;a&gt;DetachGroupPolicy&lt;/a&gt;. For more information about policies, refer to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_group_policy_request: 
    :type delete_group_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_group_policy_request = DeleteGroupPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_instance_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_instance_profile_request=None):  # noqa: E501
    """post_delete_instance_profile

    &lt;p&gt;Deletes the specified instance profile. The instance profile must not have an associated role.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.&lt;/p&gt; &lt;/important&gt; &lt;p&gt;For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_instance_profile_request: 
    :type delete_instance_profile_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_instance_profile_request = DeleteInstanceProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_login_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_login_profile_request=None):  # noqa: E501
    """post_delete_login_profile

    &lt;p&gt;Deletes the password for the specified IAM user, For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_passwords_admin-change-user.html\&quot;&gt;Managing passwords for IAM users&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;You can use the CLI, the Amazon Web Services API, or the &lt;b&gt;Users&lt;/b&gt; page in the IAM console to delete a password for any IAM user. You can use &lt;a&gt;ChangePassword&lt;/a&gt; to update, but not delete, your own password in the &lt;b&gt;My Security Credentials&lt;/b&gt; page in the Amazon Web Services Management Console.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Deleting a user&#39;s password does not prevent a user from accessing Amazon Web Services through the command line interface or the API. To prevent all user access, you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see &lt;a&gt;UpdateAccessKey&lt;/a&gt; and &lt;a&gt;DeleteAccessKey&lt;/a&gt;.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_login_profile_request: 
    :type delete_login_profile_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_login_profile_request = DeleteLoginProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_open_id_connect_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_open_id_connect_provider_request=None):  # noqa: E501
    """post_delete_open_id_connect_provider

    &lt;p&gt;Deletes an OpenID Connect identity provider (IdP) resource object in IAM.&lt;/p&gt; &lt;p&gt;Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails.&lt;/p&gt; &lt;p&gt;This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_open_id_connect_provider_request: 
    :type delete_open_id_connect_provider_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_open_id_connect_provider_request = DeleteOpenIDConnectProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_policy_request=None):  # noqa: E501
    """post_delete_policy

    &lt;p&gt;Deletes the specified managed policy.&lt;/p&gt; &lt;p&gt;Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition, you must delete all the policy&#39;s versions. The following steps describe the process for deleting a managed policy:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Detach the policy from all users, groups, and roles that the policy is attached to, using &lt;a&gt;DetachUserPolicy&lt;/a&gt;, &lt;a&gt;DetachGroupPolicy&lt;/a&gt;, or &lt;a&gt;DetachRolePolicy&lt;/a&gt;. To list all the users, groups, and roles that a policy is attached to, use &lt;a&gt;ListEntitiesForPolicy&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Delete all versions of the policy using &lt;a&gt;DeletePolicyVersion&lt;/a&gt;. To list the policy&#39;s versions, use &lt;a&gt;ListPolicyVersions&lt;/a&gt;. You cannot use &lt;a&gt;DeletePolicyVersion&lt;/a&gt; to delete the version that is marked as the default version. You delete the policy&#39;s default version in the next step of the process.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Delete the policy (this automatically deletes the policy&#39;s default version) using this operation.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_policy_request: 
    :type delete_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_policy_request = DeletePolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_policy_version(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_policy_version_request=None):  # noqa: E501
    """post_delete_policy_version

    &lt;p&gt;Deletes the specified version from the specified managed policy.&lt;/p&gt; &lt;p&gt;You cannot delete the default version from a policy using this operation. To delete the default version from a policy, use &lt;a&gt;DeletePolicy&lt;/a&gt;. To find out which version of a policy is marked as the default version, use &lt;a&gt;ListPolicyVersions&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For information about versions for managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_policy_version_request: 
    :type delete_policy_version_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_policy_version_request = DeletePolicyVersionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_role(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_role_request=None):  # noqa: E501
    """post_delete_role

    &lt;p&gt;Deletes the specified role. Unlike the Amazon Web Services Management Console, when you delete a role programmatically, you must delete the items attached to the role manually, or the deletion fails. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_manage_delete.html#roles-managingrole-deleting-cli\&quot;&gt;Deleting an IAM role&lt;/a&gt;. Before attempting to delete a role, remove the following attached items: &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Inline policies (&lt;a&gt;DeleteRolePolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Attached managed policies (&lt;a&gt;DetachRolePolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Instance profile (&lt;a&gt;RemoveRoleFromInstanceProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Optional – Delete instance profile after detaching from role for resource clean up (&lt;a&gt;DeleteInstanceProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;important&gt; &lt;p&gt;Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_role_request: 
    :type delete_role_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_role_request = DeleteRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_role_permissions_boundary(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_role_permissions_boundary_request=None):  # noqa: E501
    """post_delete_role_permissions_boundary

    &lt;p&gt;Deletes the permissions boundary for the specified IAM role. &lt;/p&gt; &lt;p&gt;You cannot set the boundary for a service-linked role.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Deleting the permissions boundary for a role might increase its permissions. For example, it might allow anyone who assumes the role to perform all the actions granted in its permissions policies.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_role_permissions_boundary_request: 
    :type delete_role_permissions_boundary_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_role_permissions_boundary_request = DeleteRolePermissionsBoundaryRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_role_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_role_policy_request=None):  # noqa: E501
    """post_delete_role_policy

    &lt;p&gt;Deletes the specified inline policy that is embedded in the specified IAM role.&lt;/p&gt; &lt;p&gt;A role can also have managed policies attached to it. To detach a managed policy from a role, use &lt;a&gt;DetachRolePolicy&lt;/a&gt;. For more information about policies, refer to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_role_policy_request: 
    :type delete_role_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_role_policy_request = DeleteRolePolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_saml_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_saml_provider_request=None):  # noqa: E501
    """post_delete_saml_provider

    &lt;p&gt;Deletes a SAML provider resource in IAM.&lt;/p&gt; &lt;p&gt;Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource&#39;s ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.&lt;/p&gt; &lt;note&gt; &lt;p&gt; This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_saml_provider_request: 
    :type delete_saml_provider_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_saml_provider_request = DeleteSAMLProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_server_certificate(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_server_certificate_request=None):  # noqa: E501
    """post_delete_server_certificate

    &lt;p&gt;Deletes the specified server certificate.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;important&gt; &lt;p&gt; If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn&#39;t detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html\&quot;&gt;DeleteLoadBalancerListeners&lt;/a&gt; in the &lt;i&gt;Elastic Load Balancing API Reference&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_server_certificate_request: 
    :type delete_server_certificate_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_server_certificate_request = DeleteServerCertificateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_service_linked_role(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_service_linked_role_request=None):  # noqa: E501
    """post_delete_service_linked_role

    &lt;p&gt;Submits a service-linked role deletion request and returns a &lt;code&gt;DeletionTaskId&lt;/code&gt;, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the &lt;code&gt;DeletionTaskId&lt;/code&gt; of the earlier request is returned.&lt;/p&gt; &lt;p&gt;If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the &lt;a&gt;GetServiceLinkedRoleDeletionStatus&lt;/a&gt; operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the &lt;a href&#x3D;\&quot;http://docs.aws.amazon.com/\&quot;&gt;Amazon Web Services documentation&lt;/a&gt; for your service.&lt;/p&gt; &lt;p&gt;For more information about service-linked roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role\&quot;&gt;Roles terms and concepts: Amazon Web Services service-linked role&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_service_linked_role_request: 
    :type delete_service_linked_role_request: dict | bytes

    :rtype: Union[DeleteServiceLinkedRoleResponse, Tuple[DeleteServiceLinkedRoleResponse, int], Tuple[DeleteServiceLinkedRoleResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_service_linked_role_request = DeleteServiceLinkedRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_service_specific_credential(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_service_specific_credential_request=None):  # noqa: E501
    """post_delete_service_specific_credential

    Deletes the specified service-specific credential. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_service_specific_credential_request: 
    :type delete_service_specific_credential_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_service_specific_credential_request = DeleteServiceSpecificCredentialRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_signing_certificate(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_signing_certificate_request=None):  # noqa: E501
    """post_delete_signing_certificate

    &lt;p&gt;Deletes a signing certificate associated with the specified IAM user.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated IAM users.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_signing_certificate_request: 
    :type delete_signing_certificate_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_signing_certificate_request = DeleteSigningCertificateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_ssh_public_key(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_ssh_public_key_request=None):  # noqa: E501
    """post_delete_ssh_public_key

    &lt;p&gt;Deletes the specified SSH public key.&lt;/p&gt; &lt;p&gt;The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_ssh_public_key_request: 
    :type delete_ssh_public_key_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_ssh_public_key_request = DeleteSSHPublicKeyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_user(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_user_request=None):  # noqa: E501
    """post_delete_user

    &lt;p&gt;Deletes the specified IAM user. Unlike the Amazon Web Services Management Console, when you delete a user programmatically, you must delete the items attached to the user manually, or the deletion fails. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_deleting_cli\&quot;&gt;Deleting an IAM user&lt;/a&gt;. Before attempting to delete a user, remove the following items:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Password (&lt;a&gt;DeleteLoginProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Access keys (&lt;a&gt;DeleteAccessKey&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Signing certificate (&lt;a&gt;DeleteSigningCertificate&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;SSH public key (&lt;a&gt;DeleteSSHPublicKey&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Git credentials (&lt;a&gt;DeleteServiceSpecificCredential&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Multi-factor authentication (MFA) device (&lt;a&gt;DeactivateMFADevice&lt;/a&gt;, &lt;a&gt;DeleteVirtualMFADevice&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Inline policies (&lt;a&gt;DeleteUserPolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Attached managed policies (&lt;a&gt;DetachUserPolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Group memberships (&lt;a&gt;RemoveUserFromGroup&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_user_request: 
    :type delete_user_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_user_request = DeleteUserRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_user_permissions_boundary(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_user_permissions_boundary_request=None):  # noqa: E501
    """post_delete_user_permissions_boundary

    &lt;p&gt;Deletes the permissions boundary for the specified IAM user.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies. &lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_user_permissions_boundary_request: 
    :type delete_user_permissions_boundary_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_user_permissions_boundary_request = DeleteUserPermissionsBoundaryRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_user_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_user_policy_request=None):  # noqa: E501
    """post_delete_user_policy

    &lt;p&gt;Deletes the specified inline policy that is embedded in the specified IAM user.&lt;/p&gt; &lt;p&gt;A user can also have managed policies attached to it. To detach a managed policy from a user, use &lt;a&gt;DetachUserPolicy&lt;/a&gt;. For more information about policies, refer to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_user_policy_request: 
    :type delete_user_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_user_policy_request = DeleteUserPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_delete_virtual_mfa_device(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, delete_virtual_mfa_device_request=None):  # noqa: E501
    """post_delete_virtual_mfa_device

    &lt;p&gt;Deletes a virtual MFA device.&lt;/p&gt; &lt;note&gt; &lt;p&gt; You must deactivate a user&#39;s virtual MFA device before you can delete it. For information about deactivating MFA devices, see &lt;a&gt;DeactivateMFADevice&lt;/a&gt;. &lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param delete_virtual_mfa_device_request: 
    :type delete_virtual_mfa_device_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_virtual_mfa_device_request = DeleteVirtualMFADeviceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_detach_group_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, detach_group_policy_request=None):  # noqa: E501
    """post_detach_group_policy

    &lt;p&gt;Removes the specified managed policy from the specified IAM group.&lt;/p&gt; &lt;p&gt;A group can also have inline policies embedded with it. To delete an inline policy, use &lt;a&gt;DeleteGroupPolicy&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param detach_group_policy_request: 
    :type detach_group_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        detach_group_policy_request = DetachGroupPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_detach_role_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, detach_role_policy_request=None):  # noqa: E501
    """post_detach_role_policy

    &lt;p&gt;Removes the specified managed policy from the specified role.&lt;/p&gt; &lt;p&gt;A role can also have inline policies embedded with it. To delete an inline policy, use &lt;a&gt;DeleteRolePolicy&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param detach_role_policy_request: 
    :type detach_role_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        detach_role_policy_request = DetachRolePolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_detach_user_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, detach_user_policy_request=None):  # noqa: E501
    """post_detach_user_policy

    &lt;p&gt;Removes the specified managed policy from the specified user.&lt;/p&gt; &lt;p&gt;A user can also have inline policies embedded with it. To delete an inline policy, use &lt;a&gt;DeleteUserPolicy&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param detach_user_policy_request: 
    :type detach_user_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        detach_user_policy_request = DetachUserPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_enable_mfa_device(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, enable_mfa_device_request=None):  # noqa: E501
    """post_enable_mfa_device

    Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param enable_mfa_device_request: 
    :type enable_mfa_device_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        enable_mfa_device_request = EnableMFADeviceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_generate_credential_report(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """post_generate_credential_report

     Generates a credential report for the Amazon Web Services account. For more information about the credential report, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html\&quot;&gt;Getting credential reports&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GenerateCredentialReportResponse, Tuple[GenerateCredentialReportResponse, int], Tuple[GenerateCredentialReportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_generate_organizations_access_report(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, generate_organizations_access_report_request=None):  # noqa: E501
    """post_generate_organizations_access_report

    &lt;p&gt;Generates a report for service last accessed data for Organizations. You can generate a report for any entities (organization root, organizational unit, or account) or policies in your organization.&lt;/p&gt; &lt;p&gt;To call this operation, you must be signed in using your Organizations management account credentials. You can use your long-term IAM user or root user credentials, or temporary credentials from assuming an IAM role. SCPs must be enabled for your organization root. You must have the required IAM and Organizations permissions. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Refining permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can generate a service last accessed data report for entities by specifying only the entity&#39;s path. This data includes a list of services that are allowed by any service control policies (SCPs) that apply to the entity.&lt;/p&gt; &lt;p&gt;You can generate a service last accessed data report for a policy by specifying an entity&#39;s path and an optional Organizations policy ID. This data includes a list of services that are allowed by the specified SCP.&lt;/p&gt; &lt;p&gt;For each service in both report types, the data includes the most recent account activity that the policy allows to account principals in the entity or the entity&#39;s children. For important information about the data, reporting period, permissions required, troubleshooting, and supported Regions see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt;The data includes all attempts to access Amazon Web Services, not just the successful ones. This includes all attempts that were made using the Amazon Web Services Management Console, the Amazon Web Services API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that an account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\&quot;&gt;Logging IAM events with CloudTrail&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;p&gt;This operation returns a &lt;code&gt;JobId&lt;/code&gt;. Use this parameter in the &lt;code&gt; &lt;a&gt;GetOrganizationsAccessReport&lt;/a&gt; &lt;/code&gt; operation to check the status of the report generation. To check the status of this request, use the &lt;code&gt;JobId&lt;/code&gt; parameter in the &lt;code&gt; &lt;a&gt;GetOrganizationsAccessReport&lt;/a&gt; &lt;/code&gt; operation and test the &lt;code&gt;JobStatus&lt;/code&gt; response parameter. When the job is complete, you can retrieve the report.&lt;/p&gt; &lt;p&gt;To generate a service last accessed data report for entities, specify an entity path without specifying the optional Organizations policy ID. The type of entity that you specify determines the data returned in the report.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Root&lt;/b&gt; – When you specify the organizations root as the entity, the resulting report lists all of the services allowed by SCPs that are attached to your root. For each service, the report includes data for all accounts in your organization except the management account, because the management account is not limited by SCPs.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;OU&lt;/b&gt; – When you specify an organizational unit (OU) as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the OU and its parents. For each service, the report includes data for all accounts in the OU or its children. This data excludes the management account, because the management account is not limited by SCPs.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;management account&lt;/b&gt; – When you specify the management account, the resulting report lists all Amazon Web Services services, because the management account is not limited by SCPs. For each service, the report includes data for only the management account.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Account&lt;/b&gt; – When you specify another account as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the account and its parents. For each service, the report includes data for only the specified account.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To generate a service last accessed data report for policies, specify an entity path and the optional Organizations policy ID. The type of entity that you specify determines the data returned for each service.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Root&lt;/b&gt; – When you specify the root entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in your organization to which the SCP applies. This data excludes the management account, because the management account is not limited by SCPs. If the SCP is not attached to any entities in the organization, then the report will return a list of services with no data.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;OU&lt;/b&gt; – When you specify an OU entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in the OU or its children to which the SCP applies. This means that other accounts outside the OU that are affected by the SCP might not be included in the data. This data excludes the management account, because the management account is not limited by SCPs. If the SCP is not attached to the OU or one of its children, the report will return a list of services with no data.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;management account&lt;/b&gt; – When you specify the management account, the resulting report lists all Amazon Web Services services, because the management account is not limited by SCPs. If you specify a policy ID in the CLI or API, the policy is ignored. For each service, the report includes data for only the management account.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Account&lt;/b&gt; – When you specify another account entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for only the specified account. This means that other accounts in the organization that are affected by the SCP might not be included in the data. If the SCP is not attached to the account, the report will return a list of services with no data.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;Service last accessed data does not use other policy types when determining whether a principal could access a service. These other policy types include identity-based policies, resource-based policies, access control lists, IAM permissions boundaries, and STS assume role policies. It only applies SCP logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;For more information about service last accessed data, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing policy scope by viewing user activity&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param generate_organizations_access_report_request: 
    :type generate_organizations_access_report_request: dict | bytes

    :rtype: Union[GenerateOrganizationsAccessReportResponse, Tuple[GenerateOrganizationsAccessReportResponse, int], Tuple[GenerateOrganizationsAccessReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_organizations_access_report_request = GenerateOrganizationsAccessReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_generate_service_last_accessed_details(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, generate_service_last_accessed_details_request=None):  # noqa: E501
    """post_generate_service_last_accessed_details

    &lt;p&gt;Generates a report that includes details about when an IAM resource (user, group, role, or policy) was last used in an attempt to access Amazon Web Services services. Recent activity usually appears within four hours. IAM reports activity for at least the last 400 days, or less if your Region began supporting this feature within the last year. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period\&quot;&gt;Regions where data is tracked&lt;/a&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt;The service last accessed data includes all attempts to access an Amazon Web Services API, not just the successful ones. This includes all attempts that were made using the Amazon Web Services Management Console, the Amazon Web Services API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that your account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\&quot;&gt;Logging IAM events with CloudTrail&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;p&gt;The &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; operation returns a &lt;code&gt;JobId&lt;/code&gt;. Use this parameter in the following operations to retrieve the following details from your report: &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;GetServiceLastAccessedDetails&lt;/a&gt; – Use this operation for users, groups, roles, or policies to list every Amazon Web Services service that the resource could access using permissions policies. For each service, the response includes information about the most recent access attempt.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;JobId&lt;/code&gt; returned by &lt;code&gt;GenerateServiceLastAccessedDetail&lt;/code&gt; must be used by the same role within a session, or by the same user when used to call &lt;code&gt;GetServiceLastAccessedDetail&lt;/code&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;GetServiceLastAccessedDetailsWithEntities&lt;/a&gt; – Use this operation for groups and policies to list information about the associated entities (users or roles) that attempted to access a specific Amazon Web Services service. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To check the status of the &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; request, use the &lt;code&gt;JobId&lt;/code&gt; parameter in the same operations and test the &lt;code&gt;JobStatus&lt;/code&gt; response parameter.&lt;/p&gt; &lt;p&gt;For additional information about the permissions policies that allow an identity (user, group, or role) to access specific services, use the &lt;a&gt;ListPoliciesGrantingServiceAccess&lt;/a&gt; operation.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;For more information about service and action last accessed data, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param generate_service_last_accessed_details_request: 
    :type generate_service_last_accessed_details_request: dict | bytes

    :rtype: Union[GenerateServiceLastAccessedDetailsResponse, Tuple[GenerateServiceLastAccessedDetailsResponse, int], Tuple[GenerateServiceLastAccessedDetailsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_service_last_accessed_details_request = GenerateServiceLastAccessedDetailsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_access_key_last_used(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_access_key_last_used_request=None):  # noqa: E501
    """post_get_access_key_last_used

    Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the Amazon Web Services service and Region that were specified in the last request made with that key. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_access_key_last_used_request: 
    :type get_access_key_last_used_request: dict | bytes

    :rtype: Union[GetAccessKeyLastUsedResponse, Tuple[GetAccessKeyLastUsedResponse, int], Tuple[GetAccessKeyLastUsedResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_access_key_last_used_request = GetAccessKeyLastUsedRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_account_authorization_details(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, get_account_authorization_details_request=None):  # noqa: E501
    """post_get_account_authorization_details

    &lt;p&gt;Retrieves information about all IAM users, groups, roles, and policies in your Amazon Web Services account, including their relationships to one another. Use this operation to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can optionally filter the results using the &lt;code&gt;Filter&lt;/code&gt; parameter. You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param get_account_authorization_details_request: 
    :type get_account_authorization_details_request: dict | bytes

    :rtype: Union[GetAccountAuthorizationDetailsResponse, Tuple[GetAccountAuthorizationDetailsResponse, int], Tuple[GetAccountAuthorizationDetailsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_account_authorization_details_request = GetAccountAuthorizationDetailsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_account_password_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """post_get_account_password_policy

    Retrieves the password policy for the Amazon Web Services account. This tells you the complexity requirements and mandatory rotation periods for the IAM user passwords in your account. For more information about using a password policy, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html\&quot;&gt;Managing an IAM password policy&lt;/a&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetAccountPasswordPolicyResponse, Tuple[GetAccountPasswordPolicyResponse, int], Tuple[GetAccountPasswordPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_get_account_summary(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """post_get_account_summary

    &lt;p&gt;Retrieves information about IAM entity usage and IAM quotas in the Amazon Web Services account.&lt;/p&gt; &lt;p&gt; For information about IAM quotas, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetAccountSummaryResponse, Tuple[GetAccountSummaryResponse, int], Tuple[GetAccountSummaryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_get_context_keys_for_custom_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_context_keys_for_custom_policy_request=None):  # noqa: E501
    """post_get_context_keys_for_custom_policy

    &lt;p&gt;Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use &lt;a&gt;GetContextKeysForPrincipalPolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use &lt;code&gt;GetContextKeysForCustomPolicy&lt;/code&gt; to understand what key names and values you must supply when you call &lt;a&gt;SimulateCustomPolicy&lt;/a&gt;. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_context_keys_for_custom_policy_request: 
    :type get_context_keys_for_custom_policy_request: dict | bytes

    :rtype: Union[GetContextKeysForPolicyResponse, Tuple[GetContextKeysForPolicyResponse, int], Tuple[GetContextKeysForPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_context_keys_for_custom_policy_request = GetContextKeysForCustomPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_context_keys_for_principal_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_context_keys_for_principal_policy_request=None):  # noqa: E501
    """post_get_context_keys_for_principal_policy

    &lt;p&gt;Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of.&lt;/p&gt; &lt;p&gt;You can optionally include a list of one or more additional policies, specified as strings. If you want to include &lt;i&gt;only&lt;/i&gt; a list of policies by string, use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; This operation discloses information about the permissions granted to other users. If you do not want users to see other user&#39;s permissions, then consider allowing them to use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use &lt;a&gt;GetContextKeysForPrincipalPolicy&lt;/a&gt; to understand what key names and values you must supply when you call &lt;a&gt;SimulatePrincipalPolicy&lt;/a&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_context_keys_for_principal_policy_request: 
    :type get_context_keys_for_principal_policy_request: dict | bytes

    :rtype: Union[GetContextKeysForPolicyResponse, Tuple[GetContextKeysForPolicyResponse, int], Tuple[GetContextKeysForPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_context_keys_for_principal_policy_request = GetContextKeysForPrincipalPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_credential_report(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None):  # noqa: E501
    """post_get_credential_report

     Retrieves a credential report for the Amazon Web Services account. For more information about the credential report, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html\&quot;&gt;Getting credential reports&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str

    :rtype: Union[GetCredentialReportResponse, Tuple[GetCredentialReportResponse, int], Tuple[GetCredentialReportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_get_group(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, get_group_request=None):  # noqa: E501
    """post_get_group

     Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param get_group_request: 
    :type get_group_request: dict | bytes

    :rtype: Union[GetGroupResponse, Tuple[GetGroupResponse, int], Tuple[GetGroupResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_group_request = GetGroupRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_group_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_group_policy_request=None):  # noqa: E501
    """post_get_group_policy

    &lt;p&gt;Retrieves the specified inline policy document that is embedded in the specified IAM group.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use &lt;a&gt;GetPolicy&lt;/a&gt; to determine the policy&#39;s default version, then use &lt;a&gt;GetPolicyVersion&lt;/a&gt; to retrieve the policy document.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_group_policy_request: 
    :type get_group_policy_request: dict | bytes

    :rtype: Union[GetGroupPolicyResponse, Tuple[GetGroupPolicyResponse, int], Tuple[GetGroupPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_group_policy_request = GetGroupPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_instance_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_instance_profile_request=None):  # noqa: E501
    """post_get_instance_profile

     Retrieves information about the specified instance profile, including the instance profile&#39;s path, GUID, ARN, and role. For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_instance_profile_request: 
    :type get_instance_profile_request: dict | bytes

    :rtype: Union[GetInstanceProfileResponse, Tuple[GetInstanceProfileResponse, int], Tuple[GetInstanceProfileResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_instance_profile_request = GetInstanceProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_login_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_login_profile_request=None):  # noqa: E501
    """post_get_login_profile

    &lt;p&gt;Retrieves the user name for the specified IAM user. A login profile is created when you create a password for the user to access the Amazon Web Services Management Console. If the user does not exist or does not have a password, the operation returns a 404 (&lt;code&gt;NoSuchEntity&lt;/code&gt;) error.&lt;/p&gt; &lt;p&gt;If you create an IAM user with access to the console, the &lt;code&gt;CreateDate&lt;/code&gt; reflects the date you created the initial password for the user.&lt;/p&gt; &lt;p&gt;If you create an IAM user with programmatic access, and then later add a password for the user to access the Amazon Web Services Management Console, the &lt;code&gt;CreateDate&lt;/code&gt; reflects the initial password creation date. A user with programmatic access does not have a login profile unless you create a password for the user to access the Amazon Web Services Management Console.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_login_profile_request: 
    :type get_login_profile_request: dict | bytes

    :rtype: Union[GetLoginProfileResponse, Tuple[GetLoginProfileResponse, int], Tuple[GetLoginProfileResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_login_profile_request = GetLoginProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_mfa_device(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_mfa_device_request=None):  # noqa: E501
    """post_get_mfa_device

    Retrieves information about an MFA device for a specified user. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_mfa_device_request: 
    :type get_mfa_device_request: dict | bytes

    :rtype: Union[GetMFADeviceResponse, Tuple[GetMFADeviceResponse, int], Tuple[GetMFADeviceResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_mfa_device_request = GetMFADeviceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_open_id_connect_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_open_id_connect_provider_request=None):  # noqa: E501
    """post_get_open_id_connect_provider

    Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_open_id_connect_provider_request: 
    :type get_open_id_connect_provider_request: dict | bytes

    :rtype: Union[GetOpenIDConnectProviderResponse, Tuple[GetOpenIDConnectProviderResponse, int], Tuple[GetOpenIDConnectProviderResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_open_id_connect_provider_request = GetOpenIDConnectProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_organizations_access_report(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_organizations_access_report_request=None):  # noqa: E501
    """post_get_organizations_access_report

    &lt;p&gt;Retrieves the service last accessed data report for Organizations that was previously generated using the &lt;code&gt; &lt;a&gt;GenerateOrganizationsAccessReport&lt;/a&gt; &lt;/code&gt; operation. This operation retrieves the status of your report job and the report contents.&lt;/p&gt; &lt;p&gt;Depending on the parameters that you passed when you generated the report, the data returned could include different information. For details, see &lt;a&gt;GenerateOrganizationsAccessReport&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;To call this operation, you must be signed in to the management account in your organization. SCPs must be enabled for your organization root. You must have permissions to perform this operation. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Refining permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For each service that principals in an account (root user, IAM users, or IAM roles) could access using SCPs, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, it returns the reason that it failed.&lt;/p&gt; &lt;p&gt;By default, the list is sorted by service namespace.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_organizations_access_report_request: 
    :type get_organizations_access_report_request: dict | bytes

    :rtype: Union[GetOrganizationsAccessReportResponse, Tuple[GetOrganizationsAccessReportResponse, int], Tuple[GetOrganizationsAccessReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_organizations_access_report_request = GetOrganizationsAccessReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_policy_request=None):  # noqa: E501
    """post_get_policy

    &lt;p&gt;Retrieves information about the specified managed policy, including the policy&#39;s default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use &lt;a&gt;ListEntitiesForPolicy&lt;/a&gt;. This operation returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use &lt;a&gt;GetPolicyVersion&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;This operation retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use &lt;a&gt;GetUserPolicy&lt;/a&gt;, &lt;a&gt;GetGroupPolicy&lt;/a&gt;, or &lt;a&gt;GetRolePolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_policy_request: 
    :type get_policy_request: dict | bytes

    :rtype: Union[GetPolicyResponse, Tuple[GetPolicyResponse, int], Tuple[GetPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_policy_request = GetPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_policy_version(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_policy_version_request=None):  # noqa: E501
    """post_get_policy_version

    &lt;p&gt;Retrieves information about the specified version of the specified managed policy, including the policy document.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;To list the available versions for a policy, use &lt;a&gt;ListPolicyVersions&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;This operation retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use &lt;a&gt;GetUserPolicy&lt;/a&gt;, &lt;a&gt;GetGroupPolicy&lt;/a&gt;, or &lt;a&gt;GetRolePolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about the types of policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about managed policy versions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\&quot;&gt;Versioning for managed policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_policy_version_request: 
    :type get_policy_version_request: dict | bytes

    :rtype: Union[GetPolicyVersionResponse, Tuple[GetPolicyVersionResponse, int], Tuple[GetPolicyVersionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_policy_version_request = GetPolicyVersionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_role(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_role_request=None):  # noqa: E501
    """post_get_role

    &lt;p&gt;Retrieves information about the specified role, including the role&#39;s path, GUID, ARN, and the role&#39;s trust policy that grants permission to assume the role. For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_role_request: 
    :type get_role_request: dict | bytes

    :rtype: Union[GetRoleResponse, Tuple[GetRoleResponse, int], Tuple[GetRoleResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_role_request = GetRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_role_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_role_policy_request=None):  # noqa: E501
    """post_get_role_policy

    &lt;p&gt;Retrieves the specified inline policy document that is embedded with the specified IAM role.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use &lt;a&gt;GetPolicy&lt;/a&gt; to determine the policy&#39;s default version, then use &lt;a&gt;GetPolicyVersion&lt;/a&gt; to retrieve the policy document.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_role_policy_request: 
    :type get_role_policy_request: dict | bytes

    :rtype: Union[GetRolePolicyResponse, Tuple[GetRolePolicyResponse, int], Tuple[GetRolePolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_role_policy_request = GetRolePolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_saml_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_saml_provider_request=None):  # noqa: E501
    """post_get_saml_provider

    &lt;p&gt;Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.&lt;/p&gt; &lt;note&gt; &lt;p&gt;This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_saml_provider_request: 
    :type get_saml_provider_request: dict | bytes

    :rtype: Union[GetSAMLProviderResponse, Tuple[GetSAMLProviderResponse, int], Tuple[GetSAMLProviderResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_saml_provider_request = GetSAMLProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_server_certificate(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_server_certificate_request=None):  # noqa: E501
    """post_get_server_certificate

    &lt;p&gt;Retrieves information about the specified server certificate stored in IAM.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_server_certificate_request: 
    :type get_server_certificate_request: dict | bytes

    :rtype: Union[GetServerCertificateResponse, Tuple[GetServerCertificateResponse, int], Tuple[GetServerCertificateResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_server_certificate_request = GetServerCertificateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_service_last_accessed_details(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_service_last_accessed_details_request=None):  # noqa: E501
    """post_get_service_last_accessed_details

    &lt;p&gt;Retrieves a service last accessed report that was created using the &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; operation. You can use the &lt;code&gt;JobId&lt;/code&gt; parameter in &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of Amazon Web Services services that the resource (user, group, role, or managed policy) can access.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; operation returns the reason that it failed.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;User&lt;/b&gt; – Returns the user ARN that you used to generate the report&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Group&lt;/b&gt; – Returns the ARN of the group member (user) that last attempted to access the service&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Role&lt;/b&gt; – Returns the role ARN that you used to generate the report&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Policy&lt;/b&gt; – Returns the ARN of the user or role that last used the policy to attempt to access the service&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;By default, the list is sorted by service namespace.&lt;/p&gt; &lt;p&gt;If you specified &lt;code&gt;ACTION_LEVEL&lt;/code&gt; granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data.&lt;/p&gt; &lt;p&gt;For more information about service and action last accessed data, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_service_last_accessed_details_request: 
    :type get_service_last_accessed_details_request: dict | bytes

    :rtype: Union[GetServiceLastAccessedDetailsResponse, Tuple[GetServiceLastAccessedDetailsResponse, int], Tuple[GetServiceLastAccessedDetailsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_service_last_accessed_details_request = GetServiceLastAccessedDetailsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_service_last_accessed_details_with_entities(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_service_last_accessed_details_with_entities_request=None):  # noqa: E501
    """post_get_service_last_accessed_details_with_entities

    &lt;p&gt;After you generate a group or policy report using the &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; operation, you can use the &lt;code&gt;JobId&lt;/code&gt; parameter in &lt;code&gt;GetServiceLastAccessedDetailsWithEntities&lt;/code&gt;. This operation retrieves the status of your report job and a list of entities that could have used group or policy permissions to access the specified service.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Group&lt;/b&gt; – For a group report, this operation returns a list of users in the group that could have used the group’s policies in an attempt to access the service.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Policy&lt;/b&gt; – For a policy report, this operation returns a list of entities (users or roles) that could have used the policy in an attempt to access the service.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;You can also use this operation for user or role reports to retrieve details about those entities.&lt;/p&gt; &lt;p&gt;If the operation fails, the &lt;code&gt;GetServiceLastAccessedDetailsWithEntities&lt;/code&gt; operation returns the reason that it failed.&lt;/p&gt; &lt;p&gt;By default, the list of associated entities is sorted by date, with the most recent access listed first.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_service_last_accessed_details_with_entities_request: 
    :type get_service_last_accessed_details_with_entities_request: dict | bytes

    :rtype: Union[GetServiceLastAccessedDetailsWithEntitiesResponse, Tuple[GetServiceLastAccessedDetailsWithEntitiesResponse, int], Tuple[GetServiceLastAccessedDetailsWithEntitiesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_service_last_accessed_details_with_entities_request = GetServiceLastAccessedDetailsWithEntitiesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_service_linked_role_deletion_status(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_service_linked_role_deletion_status_request=None):  # noqa: E501
    """post_get_service_linked_role_deletion_status

    Retrieves the status of your service-linked role deletion. After you use &lt;a&gt;DeleteServiceLinkedRole&lt;/a&gt; to submit a service-linked role for deletion, you can use the &lt;code&gt;DeletionTaskId&lt;/code&gt; parameter in &lt;code&gt;GetServiceLinkedRoleDeletionStatus&lt;/code&gt; to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_service_linked_role_deletion_status_request: 
    :type get_service_linked_role_deletion_status_request: dict | bytes

    :rtype: Union[GetServiceLinkedRoleDeletionStatusResponse, Tuple[GetServiceLinkedRoleDeletionStatusResponse, int], Tuple[GetServiceLinkedRoleDeletionStatusResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_service_linked_role_deletion_status_request = GetServiceLinkedRoleDeletionStatusRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_ssh_public_key(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_ssh_public_key_request=None):  # noqa: E501
    """post_get_ssh_public_key

    &lt;p&gt;Retrieves the specified SSH public key, including metadata about the key.&lt;/p&gt; &lt;p&gt;The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_ssh_public_key_request: 
    :type get_ssh_public_key_request: dict | bytes

    :rtype: Union[GetSSHPublicKeyResponse, Tuple[GetSSHPublicKeyResponse, int], Tuple[GetSSHPublicKeyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_ssh_public_key_request = GetSSHPublicKeyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_user(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_user_request=None):  # noqa: E501
    """post_get_user

    &lt;p&gt;Retrieves information about the specified IAM user, including the user&#39;s creation date, path, unique ID, and ARN.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID used to sign the request to this operation.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_user_request: 
    :type get_user_request: dict | bytes

    :rtype: Union[GetUserResponse, Tuple[GetUserResponse, int], Tuple[GetUserResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_user_request = GetUserRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_get_user_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, get_user_policy_request=None):  # noqa: E501
    """post_get_user_policy

    &lt;p&gt;Retrieves the specified inline policy document that is embedded in the specified IAM user.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Policies returned by this operation are URL-encoded compliant with &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc3986\&quot;&gt;RFC 3986&lt;/a&gt;. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the &lt;code&gt;decode&lt;/code&gt; method of the &lt;code&gt;java.net.URLDecoder&lt;/code&gt; utility class in the Java SDK. Other languages and SDKs provide similar functionality.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use &lt;a&gt;GetPolicy&lt;/a&gt; to determine the policy&#39;s default version. Then use &lt;a&gt;GetPolicyVersion&lt;/a&gt; to retrieve the policy document.&lt;/p&gt; &lt;p&gt;For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param get_user_policy_request: 
    :type get_user_policy_request: dict | bytes

    :rtype: Union[GetUserPolicyResponse, Tuple[GetUserPolicyResponse, int], Tuple[GetUserPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_user_policy_request = GetUserPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_access_keys(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_access_keys_request=None):  # noqa: E501
    """post_list_access_keys

    &lt;p&gt;Returns information about the access key IDs associated with the specified IAM user. If there is none, the operation returns an empty list.&lt;/p&gt; &lt;p&gt;Although each user is limited to a small number of keys, you can still paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. If a temporary access key is used, then &lt;code&gt;UserName&lt;/code&gt; is required. If a long-term key is assigned to the user, then &lt;code&gt;UserName&lt;/code&gt; is not required. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; &lt;note&gt; &lt;p&gt;To ensure the security of your Amazon Web Services account, the secret access key is accessible only during key and user creation.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_access_keys_request: 
    :type list_access_keys_request: dict | bytes

    :rtype: Union[ListAccessKeysResponse, Tuple[ListAccessKeysResponse, int], Tuple[ListAccessKeysResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_access_keys_request = ListAccessKeysRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_account_aliases(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_account_aliases_request=None):  # noqa: E501
    """post_list_account_aliases

    Lists the account alias associated with the Amazon Web Services account (Note: you can have only one). For information about using an Amazon Web Services account alias, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\&quot;&gt;Creating, deleting, and listing an Amazon Web Services account alias&lt;/a&gt; in the &lt;i&gt;Amazon Web Services Sign-In User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_account_aliases_request: 
    :type list_account_aliases_request: dict | bytes

    :rtype: Union[ListAccountAliasesResponse, Tuple[ListAccountAliasesResponse, int], Tuple[ListAccountAliasesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_account_aliases_request = ListAccountAliasesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_attached_group_policies(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_attached_group_policies_request=None):  # noqa: E501
    """post_list_attached_group_policies

    &lt;p&gt;Lists all managed policies that are attached to the specified IAM group.&lt;/p&gt; &lt;p&gt;An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use &lt;a&gt;ListGroupPolicies&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. You can use the &lt;code&gt;PathPrefix&lt;/code&gt; parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_attached_group_policies_request: 
    :type list_attached_group_policies_request: dict | bytes

    :rtype: Union[ListAttachedGroupPoliciesResponse, Tuple[ListAttachedGroupPoliciesResponse, int], Tuple[ListAttachedGroupPoliciesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_attached_group_policies_request = ListAttachedGroupPoliciesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_attached_role_policies(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_attached_role_policies_request=None):  # noqa: E501
    """post_list_attached_role_policies

    &lt;p&gt;Lists all managed policies that are attached to the specified IAM role.&lt;/p&gt; &lt;p&gt;An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use &lt;a&gt;ListRolePolicies&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. You can use the &lt;code&gt;PathPrefix&lt;/code&gt; parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_attached_role_policies_request: 
    :type list_attached_role_policies_request: dict | bytes

    :rtype: Union[ListAttachedRolePoliciesResponse, Tuple[ListAttachedRolePoliciesResponse, int], Tuple[ListAttachedRolePoliciesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_attached_role_policies_request = ListAttachedRolePoliciesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_attached_user_policies(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_attached_user_policies_request=None):  # noqa: E501
    """post_list_attached_user_policies

    &lt;p&gt;Lists all managed policies that are attached to the specified IAM user.&lt;/p&gt; &lt;p&gt;An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use &lt;a&gt;ListUserPolicies&lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. You can use the &lt;code&gt;PathPrefix&lt;/code&gt; parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_attached_user_policies_request: 
    :type list_attached_user_policies_request: dict | bytes

    :rtype: Union[ListAttachedUserPoliciesResponse, Tuple[ListAttachedUserPoliciesResponse, int], Tuple[ListAttachedUserPoliciesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_attached_user_policies_request = ListAttachedUserPoliciesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_entities_for_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_entities_for_policy_request=None):  # noqa: E501
    """post_list_entities_for_policy

    &lt;p&gt;Lists all IAM users, groups, and roles that the specified managed policy is attached to.&lt;/p&gt; &lt;p&gt;You can use the optional &lt;code&gt;EntityFilter&lt;/code&gt; parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set &lt;code&gt;EntityFilter&lt;/code&gt; to &lt;code&gt;Role&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_entities_for_policy_request: 
    :type list_entities_for_policy_request: dict | bytes

    :rtype: Union[ListEntitiesForPolicyResponse, Tuple[ListEntitiesForPolicyResponse, int], Tuple[ListEntitiesForPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_entities_for_policy_request = ListEntitiesForPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_group_policies(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_group_policies_request=None):  # noqa: E501
    """post_list_group_policies

    &lt;p&gt;Lists the names of the inline policies that are embedded in the specified IAM group.&lt;/p&gt; &lt;p&gt;An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use &lt;a&gt;ListAttachedGroupPolicies&lt;/a&gt;. For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_group_policies_request: 
    :type list_group_policies_request: dict | bytes

    :rtype: Union[ListGroupPoliciesResponse, Tuple[ListGroupPoliciesResponse, int], Tuple[ListGroupPoliciesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_group_policies_request = ListGroupPoliciesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_groups(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_groups_request=None):  # noqa: E501
    """post_list_groups

    &lt;p&gt;Lists the IAM groups that have the specified path prefix.&lt;/p&gt; &lt;p&gt; You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_groups_request: 
    :type list_groups_request: dict | bytes

    :rtype: Union[ListGroupsResponse, Tuple[ListGroupsResponse, int], Tuple[ListGroupsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_groups_request = ListGroupsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_groups_for_user(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_groups_for_user_request=None):  # noqa: E501
    """post_list_groups_for_user

    &lt;p&gt;Lists the IAM groups that the specified IAM user belongs to.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_groups_for_user_request: 
    :type list_groups_for_user_request: dict | bytes

    :rtype: Union[ListGroupsForUserResponse, Tuple[ListGroupsForUserResponse, int], Tuple[ListGroupsForUserResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_groups_for_user_request = ListGroupsForUserRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_instance_profile_tags(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_instance_profile_tags_request=None):  # noqa: E501
    """post_list_instance_profile_tags

    Lists the tags that are attached to the specified IAM instance profile. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_instance_profile_tags_request: 
    :type list_instance_profile_tags_request: dict | bytes

    :rtype: Union[ListInstanceProfileTagsResponse, Tuple[ListInstanceProfileTagsResponse, int], Tuple[ListInstanceProfileTagsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_instance_profile_tags_request = ListInstanceProfileTagsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_instance_profiles(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_instance_profiles_request=None):  # noqa: E501
    """post_list_instance_profiles

    &lt;p&gt;Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for an instance profile, see &lt;a&gt;GetInstanceProfile&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_instance_profiles_request: 
    :type list_instance_profiles_request: dict | bytes

    :rtype: Union[ListInstanceProfilesResponse, Tuple[ListInstanceProfilesResponse, int], Tuple[ListInstanceProfilesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_instance_profiles_request = ListInstanceProfilesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_instance_profiles_for_role(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_instance_profiles_for_role_request=None):  # noqa: E501
    """post_list_instance_profiles_for_role

    &lt;p&gt;Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_instance_profiles_for_role_request: 
    :type list_instance_profiles_for_role_request: dict | bytes

    :rtype: Union[ListInstanceProfilesForRoleResponse, Tuple[ListInstanceProfilesForRoleResponse, int], Tuple[ListInstanceProfilesForRoleResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_instance_profiles_for_role_request = ListInstanceProfilesForRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_mfa_device_tags(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_mfa_device_tags_request=None):  # noqa: E501
    """post_list_mfa_device_tags

    Lists the tags that are attached to the specified IAM virtual multi-factor authentication (MFA) device. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_mfa_device_tags_request: 
    :type list_mfa_device_tags_request: dict | bytes

    :rtype: Union[ListMFADeviceTagsResponse, Tuple[ListMFADeviceTagsResponse, int], Tuple[ListMFADeviceTagsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_mfa_device_tags_request = ListMFADeviceTagsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_mfa_devices(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_mfa_devices_request=None):  # noqa: E501
    """post_list_mfa_devices

    &lt;p&gt;Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request for this operation.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_mfa_devices_request: 
    :type list_mfa_devices_request: dict | bytes

    :rtype: Union[ListMFADevicesResponse, Tuple[ListMFADevicesResponse, int], Tuple[ListMFADevicesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_mfa_devices_request = ListMFADevicesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_open_id_connect_provider_tags(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_open_id_connect_provider_tags_request=None):  # noqa: E501
    """post_list_open_id_connect_provider_tags

    &lt;p&gt;Lists the tags that are attached to the specified OpenID Connect (OIDC)-compatible identity provider. The returned list of tags is sorted by tag key. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_open_id_connect_provider_tags_request: 
    :type list_open_id_connect_provider_tags_request: dict | bytes

    :rtype: Union[ListOpenIDConnectProviderTagsResponse, Tuple[ListOpenIDConnectProviderTagsResponse, int], Tuple[ListOpenIDConnectProviderTagsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_open_id_connect_provider_tags_request = ListOpenIDConnectProviderTagsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_open_id_connect_providers(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, body=None):  # noqa: E501
    """post_list_open_id_connect_providers

    &lt;p&gt;Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the Amazon Web Services account.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for an OIDC provider, see &lt;a&gt;GetOpenIDConnectProvider&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param body: 
    :type body: 

    :rtype: Union[ListOpenIDConnectProvidersResponse, Tuple[ListOpenIDConnectProvidersResponse, int], Tuple[ListOpenIDConnectProvidersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_list_policies(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_policies_request=None):  # noqa: E501
    """post_list_policies

    &lt;p&gt;Lists all the managed policies that are available in your Amazon Web Services account, including your own customer-defined managed policies and all Amazon Web Services managed policies.&lt;/p&gt; &lt;p&gt;You can filter the list of policies that is returned using the optional &lt;code&gt;OnlyAttached&lt;/code&gt;, &lt;code&gt;Scope&lt;/code&gt;, and &lt;code&gt;PathPrefix&lt;/code&gt; parameters. For example, to list only the customer managed policies in your Amazon Web Services account, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;Local&lt;/code&gt;. To list only Amazon Web Services managed policies, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;AWS&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;For more information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a customer manged policy, see &lt;a&gt;GetPolicy&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_policies_request: 
    :type list_policies_request: dict | bytes

    :rtype: Union[ListPoliciesResponse, Tuple[ListPoliciesResponse, int], Tuple[ListPoliciesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_policies_request = ListPoliciesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_policies_granting_service_access(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, list_policies_granting_service_access_request=None):  # noqa: E501
    """post_list_policies_granting_service_access

    &lt;p&gt;Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified service.&lt;/p&gt; &lt;note&gt; &lt;p&gt;This operation does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;The list of policies returned by the operation depends on the ARN of the identity that you provide.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;User&lt;/b&gt; – The list of policies includes the managed and inline policies that are attached to the user directly. The list also includes any additional managed and inline policies that are attached to the group to which the user belongs. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Group&lt;/b&gt; – The list of policies includes only the managed and inline policies that are attached to the group directly. Policies that are attached to the group’s user are not included.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Role&lt;/b&gt; – The list of policies includes only the managed and inline policies that are attached to the role.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information about these policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed policy is currently used to set the permissions boundary for a user or role, use the &lt;a&gt;GetUser&lt;/a&gt; or &lt;a&gt;GetRole&lt;/a&gt; operations.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param list_policies_granting_service_access_request: 
    :type list_policies_granting_service_access_request: dict | bytes

    :rtype: Union[ListPoliciesGrantingServiceAccessResponse, Tuple[ListPoliciesGrantingServiceAccessResponse, int], Tuple[ListPoliciesGrantingServiceAccessResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_policies_granting_service_access_request = ListPoliciesGrantingServiceAccessRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_policy_tags(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_policy_tags_request=None):  # noqa: E501
    """post_list_policy_tags

    Lists the tags that are attached to the specified IAM customer managed policy. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_policy_tags_request: 
    :type list_policy_tags_request: dict | bytes

    :rtype: Union[ListPolicyTagsResponse, Tuple[ListPolicyTagsResponse, int], Tuple[ListPolicyTagsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_policy_tags_request = ListPolicyTagsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_policy_versions(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_policy_versions_request=None):  # noqa: E501
    """post_list_policy_versions

    &lt;p&gt;Lists information about the versions of the specified managed policy, including the version that is currently set as the policy&#39;s default version.&lt;/p&gt; &lt;p&gt;For more information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_policy_versions_request: 
    :type list_policy_versions_request: dict | bytes

    :rtype: Union[ListPolicyVersionsResponse, Tuple[ListPolicyVersionsResponse, int], Tuple[ListPolicyVersionsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_policy_versions_request = ListPolicyVersionsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_role_policies(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_role_policies_request=None):  # noqa: E501
    """post_list_role_policies

    &lt;p&gt;Lists the names of the inline policies that are embedded in the specified IAM role.&lt;/p&gt; &lt;p&gt;An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use &lt;a&gt;ListAttachedRolePolicies&lt;/a&gt;. For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_role_policies_request: 
    :type list_role_policies_request: dict | bytes

    :rtype: Union[ListRolePoliciesResponse, Tuple[ListRolePoliciesResponse, int], Tuple[ListRolePoliciesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_role_policies_request = ListRolePoliciesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_role_tags(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_role_tags_request=None):  # noqa: E501
    """post_list_role_tags

    Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_role_tags_request: 
    :type list_role_tags_request: dict | bytes

    :rtype: Union[ListRoleTagsResponse, Tuple[ListRoleTagsResponse, int], Tuple[ListRoleTagsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_role_tags_request = ListRoleTagsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_roles(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_roles_request=None):  # noqa: E501
    """post_list_roles

    &lt;p&gt;Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. This operation does not return the following attributes, even though they are an attribute of the returned object:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;PermissionsBoundary&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;RoleLastUsed&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Tags&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To view all of the information for a role, see &lt;a&gt;GetRole&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_roles_request: 
    :type list_roles_request: dict | bytes

    :rtype: Union[ListRolesResponse, Tuple[ListRolesResponse, int], Tuple[ListRolesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_roles_request = ListRolesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_saml_provider_tags(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_saml_provider_tags_request=None):  # noqa: E501
    """post_list_saml_provider_tags

    &lt;p&gt;Lists the tags that are attached to the specified Security Assertion Markup Language (SAML) identity provider. The returned list of tags is sorted by tag key. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_saml_provider_tags_request: 
    :type list_saml_provider_tags_request: dict | bytes

    :rtype: Union[ListSAMLProviderTagsResponse, Tuple[ListSAMLProviderTagsResponse, int], Tuple[ListSAMLProviderTagsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_saml_provider_tags_request = ListSAMLProviderTagsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_saml_providers(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, body=None):  # noqa: E501
    """post_list_saml_providers

    &lt;p&gt;Lists the SAML provider resource objects defined in IAM in the account. IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a SAML provider, see &lt;a&gt;GetSAMLProvider&lt;/a&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt; This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param body: 
    :type body: 

    :rtype: Union[ListSAMLProvidersResponse, Tuple[ListSAMLProvidersResponse, int], Tuple[ListSAMLProvidersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_list_server_certificate_tags(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_server_certificate_tags_request=None):  # noqa: E501
    """post_list_server_certificate_tags

    &lt;p&gt;Lists the tags that are attached to the specified IAM server certificate. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don&#39;t use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_server_certificate_tags_request: 
    :type list_server_certificate_tags_request: dict | bytes

    :rtype: Union[ListServerCertificateTagsResponse, Tuple[ListServerCertificateTagsResponse, int], Tuple[ListServerCertificateTagsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_server_certificate_tags_request = ListServerCertificateTagsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_server_certificates(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_server_certificates_request=None):  # noqa: E501
    """post_list_server_certificates

    &lt;p&gt;Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.&lt;/p&gt; &lt;p&gt; You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a servercertificate, see &lt;a&gt;GetServerCertificate&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_server_certificates_request: 
    :type list_server_certificates_request: dict | bytes

    :rtype: Union[ListServerCertificatesResponse, Tuple[ListServerCertificatesResponse, int], Tuple[ListServerCertificatesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_server_certificates_request = ListServerCertificatesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_service_specific_credentials(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, list_service_specific_credentials_request=None):  # noqa: E501
    """post_list_service_specific_credentials

    Returns information about the service-specific credentials associated with the specified IAM user. If none exists, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an Amazon Web Services service, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-gc.html\&quot;&gt;Set up service-specific credentials&lt;/a&gt; in the CodeCommit User Guide. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param list_service_specific_credentials_request: 
    :type list_service_specific_credentials_request: dict | bytes

    :rtype: Union[ListServiceSpecificCredentialsResponse, Tuple[ListServiceSpecificCredentialsResponse, int], Tuple[ListServiceSpecificCredentialsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_service_specific_credentials_request = ListServiceSpecificCredentialsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_signing_certificates(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_signing_certificates_request=None):  # noqa: E501
    """post_list_signing_certificates

    &lt;p&gt;Returns information about the signing certificates associated with the specified IAM user. If none exists, the operation returns an empty list.&lt;/p&gt; &lt;p&gt;Although each user is limited to a small number of signing certificates, you can still paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; field is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request for this operation. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_signing_certificates_request: 
    :type list_signing_certificates_request: dict | bytes

    :rtype: Union[ListSigningCertificatesResponse, Tuple[ListSigningCertificatesResponse, int], Tuple[ListSigningCertificatesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_signing_certificates_request = ListSigningCertificatesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_ssh_public_keys(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_ssh_public_keys_request=None):  # noqa: E501
    """post_list_ssh_public_keys

    &lt;p&gt;Returns information about the SSH public keys associated with the specified IAM user. If none exists, the operation returns an empty list.&lt;/p&gt; &lt;p&gt;The SSH public keys returned by this operation are used only for authenticating the IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;Although each user is limited to a small number of keys, you can still paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_ssh_public_keys_request: 
    :type list_ssh_public_keys_request: dict | bytes

    :rtype: Union[ListSSHPublicKeysResponse, Tuple[ListSSHPublicKeysResponse, int], Tuple[ListSSHPublicKeysResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_ssh_public_keys_request = ListSSHPublicKeysRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_user_policies(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_user_policies_request=None):  # noqa: E501
    """post_list_user_policies

    &lt;p&gt;Lists the names of the inline policies embedded in the specified IAM user.&lt;/p&gt; &lt;p&gt;An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use &lt;a&gt;ListAttachedUserPolicies&lt;/a&gt;. For more information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_user_policies_request: 
    :type list_user_policies_request: dict | bytes

    :rtype: Union[ListUserPoliciesResponse, Tuple[ListUserPoliciesResponse, int], Tuple[ListUserPoliciesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_user_policies_request = ListUserPoliciesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_user_tags(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_user_tags_request=None):  # noqa: E501
    """post_list_user_tags

    Lists the tags that are attached to the specified IAM user. The returned list of tags is sorted by tag key. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_user_tags_request: 
    :type list_user_tags_request: dict | bytes

    :rtype: Union[ListUserTagsResponse, Tuple[ListUserTagsResponse, int], Tuple[ListUserTagsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_user_tags_request = ListUserTagsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_users(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_users_request=None):  # noqa: E501
    """post_list_users

    &lt;p&gt;Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the Amazon Web Services account. If there are none, the operation returns an empty list.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. This operation does not return the following attributes, even though they are an attribute of the returned object:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;PermissionsBoundary&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Tags&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To view all of the information for a user, see &lt;a&gt;GetUser&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_users_request: 
    :type list_users_request: dict | bytes

    :rtype: Union[ListUsersResponse, Tuple[ListUsersResponse, int], Tuple[ListUsersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_users_request = ListUsersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_list_virtual_mfa_devices(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, list_virtual_mfa_devices_request=None):  # noqa: E501
    """post_list_virtual_mfa_devices

    &lt;p&gt;Lists the virtual MFA devices defined in the Amazon Web Services account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be &lt;code&gt;Assigned&lt;/code&gt;, &lt;code&gt;Unassigned&lt;/code&gt;, or &lt;code&gt;Any&lt;/code&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view tag information for a virtual MFA device, see &lt;a&gt;ListMFADeviceTags&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param list_virtual_mfa_devices_request: 
    :type list_virtual_mfa_devices_request: dict | bytes

    :rtype: Union[ListVirtualMFADevicesResponse, Tuple[ListVirtualMFADevicesResponse, int], Tuple[ListVirtualMFADevicesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_virtual_mfa_devices_request = ListVirtualMFADevicesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_put_group_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, put_group_policy_request=None):  # noqa: E501
    """post_put_group_policy

    &lt;p&gt;Adds or updates an inline policy document that is embedded in the specified IAM group.&lt;/p&gt; &lt;p&gt;A user can also have managed policies attached to it. To attach a managed policy to a group, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachGroupPolicy.html\&quot;&gt; &lt;code&gt;AttachGroupPolicy&lt;/code&gt; &lt;/a&gt;. To create a new managed policy, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\&quot;&gt; &lt;code&gt;CreatePolicy&lt;/code&gt; &lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For information about the maximum number of inline policies that you can embed in a group, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because policy documents can be large, you should use POST rather than GET when calling &lt;code&gt;PutGroupPolicy&lt;/code&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\&quot;&gt;Making query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param put_group_policy_request: 
    :type put_group_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        put_group_policy_request = PutGroupPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_put_role_permissions_boundary(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, put_role_permissions_boundary_request=None):  # noqa: E501
    """post_put_role_permissions_boundary

    &lt;p&gt;Adds or updates the policy that is specified as the IAM role&#39;s permissions boundary. You can use an Amazon Web Services managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role.&lt;/p&gt; &lt;p&gt;You cannot set the boundary for a service-linked role.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html\&quot;&gt;IAM JSON policy evaluation logic&lt;/a&gt; in the IAM User Guide. &lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param put_role_permissions_boundary_request: 
    :type put_role_permissions_boundary_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        put_role_permissions_boundary_request = PutRolePermissionsBoundaryRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_put_role_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, put_role_policy_request=None):  # noqa: E501
    """post_put_role_policy

    &lt;p&gt;Adds or updates an inline policy document that is embedded in the specified IAM role.&lt;/p&gt; &lt;p&gt;When you embed an inline policy in a role, the inline policy is used as part of the role&#39;s access (permissions) policy. The role&#39;s trust policy is created at the same time as the role, using &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html\&quot;&gt; &lt;code&gt;CreateRole&lt;/code&gt; &lt;/a&gt;. You can update a role&#39;s trust policy using &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html\&quot;&gt; &lt;code&gt;UpdateAssumeRolePolicy&lt;/code&gt; &lt;/a&gt;. For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;A role can also have a managed policy attached to it. To attach a managed policy to a role, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachRolePolicy.html\&quot;&gt; &lt;code&gt;AttachRolePolicy&lt;/code&gt; &lt;/a&gt;. To create a new managed policy, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\&quot;&gt; &lt;code&gt;CreatePolicy&lt;/code&gt; &lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For information about the maximum number of inline policies that you can embed with a role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because policy documents can be large, you should use POST rather than GET when calling &lt;code&gt;PutRolePolicy&lt;/code&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\&quot;&gt;Making query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param put_role_policy_request: 
    :type put_role_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        put_role_policy_request = PutRolePolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_put_user_permissions_boundary(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, put_user_permissions_boundary_request=None):  # noqa: E501
    """post_put_user_permissions_boundary

    &lt;p&gt;Adds or updates the policy that is specified as the IAM user&#39;s permissions boundary. You can use an Amazon Web Services managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html\&quot;&gt;IAM JSON policy evaluation logic&lt;/a&gt; in the IAM User Guide. &lt;/p&gt; &lt;/important&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param put_user_permissions_boundary_request: 
    :type put_user_permissions_boundary_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        put_user_permissions_boundary_request = PutUserPermissionsBoundaryRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_put_user_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, put_user_policy_request=None):  # noqa: E501
    """post_put_user_policy

    &lt;p&gt;Adds or updates an inline policy document that is embedded in the specified IAM user.&lt;/p&gt; &lt;p&gt;An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachUserPolicy.html\&quot;&gt; &lt;code&gt;AttachUserPolicy&lt;/code&gt; &lt;/a&gt;. To create a new managed policy, use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\&quot;&gt; &lt;code&gt;CreatePolicy&lt;/code&gt; &lt;/a&gt;. For information about policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For information about the maximum number of inline policies that you can embed in a user, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because policy documents can be large, you should use POST rather than GET when calling &lt;code&gt;PutUserPolicy&lt;/code&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\&quot;&gt;Making query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param put_user_policy_request: 
    :type put_user_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        put_user_policy_request = PutUserPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_remove_client_id_from_open_id_connect_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, remove_client_id_from_open_id_connect_provider_request=None):  # noqa: E501
    """post_remove_client_id_from_open_id_connect_provider

    &lt;p&gt;Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object.&lt;/p&gt; &lt;p&gt;This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param remove_client_id_from_open_id_connect_provider_request: 
    :type remove_client_id_from_open_id_connect_provider_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remove_client_id_from_open_id_connect_provider_request = RemoveClientIDFromOpenIDConnectProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_remove_role_from_instance_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, remove_role_from_instance_profile_request=None):  # noqa: E501
    """post_remove_role_from_instance_profile

    &lt;p&gt;Removes the specified IAM role from the specified EC2 instance profile.&lt;/p&gt; &lt;important&gt; &lt;p&gt;Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.&lt;/p&gt; &lt;/important&gt; &lt;p&gt; For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\&quot;&gt;IAM roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. For more information about instance profiles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\&quot;&gt;Using instance profiles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param remove_role_from_instance_profile_request: 
    :type remove_role_from_instance_profile_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remove_role_from_instance_profile_request = RemoveRoleFromInstanceProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_remove_user_from_group(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, remove_user_from_group_request=None):  # noqa: E501
    """post_remove_user_from_group

    Removes the specified user from the specified group. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param remove_user_from_group_request: 
    :type remove_user_from_group_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remove_user_from_group_request = RemoveUserFromGroupRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_reset_service_specific_credential(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, reset_service_specific_credential_request=None):  # noqa: E501
    """post_reset_service_specific_credential

    Resets the password for a service-specific credential. The new password is Amazon Web Services generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param reset_service_specific_credential_request: 
    :type reset_service_specific_credential_request: dict | bytes

    :rtype: Union[ResetServiceSpecificCredentialResponse, Tuple[ResetServiceSpecificCredentialResponse, int], Tuple[ResetServiceSpecificCredentialResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        reset_service_specific_credential_request = ResetServiceSpecificCredentialRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_resync_mfa_device(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, resync_mfa_device_request=None):  # noqa: E501
    """post_resync_mfa_device

    &lt;p&gt;Synchronizes the specified MFA device with its IAM resource object on the Amazon Web Services servers.&lt;/p&gt; &lt;p&gt;For more information about creating and working with virtual MFA devices, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\&quot;&gt;Using a virtual MFA device&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param resync_mfa_device_request: 
    :type resync_mfa_device_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        resync_mfa_device_request = ResyncMFADeviceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_set_default_policy_version(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, set_default_policy_version_request=None):  # noqa: E501
    """post_set_default_policy_version

    &lt;p&gt;Sets the specified version of the specified policy as the policy&#39;s default (operative) version.&lt;/p&gt; &lt;p&gt;This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use &lt;a&gt;ListEntitiesForPolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param set_default_policy_version_request: 
    :type set_default_policy_version_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_default_policy_version_request = SetDefaultPolicyVersionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_set_security_token_service_preferences(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, set_security_token_service_preferences_request=None):  # noqa: E501
    """post_set_security_token_service_preferences

    &lt;p&gt;Sets the specified version of the global endpoint token as the token version used for the Amazon Web Services account.&lt;/p&gt; &lt;p&gt;By default, Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at &lt;code&gt;https://sts.amazonaws.com&lt;/code&gt;. Amazon Web Services recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/sts.html\&quot;&gt;Security Token Service endpoints and quotas&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\&quot;&gt;Activating and deactivating STS in an Amazon Web Services Region&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;To view the current session token version, see the &lt;code&gt;GlobalEndpointTokenVersion&lt;/code&gt; entry in the response of the &lt;a&gt;GetAccountSummary&lt;/a&gt; operation.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param set_security_token_service_preferences_request: 
    :type set_security_token_service_preferences_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_security_token_service_preferences_request = SetSecurityTokenServicePreferencesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_simulate_custom_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, simulate_custom_policy_request=None):  # noqa: E501
    """post_simulate_custom_policy

    &lt;p&gt;Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and Amazon Web Services resources to determine the policies&#39; effective permissions. The policies are provided as strings.&lt;/p&gt; &lt;p&gt;The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. You can simulate resources that don&#39;t exist in your account.&lt;/p&gt; &lt;p&gt;If you want to simulate existing policies that are attached to an IAM user, group, or role, use &lt;a&gt;SimulatePrincipalPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Context keys are variables that are maintained by Amazon Web Services and its services and which provide details about the context of an API query request. You can use the &lt;code&gt;Condition&lt;/code&gt; element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;If the output is long, you can use &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters to paginate the results.&lt;/p&gt; &lt;note&gt; &lt;p&gt;The IAM policy simulator evaluates statements in the identity-based policy and the inputs that you provide during simulation. The policy simulator results can differ from your live Amazon Web Services environment. We recommend that you check your policies against your live Amazon Web Services environment after testing using the policy simulator to confirm that you have the desired results. For more information about using the policy simulator, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html\&quot;&gt;Testing IAM policies with the IAM policy simulator &lt;/a&gt;in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param simulate_custom_policy_request: 
    :type simulate_custom_policy_request: dict | bytes

    :rtype: Union[SimulatePolicyResponse, Tuple[SimulatePolicyResponse, int], Tuple[SimulatePolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        simulate_custom_policy_request = SimulateCustomPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_simulate_principal_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, max_items=None, marker=None, simulate_principal_policy_request=None):  # noqa: E501
    """post_simulate_principal_policy

    &lt;p&gt;Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and Amazon Web Services resources to determine the policies&#39; effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can simulate resources that don&#39;t exist in your account.&lt;/p&gt; &lt;p&gt;You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use &lt;a&gt;SimulateCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation for IAM users only.&lt;/p&gt; &lt;p&gt;The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; This operation discloses information about the permissions granted to other users. If you do not want users to see other user&#39;s permissions, then consider allowing them to use &lt;a&gt;SimulateCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. You can use the &lt;code&gt;Condition&lt;/code&gt; element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use &lt;a&gt;GetContextKeysForPrincipalPolicy&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;If the output is long, you can use the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters to paginate the results.&lt;/p&gt; &lt;note&gt; &lt;p&gt;The IAM policy simulator evaluates statements in the identity-based policy and the inputs that you provide during simulation. The policy simulator results can differ from your live Amazon Web Services environment. We recommend that you check your policies against your live Amazon Web Services environment after testing using the policy simulator to confirm that you have the desired results. For more information about using the policy simulator, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html\&quot;&gt;Testing IAM policies with the IAM policy simulator &lt;/a&gt;in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param max_items: Pagination limit
    :type max_items: str
    :param marker: Pagination token
    :type marker: str
    :param simulate_principal_policy_request: 
    :type simulate_principal_policy_request: dict | bytes

    :rtype: Union[SimulatePolicyResponse, Tuple[SimulatePolicyResponse, int], Tuple[SimulatePolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        simulate_principal_policy_request = SimulatePrincipalPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_tag_instance_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, tag_instance_profile_request=None):  # noqa: E501
    """post_tag_instance_profile

    &lt;p&gt;Adds one or more tags to an IAM instance profile. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;Each tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM instance profile that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param tag_instance_profile_request: 
    :type tag_instance_profile_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tag_instance_profile_request = TagInstanceProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_tag_mfa_device(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, tag_mfa_device_request=None):  # noqa: E501
    """post_tag_mfa_device

    &lt;p&gt;Adds one or more tags to an IAM virtual multi-factor authentication (MFA) device. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM virtual MFA device that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param tag_mfa_device_request: 
    :type tag_mfa_device_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tag_mfa_device_request = TagMFADeviceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_tag_open_id_connect_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, tag_open_id_connect_provider_request=None):  # noqa: E501
    """post_tag_open_id_connect_provider

    &lt;p&gt;Adds one or more tags to an OpenID Connect (OIDC)-compatible identity provider. For more information about these providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an OIDC provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param tag_open_id_connect_provider_request: 
    :type tag_open_id_connect_provider_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tag_open_id_connect_provider_request = TagOpenIDConnectProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_tag_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, tag_policy_request=None):  # noqa: E501
    """post_tag_policy

    &lt;p&gt;Adds one or more tags to an IAM customer managed policy. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM customer managed policy that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param tag_policy_request: 
    :type tag_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tag_policy_request = TagPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_tag_role(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, tag_role_request=None):  # noqa: E501
    """post_tag_role

    &lt;p&gt;Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Cost allocation&lt;/b&gt; - Use tags to help track which individuals and teams are using which Amazon Web Services resources.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; &lt;p&gt;For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM identities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param tag_role_request: 
    :type tag_role_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tag_role_request = TagRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_tag_saml_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, tag_saml_provider_request=None):  # noqa: E501
    """post_tag_saml_provider

    &lt;p&gt;Adds one or more tags to a Security Assertion Markup Language (SAML) identity provider. For more information about these providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation &lt;/a&gt;. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only a SAML identity provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param tag_saml_provider_request: 
    :type tag_saml_provider_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tag_saml_provider_request = TagSAMLProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_tag_server_certificate(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, tag_server_certificate_request=None):  # noqa: E501
    """post_tag_server_certificate

    &lt;p&gt;Adds one or more tags to an IAM server certificate. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;note&gt; &lt;p&gt;For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don&#39;t use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only a server certificate that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Cost allocation&lt;/b&gt; - Use tags to help track which individuals and teams are using which Amazon Web Services resources.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param tag_server_certificate_request: 
    :type tag_server_certificate_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tag_server_certificate_request = TagServerCertificateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_tag_user(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, tag_user_request=None):  # noqa: E501
    """post_tag_user

    &lt;p&gt;Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Cost allocation&lt;/b&gt; - Use tags to help track which individuals and teams are using which Amazon Web Services resources.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt; &lt;p&gt;For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM identities&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param tag_user_request: 
    :type tag_user_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tag_user_request = TagUserRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_untag_instance_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, untag_instance_profile_request=None):  # noqa: E501
    """post_untag_instance_profile

    Removes the specified tags from the IAM instance profile. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param untag_instance_profile_request: 
    :type untag_instance_profile_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        untag_instance_profile_request = UntagInstanceProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_untag_mfa_device(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, untag_mfa_device_request=None):  # noqa: E501
    """post_untag_mfa_device

    Removes the specified tags from the IAM virtual multi-factor authentication (MFA) device. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param untag_mfa_device_request: 
    :type untag_mfa_device_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        untag_mfa_device_request = UntagMFADeviceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_untag_open_id_connect_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, untag_open_id_connect_provider_request=None):  # noqa: E501
    """post_untag_open_id_connect_provider

    Removes the specified tags from the specified OpenID Connect (OIDC)-compatible identity provider in IAM. For more information about OIDC providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param untag_open_id_connect_provider_request: 
    :type untag_open_id_connect_provider_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        untag_open_id_connect_provider_request = UntagOpenIDConnectProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_untag_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, untag_policy_request=None):  # noqa: E501
    """post_untag_policy

    Removes the specified tags from the customer managed policy. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param untag_policy_request: 
    :type untag_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        untag_policy_request = UntagPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_untag_role(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, untag_role_request=None):  # noqa: E501
    """post_untag_role

    Removes the specified tags from the role. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param untag_role_request: 
    :type untag_role_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        untag_role_request = UntagRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_untag_saml_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, untag_saml_provider_request=None):  # noqa: E501
    """post_untag_saml_provider

    Removes the specified tags from the specified Security Assertion Markup Language (SAML) identity provider in IAM. For more information about these providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param untag_saml_provider_request: 
    :type untag_saml_provider_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        untag_saml_provider_request = UntagSAMLProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_untag_server_certificate(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, untag_server_certificate_request=None):  # noqa: E501
    """post_untag_server_certificate

    &lt;p&gt;Removes the specified tags from the IAM server certificate. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don&#39;t use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param untag_server_certificate_request: 
    :type untag_server_certificate_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        untag_server_certificate_request = UntagServerCertificateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_untag_user(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, untag_user_request=None):  # noqa: E501
    """post_untag_user

    Removes the specified tags from the user. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param untag_user_request: 
    :type untag_user_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        untag_user_request = UntagUserRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_access_key(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_access_key_request=None):  # noqa: E501
    """post_update_access_key

    &lt;p&gt;Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user&#39;s key as part of a key rotation workflow.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. If a temporary access key is used, then &lt;code&gt;UserName&lt;/code&gt; is required. If a long-term key is assigned to the user, then &lt;code&gt;UserName&lt;/code&gt; is not required. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; &lt;p&gt;For information about rotating keys, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html\&quot;&gt;Managing keys and certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_access_key_request: 
    :type update_access_key_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_access_key_request = UpdateAccessKeyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_account_password_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_account_password_policy_request=None):  # noqa: E501
    """post_update_account_password_policy

    &lt;p&gt;Updates the password policy settings for the Amazon Web Services account.&lt;/p&gt; &lt;note&gt; &lt;p&gt;This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter&#39;s value reverts to its default value. See the &lt;b&gt;Request Parameters&lt;/b&gt; section for each parameter&#39;s default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; For more information about using a password policy, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html\&quot;&gt;Managing an IAM password policy&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_account_password_policy_request: 
    :type update_account_password_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_account_password_policy_request = UpdateAccountPasswordPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_assume_role_policy(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_assume_role_policy_request=None):  # noqa: E501
    """post_update_assume_role_policy

    Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the \&quot;role trust policy\&quot;. For more information about roles, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html\&quot;&gt;Using roles to delegate permissions and federate identities&lt;/a&gt;. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_assume_role_policy_request: 
    :type update_assume_role_policy_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_assume_role_policy_request = UpdateAssumeRolePolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_group(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_group_request=None):  # noqa: E501
    """post_update_group

    &lt;p&gt;Updates the name and/or the path of the specified IAM group.&lt;/p&gt; &lt;important&gt; &lt;p&gt; You should understand the implications of changing a group&#39;s path or name. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html\&quot;&gt;Renaming users and groups&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;note&gt; &lt;p&gt;The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named &lt;code&gt;Managers&lt;/code&gt; to &lt;code&gt;MGRs&lt;/code&gt;, the principal must have a policy that allows them to update both groups. If the principal has permission to update the &lt;code&gt;Managers&lt;/code&gt; group, but not the &lt;code&gt;MGRs&lt;/code&gt; group, then the update fails. For more information about permissions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\&quot;&gt;Access management&lt;/a&gt;. &lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_group_request: 
    :type update_group_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_group_request = UpdateGroupRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_login_profile(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_login_profile_request=None):  # noqa: E501
    """post_update_login_profile

    &lt;p&gt;Changes the password for the specified IAM user. You can use the CLI, the Amazon Web Services API, or the &lt;b&gt;Users&lt;/b&gt; page in the IAM console to change the password for any IAM user. Use &lt;a&gt;ChangePassword&lt;/a&gt; to change your own password in the &lt;b&gt;My Security Credentials&lt;/b&gt; page in the Amazon Web Services Management Console.&lt;/p&gt; &lt;p&gt;For more information about modifying passwords, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\&quot;&gt;Managing passwords&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_login_profile_request: 
    :type update_login_profile_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_login_profile_request = UpdateLoginProfileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_open_id_connect_provider_thumbprint(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_open_id_connect_provider_thumbprint_request=None):  # noqa: E501
    """post_update_open_id_connect_provider_thumbprint

    &lt;p&gt;Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints.&lt;/p&gt; &lt;p&gt;The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.)&lt;/p&gt; &lt;p&gt;Typically, you need to update a thumbprint only when the identity provider certificate changes, which occurs rarely. However, if the provider&#39;s certificate &lt;i&gt;does&lt;/i&gt; change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Amazon Web Services secures communication with some OIDC identity providers (IdPs) through our library of trusted root certificate authorities (CAs) instead of using a certificate thumbprint to verify your IdP server certificate. These OIDC IdPs include Auth0, GitHub, Google, and those that use an Amazon S3 bucket to host a JSON Web Key Set (JWKS) endpoint. In these cases, your legacy thumbprint remains in your configuration, but is no longer used for validation.&lt;/p&gt; &lt;/note&gt; &lt;note&gt; &lt;p&gt;Trust for the OIDC provider is derived from the provider certificate and is validated by the thumbprint. Therefore, it is best to limit access to the &lt;code&gt;UpdateOpenIDConnectProviderThumbprint&lt;/code&gt; operation to highly privileged users.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_open_id_connect_provider_thumbprint_request: 
    :type update_open_id_connect_provider_thumbprint_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_open_id_connect_provider_thumbprint_request = UpdateOpenIDConnectProviderThumbprintRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_role(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_role_request=None):  # noqa: E501
    """post_update_role

    Updates the description or maximum session duration setting of a role. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_role_request: 
    :type update_role_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_role_request = UpdateRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_role_description(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_role_description_request=None):  # noqa: E501
    """post_update_role_description

    &lt;p&gt;Use &lt;a&gt;UpdateRole&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Modifies only the description of a role. This operation performs the same function as the &lt;code&gt;Description&lt;/code&gt; parameter in the &lt;code&gt;UpdateRole&lt;/code&gt; operation.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_role_description_request: 
    :type update_role_description_request: dict | bytes

    :rtype: Union[UpdateRoleDescriptionResponse, Tuple[UpdateRoleDescriptionResponse, int], Tuple[UpdateRoleDescriptionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_role_description_request = UpdateRoleDescriptionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_saml_provider(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_saml_provider_request=None):  # noqa: E501
    """post_update_saml_provider

    &lt;p&gt;Updates the metadata document for an existing SAML provider resource object.&lt;/p&gt; &lt;note&gt; &lt;p&gt;This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_saml_provider_request: 
    :type update_saml_provider_request: dict | bytes

    :rtype: Union[UpdateSAMLProviderResponse, Tuple[UpdateSAMLProviderResponse, int], Tuple[UpdateSAMLProviderResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_saml_provider_request = UpdateSAMLProviderRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_server_certificate(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_server_certificate_request=None):  # noqa: E501
    """post_update_server_certificate

    &lt;p&gt;Updates the name and/or the path of the specified server certificate stored in IAM.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;important&gt; &lt;p&gt;You should understand the implications of changing a server certificate&#39;s path or name. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts\&quot;&gt;Renaming a server certificate&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;note&gt; &lt;p&gt;The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named &lt;code&gt;ProductionCert&lt;/code&gt; to &lt;code&gt;ProdCert&lt;/code&gt;, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the &lt;code&gt;ProductionCert&lt;/code&gt; group, but not the &lt;code&gt;ProdCert&lt;/code&gt; certificate, then the update fails. For more information about permissions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\&quot;&gt;Access management&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_server_certificate_request: 
    :type update_server_certificate_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_server_certificate_request = UpdateServerCertificateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_service_specific_credential(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_service_specific_credential_request=None):  # noqa: E501
    """post_update_service_specific_credential

    Sets the status of a service-specific credential to &lt;code&gt;Active&lt;/code&gt; or &lt;code&gt;Inactive&lt;/code&gt;. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user&#39;s service-specific credential as part of a credential rotation work flow. # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_service_specific_credential_request: 
    :type update_service_specific_credential_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_service_specific_credential_request = UpdateServiceSpecificCredentialRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_signing_certificate(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_signing_certificate_request=None):  # noqa: E501
    """post_update_signing_certificate

    &lt;p&gt;Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user&#39;s signing certificate as part of a certificate rotation work flow.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; field is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_signing_certificate_request: 
    :type update_signing_certificate_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_signing_certificate_request = UpdateSigningCertificateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_ssh_public_key(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_ssh_public_key_request=None):  # noqa: E501
    """post_update_ssh_public_key

    &lt;p&gt;Sets the status of an IAM user&#39;s SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user&#39;s SSH public key as part of a key rotation work flow.&lt;/p&gt; &lt;p&gt;The SSH public key affected by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_ssh_public_key_request: 
    :type update_ssh_public_key_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_ssh_public_key_request = UpdateSSHPublicKeyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_update_user(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, update_user_request=None):  # noqa: E501
    """post_update_user

    &lt;p&gt;Updates the name and/or the path of the specified IAM user.&lt;/p&gt; &lt;important&gt; &lt;p&gt; You should understand the implications of changing an IAM user&#39;s path or name. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming\&quot;&gt;Renaming an IAM user&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html\&quot;&gt;Renaming an IAM group&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;note&gt; &lt;p&gt; To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html\&quot;&gt;Permissions and policies&lt;/a&gt;. &lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param update_user_request: 
    :type update_user_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_user_request = UpdateUserRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_upload_server_certificate(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, upload_server_certificate_request=None):  # noqa: E501
    """post_upload_server_certificate

    &lt;p&gt;Uploads a server certificate entity for the Amazon Web Services account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded.&lt;/p&gt; &lt;p&gt;We recommend that you use &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/acm/\&quot;&gt;Certificate Manager&lt;/a&gt; to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to Amazon Web Services resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/acm/latest/userguide/\&quot;&gt;Certificate Manager User Guide&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;p&gt;For information about the number of server certificates you can upload, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\&quot;&gt;IAM and STS quotas&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling &lt;code&gt;UploadServerCertificate&lt;/code&gt;. For information about setting up signatures and authorization through the API, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html\&quot;&gt;Signing Amazon Web Services API requests&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html\&quot;&gt;Calling the API by making HTTP query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param upload_server_certificate_request: 
    :type upload_server_certificate_request: dict | bytes

    :rtype: Union[UploadServerCertificateResponse, Tuple[UploadServerCertificateResponse, int], Tuple[UploadServerCertificateResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        upload_server_certificate_request = UploadServerCertificateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_upload_signing_certificate(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, upload_signing_certificate_request=None):  # noqa: E501
    """post_upload_signing_certificate

    &lt;p&gt;Uploads an X.509 signing certificate and associates it with the specified IAM user. Some Amazon Web Services services require you to use certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is &lt;code&gt;Active&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;For information about when you would use an X.509 signing certificate, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Managing server certificates in IAM&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;UserName&lt;/code&gt; is not specified, the IAM user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling &lt;code&gt;UploadSigningCertificate&lt;/code&gt;. For information about setting up signatures and authorization through the API, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html\&quot;&gt;Signing Amazon Web Services API requests&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;. For general information about using the Query API with IAM, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\&quot;&gt;Making query requests&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param upload_signing_certificate_request: 
    :type upload_signing_certificate_request: dict | bytes

    :rtype: Union[UploadSigningCertificateResponse, Tuple[UploadSigningCertificateResponse, int], Tuple[UploadSigningCertificateResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        upload_signing_certificate_request = UploadSigningCertificateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_upload_ssh_public_key(action, version, x_amz_content_sha256=None, x_amz_date=None, x_amz_algorithm=None, x_amz_credential=None, x_amz_security_token=None, x_amz_signature=None, x_amz_signed_headers=None, upload_ssh_public_key_request=None):  # noqa: E501
    """post_upload_ssh_public_key

    &lt;p&gt;Uploads an SSH public key and associates it with the specified IAM user.&lt;/p&gt; &lt;p&gt;The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\&quot;&gt;Set up CodeCommit for SSH connections&lt;/a&gt; in the &lt;i&gt;CodeCommit User Guide&lt;/i&gt;.&lt;/p&gt; # noqa: E501

    :param action: 
    :type action: str
    :param version: 
    :type version: str
    :param x_amz_content_sha256: 
    :type x_amz_content_sha256: str
    :param x_amz_date: 
    :type x_amz_date: str
    :param x_amz_algorithm: 
    :type x_amz_algorithm: str
    :param x_amz_credential: 
    :type x_amz_credential: str
    :param x_amz_security_token: 
    :type x_amz_security_token: str
    :param x_amz_signature: 
    :type x_amz_signature: str
    :param x_amz_signed_headers: 
    :type x_amz_signed_headers: str
    :param upload_ssh_public_key_request: 
    :type upload_ssh_public_key_request: dict | bytes

    :rtype: Union[UploadSSHPublicKeyResponse, Tuple[UploadSSHPublicKeyResponse, int], Tuple[UploadSSHPublicKeyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        upload_ssh_public_key_request = UploadSSHPublicKeyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
