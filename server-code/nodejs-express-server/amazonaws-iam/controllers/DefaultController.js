/**
 * The DefaultController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DefaultService');
const gET_AddClientIDToOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_AddClientIDToOpenIDConnectProvider);
};

const gET_AddRoleToInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_AddRoleToInstanceProfile);
};

const gET_AddUserToGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_AddUserToGroup);
};

const gET_AttachGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_AttachGroupPolicy);
};

const gET_AttachRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_AttachRolePolicy);
};

const gET_AttachUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_AttachUserPolicy);
};

const gET_ChangePassword = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ChangePassword);
};

const gET_CreateAccessKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateAccessKey);
};

const gET_CreateAccountAlias = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateAccountAlias);
};

const gET_CreateGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateGroup);
};

const gET_CreateInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateInstanceProfile);
};

const gET_CreateLoginProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateLoginProfile);
};

const gET_CreateOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateOpenIDConnectProvider);
};

const gET_CreatePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreatePolicy);
};

const gET_CreatePolicyVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreatePolicyVersion);
};

const gET_CreateRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateRole);
};

const gET_CreateSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateSAMLProvider);
};

const gET_CreateServiceLinkedRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateServiceLinkedRole);
};

const gET_CreateServiceSpecificCredential = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateServiceSpecificCredential);
};

const gET_CreateUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateUser);
};

const gET_CreateVirtualMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_CreateVirtualMFADevice);
};

const gET_DeactivateMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeactivateMFADevice);
};

const gET_DeleteAccessKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteAccessKey);
};

const gET_DeleteAccountAlias = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteAccountAlias);
};

const gET_DeleteAccountPasswordPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteAccountPasswordPolicy);
};

const gET_DeleteGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteGroup);
};

const gET_DeleteGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteGroupPolicy);
};

const gET_DeleteInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteInstanceProfile);
};

const gET_DeleteLoginProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteLoginProfile);
};

const gET_DeleteOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteOpenIDConnectProvider);
};

const gET_DeletePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeletePolicy);
};

const gET_DeletePolicyVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeletePolicyVersion);
};

const gET_DeleteRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteRole);
};

const gET_DeleteRolePermissionsBoundary = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteRolePermissionsBoundary);
};

const gET_DeleteRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteRolePolicy);
};

const gET_DeleteSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteSAMLProvider);
};

const gET_DeleteSSHPublicKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteSSHPublicKey);
};

const gET_DeleteServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteServerCertificate);
};

const gET_DeleteServiceLinkedRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteServiceLinkedRole);
};

const gET_DeleteServiceSpecificCredential = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteServiceSpecificCredential);
};

const gET_DeleteSigningCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteSigningCertificate);
};

const gET_DeleteUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteUser);
};

const gET_DeleteUserPermissionsBoundary = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteUserPermissionsBoundary);
};

const gET_DeleteUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteUserPolicy);
};

const gET_DeleteVirtualMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DeleteVirtualMFADevice);
};

const gET_DetachGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DetachGroupPolicy);
};

const gET_DetachRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DetachRolePolicy);
};

const gET_DetachUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_DetachUserPolicy);
};

const gET_EnableMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_EnableMFADevice);
};

const gET_GenerateCredentialReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GenerateCredentialReport);
};

const gET_GenerateOrganizationsAccessReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GenerateOrganizationsAccessReport);
};

const gET_GenerateServiceLastAccessedDetails = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GenerateServiceLastAccessedDetails);
};

const gET_GetAccessKeyLastUsed = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetAccessKeyLastUsed);
};

const gET_GetAccountAuthorizationDetails = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetAccountAuthorizationDetails);
};

const gET_GetAccountPasswordPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetAccountPasswordPolicy);
};

const gET_GetAccountSummary = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetAccountSummary);
};

const gET_GetContextKeysForCustomPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetContextKeysForCustomPolicy);
};

const gET_GetContextKeysForPrincipalPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetContextKeysForPrincipalPolicy);
};

const gET_GetCredentialReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetCredentialReport);
};

const gET_GetGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetGroup);
};

const gET_GetGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetGroupPolicy);
};

const gET_GetInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetInstanceProfile);
};

const gET_GetLoginProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetLoginProfile);
};

const gET_GetMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetMFADevice);
};

const gET_GetOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetOpenIDConnectProvider);
};

const gET_GetOrganizationsAccessReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetOrganizationsAccessReport);
};

const gET_GetPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetPolicy);
};

const gET_GetPolicyVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetPolicyVersion);
};

const gET_GetRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetRole);
};

const gET_GetRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetRolePolicy);
};

const gET_GetSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetSAMLProvider);
};

const gET_GetSSHPublicKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetSSHPublicKey);
};

const gET_GetServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetServerCertificate);
};

const gET_GetServiceLastAccessedDetails = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetServiceLastAccessedDetails);
};

const gET_GetServiceLastAccessedDetailsWithEntities = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetServiceLastAccessedDetailsWithEntities);
};

const gET_GetServiceLinkedRoleDeletionStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetServiceLinkedRoleDeletionStatus);
};

const gET_GetUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetUser);
};

const gET_GetUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_GetUserPolicy);
};

const gET_ListAccessKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListAccessKeys);
};

const gET_ListAccountAliases = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListAccountAliases);
};

const gET_ListAttachedGroupPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListAttachedGroupPolicies);
};

const gET_ListAttachedRolePolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListAttachedRolePolicies);
};

const gET_ListAttachedUserPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListAttachedUserPolicies);
};

const gET_ListEntitiesForPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListEntitiesForPolicy);
};

const gET_ListGroupPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListGroupPolicies);
};

const gET_ListGroups = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListGroups);
};

const gET_ListGroupsForUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListGroupsForUser);
};

const gET_ListInstanceProfileTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListInstanceProfileTags);
};

const gET_ListInstanceProfiles = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListInstanceProfiles);
};

const gET_ListInstanceProfilesForRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListInstanceProfilesForRole);
};

const gET_ListMFADeviceTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListMFADeviceTags);
};

const gET_ListMFADevices = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListMFADevices);
};

const gET_ListOpenIDConnectProviderTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListOpenIDConnectProviderTags);
};

const gET_ListOpenIDConnectProviders = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListOpenIDConnectProviders);
};

const gET_ListPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListPolicies);
};

const gET_ListPoliciesGrantingServiceAccess = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListPoliciesGrantingServiceAccess);
};

const gET_ListPolicyTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListPolicyTags);
};

const gET_ListPolicyVersions = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListPolicyVersions);
};

const gET_ListRolePolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListRolePolicies);
};

const gET_ListRoleTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListRoleTags);
};

const gET_ListRoles = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListRoles);
};

const gET_ListSAMLProviderTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListSAMLProviderTags);
};

const gET_ListSAMLProviders = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListSAMLProviders);
};

const gET_ListSSHPublicKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListSSHPublicKeys);
};

const gET_ListServerCertificateTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListServerCertificateTags);
};

const gET_ListServerCertificates = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListServerCertificates);
};

const gET_ListServiceSpecificCredentials = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListServiceSpecificCredentials);
};

const gET_ListSigningCertificates = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListSigningCertificates);
};

const gET_ListUserPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListUserPolicies);
};

const gET_ListUserTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListUserTags);
};

const gET_ListUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListUsers);
};

const gET_ListVirtualMFADevices = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ListVirtualMFADevices);
};

const gET_PutGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_PutGroupPolicy);
};

const gET_PutRolePermissionsBoundary = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_PutRolePermissionsBoundary);
};

const gET_PutRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_PutRolePolicy);
};

const gET_PutUserPermissionsBoundary = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_PutUserPermissionsBoundary);
};

const gET_PutUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_PutUserPolicy);
};

const gET_RemoveClientIDFromOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_RemoveClientIDFromOpenIDConnectProvider);
};

const gET_RemoveRoleFromInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_RemoveRoleFromInstanceProfile);
};

const gET_RemoveUserFromGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_RemoveUserFromGroup);
};

const gET_ResetServiceSpecificCredential = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ResetServiceSpecificCredential);
};

const gET_ResyncMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_ResyncMFADevice);
};

const gET_SetDefaultPolicyVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_SetDefaultPolicyVersion);
};

const gET_SetSecurityTokenServicePreferences = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_SetSecurityTokenServicePreferences);
};

const gET_SimulateCustomPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_SimulateCustomPolicy);
};

const gET_SimulatePrincipalPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_SimulatePrincipalPolicy);
};

const gET_TagInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_TagInstanceProfile);
};

const gET_TagMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_TagMFADevice);
};

const gET_TagOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_TagOpenIDConnectProvider);
};

const gET_TagPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_TagPolicy);
};

const gET_TagRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_TagRole);
};

const gET_TagSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_TagSAMLProvider);
};

const gET_TagServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_TagServerCertificate);
};

const gET_TagUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_TagUser);
};

const gET_UntagInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UntagInstanceProfile);
};

const gET_UntagMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UntagMFADevice);
};

const gET_UntagOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UntagOpenIDConnectProvider);
};

const gET_UntagPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UntagPolicy);
};

const gET_UntagRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UntagRole);
};

const gET_UntagSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UntagSAMLProvider);
};

const gET_UntagServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UntagServerCertificate);
};

const gET_UntagUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UntagUser);
};

const gET_UpdateAccessKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateAccessKey);
};

const gET_UpdateAccountPasswordPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateAccountPasswordPolicy);
};

const gET_UpdateAssumeRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateAssumeRolePolicy);
};

const gET_UpdateGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateGroup);
};

const gET_UpdateLoginProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateLoginProfile);
};

const gET_UpdateOpenIDConnectProviderThumbprint = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateOpenIDConnectProviderThumbprint);
};

const gET_UpdateRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateRole);
};

const gET_UpdateRoleDescription = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateRoleDescription);
};

const gET_UpdateSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateSAMLProvider);
};

const gET_UpdateSSHPublicKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateSSHPublicKey);
};

const gET_UpdateServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateServerCertificate);
};

const gET_UpdateServiceSpecificCredential = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateServiceSpecificCredential);
};

const gET_UpdateSigningCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateSigningCertificate);
};

const gET_UpdateUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UpdateUser);
};

const gET_UploadSSHPublicKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UploadSSHPublicKey);
};

const gET_UploadServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UploadServerCertificate);
};

const gET_UploadSigningCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.gET_UploadSigningCertificate);
};

const pOST_AddClientIDToOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_AddClientIDToOpenIDConnectProvider);
};

const pOST_AddRoleToInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_AddRoleToInstanceProfile);
};

const pOST_AddUserToGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_AddUserToGroup);
};

const pOST_AttachGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_AttachGroupPolicy);
};

const pOST_AttachRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_AttachRolePolicy);
};

const pOST_AttachUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_AttachUserPolicy);
};

const pOST_ChangePassword = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ChangePassword);
};

const pOST_CreateAccessKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateAccessKey);
};

const pOST_CreateAccountAlias = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateAccountAlias);
};

const pOST_CreateGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateGroup);
};

const pOST_CreateInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateInstanceProfile);
};

const pOST_CreateLoginProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateLoginProfile);
};

const pOST_CreateOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateOpenIDConnectProvider);
};

const pOST_CreatePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreatePolicy);
};

const pOST_CreatePolicyVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreatePolicyVersion);
};

const pOST_CreateRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateRole);
};

const pOST_CreateSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateSAMLProvider);
};

const pOST_CreateServiceLinkedRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateServiceLinkedRole);
};

const pOST_CreateServiceSpecificCredential = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateServiceSpecificCredential);
};

const pOST_CreateUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateUser);
};

const pOST_CreateVirtualMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_CreateVirtualMFADevice);
};

const pOST_DeactivateMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeactivateMFADevice);
};

const pOST_DeleteAccessKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteAccessKey);
};

const pOST_DeleteAccountAlias = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteAccountAlias);
};

const pOST_DeleteAccountPasswordPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteAccountPasswordPolicy);
};

const pOST_DeleteGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteGroup);
};

const pOST_DeleteGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteGroupPolicy);
};

const pOST_DeleteInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteInstanceProfile);
};

const pOST_DeleteLoginProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteLoginProfile);
};

const pOST_DeleteOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteOpenIDConnectProvider);
};

const pOST_DeletePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeletePolicy);
};

const pOST_DeletePolicyVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeletePolicyVersion);
};

const pOST_DeleteRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteRole);
};

const pOST_DeleteRolePermissionsBoundary = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteRolePermissionsBoundary);
};

const pOST_DeleteRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteRolePolicy);
};

const pOST_DeleteSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteSAMLProvider);
};

const pOST_DeleteSSHPublicKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteSSHPublicKey);
};

const pOST_DeleteServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteServerCertificate);
};

const pOST_DeleteServiceLinkedRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteServiceLinkedRole);
};

const pOST_DeleteServiceSpecificCredential = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteServiceSpecificCredential);
};

const pOST_DeleteSigningCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteSigningCertificate);
};

const pOST_DeleteUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteUser);
};

const pOST_DeleteUserPermissionsBoundary = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteUserPermissionsBoundary);
};

const pOST_DeleteUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteUserPolicy);
};

const pOST_DeleteVirtualMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DeleteVirtualMFADevice);
};

const pOST_DetachGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DetachGroupPolicy);
};

const pOST_DetachRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DetachRolePolicy);
};

const pOST_DetachUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_DetachUserPolicy);
};

const pOST_EnableMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_EnableMFADevice);
};

const pOST_GenerateCredentialReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GenerateCredentialReport);
};

const pOST_GenerateOrganizationsAccessReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GenerateOrganizationsAccessReport);
};

const pOST_GenerateServiceLastAccessedDetails = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GenerateServiceLastAccessedDetails);
};

const pOST_GetAccessKeyLastUsed = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetAccessKeyLastUsed);
};

const pOST_GetAccountAuthorizationDetails = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetAccountAuthorizationDetails);
};

const pOST_GetAccountPasswordPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetAccountPasswordPolicy);
};

const pOST_GetAccountSummary = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetAccountSummary);
};

const pOST_GetContextKeysForCustomPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetContextKeysForCustomPolicy);
};

const pOST_GetContextKeysForPrincipalPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetContextKeysForPrincipalPolicy);
};

const pOST_GetCredentialReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetCredentialReport);
};

const pOST_GetGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetGroup);
};

const pOST_GetGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetGroupPolicy);
};

const pOST_GetInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetInstanceProfile);
};

const pOST_GetLoginProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetLoginProfile);
};

const pOST_GetMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetMFADevice);
};

const pOST_GetOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetOpenIDConnectProvider);
};

const pOST_GetOrganizationsAccessReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetOrganizationsAccessReport);
};

const pOST_GetPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetPolicy);
};

const pOST_GetPolicyVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetPolicyVersion);
};

const pOST_GetRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetRole);
};

const pOST_GetRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetRolePolicy);
};

const pOST_GetSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetSAMLProvider);
};

const pOST_GetSSHPublicKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetSSHPublicKey);
};

const pOST_GetServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetServerCertificate);
};

const pOST_GetServiceLastAccessedDetails = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetServiceLastAccessedDetails);
};

const pOST_GetServiceLastAccessedDetailsWithEntities = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetServiceLastAccessedDetailsWithEntities);
};

const pOST_GetServiceLinkedRoleDeletionStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetServiceLinkedRoleDeletionStatus);
};

const pOST_GetUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetUser);
};

const pOST_GetUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_GetUserPolicy);
};

const pOST_ListAccessKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListAccessKeys);
};

const pOST_ListAccountAliases = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListAccountAliases);
};

const pOST_ListAttachedGroupPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListAttachedGroupPolicies);
};

const pOST_ListAttachedRolePolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListAttachedRolePolicies);
};

const pOST_ListAttachedUserPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListAttachedUserPolicies);
};

const pOST_ListEntitiesForPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListEntitiesForPolicy);
};

const pOST_ListGroupPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListGroupPolicies);
};

const pOST_ListGroups = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListGroups);
};

const pOST_ListGroupsForUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListGroupsForUser);
};

const pOST_ListInstanceProfileTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListInstanceProfileTags);
};

const pOST_ListInstanceProfiles = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListInstanceProfiles);
};

const pOST_ListInstanceProfilesForRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListInstanceProfilesForRole);
};

const pOST_ListMFADeviceTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListMFADeviceTags);
};

const pOST_ListMFADevices = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListMFADevices);
};

const pOST_ListOpenIDConnectProviderTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListOpenIDConnectProviderTags);
};

const pOST_ListOpenIDConnectProviders = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListOpenIDConnectProviders);
};

const pOST_ListPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListPolicies);
};

const pOST_ListPoliciesGrantingServiceAccess = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListPoliciesGrantingServiceAccess);
};

const pOST_ListPolicyTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListPolicyTags);
};

const pOST_ListPolicyVersions = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListPolicyVersions);
};

const pOST_ListRolePolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListRolePolicies);
};

const pOST_ListRoleTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListRoleTags);
};

const pOST_ListRoles = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListRoles);
};

const pOST_ListSAMLProviderTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListSAMLProviderTags);
};

const pOST_ListSAMLProviders = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListSAMLProviders);
};

const pOST_ListSSHPublicKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListSSHPublicKeys);
};

const pOST_ListServerCertificateTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListServerCertificateTags);
};

const pOST_ListServerCertificates = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListServerCertificates);
};

const pOST_ListServiceSpecificCredentials = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListServiceSpecificCredentials);
};

const pOST_ListSigningCertificates = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListSigningCertificates);
};

const pOST_ListUserPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListUserPolicies);
};

const pOST_ListUserTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListUserTags);
};

const pOST_ListUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListUsers);
};

const pOST_ListVirtualMFADevices = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ListVirtualMFADevices);
};

const pOST_PutGroupPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_PutGroupPolicy);
};

const pOST_PutRolePermissionsBoundary = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_PutRolePermissionsBoundary);
};

const pOST_PutRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_PutRolePolicy);
};

const pOST_PutUserPermissionsBoundary = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_PutUserPermissionsBoundary);
};

const pOST_PutUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_PutUserPolicy);
};

const pOST_RemoveClientIDFromOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_RemoveClientIDFromOpenIDConnectProvider);
};

const pOST_RemoveRoleFromInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_RemoveRoleFromInstanceProfile);
};

const pOST_RemoveUserFromGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_RemoveUserFromGroup);
};

const pOST_ResetServiceSpecificCredential = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ResetServiceSpecificCredential);
};

const pOST_ResyncMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_ResyncMFADevice);
};

const pOST_SetDefaultPolicyVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_SetDefaultPolicyVersion);
};

const pOST_SetSecurityTokenServicePreferences = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_SetSecurityTokenServicePreferences);
};

const pOST_SimulateCustomPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_SimulateCustomPolicy);
};

const pOST_SimulatePrincipalPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_SimulatePrincipalPolicy);
};

const pOST_TagInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_TagInstanceProfile);
};

const pOST_TagMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_TagMFADevice);
};

const pOST_TagOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_TagOpenIDConnectProvider);
};

const pOST_TagPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_TagPolicy);
};

const pOST_TagRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_TagRole);
};

const pOST_TagSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_TagSAMLProvider);
};

const pOST_TagServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_TagServerCertificate);
};

const pOST_TagUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_TagUser);
};

const pOST_UntagInstanceProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UntagInstanceProfile);
};

const pOST_UntagMFADevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UntagMFADevice);
};

const pOST_UntagOpenIDConnectProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UntagOpenIDConnectProvider);
};

const pOST_UntagPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UntagPolicy);
};

const pOST_UntagRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UntagRole);
};

const pOST_UntagSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UntagSAMLProvider);
};

const pOST_UntagServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UntagServerCertificate);
};

const pOST_UntagUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UntagUser);
};

const pOST_UpdateAccessKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateAccessKey);
};

const pOST_UpdateAccountPasswordPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateAccountPasswordPolicy);
};

const pOST_UpdateAssumeRolePolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateAssumeRolePolicy);
};

const pOST_UpdateGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateGroup);
};

const pOST_UpdateLoginProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateLoginProfile);
};

const pOST_UpdateOpenIDConnectProviderThumbprint = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateOpenIDConnectProviderThumbprint);
};

const pOST_UpdateRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateRole);
};

const pOST_UpdateRoleDescription = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateRoleDescription);
};

const pOST_UpdateSAMLProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateSAMLProvider);
};

const pOST_UpdateSSHPublicKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateSSHPublicKey);
};

const pOST_UpdateServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateServerCertificate);
};

const pOST_UpdateServiceSpecificCredential = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateServiceSpecificCredential);
};

const pOST_UpdateSigningCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateSigningCertificate);
};

const pOST_UpdateUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UpdateUser);
};

const pOST_UploadSSHPublicKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UploadSSHPublicKey);
};

const pOST_UploadServerCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UploadServerCertificate);
};

const pOST_UploadSigningCertificate = async (request, response) => {
  await Controller.handleRequest(request, response, service.pOST_UploadSigningCertificate);
};


module.exports = {
  gET_AddClientIDToOpenIDConnectProvider,
  gET_AddRoleToInstanceProfile,
  gET_AddUserToGroup,
  gET_AttachGroupPolicy,
  gET_AttachRolePolicy,
  gET_AttachUserPolicy,
  gET_ChangePassword,
  gET_CreateAccessKey,
  gET_CreateAccountAlias,
  gET_CreateGroup,
  gET_CreateInstanceProfile,
  gET_CreateLoginProfile,
  gET_CreateOpenIDConnectProvider,
  gET_CreatePolicy,
  gET_CreatePolicyVersion,
  gET_CreateRole,
  gET_CreateSAMLProvider,
  gET_CreateServiceLinkedRole,
  gET_CreateServiceSpecificCredential,
  gET_CreateUser,
  gET_CreateVirtualMFADevice,
  gET_DeactivateMFADevice,
  gET_DeleteAccessKey,
  gET_DeleteAccountAlias,
  gET_DeleteAccountPasswordPolicy,
  gET_DeleteGroup,
  gET_DeleteGroupPolicy,
  gET_DeleteInstanceProfile,
  gET_DeleteLoginProfile,
  gET_DeleteOpenIDConnectProvider,
  gET_DeletePolicy,
  gET_DeletePolicyVersion,
  gET_DeleteRole,
  gET_DeleteRolePermissionsBoundary,
  gET_DeleteRolePolicy,
  gET_DeleteSAMLProvider,
  gET_DeleteSSHPublicKey,
  gET_DeleteServerCertificate,
  gET_DeleteServiceLinkedRole,
  gET_DeleteServiceSpecificCredential,
  gET_DeleteSigningCertificate,
  gET_DeleteUser,
  gET_DeleteUserPermissionsBoundary,
  gET_DeleteUserPolicy,
  gET_DeleteVirtualMFADevice,
  gET_DetachGroupPolicy,
  gET_DetachRolePolicy,
  gET_DetachUserPolicy,
  gET_EnableMFADevice,
  gET_GenerateCredentialReport,
  gET_GenerateOrganizationsAccessReport,
  gET_GenerateServiceLastAccessedDetails,
  gET_GetAccessKeyLastUsed,
  gET_GetAccountAuthorizationDetails,
  gET_GetAccountPasswordPolicy,
  gET_GetAccountSummary,
  gET_GetContextKeysForCustomPolicy,
  gET_GetContextKeysForPrincipalPolicy,
  gET_GetCredentialReport,
  gET_GetGroup,
  gET_GetGroupPolicy,
  gET_GetInstanceProfile,
  gET_GetLoginProfile,
  gET_GetMFADevice,
  gET_GetOpenIDConnectProvider,
  gET_GetOrganizationsAccessReport,
  gET_GetPolicy,
  gET_GetPolicyVersion,
  gET_GetRole,
  gET_GetRolePolicy,
  gET_GetSAMLProvider,
  gET_GetSSHPublicKey,
  gET_GetServerCertificate,
  gET_GetServiceLastAccessedDetails,
  gET_GetServiceLastAccessedDetailsWithEntities,
  gET_GetServiceLinkedRoleDeletionStatus,
  gET_GetUser,
  gET_GetUserPolicy,
  gET_ListAccessKeys,
  gET_ListAccountAliases,
  gET_ListAttachedGroupPolicies,
  gET_ListAttachedRolePolicies,
  gET_ListAttachedUserPolicies,
  gET_ListEntitiesForPolicy,
  gET_ListGroupPolicies,
  gET_ListGroups,
  gET_ListGroupsForUser,
  gET_ListInstanceProfileTags,
  gET_ListInstanceProfiles,
  gET_ListInstanceProfilesForRole,
  gET_ListMFADeviceTags,
  gET_ListMFADevices,
  gET_ListOpenIDConnectProviderTags,
  gET_ListOpenIDConnectProviders,
  gET_ListPolicies,
  gET_ListPoliciesGrantingServiceAccess,
  gET_ListPolicyTags,
  gET_ListPolicyVersions,
  gET_ListRolePolicies,
  gET_ListRoleTags,
  gET_ListRoles,
  gET_ListSAMLProviderTags,
  gET_ListSAMLProviders,
  gET_ListSSHPublicKeys,
  gET_ListServerCertificateTags,
  gET_ListServerCertificates,
  gET_ListServiceSpecificCredentials,
  gET_ListSigningCertificates,
  gET_ListUserPolicies,
  gET_ListUserTags,
  gET_ListUsers,
  gET_ListVirtualMFADevices,
  gET_PutGroupPolicy,
  gET_PutRolePermissionsBoundary,
  gET_PutRolePolicy,
  gET_PutUserPermissionsBoundary,
  gET_PutUserPolicy,
  gET_RemoveClientIDFromOpenIDConnectProvider,
  gET_RemoveRoleFromInstanceProfile,
  gET_RemoveUserFromGroup,
  gET_ResetServiceSpecificCredential,
  gET_ResyncMFADevice,
  gET_SetDefaultPolicyVersion,
  gET_SetSecurityTokenServicePreferences,
  gET_SimulateCustomPolicy,
  gET_SimulatePrincipalPolicy,
  gET_TagInstanceProfile,
  gET_TagMFADevice,
  gET_TagOpenIDConnectProvider,
  gET_TagPolicy,
  gET_TagRole,
  gET_TagSAMLProvider,
  gET_TagServerCertificate,
  gET_TagUser,
  gET_UntagInstanceProfile,
  gET_UntagMFADevice,
  gET_UntagOpenIDConnectProvider,
  gET_UntagPolicy,
  gET_UntagRole,
  gET_UntagSAMLProvider,
  gET_UntagServerCertificate,
  gET_UntagUser,
  gET_UpdateAccessKey,
  gET_UpdateAccountPasswordPolicy,
  gET_UpdateAssumeRolePolicy,
  gET_UpdateGroup,
  gET_UpdateLoginProfile,
  gET_UpdateOpenIDConnectProviderThumbprint,
  gET_UpdateRole,
  gET_UpdateRoleDescription,
  gET_UpdateSAMLProvider,
  gET_UpdateSSHPublicKey,
  gET_UpdateServerCertificate,
  gET_UpdateServiceSpecificCredential,
  gET_UpdateSigningCertificate,
  gET_UpdateUser,
  gET_UploadSSHPublicKey,
  gET_UploadServerCertificate,
  gET_UploadSigningCertificate,
  pOST_AddClientIDToOpenIDConnectProvider,
  pOST_AddRoleToInstanceProfile,
  pOST_AddUserToGroup,
  pOST_AttachGroupPolicy,
  pOST_AttachRolePolicy,
  pOST_AttachUserPolicy,
  pOST_ChangePassword,
  pOST_CreateAccessKey,
  pOST_CreateAccountAlias,
  pOST_CreateGroup,
  pOST_CreateInstanceProfile,
  pOST_CreateLoginProfile,
  pOST_CreateOpenIDConnectProvider,
  pOST_CreatePolicy,
  pOST_CreatePolicyVersion,
  pOST_CreateRole,
  pOST_CreateSAMLProvider,
  pOST_CreateServiceLinkedRole,
  pOST_CreateServiceSpecificCredential,
  pOST_CreateUser,
  pOST_CreateVirtualMFADevice,
  pOST_DeactivateMFADevice,
  pOST_DeleteAccessKey,
  pOST_DeleteAccountAlias,
  pOST_DeleteAccountPasswordPolicy,
  pOST_DeleteGroup,
  pOST_DeleteGroupPolicy,
  pOST_DeleteInstanceProfile,
  pOST_DeleteLoginProfile,
  pOST_DeleteOpenIDConnectProvider,
  pOST_DeletePolicy,
  pOST_DeletePolicyVersion,
  pOST_DeleteRole,
  pOST_DeleteRolePermissionsBoundary,
  pOST_DeleteRolePolicy,
  pOST_DeleteSAMLProvider,
  pOST_DeleteSSHPublicKey,
  pOST_DeleteServerCertificate,
  pOST_DeleteServiceLinkedRole,
  pOST_DeleteServiceSpecificCredential,
  pOST_DeleteSigningCertificate,
  pOST_DeleteUser,
  pOST_DeleteUserPermissionsBoundary,
  pOST_DeleteUserPolicy,
  pOST_DeleteVirtualMFADevice,
  pOST_DetachGroupPolicy,
  pOST_DetachRolePolicy,
  pOST_DetachUserPolicy,
  pOST_EnableMFADevice,
  pOST_GenerateCredentialReport,
  pOST_GenerateOrganizationsAccessReport,
  pOST_GenerateServiceLastAccessedDetails,
  pOST_GetAccessKeyLastUsed,
  pOST_GetAccountAuthorizationDetails,
  pOST_GetAccountPasswordPolicy,
  pOST_GetAccountSummary,
  pOST_GetContextKeysForCustomPolicy,
  pOST_GetContextKeysForPrincipalPolicy,
  pOST_GetCredentialReport,
  pOST_GetGroup,
  pOST_GetGroupPolicy,
  pOST_GetInstanceProfile,
  pOST_GetLoginProfile,
  pOST_GetMFADevice,
  pOST_GetOpenIDConnectProvider,
  pOST_GetOrganizationsAccessReport,
  pOST_GetPolicy,
  pOST_GetPolicyVersion,
  pOST_GetRole,
  pOST_GetRolePolicy,
  pOST_GetSAMLProvider,
  pOST_GetSSHPublicKey,
  pOST_GetServerCertificate,
  pOST_GetServiceLastAccessedDetails,
  pOST_GetServiceLastAccessedDetailsWithEntities,
  pOST_GetServiceLinkedRoleDeletionStatus,
  pOST_GetUser,
  pOST_GetUserPolicy,
  pOST_ListAccessKeys,
  pOST_ListAccountAliases,
  pOST_ListAttachedGroupPolicies,
  pOST_ListAttachedRolePolicies,
  pOST_ListAttachedUserPolicies,
  pOST_ListEntitiesForPolicy,
  pOST_ListGroupPolicies,
  pOST_ListGroups,
  pOST_ListGroupsForUser,
  pOST_ListInstanceProfileTags,
  pOST_ListInstanceProfiles,
  pOST_ListInstanceProfilesForRole,
  pOST_ListMFADeviceTags,
  pOST_ListMFADevices,
  pOST_ListOpenIDConnectProviderTags,
  pOST_ListOpenIDConnectProviders,
  pOST_ListPolicies,
  pOST_ListPoliciesGrantingServiceAccess,
  pOST_ListPolicyTags,
  pOST_ListPolicyVersions,
  pOST_ListRolePolicies,
  pOST_ListRoleTags,
  pOST_ListRoles,
  pOST_ListSAMLProviderTags,
  pOST_ListSAMLProviders,
  pOST_ListSSHPublicKeys,
  pOST_ListServerCertificateTags,
  pOST_ListServerCertificates,
  pOST_ListServiceSpecificCredentials,
  pOST_ListSigningCertificates,
  pOST_ListUserPolicies,
  pOST_ListUserTags,
  pOST_ListUsers,
  pOST_ListVirtualMFADevices,
  pOST_PutGroupPolicy,
  pOST_PutRolePermissionsBoundary,
  pOST_PutRolePolicy,
  pOST_PutUserPermissionsBoundary,
  pOST_PutUserPolicy,
  pOST_RemoveClientIDFromOpenIDConnectProvider,
  pOST_RemoveRoleFromInstanceProfile,
  pOST_RemoveUserFromGroup,
  pOST_ResetServiceSpecificCredential,
  pOST_ResyncMFADevice,
  pOST_SetDefaultPolicyVersion,
  pOST_SetSecurityTokenServicePreferences,
  pOST_SimulateCustomPolicy,
  pOST_SimulatePrincipalPolicy,
  pOST_TagInstanceProfile,
  pOST_TagMFADevice,
  pOST_TagOpenIDConnectProvider,
  pOST_TagPolicy,
  pOST_TagRole,
  pOST_TagSAMLProvider,
  pOST_TagServerCertificate,
  pOST_TagUser,
  pOST_UntagInstanceProfile,
  pOST_UntagMFADevice,
  pOST_UntagOpenIDConnectProvider,
  pOST_UntagPolicy,
  pOST_UntagRole,
  pOST_UntagSAMLProvider,
  pOST_UntagServerCertificate,
  pOST_UntagUser,
  pOST_UpdateAccessKey,
  pOST_UpdateAccountPasswordPolicy,
  pOST_UpdateAssumeRolePolicy,
  pOST_UpdateGroup,
  pOST_UpdateLoginProfile,
  pOST_UpdateOpenIDConnectProviderThumbprint,
  pOST_UpdateRole,
  pOST_UpdateRoleDescription,
  pOST_UpdateSAMLProvider,
  pOST_UpdateSSHPublicKey,
  pOST_UpdateServerCertificate,
  pOST_UpdateServiceSpecificCredential,
  pOST_UpdateSigningCertificate,
  pOST_UpdateUser,
  pOST_UploadSSHPublicKey,
  pOST_UploadServerCertificate,
  pOST_UploadSigningCertificate,
};
