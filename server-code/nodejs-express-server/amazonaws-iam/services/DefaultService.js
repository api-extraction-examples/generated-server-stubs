/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* <p>Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource.</p> <p>This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.</p>
*
* openIDConnectProviderArn String The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC) provider resource to add the client ID to. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
* clientID String The client ID (also known as audience) to add to the IAM OpenID Connect provider resource.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_AddClientIDToOpenIDConnectProvider = ({ openIDConnectProviderArn, clientID, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        openIDConnectProviderArn,
        clientID,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this quota cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of Amazon Web Services because of <a href=\"https://en.wikipedia.org/wiki/Eventual_consistency\">eventual consistency</a>. To force the change, you must <a href=\"https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateIamInstanceProfile.html\">disassociate the instance profile</a> and then <a href=\"https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateIamInstanceProfile.html\">associate the instance profile</a>, or you can stop your instance and then restart it.</p> <note> <p>The caller of this operation must be granted the <code>PassRole</code> permission on the IAM role by a permissions policy.</p> </note> <p> For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>. For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p>
*
* instanceProfileName String <p>The name of the instance profile to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* roleName String <p>The name of the role to add.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_AddRoleToInstanceProfile = ({ instanceProfileName, roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        instanceProfileName,
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Adds the specified user to the specified group.
*
* groupName String <p>The name of the group to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* userName String <p>The name of the user to add.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_AddUserToGroup = ({ groupName, userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Attaches the specified managed policy to the specified IAM group.</p> <p>You use this operation to attach a managed policy to a group. To embed an inline policy in a group, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutGroupPolicy.html\"> <code>PutGroupPolicy</code> </a>.</p> <p>As a best practice, you can validate your IAM policies. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\">Validating IAM policies</a> in the <i>IAM User Guide</i>.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* groupName String <p>The name (friendly name, not ARN) of the group to attach the policy to.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy you want to attach.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_AttachGroupPolicy = ({ groupName, policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.</p> <note> <p>You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html\"> <code>CreateRole</code> </a>. You can update a role's trust policy using <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html\"> <code>UpdateAssumerolePolicy</code> </a>.</p> </note> <p>Use this operation to attach a <i>managed</i> policy to a role. To embed an inline policy in a role, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutRolePolicy.html\"> <code>PutRolePolicy</code> </a>. For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>As a best practice, you can validate your IAM policies. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\">Validating IAM policies</a> in the <i>IAM User Guide</i>.</p>
*
* roleName String <p>The name (friendly name, not ARN) of the role to attach the policy to.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy you want to attach.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_AttachRolePolicy = ({ roleName, policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Attaches the specified managed policy to the specified user.</p> <p>You use this operation to attach a <i>managed</i> policy to a user. To embed an inline policy in a user, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutUserPolicy.html\"> <code>PutUserPolicy</code> </a>.</p> <p>As a best practice, you can validate your IAM policies. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\">Validating IAM policies</a> in the <i>IAM User Guide</i>.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name (friendly name, not ARN) of the IAM user to attach the policy to.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy you want to attach.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_AttachUserPolicy = ({ userName, policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Changes the password of the IAM user who is calling this operation. This operation can be performed using the CLI, the Amazon Web Services API, or the <b>My Security Credentials</b> page in the Amazon Web Services Management Console. The Amazon Web Services account root user password is not affected by this operation.</p> <p>Use <a>UpdateLoginProfile</a> to use the CLI, the Amazon Web Services API, or the <b>Users</b> page in the IAM console to change the password for any IAM user. For more information about modifying passwords, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\">Managing passwords</a> in the <i>IAM User Guide</i>.</p>
*
* oldPassword String The IAM user's current password.
* newPassword String <p>The new password. The new password must conform to the Amazon Web Services account's password policy, if one exists.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (<code>\\u0020</code>) through the end of the ASCII character range (<code>\\u00FF</code>). You can also include the tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>) characters. Any of these characters are valid in a password. However, many tools, such as the Amazon Web Services Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_ChangePassword = ({ oldPassword, newPassword, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        oldPassword,
        newPassword,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p> Creates a new Amazon Web Services secret access key and corresponding Amazon Web Services access key ID for the specified user. The default status for new keys is <code>Active</code>.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials. This is true even if the Amazon Web Services account has no associated users.</p> <p> For information about quotas on the number of keys you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <important> <p>To ensure the security of your Amazon Web Services account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys.</p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the IAM user that the new key will belong to.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* returns CreateAccessKeyResponse
* */
const gET_CreateAccessKey = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates an alias for your Amazon Web Services account. For information about using an Amazon Web Services account alias, see <a href=\"https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\">Creating, deleting, and listing an Amazon Web Services account alias</a> in the <i>Amazon Web Services Sign-In User Guide</i>.
*
* accountAlias String <p>The account alias to create.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_CreateAccountAlias = ({ accountAlias, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountAlias,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new group.</p> <p> For information about the number of groups you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p>
*
* groupName String <p>The name of the group to create. Do not include the path in this value.</p> <p>IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \"MyResource\" and \"myresource\".</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* path String <p> The path to the group. For more information about paths, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\">IAM identifiers</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/).</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* returns CreateGroupResponse
* */
const gET_CreateGroup = ({ groupName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, path }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        path,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p> Creates a new instance profile. For information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html\">Using roles for applications on Amazon EC2</a> in the <i>IAM User Guide</i>, and <a href=\"https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/iam-roles-for-amazon-ec2.html#ec2-instance-profile\">Instance profiles</a> in the <i>Amazon EC2 User Guide</i>.</p> <p> For information about the number of instance profiles you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM object quotas</a> in the <i>IAM User Guide</i>.</p>
*
* instanceProfileName String <p>The name of the instance profile to create.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* path String <p> The path to the instance profile. For more information about paths, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\">IAM Identifiers</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/).</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* tags List <p>A list of tags that you want to attach to the newly created IAM instance profile. Each tag consists of a key name and an associated value. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.</p> </note> (optional)
* returns CreateInstanceProfileResponse
* */
const gET_CreateInstanceProfile = ({ instanceProfileName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, path, tags }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        instanceProfileName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        path,
        tags,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a password for the specified IAM user. A password allows an IAM user to access Amazon Web Services services through the Amazon Web Services Management Console.</p> <p>You can use the CLI, the Amazon Web Services API, or the <b>Users</b> page in the IAM console to create a password for any IAM user. Use <a>ChangePassword</a> to update your own existing password in the <b>My Security Credentials</b> page in the Amazon Web Services Management Console.</p> <p>For more information about managing passwords, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\">Managing passwords</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name of the IAM user to create a password for. The user must already exist.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* password String <p>The new password for the user.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (<code>\\u0020</code>) through the end of the ASCII character range (<code>\\u00FF</code>). You can also include the tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>) characters. Any of these characters are valid in a password. However, many tools, such as the Amazon Web Services Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* passwordResetRequired Boolean Specifies whether the user is required to set a new password on next sign-in. (optional)
* returns CreateLoginProfileResponse
* */
const gET_CreateLoginProfile = ({ userName, password, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, passwordResetRequired }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        password,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        passwordResetRequired,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates an IAM entity to describe an identity provider (IdP) that supports <a href=\"http://openid.net/connect/\">OpenID Connect (OIDC)</a>.</p> <p>The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between Amazon Web Services and the OIDC provider.</p> <p>If you are using an OIDC identity provider from Google, Facebook, or Amazon Cognito, you don't need to create a separate IAM identity provider. These OIDC identity providers are already built-in to Amazon Web Services and are available for your use. Instead, you can move directly to creating new roles using your identity provider. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_oidc.html\">Creating a role for web identity or OpenID connect federation</a> in the <i>IAM User Guide</i>.</p> <p>When you create the IAM OIDC provider, you specify the following:</p> <ul> <li> <p>The URL of the OIDC identity provider (IdP) to trust</p> </li> <li> <p>A list of client IDs (also known as audiences) that identify the application or applications allowed to authenticate using the OIDC provider</p> </li> <li> <p>A list of tags that are attached to the specified IAM OIDC provider</p> </li> <li> <p>A list of thumbprints of one or more server certificates that the IdP uses</p> </li> </ul> <p>You get all of this information from the OIDC IdP you want to use to access Amazon Web Services.</p> <note> <p>Amazon Web Services secures communication with some OIDC identity providers (IdPs) through our library of trusted root certificate authorities (CAs) instead of using a certificate thumbprint to verify your IdP server certificate. These OIDC IdPs include Auth0, GitHub, Google, and those that use an Amazon S3 bucket to host a JSON Web Key Set (JWKS) endpoint. In these cases, your legacy thumbprint remains in your configuration, but is no longer used for validation.</p> </note> <note> <p>The trust for the OIDC provider is derived from the IAM provider that this operation creates. Therefore, it is best to limit access to the <a>CreateOpenIDConnectProvider</a> operation to highly privileged users.</p> </note>
*
* url String <p>The URL of the identity provider. The URL must begin with <code>https://</code> and should correspond to the <code>iss</code> claim in the provider's OpenID Connect ID tokens. Per the OIDC standard, path components are allowed but query parameters are not. Typically the URL consists of only a hostname, like <code>https://server.example.org</code> or <code>https://example.com</code>. The URL should not contain a port number. </p> <p>You cannot register the same provider multiple times in a single Amazon Web Services account. If you try to submit a URL that has already been used for an OpenID Connect provider in the Amazon Web Services account, you will get an error.</p>
* thumbprintList List <p>A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificates. Typically this list includes only one entry. However, IAM lets you have up to five thumbprints for an OIDC provider. This lets you maintain multiple thumbprints if the identity provider is rotating certificates.</p> <p>The server certificate thumbprint is the hex-encoded SHA-1 hash value of the X.509 certificate used by the domain where the OpenID Connect provider makes its keys available. It is always a 40-character string.</p> <p>You must provide at least one thumbprint when creating an IAM OIDC provider. For example, assume that the OIDC provider is <code>server.example.com</code> and the provider stores its keys at https://keys.server.example.com/openid-connect. In that case, the thumbprint string would be the hex-encoded SHA-1 hash value of the certificate used by <code>https://keys.server.example.com.</code> </p> <p>For more information about obtaining the OIDC provider thumbprint, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html\">Obtaining the thumbprint for an OpenID Connect provider</a> in the <i>IAM user Guide</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* clientIDList List <p>Provides a list of client IDs, also known as audiences. When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. This is the value that's sent as the <code>client_id</code> parameter on OAuth requests.</p> <p>You can register multiple client IDs with the same provider. For example, you might have multiple applications that use the same OIDC provider. You cannot register more than 100 client IDs with a single IAM OIDC provider.</p> <p>There is no defined format for a client ID. The <code>CreateOpenIDConnectProviderRequest</code> operation accepts client IDs up to 255 characters long.</p> (optional)
* tags List <p>A list of tags that you want to attach to the new IAM OpenID Connect (OIDC) provider. Each tag consists of a key name and an associated value. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.</p> </note> (optional)
* returns CreateOpenIDConnectProviderResponse
* */
const gET_CreateOpenIDConnectProvider = ({ url, thumbprintList, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, clientIDList, tags }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        url,
        thumbprintList,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        clientIDList,
        tags,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new managed policy for your Amazon Web Services account.</p> <p>This operation creates a policy version with a version identifier of <code>v1</code> and sets v1 as the policy's default version. For more information about policy versions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p> <p>As a best practice, you can validate your IAM policies. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\">Validating IAM policies</a> in the <i>IAM User Guide</i>.</p> <p>For more information about managed policies in general, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* policyName String <p>The friendly name of the policy.</p> <p>IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \"MyResource\" and \"myresource\".</p>
* policyDocument String <p>The JSON policy document that you want to use as the content for the new policy.</p> <p>You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.</p> <p>The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\">IAM and STS character quotas</a>.</p> <p>To learn more about JSON policy grammar, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_grammar.html\">Grammar of the IAM JSON policy language</a> in the <i>IAM User Guide</i>. </p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* path String <p>The path for the policy.</p> <p>For more information about paths, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\">IAM identifiers</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/).</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> <note> <p>You cannot use an asterisk (*) in the path name.</p> </note> (optional)
* description String <p>A friendly description of the policy.</p> <p>Typically used to store information about the permissions defined in the policy. For example, \"Grants access to production DynamoDB tables.\"</p> <p>The policy description is immutable. After a value is assigned, it cannot be changed.</p> (optional)
* tags List <p>A list of tags that you want to attach to the new IAM customer managed policy. Each tag consists of a key name and an associated value. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.</p> </note> (optional)
* returns CreatePolicyResponse
* */
const gET_CreatePolicy = ({ policyName, policyDocument, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, path, description, tags }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyName,
        policyDocument,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        path,
        description,
        tags,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using <a>DeletePolicyVersion</a> before you create a new version.</p> <p>Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached.</p> <p>For more information about managed policy versions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p>
*
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* policyDocument String <p>The JSON policy document that you want to use as the content for this new version of the policy.</p> <p>You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.</p> <p>The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\">IAM and STS character quotas</a>.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* setAsDefault Boolean <p>Specifies whether to set this version as the policy's default version.</p> <p>When this parameter is <code>true</code>, the new policy version becomes the operative version. That is, it becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached to.</p> <p>For more information about managed policy versions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p> (optional)
* returns CreatePolicyVersionResponse
* */
const gET_CreatePolicyVersion = ({ policyArn, policyDocument, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, setAsDefault }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        policyDocument,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        setAsDefault,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new role for your Amazon Web Services account.</p> <p> For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>. For information about quotas for role names and the number of roles you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p>
*
* roleName String <p>The name of the role to create.</p> <p>IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \"MyResource\" and \"myresource\".</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* assumeRolePolicyDocument String <p>The trust relationship policy document that grants an entity permission to assume the role.</p> <p>In IAM, you must provide a JSON policy that has been converted to a string. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul> <p> Upon success, the response includes the same trust policy in JSON format.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* path String <p> The path to the role. For more information about paths, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\">IAM Identifiers</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/).</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* description String A description of the role. (optional)
* maxSessionDuration Integer <p>The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default value of one hour is applied. This setting can have a value from 1 hour to 12 hours.</p> <p>Anyone who assumes the role from the CLI or API can use the <code>DurationSeconds</code> API parameter or the <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code> setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter. If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console URL. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html\">Using IAM roles</a> in the <i>IAM User Guide</i>.</p> (optional)
* permissionsBoundary String <p>The ARN of the managed policy that is used to set the permissions boundary for the role.</p> <p>A permissions boundary policy defines the maximum permissions that identity-based policies can grant to an entity, but does not grant permissions. Permissions boundaries do not define the maximum permissions that a resource-based policy can grant to an entity. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\">Permissions boundaries for IAM entities</a> in the <i>IAM User Guide</i>.</p> <p>For more information about policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types\">Policy types </a> in the <i>IAM User Guide</i>.</p> (optional)
* tags List <p>A list of tags that you want to attach to the new role. Each tag consists of a key name and an associated value. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.</p> </note> (optional)
* returns CreateRoleResponse
* */
const gET_CreateRole = ({ roleName, assumeRolePolicyDocument, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, path, description, maxSessionDuration, permissionsBoundary, tags }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        assumeRolePolicyDocument,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        path,
        description,
        maxSessionDuration,
        permissionsBoundary,
        tags,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.</p> <p>The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the Amazon Web Services Management Console or one that supports API access to Amazon Web Services.</p> <p>When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.</p> <note> <p> This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note> <p> For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html\">Enabling SAML 2.0 federated users to access the Amazon Web Services Management Console</a> and <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation</a> in the <i>IAM User Guide</i>.</p>
*
* sAMLMetadataDocument String <p>An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization's IdP.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation</a> in the <i>IAM User Guide</i> </p>
* name String <p>The name of the provider to create.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* tags List <p>A list of tags that you want to attach to the new IAM SAML provider. Each tag consists of a key name and an associated value. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.</p> </note> (optional)
* returns CreateSAMLProviderResponse
* */
const gET_CreateSAMLProvider = ({ sAMLMetadataDocument, name, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, tags }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sAMLMetadataDocument,
        name,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        tags,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates an IAM role that is linked to a specific Amazon Web Services service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your Amazon Web Services resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html\">Using service-linked roles</a> in the <i>IAM User Guide</i>. </p> <p>To attach a policy to this service-linked role, you must make the request using the Amazon Web Services service that depends on this role.</p>
*
* aWSServiceName String <p>The service principal for the Amazon Web Services service to which this role is attached. You use a string similar to a URL but without the http:// in front. For example: <code>elasticbeanstalk.amazonaws.com</code>. </p> <p>Service principals are unique and case-sensitive. To find the exact service principal for your service-linked role, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html\">Amazon Web Services services that work with IAM</a> in the <i>IAM User Guide</i>. Look for the services that have <b>Yes </b>in the <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link to view the service-linked role documentation for that service.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* description String The description of the role. (optional)
* customSuffix String <p/> <p>A string that you provide, which is combined with the service-provided prefix to form the complete role name. If you make multiple requests for the same service, then you must supply a different <code>CustomSuffix</code> for each request. Otherwise the request fails with a duplicate role name error. For example, you could add <code>-1</code> or <code>-debug</code> to the suffix.</p> <p>Some services do not support the <code>CustomSuffix</code> parameter. If you provide an optional suffix and the operation fails, try the operation again without the suffix.</p> (optional)
* returns CreateServiceLinkedRoleResponse
* */
const gET_CreateServiceLinkedRole = ({ aWSServiceName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, description, customSuffix }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        aWSServiceName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        description,
        customSuffix,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service. </p> <p>You can have a maximum of two sets of service-specific credentials for each supported service per user.</p> <p>You can create service-specific credentials for CodeCommit and Amazon Keyspaces (for Apache Cassandra).</p> <p>You can reset the password to a new service-generated value by calling <a>ResetServiceSpecificCredential</a>.</p> <p>For more information about service-specific credentials, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_ssh-keys.html\">Using IAM with CodeCommit: Git credentials, SSH keys, and Amazon Web Services access keys</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name of the IAM user that is to be associated with the credentials. The new service-specific credentials have the same permissions as the associated user except that they can be used only to access the specified service.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* serviceName String The name of the Amazon Web Services service that is to be associated with the credentials. The service you specify here is the only service that can be accessed using these credentials.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns CreateServiceSpecificCredentialResponse
* */
const gET_CreateServiceSpecificCredential = ({ userName, serviceName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        serviceName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new IAM user for your Amazon Web Services account.</p> <p> For information about quotas for the number of IAM users you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name of the user to create.</p> <p>IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \"MyResource\" and \"myresource\".</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* path String <p> The path for the user name. For more information about paths, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\">IAM identifiers</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/).</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* permissionsBoundary String <p>The ARN of the managed policy that is used to set the permissions boundary for the user.</p> <p>A permissions boundary policy defines the maximum permissions that identity-based policies can grant to an entity, but does not grant permissions. Permissions boundaries do not define the maximum permissions that a resource-based policy can grant to an entity. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\">Permissions boundaries for IAM entities</a> in the <i>IAM User Guide</i>.</p> <p>For more information about policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types\">Policy types </a> in the <i>IAM User Guide</i>.</p> (optional)
* tags List <p>A list of tags that you want to attach to the new user. Each tag consists of a key name and an associated value. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.</p> </note> (optional)
* returns CreateUserResponse
* */
const gET_CreateUser = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, path, permissionsBoundary, tags }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        path,
        permissionsBoundary,
        tags,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new virtual MFA device for the Amazon Web Services account. After creating the virtual MFA, use <a>EnableMFADevice</a> to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\">Using a virtual MFA device</a> in the <i>IAM User Guide</i>.</p> <p>For information about the maximum number of MFA devices you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <important> <p>The seed information contained in the QR code and the Base32 string should be treated like any other secret access information. In other words, protect the seed information as you would your Amazon Web Services access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures.</p> </important>
*
* virtualMFADeviceName String <p>The name of the virtual MFA device, which must be unique. Use with path to uniquely identify a virtual MFA device.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* path String <p> The path for the virtual MFA device. For more information about paths, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\">IAM identifiers</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/).</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* tags List <p>A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name and an associated value. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.</p> </note> (optional)
* returns CreateVirtualMFADeviceResponse
* */
const gET_CreateVirtualMFADevice = ({ virtualMFADeviceName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, path, tags }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        virtualMFADeviceName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        path,
        tags,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.</p> <p>For more information about creating and working with virtual MFA devices, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\">Enabling a virtual multi-factor authentication (MFA) device</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name of the user whose MFA device you want to deactivate.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* serialNumber String <p>The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeactivateMFADevice = ({ userName, serialNumber, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        serialNumber,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the access key pair associated with the specified IAM user.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p>
*
* accessKeyId String <p>The access key ID for the access key ID and secret access key you want to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the user whose access key pair you want to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* no response value expected for this operation
* */
const gET_DeleteAccessKey = ({ accessKeyId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accessKeyId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Deletes the specified Amazon Web Services account alias. For information about using an Amazon Web Services account alias, see <a href=\"https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\">Creating, deleting, and listing an Amazon Web Services account alias</a> in the <i>Amazon Web Services Sign-In User Guide</i>.
*
* accountAlias String <p>The name of the account alias to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteAccountAlias = ({ accountAlias, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountAlias,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Deletes the password policy for the Amazon Web Services account. There are no parameters.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteAccountPasswordPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Deletes the specified IAM group. The group must not contain any users or have any attached policies.
*
* groupName String <p>The name of the IAM group to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteGroup = ({ groupName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified inline policy that is embedded in the specified IAM group.</p> <p>A group can also have managed policies attached to it. To detach a managed policy from a group, use <a>DetachGroupPolicy</a>. For more information about policies, refer to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* groupName String <p>The name (friendly name, not ARN) identifying the group that the policy is embedded in.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyName String <p>The name identifying the policy document to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteGroupPolicy = ({ groupName, policyName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        policyName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified instance profile. The instance profile must not have an associated role.</p> <important> <p>Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.</p> </important> <p>For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p>
*
* instanceProfileName String <p>The name of the instance profile to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteInstanceProfile = ({ instanceProfileName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        instanceProfileName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the password for the specified IAM user, For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_passwords_admin-change-user.html\">Managing passwords for IAM users</a>.</p> <p>You can use the CLI, the Amazon Web Services API, or the <b>Users</b> page in the IAM console to delete a password for any IAM user. You can use <a>ChangePassword</a> to update, but not delete, your own password in the <b>My Security Credentials</b> page in the Amazon Web Services Management Console.</p> <important> <p>Deleting a user's password does not prevent a user from accessing Amazon Web Services through the command line interface or the API. To prevent all user access, you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see <a>UpdateAccessKey</a> and <a>DeleteAccessKey</a>.</p> </important>
*
* userName String <p>The name of the user whose password you want to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteLoginProfile = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes an OpenID Connect identity provider (IdP) resource object in IAM.</p> <p>Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails.</p> <p>This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.</p>
*
* openIDConnectProviderArn String The Amazon Resource Name (ARN) of the IAM OpenID Connect provider resource object to delete. You can get a list of OpenID Connect provider resource ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteOpenIDConnectProvider = ({ openIDConnectProviderArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        openIDConnectProviderArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified managed policy.</p> <p>Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition, you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:</p> <ul> <li> <p>Detach the policy from all users, groups, and roles that the policy is attached to, using <a>DetachUserPolicy</a>, <a>DetachGroupPolicy</a>, or <a>DetachRolePolicy</a>. To list all the users, groups, and roles that a policy is attached to, use <a>ListEntitiesForPolicy</a>.</p> </li> <li> <p>Delete all versions of the policy using <a>DeletePolicyVersion</a>. To list the policy's versions, use <a>ListPolicyVersions</a>. You cannot use <a>DeletePolicyVersion</a> to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.</p> </li> <li> <p>Delete the policy (this automatically deletes the policy's default version) using this operation.</p> </li> </ul> <p>For information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy you want to delete.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeletePolicy = ({ policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified version from the specified managed policy.</p> <p>You cannot delete the default version from a policy using this operation. To delete the default version from a policy, use <a>DeletePolicy</a>. To find out which version of a policy is marked as the default version, use <a>ListPolicyVersions</a>.</p> <p>For information about versions for managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p>
*
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy from which you want to delete a version.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* versionId String <p>The policy version to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that consists of the lowercase letter 'v' followed by one or two digits, and optionally followed by a period '.' and a string of letters and digits.</p> <p>For more information about managed policy versions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeletePolicyVersion = ({ policyArn, versionId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        versionId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified role. Unlike the Amazon Web Services Management Console, when you delete a role programmatically, you must delete the items attached to the role manually, or the deletion fails. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_manage_delete.html#roles-managingrole-deleting-cli\">Deleting an IAM role</a>. Before attempting to delete a role, remove the following attached items: </p> <ul> <li> <p>Inline policies (<a>DeleteRolePolicy</a>)</p> </li> <li> <p>Attached managed policies (<a>DetachRolePolicy</a>)</p> </li> <li> <p>Instance profile (<a>RemoveRoleFromInstanceProfile</a>)</p> </li> <li> <p>Optional – Delete instance profile after detaching from role for resource clean up (<a>DeleteInstanceProfile</a>)</p> </li> </ul> <important> <p>Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.</p> </important>
*
* roleName String <p>The name of the role to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteRole = ({ roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the permissions boundary for the specified IAM role. </p> <p>You cannot set the boundary for a service-linked role.</p> <important> <p>Deleting the permissions boundary for a role might increase its permissions. For example, it might allow anyone who assumes the role to perform all the actions granted in its permissions policies.</p> </important>
*
* roleName String The name (friendly name, not ARN) of the IAM role from which you want to remove the permissions boundary.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteRolePermissionsBoundary = ({ roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified inline policy that is embedded in the specified IAM role.</p> <p>A role can also have managed policies attached to it. To detach a managed policy from a role, use <a>DetachRolePolicy</a>. For more information about policies, refer to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* roleName String <p>The name (friendly name, not ARN) identifying the role that the policy is embedded in.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyName String <p>The name of the inline policy to delete from the specified IAM role.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteRolePolicy = ({ roleName, policyName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        policyName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes a SAML provider resource in IAM.</p> <p>Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.</p> <note> <p> This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note>
*
* sAMLProviderArn String The Amazon Resource Name (ARN) of the SAML provider to delete.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteSAMLProvider = ({ sAMLProviderArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sAMLProviderArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified SSH public key.</p> <p>The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p>
*
* userName String <p>The name of the IAM user associated with the SSH public key.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* sSHPublicKeyId String <p>The unique identifier for the SSH public key.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteSSHPublicKey = ({ userName, sSHPublicKeyId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        sSHPublicKeyId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified server certificate.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <important> <p> If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, see <a href=\"https://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html\">DeleteLoadBalancerListeners</a> in the <i>Elastic Load Balancing API Reference</i>.</p> </important>
*
* serverCertificateName String <p>The name of the server certificate you want to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteServerCertificate = ({ serverCertificateName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverCertificateName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Submits a service-linked role deletion request and returns a <code>DeletionTaskId</code>, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the <code>DeletionTaskId</code> of the earlier request is returned.</p> <p>If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the <a>GetServiceLinkedRoleDeletionStatus</a> operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the <a href=\"http://docs.aws.amazon.com/\">Amazon Web Services documentation</a> for your service.</p> <p>For more information about service-linked roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role\">Roles terms and concepts: Amazon Web Services service-linked role</a> in the <i>IAM User Guide</i>.</p>
*
* roleName String The name of the service-linked role to be deleted.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns DeleteServiceLinkedRoleResponse
* */
const gET_DeleteServiceLinkedRole = ({ roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Deletes the specified service-specific credential.
*
* serviceSpecificCredentialId String <p>The unique identifier of the service-specific credential. You can get this value by calling <a>ListServiceSpecificCredentials</a>.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the IAM user associated with the service-specific credential. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* no response value expected for this operation
* */
const gET_DeleteServiceSpecificCredential = ({ serviceSpecificCredentialId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serviceSpecificCredentialId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes a signing certificate associated with the specified IAM user.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated IAM users.</p>
*
* certificateId String <p>The ID of the signing certificate to delete.</p> <p>The format of this parameter, as described by its <a href=\"http://wikipedia.org/wiki/regex\">regex</a> pattern, is a string of characters that can be upper- or lower-cased letters or digits.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the user the signing certificate belongs to.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* no response value expected for this operation
* */
const gET_DeleteSigningCertificate = ({ certificateId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        certificateId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified IAM user. Unlike the Amazon Web Services Management Console, when you delete a user programmatically, you must delete the items attached to the user manually, or the deletion fails. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_deleting_cli\">Deleting an IAM user</a>. Before attempting to delete a user, remove the following items:</p> <ul> <li> <p>Password (<a>DeleteLoginProfile</a>)</p> </li> <li> <p>Access keys (<a>DeleteAccessKey</a>)</p> </li> <li> <p>Signing certificate (<a>DeleteSigningCertificate</a>)</p> </li> <li> <p>SSH public key (<a>DeleteSSHPublicKey</a>)</p> </li> <li> <p>Git credentials (<a>DeleteServiceSpecificCredential</a>)</p> </li> <li> <p>Multi-factor authentication (MFA) device (<a>DeactivateMFADevice</a>, <a>DeleteVirtualMFADevice</a>)</p> </li> <li> <p>Inline policies (<a>DeleteUserPolicy</a>)</p> </li> <li> <p>Attached managed policies (<a>DetachUserPolicy</a>)</p> </li> <li> <p>Group memberships (<a>RemoveUserFromGroup</a>)</p> </li> </ul>
*
* userName String <p>The name of the user to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteUser = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the permissions boundary for the specified IAM user.</p> <important> <p>Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies. </p> </important>
*
* userName String The name (friendly name, not ARN) of the IAM user from which you want to remove the permissions boundary.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteUserPermissionsBoundary = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified inline policy that is embedded in the specified IAM user.</p> <p>A user can also have managed policies attached to it. To detach a managed policy from a user, use <a>DetachUserPolicy</a>. For more information about policies, refer to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name (friendly name, not ARN) identifying the user that the policy is embedded in.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyName String <p>The name identifying the policy document to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteUserPolicy = ({ userName, policyName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        policyName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes a virtual MFA device.</p> <note> <p> You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see <a>DeactivateMFADevice</a>. </p> </note>
*
* serialNumber String <p>The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the same as the ARN.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DeleteVirtualMFADevice = ({ serialNumber, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serialNumber,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified managed policy from the specified IAM group.</p> <p>A group can also have inline policies embedded with it. To delete an inline policy, use <a>DeleteGroupPolicy</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* groupName String <p>The name (friendly name, not ARN) of the IAM group to detach the policy from.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy you want to detach.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DetachGroupPolicy = ({ groupName, policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified managed policy from the specified role.</p> <p>A role can also have inline policies embedded with it. To delete an inline policy, use <a>DeleteRolePolicy</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* roleName String <p>The name (friendly name, not ARN) of the IAM role to detach the policy from.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy you want to detach.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DetachRolePolicy = ({ roleName, policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified managed policy from the specified user.</p> <p>A user can also have inline policies embedded with it. To delete an inline policy, use <a>DeleteUserPolicy</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name (friendly name, not ARN) of the IAM user to detach the policy from.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy you want to detach.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_DetachUserPolicy = ({ userName, policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
*
* userName String <p>The name of the IAM user for whom you want to enable the MFA device.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* serialNumber String <p>The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-</p>
* authenticationCode1 String <p>An authentication code emitted by the device. </p> <p>The format for this parameter is a string of six digits.</p> <important> <p>Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_mfa_sync.html\">resync the device</a>.</p> </important>
* authenticationCode2 String <p>A subsequent authentication code emitted by the device.</p> <p>The format for this parameter is a string of six digits.</p> <important> <p>Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_mfa_sync.html\">resync the device</a>.</p> </important>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_EnableMFADevice = ({ userName, serialNumber, authenticationCode1, authenticationCode2, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        serialNumber,
        authenticationCode1,
        authenticationCode2,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Generates a credential report for the Amazon Web Services account. For more information about the credential report, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html\">Getting credential reports</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GenerateCredentialReportResponse
* */
const gET_GenerateCredentialReport = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Generates a report for service last accessed data for Organizations. You can generate a report for any entities (organization root, organizational unit, or account) or policies in your organization.</p> <p>To call this operation, you must be signed in using your Organizations management account credentials. You can use your long-term IAM user or root user credentials, or temporary credentials from assuming an IAM role. SCPs must be enabled for your organization root. You must have the required IAM and Organizations permissions. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Refining permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p> <p>You can generate a service last accessed data report for entities by specifying only the entity's path. This data includes a list of services that are allowed by any service control policies (SCPs) that apply to the entity.</p> <p>You can generate a service last accessed data report for a policy by specifying an entity's path and an optional Organizations policy ID. This data includes a list of services that are allowed by the specified SCP.</p> <p>For each service in both report types, the data includes the most recent account activity that the policy allows to account principals in the entity or the entity's children. For important information about the data, reporting period, permissions required, troubleshooting, and supported Regions see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p> <important> <p>The data includes all attempts to access Amazon Web Services, not just the successful ones. This includes all attempts that were made using the Amazon Web Services Management Console, the Amazon Web Services API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that an account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\">Logging IAM events with CloudTrail</a> in the <i>IAM User Guide</i>.</p> </important> <p>This operation returns a <code>JobId</code>. Use this parameter in the <code> <a>GetOrganizationsAccessReport</a> </code> operation to check the status of the report generation. To check the status of this request, use the <code>JobId</code> parameter in the <code> <a>GetOrganizationsAccessReport</a> </code> operation and test the <code>JobStatus</code> response parameter. When the job is complete, you can retrieve the report.</p> <p>To generate a service last accessed data report for entities, specify an entity path without specifying the optional Organizations policy ID. The type of entity that you specify determines the data returned in the report.</p> <ul> <li> <p> <b>Root</b> – When you specify the organizations root as the entity, the resulting report lists all of the services allowed by SCPs that are attached to your root. For each service, the report includes data for all accounts in your organization except the management account, because the management account is not limited by SCPs.</p> </li> <li> <p> <b>OU</b> – When you specify an organizational unit (OU) as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the OU and its parents. For each service, the report includes data for all accounts in the OU or its children. This data excludes the management account, because the management account is not limited by SCPs.</p> </li> <li> <p> <b>management account</b> – When you specify the management account, the resulting report lists all Amazon Web Services services, because the management account is not limited by SCPs. For each service, the report includes data for only the management account.</p> </li> <li> <p> <b>Account</b> – When you specify another account as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the account and its parents. For each service, the report includes data for only the specified account.</p> </li> </ul> <p>To generate a service last accessed data report for policies, specify an entity path and the optional Organizations policy ID. The type of entity that you specify determines the data returned for each service.</p> <ul> <li> <p> <b>Root</b> – When you specify the root entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in your organization to which the SCP applies. This data excludes the management account, because the management account is not limited by SCPs. If the SCP is not attached to any entities in the organization, then the report will return a list of services with no data.</p> </li> <li> <p> <b>OU</b> – When you specify an OU entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in the OU or its children to which the SCP applies. This means that other accounts outside the OU that are affected by the SCP might not be included in the data. This data excludes the management account, because the management account is not limited by SCPs. If the SCP is not attached to the OU or one of its children, the report will return a list of services with no data.</p> </li> <li> <p> <b>management account</b> – When you specify the management account, the resulting report lists all Amazon Web Services services, because the management account is not limited by SCPs. If you specify a policy ID in the CLI or API, the policy is ignored. For each service, the report includes data for only the management account.</p> </li> <li> <p> <b>Account</b> – When you specify another account entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for only the specified account. This means that other accounts in the organization that are affected by the SCP might not be included in the data. If the SCP is not attached to the account, the report will return a list of services with no data.</p> </li> </ul> <note> <p>Service last accessed data does not use other policy types when determining whether a principal could access a service. These other policy types include identity-based policies, resource-based policies, access control lists, IAM permissions boundaries, and STS assume role policies. It only applies SCP logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>For more information about service last accessed data, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing policy scope by viewing user activity</a> in the <i>IAM User Guide</i>.</p>
*
* entityPath String The path of the Organizations entity (root, OU, or account). You can build an entity path using the known structure of your organization. For example, assume that your account ID is <code>123456789012</code> and its parent OU ID is <code>ou-rge0-awsabcde</code>. The organization root ID is <code>r-f6g7h8i9j0example</code> and your organization ID is <code>o-a1b2c3d4e5</code>. Your entity path is <code>o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012</code>.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* organizationsPolicyId String <p>The identifier of the Organizations service control policy (SCP). This parameter is optional.</p> <p>This ID is used to generate information about when an account principal that is limited by the SCP attempted to access an Amazon Web Services service.</p> (optional)
* returns GenerateOrganizationsAccessReportResponse
* */
const gET_GenerateOrganizationsAccessReport = ({ entityPath, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, organizationsPolicyId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        entityPath,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        organizationsPolicyId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Generates a report that includes details about when an IAM resource (user, group, role, or policy) was last used in an attempt to access Amazon Web Services services. Recent activity usually appears within four hours. IAM reports activity for at least the last 400 days, or less if your Region began supporting this feature within the last year. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period\">Regions where data is tracked</a>.</p> <important> <p>The service last accessed data includes all attempts to access an Amazon Web Services API, not just the successful ones. This includes all attempts that were made using the Amazon Web Services Management Console, the Amazon Web Services API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that your account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\">Logging IAM events with CloudTrail</a> in the <i>IAM User Guide</i>.</p> </important> <p>The <code>GenerateServiceLastAccessedDetails</code> operation returns a <code>JobId</code>. Use this parameter in the following operations to retrieve the following details from your report: </p> <ul> <li> <p> <a>GetServiceLastAccessedDetails</a> – Use this operation for users, groups, roles, or policies to list every Amazon Web Services service that the resource could access using permissions policies. For each service, the response includes information about the most recent access attempt.</p> <p>The <code>JobId</code> returned by <code>GenerateServiceLastAccessedDetail</code> must be used by the same role within a session, or by the same user when used to call <code>GetServiceLastAccessedDetail</code>.</p> </li> <li> <p> <a>GetServiceLastAccessedDetailsWithEntities</a> – Use this operation for groups and policies to list information about the associated entities (users or roles) that attempted to access a specific Amazon Web Services service. </p> </li> </ul> <p>To check the status of the <code>GenerateServiceLastAccessedDetails</code> request, use the <code>JobId</code> parameter in the same operations and test the <code>JobStatus</code> response parameter.</p> <p>For additional information about the permissions policies that allow an identity (user, group, or role) to access specific services, use the <a>ListPoliciesGrantingServiceAccess</a> operation.</p> <note> <p>Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>For more information about service and action last accessed data, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p>
*
* arn String The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when the resource was last used in an attempt to access an Amazon Web Services service.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* granularity String The level of detail that you want to generate. You can specify whether you want to generate information about the last attempt to access services or actions. If you specify service-level granularity, this operation generates only service data. If you specify action-level granularity, it generates service and action data. If you don't include this optional parameter, the operation generates service data. (optional)
* returns GenerateServiceLastAccessedDetailsResponse
* */
const gET_GenerateServiceLastAccessedDetails = ({ arn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, granularity }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        arn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        granularity,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the Amazon Web Services service and Region that were specified in the last request made with that key.
*
* accessKeyId String <p>The identifier of an access key.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetAccessKeyLastUsedResponse
* */
const gET_GetAccessKeyLastUsed = ({ accessKeyId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accessKeyId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about all IAM users, groups, roles, and policies in your Amazon Web Services account, including their relationships to one another. Use this operation to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>You can optionally filter the results using the <code>Filter</code> parameter. You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* filter List <p>A list of entity types used to filter the results. Only the entities that match the types you specify are included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed policies.</p> <p>The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the list must be one of the valid values listed below.</p> (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* returns GetAccountAuthorizationDetailsResponse
* */
const gET_GetAccountAuthorizationDetails = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, filter, maxItems, marker }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        filter,
        maxItems,
        marker,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves the password policy for the Amazon Web Services account. This tells you the complexity requirements and mandatory rotation periods for the IAM user passwords in your account. For more information about using a password policy, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html\">Managing an IAM password policy</a>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetAccountPasswordPolicyResponse
* */
const gET_GetAccountPasswordPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about IAM entity usage and IAM quotas in the Amazon Web Services account.</p> <p> For information about IAM quotas, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetAccountSummaryResponse
* */
const gET_GetAccountSummary = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use <a>GetContextKeysForPrincipalPolicy</a>.</p> <p>Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use <code>GetContextKeysForCustomPolicy</code> to understand what key names and values you must supply when you call <a>SimulateCustomPolicy</a>. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.</p>
*
* policyInputList List <p>A list of policies for which you want the list of context keys referenced in those policies. Each document is specified as a string containing the complete, valid JSON text of an IAM policy.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetContextKeysForPolicyResponse
* */
const gET_GetContextKeysForCustomPolicy = ({ policyInputList, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyInputList,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of.</p> <p>You can optionally include a list of one or more additional policies, specified as strings. If you want to include <i>only</i> a list of policies by string, use <a>GetContextKeysForCustomPolicy</a> instead.</p> <p> <b>Note:</b> This operation discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use <a>GetContextKeysForCustomPolicy</a> instead.</p> <p>Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use <a>GetContextKeysForPrincipalPolicy</a> to understand what key names and values you must supply when you call <a>SimulatePrincipalPolicy</a>.</p>
*
* policySourceArn String <p>The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a user, the list includes context keys that are found in all policies that are attached to the user. The list also includes all groups that the user is a member of. If you pick a group or a role, then it includes only those context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded form here for clarity, but must be URL encoded to be included as a part of a real HTML request.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* policyInputList List <p>An optional list of additional policies for which you want the list of context keys that are referenced.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul> (optional)
* returns GetContextKeysForPolicyResponse
* */
const gET_GetContextKeysForPrincipalPolicy = ({ policySourceArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, policyInputList }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policySourceArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        policyInputList,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Retrieves a credential report for the Amazon Web Services account. For more information about the credential report, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html\">Getting credential reports</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetCredentialReportResponse
* */
const gET_GetCredentialReport = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
*
* groupName String <p>The name of the group.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns GetGroupResponse
* */
const gET_GetGroup = ({ groupName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the specified inline policy document that is embedded in the specified IAM group.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use <a>GetPolicy</a> to determine the policy's default version, then use <a>GetPolicyVersion</a> to retrieve the policy document.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* groupName String <p>The name of the group the policy is associated with.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyName String <p>The name of the policy document to get.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetGroupPolicyResponse
* */
const gET_GetGroupPolicy = ({ groupName, policyName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        policyName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.
*
* instanceProfileName String <p>The name of the instance profile to get information about.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetInstanceProfileResponse
* */
const gET_GetInstanceProfile = ({ instanceProfileName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        instanceProfileName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the user name for the specified IAM user. A login profile is created when you create a password for the user to access the Amazon Web Services Management Console. If the user does not exist or does not have a password, the operation returns a 404 (<code>NoSuchEntity</code>) error.</p> <p>If you create an IAM user with access to the console, the <code>CreateDate</code> reflects the date you created the initial password for the user.</p> <p>If you create an IAM user with programmatic access, and then later add a password for the user to access the Amazon Web Services Management Console, the <code>CreateDate</code> reflects the initial password creation date. A user with programmatic access does not have a login profile unless you create a password for the user to access the Amazon Web Services Management Console.</p>
*
* userName String <p>The name of the user whose login profile you want to retrieve.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetLoginProfileResponse
* */
const gET_GetLoginProfile = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves information about an MFA device for a specified user.
*
* serialNumber String Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html\">ARNs</a>.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String The friendly name identifying the user. (optional)
* returns GetMFADeviceResponse
* */
const gET_GetMFADevice = ({ serialNumber, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serialNumber,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
*
* openIDConnectProviderArn String <p>The Amazon Resource Name (ARN) of the OIDC provider resource object in IAM to get information for. You can get a list of OIDC provider resource ARNs by using the <a>ListOpenIDConnectProviders</a> operation.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetOpenIDConnectProviderResponse
* */
const gET_GetOpenIDConnectProvider = ({ openIDConnectProviderArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        openIDConnectProviderArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the service last accessed data report for Organizations that was previously generated using the <code> <a>GenerateOrganizationsAccessReport</a> </code> operation. This operation retrieves the status of your report job and the report contents.</p> <p>Depending on the parameters that you passed when you generated the report, the data returned could include different information. For details, see <a>GenerateOrganizationsAccessReport</a>.</p> <p>To call this operation, you must be signed in to the management account in your organization. SCPs must be enabled for your organization root. You must have permissions to perform this operation. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Refining permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p> <p>For each service that principals in an account (root user, IAM users, or IAM roles) could access using SCPs, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, it returns the reason that it failed.</p> <p>By default, the list is sorted by service namespace.</p>
*
* jobId String The identifier of the request generated by the <a>GenerateOrganizationsAccessReport</a> operation.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* sortKey String The key that is used to sort the results. If you choose the namespace key, the results are returned in alphabetical order. If you choose the time key, the results are sorted numerically by the date and time. (optional)
* returns GetOrganizationsAccessReportResponse
* */
const gET_GetOrganizationsAccessReport = ({ jobId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, sortKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        jobId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        sortKey,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use <a>ListEntitiesForPolicy</a>. This operation returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use <a>GetPolicyVersion</a>.</p> <p>This operation retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or <a>GetRolePolicy</a>.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* policyArn String <p>The Amazon Resource Name (ARN) of the managed policy that you want information about.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetPolicyResponse
* */
const gET_GetPolicy = ({ policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified version of the specified managed policy, including the policy document.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>To list the available versions for a policy, use <a>ListPolicyVersions</a>.</p> <p>This operation retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or <a>GetRolePolicy</a>.</p> <p>For more information about the types of policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>For more information about managed policy versions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p>
*
* policyArn String <p>The Amazon Resource Name (ARN) of the managed policy that you want information about.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* versionId String <p>Identifies the policy version to retrieve.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that consists of the lowercase letter 'v' followed by one or two digits, and optionally followed by a period '.' and a string of letters and digits.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetPolicyVersionResponse
* */
const gET_GetPolicyVersion = ({ policyArn, versionId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        versionId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note>
*
* roleName String <p>The name of the IAM role to get information about.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetRoleResponse
* */
const gET_GetRole = ({ roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the specified inline policy document that is embedded with the specified IAM role.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use <a>GetPolicy</a> to determine the policy's default version, then use <a>GetPolicyVersion</a> to retrieve the policy document.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p> For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>.</p>
*
* roleName String <p>The name of the role associated with the policy.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyName String <p>The name of the policy document to get.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetRolePolicyResponse
* */
const gET_GetRolePolicy = ({ roleName, policyName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        policyName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.</p> <note> <p>This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note>
*
* sAMLProviderArn String <p>The Amazon Resource Name (ARN) of the SAML provider resource object in IAM to get information about.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetSAMLProviderResponse
* */
const gET_GetSAMLProvider = ({ sAMLProviderArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sAMLProviderArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the specified SSH public key, including metadata about the key.</p> <p>The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p>
*
* userName String <p>The name of the IAM user associated with the SSH public key.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* sSHPublicKeyId String <p>The unique identifier for the SSH public key.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* encoding String Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetSSHPublicKeyResponse
* */
const gET_GetSSHPublicKey = ({ userName, sSHPublicKeyId, encoding, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        sSHPublicKeyId,
        encoding,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified server certificate stored in IAM.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p>
*
* serverCertificateName String <p>The name of the server certificate you want to retrieve information about.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetServerCertificateResponse
* */
const gET_GetServerCertificate = ({ serverCertificateName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverCertificateName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves a service last accessed report that was created using the <code>GenerateServiceLastAccessedDetails</code> operation. You can use the <code>JobId</code> parameter in <code>GetServiceLastAccessedDetails</code> to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of Amazon Web Services services that the resource (user, group, role, or managed policy) can access.</p> <note> <p>Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the <code>GetServiceLastAccessedDetails</code> operation returns the reason that it failed.</p> <p>The <code>GetServiceLastAccessedDetails</code> operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:</p> <ul> <li> <p> <b>User</b> – Returns the user ARN that you used to generate the report</p> </li> <li> <p> <b>Group</b> – Returns the ARN of the group member (user) that last attempted to access the service</p> </li> <li> <p> <b>Role</b> – Returns the role ARN that you used to generate the report</p> </li> <li> <p> <b>Policy</b> – Returns the ARN of the user or role that last used the policy to attempt to access the service</p> </li> </ul> <p>By default, the list is sorted by service namespace.</p> <p>If you specified <code>ACTION_LEVEL</code> granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data.</p> <p>For more information about service and action last accessed data, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p>
*
* jobId String The ID of the request generated by the <a>GenerateServiceLastAccessedDetails</a> operation. The <code>JobId</code> returned by <code>GenerateServiceLastAccessedDetail</code> must be used by the same role within a session, or by the same user when used to call <code>GetServiceLastAccessedDetail</code>.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* returns GetServiceLastAccessedDetailsResponse
* */
const gET_GetServiceLastAccessedDetails = ({ jobId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        jobId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>After you generate a group or policy report using the <code>GenerateServiceLastAccessedDetails</code> operation, you can use the <code>JobId</code> parameter in <code>GetServiceLastAccessedDetailsWithEntities</code>. This operation retrieves the status of your report job and a list of entities that could have used group or policy permissions to access the specified service.</p> <ul> <li> <p> <b>Group</b> – For a group report, this operation returns a list of users in the group that could have used the group’s policies in an attempt to access the service.</p> </li> <li> <p> <b>Policy</b> – For a policy report, this operation returns a list of entities (users or roles) that could have used the policy in an attempt to access the service.</p> </li> </ul> <p>You can also use this operation for user or role reports to retrieve details about those entities.</p> <p>If the operation fails, the <code>GetServiceLastAccessedDetailsWithEntities</code> operation returns the reason that it failed.</p> <p>By default, the list of associated entities is sorted by date, with the most recent access listed first.</p>
*
* jobId String The ID of the request generated by the <code>GenerateServiceLastAccessedDetails</code> operation.
* serviceNamespace String <p>The service namespace for an Amazon Web Services service. Provide the service namespace to learn when the IAM entity last attempted to access the specified service.</p> <p>To learn the service namespace for a service, see <a href=\"https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html\">Actions, resources, and condition keys for Amazon Web Services services</a> in the <i>IAM User Guide</i>. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces\">Amazon Web Services service namespaces</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* returns GetServiceLastAccessedDetailsWithEntitiesResponse
* */
const gET_GetServiceLastAccessedDetailsWithEntities = ({ jobId, serviceNamespace, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        jobId,
        serviceNamespace,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves the status of your service-linked role deletion. After you use <a>DeleteServiceLinkedRole</a> to submit a service-linked role for deletion, you can use the <code>DeletionTaskId</code> parameter in <code>GetServiceLinkedRoleDeletionStatus</code> to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
*
* deletionTaskId String The deletion task identifier. This identifier is returned by the <a>DeleteServiceLinkedRole</a> operation in the format <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetServiceLinkedRoleDeletionStatusResponse
* */
const gET_GetServiceLinkedRoleDeletionStatus = ({ deletionTaskId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deletionTaskId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID used to sign the request to this operation.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the user to get information about.</p> <p>This parameter is optional. If it is not included, it defaults to the user making the request. This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* returns GetUserResponse
* */
const gET_GetUser = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the specified inline policy document that is embedded in the specified IAM user.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use <a>GetPolicy</a> to determine the policy's default version. Then use <a>GetPolicyVersion</a> to retrieve the policy document.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name of the user who the policy is associated with.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyName String <p>The name of the policy document to get.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetUserPolicyResponse
* */
const gET_GetUserPolicy = ({ userName, policyName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        policyName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Returns information about the access key IDs associated with the specified IAM user. If there is none, the operation returns an empty list.</p> <p>Although each user is limited to a small number of keys, you can still paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>If the <code>UserName</code> is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. If a temporary access key is used, then <code>UserName</code> is required. If a long-term key is assigned to the user, then <code>UserName</code> is not required. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p> <note> <p>To ensure the security of your Amazon Web Services account, the secret access key is accessible only during key and user creation.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the user.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListAccessKeysResponse
* */
const gET_ListAccessKeys = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the account alias associated with the Amazon Web Services account (Note: you can have only one). For information about using an Amazon Web Services account alias, see <a href=\"https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\">Creating, deleting, and listing an Amazon Web Services account alias</a> in the <i>Amazon Web Services Sign-In User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListAccountAliasesResponse
* */
const gET_ListAccountAliases = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all managed policies that are attached to the specified IAM group.</p> <p>An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use <a>ListGroupPolicies</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.</p>
*
* groupName String <p>The name (friendly name, not ARN) of the group to list attached policies for.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* pathPrefix String <p>The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListAttachedGroupPoliciesResponse
* */
const gET_ListAttachedGroupPolicies = ({ groupName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, pathPrefix, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        pathPrefix,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all managed policies that are attached to the specified IAM role.</p> <p>An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use <a>ListRolePolicies</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.</p>
*
* roleName String <p>The name (friendly name, not ARN) of the role to list attached policies for.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* pathPrefix String <p>The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListAttachedRolePoliciesResponse
* */
const gET_ListAttachedRolePolicies = ({ roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, pathPrefix, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        pathPrefix,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all managed policies that are attached to the specified IAM user.</p> <p>An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use <a>ListUserPolicies</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.</p>
*
* userName String <p>The name (friendly name, not ARN) of the user to list attached policies for.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* pathPrefix String <p>The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListAttachedUserPoliciesResponse
* */
const gET_ListAttachedUserPolicies = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, pathPrefix, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        pathPrefix,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all IAM users, groups, and roles that the specified managed policy is attached to.</p> <p>You can use the optional <code>EntityFilter</code> parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set <code>EntityFilter</code> to <code>Role</code>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy for which you want the versions.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* entityFilter String <p>The entity type to use for filtering the results.</p> <p>For example, when <code>EntityFilter</code> is <code>Role</code>, only the roles that are attached to the specified policy are returned. This parameter is optional. If it is not included, all attached entities (users, groups, and roles) are returned. The argument for this parameter must be one of the valid values listed below.</p> (optional)
* pathPrefix String <p>The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all entities.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* policyUsageFilter String <p>The policy usage method to use for filtering the results.</p> <p>To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>. To list only the policies used to set permissions boundaries, set the value to <code>PermissionsBoundary</code>.</p> <p>This parameter is optional. If it is not included, all policies are returned. </p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListEntitiesForPolicyResponse
* */
const gET_ListEntitiesForPolicy = ({ policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, entityFilter, pathPrefix, policyUsageFilter, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        entityFilter,
        pathPrefix,
        policyUsageFilter,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the names of the inline policies that are embedded in the specified IAM group.</p> <p>An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use <a>ListAttachedGroupPolicies</a>. For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.</p>
*
* groupName String <p>The name of the group to list policies for.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListGroupPoliciesResponse
* */
const gET_ListGroupPolicies = ({ groupName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the IAM groups that have the specified path prefix.</p> <p> You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* pathPrefix String <p> The path prefix for filtering the results. For example, the prefix <code>/division_abc/subdivision_xyz/</code> gets all groups whose path starts with <code>/division_abc/subdivision_xyz/</code>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListGroupsResponse
* */
const gET_ListGroups = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, pathPrefix, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        pathPrefix,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the IAM groups that the specified IAM user belongs to.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* userName String <p>The name of the user to list groups for.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListGroupsForUserResponse
* */
const gET_ListGroupsForUser = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified IAM instance profile. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* instanceProfileName String <p>The name of the IAM instance profile whose tags you want to see.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListInstanceProfileTagsResponse
* */
const gET_ListInstanceProfileTags = ({ instanceProfileName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        instanceProfileName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for an instance profile, see <a>GetInstanceProfile</a>.</p> </note> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* pathPrefix String <p> The path prefix for filtering the results. For example, the prefix <code>/application_abc/component_xyz/</code> gets all instance profiles whose path starts with <code>/application_abc/component_xyz/</code>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/), listing all instance profiles. This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListInstanceProfilesResponse
* */
const gET_ListInstanceProfiles = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, pathPrefix, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        pathPrefix,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* roleName String <p>The name of the role to list instance profiles for.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListInstanceProfilesForRoleResponse
* */
const gET_ListInstanceProfilesForRole = ({ roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified IAM virtual multi-factor authentication (MFA) device. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* serialNumber String <p>The unique identifier for the IAM virtual MFA device whose tags you want to see. For virtual MFA devices, the serial number is the same as the ARN.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListMFADeviceTagsResponse
* */
const gET_ListMFADeviceTags = ({ serialNumber, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serialNumber,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request for this operation.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the user whose MFA devices you want to list.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListMFADevicesResponse
* */
const gET_ListMFADevices = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the tags that are attached to the specified OpenID Connect (OIDC)-compatible identity provider. The returned list of tags is sorted by tag key. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>.</p> <p>For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p>
*
* openIDConnectProviderArn String <p>The ARN of the OpenID Connect (OIDC) identity provider whose tags you want to see.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListOpenIDConnectProviderTagsResponse
* */
const gET_ListOpenIDConnectProviderTags = ({ openIDConnectProviderArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        openIDConnectProviderArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the Amazon Web Services account.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for an OIDC provider, see <a>GetOpenIDConnectProvider</a>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns ListOpenIDConnectProvidersResponse
* */
const gET_ListOpenIDConnectProviders = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all the managed policies that are available in your Amazon Web Services account, including your own customer-defined managed policies and all Amazon Web Services managed policies.</p> <p>You can filter the list of policies that is returned using the optional <code>OnlyAttached</code>, <code>Scope</code>, and <code>PathPrefix</code> parameters. For example, to list only the customer managed policies in your Amazon Web Services account, set <code>Scope</code> to <code>Local</code>. To list only Amazon Web Services managed policies, set <code>Scope</code> to <code>AWS</code>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>For more information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a customer manged policy, see <a>GetPolicy</a>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* scope String <p>The scope to use for filtering the results.</p> <p>To list only Amazon Web Services managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer managed policies in your Amazon Web Services account, set <code>Scope</code> to <code>Local</code>.</p> <p>This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are returned.</p> (optional)
* onlyAttached Boolean <p>A flag to filter the results to only the attached policies.</p> <p>When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that are attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or when the parameter is not included, all policies are returned.</p> (optional)
* pathPrefix String The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies. This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters. (optional)
* policyUsageFilter String <p>The policy usage method to use for filtering the results.</p> <p>To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>. To list only the policies used to set permissions boundaries, set the value to <code>PermissionsBoundary</code>.</p> <p>This parameter is optional. If it is not included, all policies are returned. </p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListPoliciesResponse
* */
const gET_ListPolicies = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, scope, onlyAttached, pathPrefix, policyUsageFilter, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        scope,
        onlyAttached,
        pathPrefix,
        policyUsageFilter,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified service.</p> <note> <p>This operation does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>The list of policies returned by the operation depends on the ARN of the identity that you provide.</p> <ul> <li> <p> <b>User</b> – The list of policies includes the managed and inline policies that are attached to the user directly. The list also includes any additional managed and inline policies that are attached to the group to which the user belongs. </p> </li> <li> <p> <b>Group</b> – The list of policies includes only the managed and inline policies that are attached to the group directly. Policies that are attached to the group’s user are not included.</p> </li> <li> <p> <b>Role</b> – The list of policies includes only the managed and inline policies that are attached to the role.</p> </li> </ul> <p>For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information about these policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed policy is currently used to set the permissions boundary for a user or role, use the <a>GetUser</a> or <a>GetRole</a> operations.</p>
*
* arn String The ARN of the IAM identity (user, group, or role) whose policies you want to list.
* serviceNamespaces List <p>The service namespace for the Amazon Web Services services whose policies you want to list.</p> <p>To learn the service namespace for a service, see <a href=\"https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html\">Actions, resources, and condition keys for Amazon Web Services services</a> in the <i>IAM User Guide</i>. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces\">Amazon Web Services service namespaces</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* returns ListPoliciesGrantingServiceAccessResponse
* */
const gET_ListPoliciesGrantingServiceAccess = ({ arn, serviceNamespaces, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        arn,
        serviceNamespaces,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified IAM customer managed policy. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* policyArn String <p>The ARN of the IAM customer managed policy whose tags you want to see.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListPolicyTagsResponse
* */
const gET_ListPolicyTags = ({ policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version.</p> <p>For more information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy for which you want the versions.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListPolicyVersionsResponse
* */
const gET_ListPolicyVersions = ({ policyArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the names of the inline policies that are embedded in the specified IAM role.</p> <p>An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use <a>ListAttachedRolePolicies</a>. For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.</p>
*
* roleName String <p>The name of the role to list policies for.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListRolePoliciesResponse
* */
const gET_ListRolePolicies = ({ roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* roleName String <p>The name of the IAM role for which you want to see the list of tags.</p> <p>This parameter accepts (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListRoleTagsResponse
* */
const gET_ListRoleTags = ({ roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. This operation does not return the following attributes, even though they are an attribute of the returned object:</p> <ul> <li> <p>PermissionsBoundary</p> </li> <li> <p>RoleLastUsed</p> </li> <li> <p>Tags</p> </li> </ul> <p>To view all of the information for a role, see <a>GetRole</a>.</p> </note> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* pathPrefix String <p> The path prefix for filtering the results. For example, the prefix <code>/application_abc/component_xyz/</code> gets all roles whose path starts with <code>/application_abc/component_xyz/</code>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/), listing all roles. This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListRolesResponse
* */
const gET_ListRoles = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, pathPrefix, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        pathPrefix,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the tags that are attached to the specified Security Assertion Markup Language (SAML) identity provider. The returned list of tags is sorted by tag key. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation</a>.</p> <p>For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p>
*
* sAMLProviderArn String <p>The ARN of the Security Assertion Markup Language (SAML) identity provider whose tags you want to see.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListSAMLProviderTagsResponse
* */
const gET_ListSAMLProviderTags = ({ sAMLProviderArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sAMLProviderArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the SAML provider resource objects defined in IAM in the account. IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a SAML provider, see <a>GetSAMLProvider</a>.</p> <important> <p> This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns ListSAMLProvidersResponse
* */
const gET_ListSAMLProviders = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Returns information about the SSH public keys associated with the specified IAM user. If none exists, the operation returns an empty list.</p> <p>The SSH public keys returned by this operation are used only for authenticating the IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p> <p>Although each user is limited to a small number of keys, you can still paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the IAM user to list SSH public keys for. If none is specified, the <code>UserName</code> field is determined implicitly based on the Amazon Web Services access key used to sign the request.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListSSHPublicKeysResponse
* */
const gET_ListSSHPublicKeys = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the tags that are attached to the specified IAM server certificate. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don't use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>.</p> </note>
*
* serverCertificateName String <p>The name of the IAM server certificate whose tags you want to see.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListServerCertificateTagsResponse
* */
const gET_ListServerCertificateTags = ({ serverCertificateName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverCertificateName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.</p> <p> You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a servercertificate, see <a>GetServerCertificate</a>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* pathPrefix String <p> The path prefix for filtering the results. For example: <code>/company/servercerts</code> would get all server certificates for which the path starts with <code>/company/servercerts</code>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/), listing all server certificates. This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListServerCertificatesResponse
* */
const gET_ListServerCertificates = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, pathPrefix, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        pathPrefix,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns information about the service-specific credentials associated with the specified IAM user. If none exists, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an Amazon Web Services service, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-gc.html\">Set up service-specific credentials</a> in the CodeCommit User Guide.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the user whose service-specific credentials you want information about. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* serviceName String Filters the returned results to only those for the specified Amazon Web Services service. If not specified, then Amazon Web Services returns service-specific credentials for all services. (optional)
* returns ListServiceSpecificCredentialsResponse
* */
const gET_ListServiceSpecificCredentials = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName, serviceName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
        serviceName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Returns information about the signing certificates associated with the specified IAM user. If none exists, the operation returns an empty list.</p> <p>Although each user is limited to a small number of signing certificates, you can still paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request for this operation. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the IAM user whose signing certificates you want to examine.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListSigningCertificatesResponse
* */
const gET_ListSigningCertificates = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the names of the inline policies embedded in the specified IAM user.</p> <p>An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use <a>ListAttachedUserPolicies</a>. For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.</p>
*
* userName String <p>The name of the user to list policies for.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListUserPoliciesResponse
* */
const gET_ListUserPolicies = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified IAM user. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* userName String <p>The name of the IAM user whose tags you want to see.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListUserTagsResponse
* */
const gET_ListUserTags = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the Amazon Web Services account. If there are none, the operation returns an empty list.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. This operation does not return the following attributes, even though they are an attribute of the returned object:</p> <ul> <li> <p>PermissionsBoundary</p> </li> <li> <p>Tags</p> </li> </ul> <p>To view all of the information for a user, see <a>GetUser</a>.</p> </note> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* pathPrefix String <p> The path prefix for filtering the results. For example: <code>/division_abc/subdivision_xyz/</code>, which would get all user names whose path starts with <code>/division_abc/subdivision_xyz/</code>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/), listing all user names. This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListUsersResponse
* */
const gET_ListUsers = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, pathPrefix, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        pathPrefix,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the virtual MFA devices defined in the Amazon Web Services account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be <code>Assigned</code>, <code>Unassigned</code>, or <code>Any</code>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view tag information for a virtual MFA device, see <a>ListMFADeviceTags</a>.</p> </note> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* assignmentStatus String  The status (<code>Unassigned</code> or <code>Assigned</code>) of the devices to list. If you do not specify an <code>AssignmentStatus</code>, the operation defaults to <code>Any</code>, which lists both assigned and unassigned virtual MFA devices., (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* returns ListVirtualMFADevicesResponse
* */
const gET_ListVirtualMFADevices = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, assignmentStatus, marker, maxItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        assignmentStatus,
        marker,
        maxItems,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates an inline policy document that is embedded in the specified IAM group.</p> <p>A user can also have managed policies attached to it. To attach a managed policy to a group, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachGroupPolicy.html\"> <code>AttachGroupPolicy</code> </a>. To create a new managed policy, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\"> <code>CreatePolicy</code> </a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>For information about the maximum number of inline policies that you can embed in a group, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <note> <p>Because policy documents can be large, you should use POST rather than GET when calling <code>PutGroupPolicy</code>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\">Making query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* groupName String <p>The name of the group to associate the policy with.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-.</p>
* policyName String <p>The name of the policy document.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyDocument String <p>The policy document.</p> <p>You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_PutGroupPolicy = ({ groupName, policyName, policyDocument, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        policyName,
        policyDocument,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an Amazon Web Services managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role.</p> <p>You cannot set the boundary for a service-linked role.</p> <important> <p>Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html\">IAM JSON policy evaluation logic</a> in the IAM User Guide. </p> </important>
*
* roleName String The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
* permissionsBoundary String <p>The ARN of the managed policy that is used to set the permissions boundary for the role.</p> <p>A permissions boundary policy defines the maximum permissions that identity-based policies can grant to an entity, but does not grant permissions. Permissions boundaries do not define the maximum permissions that a resource-based policy can grant to an entity. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\">Permissions boundaries for IAM entities</a> in the <i>IAM User Guide</i>.</p> <p>For more information about policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types\">Policy types </a> in the <i>IAM User Guide</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_PutRolePermissionsBoundary = ({ roleName, permissionsBoundary, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        permissionsBoundary,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates an inline policy document that is embedded in the specified IAM role.</p> <p>When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html\"> <code>CreateRole</code> </a>. You can update a role's trust policy using <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html\"> <code>UpdateAssumeRolePolicy</code> </a>. For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html\">IAM roles</a> in the <i>IAM User Guide</i>.</p> <p>A role can also have a managed policy attached to it. To attach a managed policy to a role, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachRolePolicy.html\"> <code>AttachRolePolicy</code> </a>. To create a new managed policy, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\"> <code>CreatePolicy</code> </a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>For information about the maximum number of inline policies that you can embed with a role, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <note> <p>Because policy documents can be large, you should use POST rather than GET when calling <code>PutRolePolicy</code>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\">Making query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* roleName String <p>The name of the role to associate the policy with.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyName String <p>The name of the policy document.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyDocument String <p>The policy document.</p> <p>You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_PutRolePolicy = ({ roleName, policyName, policyDocument, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        policyName,
        policyDocument,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an Amazon Web Services managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.</p> <important> <p>Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html\">IAM JSON policy evaluation logic</a> in the IAM User Guide. </p> </important>
*
* userName String The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
* permissionsBoundary String <p>The ARN of the managed policy that is used to set the permissions boundary for the user.</p> <p>A permissions boundary policy defines the maximum permissions that identity-based policies can grant to an entity, but does not grant permissions. Permissions boundaries do not define the maximum permissions that a resource-based policy can grant to an entity. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\">Permissions boundaries for IAM entities</a> in the <i>IAM User Guide</i>.</p> <p>For more information about policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types\">Policy types </a> in the <i>IAM User Guide</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_PutUserPermissionsBoundary = ({ userName, permissionsBoundary, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        permissionsBoundary,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates an inline policy document that is embedded in the specified IAM user.</p> <p>An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachUserPolicy.html\"> <code>AttachUserPolicy</code> </a>. To create a new managed policy, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\"> <code>CreatePolicy</code> </a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>For information about the maximum number of inline policies that you can embed in a user, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <note> <p>Because policy documents can be large, you should use POST rather than GET when calling <code>PutUserPolicy</code>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\">Making query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* userName String <p>The name of the user to associate the policy with.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyName String <p>The name of the policy document.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyDocument String <p>The policy document.</p> <p>You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_PutUserPolicy = ({ userName, policyName, policyDocument, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        policyName,
        policyDocument,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object.</p> <p>This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.</p>
*
* openIDConnectProviderArn String <p>The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* clientID String The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information about client IDs, see <a>CreateOpenIDConnectProvider</a>.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_RemoveClientIDFromOpenIDConnectProvider = ({ openIDConnectProviderArn, clientID, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        openIDConnectProviderArn,
        clientID,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified IAM role from the specified EC2 instance profile.</p> <important> <p>Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.</p> </important> <p> For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>. For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p>
*
* instanceProfileName String <p>The name of the instance profile to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* roleName String <p>The name of the role to remove.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_RemoveRoleFromInstanceProfile = ({ instanceProfileName, roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        instanceProfileName,
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified user from the specified group.
*
* groupName String <p>The name of the group to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* userName String <p>The name of the user to remove.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_RemoveUserFromGroup = ({ groupName, userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Resets the password for a service-specific credential. The new password is Amazon Web Services generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
*
* serviceSpecificCredentialId String <p>The unique identifier of the service-specific credential.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the IAM user associated with the service-specific credential. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* returns ResetServiceSpecificCredentialResponse
* */
const gET_ResetServiceSpecificCredential = ({ serviceSpecificCredentialId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serviceSpecificCredentialId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Synchronizes the specified MFA device with its IAM resource object on the Amazon Web Services servers.</p> <p>For more information about creating and working with virtual MFA devices, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\">Using a virtual MFA device</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name of the user whose MFA device you want to resynchronize.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* serialNumber String <p>Serial number that uniquely identifies the MFA device.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* authenticationCode1 String <p>An authentication code emitted by the device.</p> <p>The format for this parameter is a sequence of six digits.</p>
* authenticationCode2 String <p>A subsequent authentication code emitted by the device.</p> <p>The format for this parameter is a sequence of six digits.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_ResyncMFADevice = ({ userName, serialNumber, authenticationCode1, authenticationCode2, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        serialNumber,
        authenticationCode1,
        authenticationCode2,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Sets the specified version of the specified policy as the policy's default (operative) version.</p> <p>This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use <a>ListEntitiesForPolicy</a>.</p> <p>For information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* policyArn String <p>The Amazon Resource Name (ARN) of the IAM policy whose default version you want to set.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* versionId String <p>The version of the policy to set as the default (operative) version.</p> <p>For more information about managed policy versions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_SetDefaultPolicyVersion = ({ policyArn, versionId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        versionId,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Sets the specified version of the global endpoint token as the token version used for the Amazon Web Services account.</p> <p>By default, Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at <code>https://sts.amazonaws.com</code>. Amazon Web Services recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/sts.html\">Security Token Service endpoints and quotas</a> in the <i>Amazon Web Services General Reference</i>.</p> <p>If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\">Activating and deactivating STS in an Amazon Web Services Region</a> in the <i>IAM User Guide</i>.</p> <p>To view the current session token version, see the <code>GlobalEndpointTokenVersion</code> entry in the response of the <a>GetAccountSummary</a> operation.</p>
*
* globalEndpointTokenVersion String <p>The version of the global endpoint token. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens.</p> <p>For information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\">Activating and deactivating STS in an Amazon Web Services Region</a> in the <i>IAM User Guide</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_SetSecurityTokenServicePreferences = ({ globalEndpointTokenVersion, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        globalEndpointTokenVersion,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and Amazon Web Services resources to determine the policies' effective permissions. The policies are provided as strings.</p> <p>The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. You can simulate resources that don't exist in your account.</p> <p>If you want to simulate existing policies that are attached to an IAM user, group, or role, use <a>SimulatePrincipalPolicy</a> instead.</p> <p>Context keys are variables that are maintained by Amazon Web Services and its services and which provide details about the context of an API query request. You can use the <code>Condition</code> element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use <a>GetContextKeysForCustomPolicy</a>.</p> <p>If the output is long, you can use <code>MaxItems</code> and <code>Marker</code> parameters to paginate the results.</p> <note> <p>The IAM policy simulator evaluates statements in the identity-based policy and the inputs that you provide during simulation. The policy simulator results can differ from your live Amazon Web Services environment. We recommend that you check your policies against your live Amazon Web Services environment after testing using the policy simulator to confirm that you have the desired results. For more information about using the policy simulator, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html\">Testing IAM policies with the IAM policy simulator </a>in the <i>IAM User Guide</i>.</p> </note>
*
* policyInputList List <p>A list of policy documents to include in the simulation. Each document is specified as a string containing the complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this parameter. Any resource-based policy must be submitted with the <code>ResourcePolicy</code> parameter. The policies cannot be \"scope-down\" policies, such as you could include in a call to <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html\">GetFederationToken</a> or one of the <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html\">AssumeRole</a> API operations. In other words, do not use policies designed to restrict what a user can do while using the temporary credentials.</p> <p>The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\">IAM and STS character quotas</a>.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* actionNames List A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>. This operation does not support using wildcards (*) in an action name.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* permissionsBoundaryPolicyInputList List <p>The IAM permissions boundary policy to simulate. The permissions boundary sets the maximum permissions that an IAM entity can have. You can input only one permissions boundary when you pass a policy to this operation. For more information about permissions boundaries, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\">Permissions boundaries for IAM entities</a> in the <i>IAM User Guide</i>. The policy input is specified as a string that contains the complete, valid JSON text of a permissions boundary policy.</p> <p>The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\">IAM and STS character quotas</a>.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul> (optional)
* resourceArns List <p>A list of ARNs of Amazon Web Services resources to include in the simulation. If this parameter is not provided, then the value defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is evaluated for each resource in this list. The simulation determines the access result (allowed or denied) of each combination and reports it in the response. You can simulate resources that don't exist in your account.</p> <p>The simulation does not automatically retrieve policies for the specified resources. If you want to include a resource policy in the simulation, then you must include the policy as a string in the <code>ResourcePolicy</code> parameter.</p> <p>If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included in the simulation or you receive an invalid input error.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p> <note> <p>Simulation of resource-based policies isn't supported for IAM roles.</p> </note> (optional)
* resourcePolicy String <p>A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is treated as if it had this policy attached. You can include only one resource-based policy in a simulation.</p> <p>The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\">IAM and STS character quotas</a>.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul> <note> <p>Simulation of resource-based policies isn't supported for IAM roles.</p> </note> (optional)
* resourceOwner String <p>An ARN representing the Amazon Web Services account ID that specifies the owner of any simulated resource that does not identify its owner in the resource ARN. Examples of resource ARNs include an S3 bucket or object. If <code>ResourceOwner</code> is specified, it is also used as the account owner of any <code>ResourcePolicy</code> included in the simulation. If the <code>ResourceOwner</code> parameter is not specified, then the owner of the resources and the resource policy defaults to the account of the identity provided in <code>CallerArn</code>. This parameter is required only if you specify a resource-based policy and account that owns the resource is different from the account that owns the simulated calling user <code>CallerArn</code>.</p> <p>The ARN for an account uses the following syntax: <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For example, to represent the account with the 112233445566 ID, use the following ARN: <code>arn:aws:iam::112233445566-ID:root</code>. </p> (optional)
* callerArn String <p>The ARN of the IAM user that you want to use as the simulated caller of the API operations. <code>CallerArn</code> is required if you include a <code>ResourcePolicy</code> so that the policy's <code>Principal</code> element has a value to use in evaluating the policy.</p> <p>You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a service principal.</p> (optional)
* contextEntries List A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in one of the simulated IAM permissions policies, the corresponding value is supplied. (optional)
* resourceHandlingOption String <p>Specifies the type of simulation to run. Different API operations that support resource-based policies require different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does not match one of the following scenarios, then you can omit this parameter. The following list shows each of the supported scenario values and the resources that you must define to run the simulation.</p> <p>Each of the EC2 scenarios requires that you specify instance, image, and security group resources. If your scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes VPC, then you must supply the network interface resource. If it includes an IP subnet, then you must specify the subnet resource. For more information on the EC2 scenario options, see <a href=\"https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html\">Supported platforms</a> in the <i>Amazon EC2 User Guide</i>.</p> <ul> <li> <p> <b>EC2-VPC-InstanceStore</b> </p> <p>instance, image, security group, network interface</p> </li> <li> <p> <b>EC2-VPC-InstanceStore-Subnet</b> </p> <p>instance, image, security group, network interface, subnet</p> </li> <li> <p> <b>EC2-VPC-EBS</b> </p> <p>instance, image, security group, network interface, volume</p> </li> <li> <p> <b>EC2-VPC-EBS-Subnet</b> </p> <p>instance, image, security group, network interface, subnet, volume</p> </li> </ul> (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* returns SimulatePolicyResponse
* */
const gET_SimulateCustomPolicy = ({ policyInputList, actionNames, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, permissionsBoundaryPolicyInputList, resourceArns, resourcePolicy, resourceOwner, callerArn, contextEntries, resourceHandlingOption, maxItems, marker }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyInputList,
        actionNames,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        permissionsBoundaryPolicyInputList,
        resourceArns,
        resourcePolicy,
        resourceOwner,
        callerArn,
        contextEntries,
        resourceHandlingOption,
        maxItems,
        marker,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and Amazon Web Services resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can simulate resources that don't exist in your account.</p> <p>You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use <a>SimulateCustomPolicy</a> instead.</p> <p>You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation for IAM users only.</p> <p>The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations.</p> <p> <b>Note:</b> This operation discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use <a>SimulateCustomPolicy</a> instead.</p> <p>Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. You can use the <code>Condition</code> element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use <a>GetContextKeysForPrincipalPolicy</a>.</p> <p>If the output is long, you can use the <code>MaxItems</code> and <code>Marker</code> parameters to paginate the results.</p> <note> <p>The IAM policy simulator evaluates statements in the identity-based policy and the inputs that you provide during simulation. The policy simulator results can differ from your live Amazon Web Services environment. We recommend that you check your policies against your live Amazon Web Services environment after testing using the policy simulator to confirm that you have the desired results. For more information about using the policy simulator, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html\">Testing IAM policies with the IAM policy simulator </a>in the <i>IAM User Guide</i>.</p> </note>
*
* policySourceArn String <p>The Amazon Resource Name (ARN) of a user, group, or role whose policies you want to include in the simulation. If you specify a user, group, or role, the simulation includes all policies that are associated with that entity. If you specify a user, the simulation also includes all policies that are attached to any groups the user belongs to.</p> <p>The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\">IAM and STS character quotas</a>.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* actionNames List A list of names of API operations to evaluate in the simulation. Each operation is evaluated for each resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* policyInputList List <p>An optional list of additional policy documents to include in the simulation. Each document is specified as a string containing the complete, valid JSON text of an IAM policy.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul> (optional)
* permissionsBoundaryPolicyInputList List <p>The IAM permissions boundary policy to simulate. The permissions boundary sets the maximum permissions that the entity can have. You can input only one permissions boundary when you pass a policy to this operation. An IAM entity can only have one permissions boundary in effect at a time. For example, if a permissions boundary is attached to an entity and you pass in a different permissions boundary policy using this parameter, then the new permissions boundary policy is used for the simulation. For more information about permissions boundaries, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\">Permissions boundaries for IAM entities</a> in the <i>IAM User Guide</i>. The policy input is specified as a string containing the complete, valid JSON text of a permissions boundary policy.</p> <p>The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\">IAM and STS character quotas</a>.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul> (optional)
* resourceArns List <p>A list of ARNs of Amazon Web Services resources to include in the simulation. If this parameter is not provided, then the value defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is evaluated for each resource in this list. The simulation determines the access result (allowed or denied) of each combination and reports it in the response. You can simulate resources that don't exist in your account.</p> <p>The simulation does not automatically retrieve policies for the specified resources. If you want to include a resource policy in the simulation, then you must include the policy as a string in the <code>ResourcePolicy</code> parameter.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p> <note> <p>Simulation of resource-based policies isn't supported for IAM roles.</p> </note> (optional)
* resourcePolicy String <p>A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is treated as if it had this policy attached. You can include only one resource-based policy in a simulation.</p> <p>The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length\">IAM and STS character quotas</a>.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul> <note> <p>Simulation of resource-based policies isn't supported for IAM roles.</p> </note> (optional)
* resourceOwner String An Amazon Web Services account ID that specifies the owner of any simulated resource that does not identify its owner in the resource ARN. Examples of resource ARNs include an S3 bucket or object. If <code>ResourceOwner</code> is specified, it is also used as the account owner of any <code>ResourcePolicy</code> included in the simulation. If the <code>ResourceOwner</code> parameter is not specified, then the owner of the resources and the resource policy defaults to the account of the identity provided in <code>CallerArn</code>. This parameter is required only if you specify a resource-based policy and account that owns the resource is different from the account that owns the simulated calling user <code>CallerArn</code>. (optional)
* callerArn String <p>The ARN of the IAM user that you want to specify as the simulated caller of the API operations. If you do not specify a <code>CallerArn</code>, it defaults to the ARN of the user that you specify in <code>PolicySourceArn</code>, if you specified a user. If you include both a <code>PolicySourceArn</code> (for example, <code>arn:aws:iam::123456789012:user/David</code>) and a <code>CallerArn</code> (for example, <code>arn:aws:iam::123456789012:user/Bob</code>), the result is that you simulate calling the API operations as Bob, as if Bob had David's policies.</p> <p>You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a service principal.</p> <p> <code>CallerArn</code> is required if you include a <code>ResourcePolicy</code> and the <code>PolicySourceArn</code> is not the ARN for an IAM user. This is required so that the resource-based policy's <code>Principal</code> element has a value to use in evaluating the policy.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p> (optional)
* contextEntries List A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in one of the simulated IAM permissions policies, the corresponding value is supplied. (optional)
* resourceHandlingOption String <p>Specifies the type of simulation to run. Different API operations that support resource-based policies require different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does not match one of the following scenarios, then you can omit this parameter. The following list shows each of the supported scenario values and the resources that you must define to run the simulation.</p> <p>Each of the EC2 scenarios requires that you specify instance, image, and security group resources. If your scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes VPC, then you must supply the network interface resource. If it includes an IP subnet, then you must specify the subnet resource. For more information on the EC2 scenario options, see <a href=\"https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html\">Supported platforms</a> in the <i>Amazon EC2 User Guide</i>.</p> <ul> <li> <p> <b>EC2-VPC-InstanceStore</b> </p> <p>instance, image, security group, network interface</p> </li> <li> <p> <b>EC2-VPC-InstanceStore-Subnet</b> </p> <p>instance, image, security group, network interface, subnet</p> </li> <li> <p> <b>EC2-VPC-EBS</b> </p> <p>instance, image, security group, network interface, volume</p> </li> <li> <p> <b>EC2-VPC-EBS-Subnet</b> </p> <p>instance, image, security group, network interface, subnet, volume</p> </li> </ul> (optional)
* maxItems Integer <p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p> (optional)
* marker String Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start. (optional)
* returns SimulatePolicyResponse
* */
const gET_SimulatePrincipalPolicy = ({ policySourceArn, actionNames, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, policyInputList, permissionsBoundaryPolicyInputList, resourceArns, resourcePolicy, resourceOwner, callerArn, contextEntries, resourceHandlingOption, maxItems, marker }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policySourceArn,
        actionNames,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        policyInputList,
        permissionsBoundaryPolicyInputList,
        resourceArns,
        resourcePolicy,
        resourceOwner,
        callerArn,
        contextEntries,
        resourceHandlingOption,
        maxItems,
        marker,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM instance profile. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>Each tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM instance profile that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* instanceProfileName String <p>The name of the IAM instance profile to which you want to add tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tags List The list of tags that you want to attach to the IAM instance profile. Each tag consists of a key name and an associated value.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_TagInstanceProfile = ({ instanceProfileName, tags, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        instanceProfileName,
        tags,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM virtual multi-factor authentication (MFA) device. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM virtual MFA device that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* serialNumber String <p>The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA devices, the serial number is the same as the ARN.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tags List The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name and an associated value.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_TagMFADevice = ({ serialNumber, tags, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serialNumber,
        tags,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an OpenID Connect (OIDC)-compatible identity provider. For more information about these providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an OIDC provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* openIDConnectProviderArn String <p>The ARN of the OIDC identity provider in IAM to which you want to add tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tags List The list of tags that you want to attach to the OIDC identity provider in IAM. Each tag consists of a key name and an associated value.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_TagOpenIDConnectProvider = ({ openIDConnectProviderArn, tags, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        openIDConnectProviderArn,
        tags,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM customer managed policy. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM customer managed policy that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* policyArn String <p>The ARN of the IAM customer managed policy to which you want to add tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tags List The list of tags that you want to attach to the IAM customer managed policy. Each tag consists of a key name and an associated value.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_TagPolicy = ({ policyArn, tags, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        tags,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p> <b>Cost allocation</b> - Use tags to help track which individuals and teams are using which Amazon Web Services resources.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note> <p>For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM identities</a> in the <i>IAM User Guide</i>.</p>
*
* roleName String <p>The name of the IAM role to which you want to add tags.</p> <p>This parameter accepts (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tags List The list of tags that you want to attach to the IAM role. Each tag consists of a key name and an associated value.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_TagRole = ({ roleName, tags, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        tags,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to a Security Assertion Markup Language (SAML) identity provider. For more information about these providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation </a>. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only a SAML identity provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* sAMLProviderArn String <p>The ARN of the SAML identity provider in IAM to which you want to add tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tags List The list of tags that you want to attach to the SAML identity provider in IAM. Each tag consists of a key name and an associated value.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_TagSAMLProvider = ({ sAMLProviderArn, tags, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sAMLProviderArn,
        tags,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM server certificate. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <note> <p>For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don't use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>.</p> </note> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only a server certificate that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p> <b>Cost allocation</b> - Use tags to help track which individuals and teams are using which Amazon Web Services resources.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* serverCertificateName String <p>The name of the IAM server certificate to which you want to add tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tags List The list of tags that you want to attach to the IAM server certificate. Each tag consists of a key name and an associated value.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_TagServerCertificate = ({ serverCertificateName, tags, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverCertificateName,
        tags,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p> <b>Cost allocation</b> - Use tags to help track which individuals and teams are using which Amazon Web Services resources.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note> <p>For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM identities</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name of the IAM user to which you want to add tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tags List The list of tags that you want to attach to the IAM user. Each tag consists of a key name and an associated value.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_TagUser = ({ userName, tags, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        tags,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the IAM instance profile. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* instanceProfileName String <p>The name of the IAM instance profile from which you want to remove tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tagKeys List A list of key names as a simple array of strings. The tags with matching keys are removed from the specified instance profile.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UntagInstanceProfile = ({ instanceProfileName, tagKeys, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        instanceProfileName,
        tagKeys,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the IAM virtual multi-factor authentication (MFA) device. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* serialNumber String <p>The unique identifier for the IAM virtual MFA device from which you want to remove tags. For virtual MFA devices, the serial number is the same as the ARN.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tagKeys List A list of key names as a simple array of strings. The tags with matching keys are removed from the specified instance profile.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UntagMFADevice = ({ serialNumber, tagKeys, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serialNumber,
        tagKeys,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the specified OpenID Connect (OIDC)-compatible identity provider in IAM. For more information about OIDC providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* openIDConnectProviderArn String <p>The ARN of the OIDC provider in IAM from which you want to remove tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tagKeys List A list of key names as a simple array of strings. The tags with matching keys are removed from the specified OIDC provider.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UntagOpenIDConnectProvider = ({ openIDConnectProviderArn, tagKeys, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        openIDConnectProviderArn,
        tagKeys,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the customer managed policy. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* policyArn String <p>The ARN of the IAM customer managed policy from which you want to remove tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tagKeys List A list of key names as a simple array of strings. The tags with matching keys are removed from the specified policy.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UntagPolicy = ({ policyArn, tagKeys, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        policyArn,
        tagKeys,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the role. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* roleName String <p>The name of the IAM role from which you want to remove tags.</p> <p>This parameter accepts (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tagKeys List A list of key names as a simple array of strings. The tags with matching keys are removed from the specified role.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UntagRole = ({ roleName, tagKeys, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        tagKeys,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the specified Security Assertion Markup Language (SAML) identity provider in IAM. For more information about these providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* sAMLProviderArn String <p>The ARN of the SAML identity provider in IAM from which you want to remove tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tagKeys List A list of key names as a simple array of strings. The tags with matching keys are removed from the specified SAML identity provider.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UntagSAMLProvider = ({ sAMLProviderArn, tagKeys, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sAMLProviderArn,
        tagKeys,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified tags from the IAM server certificate. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don't use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>.</p> </note>
*
* serverCertificateName String <p>The name of the IAM server certificate from which you want to remove tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tagKeys List A list of key names as a simple array of strings. The tags with matching keys are removed from the specified IAM server certificate.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UntagServerCertificate = ({ serverCertificateName, tagKeys, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverCertificateName,
        tagKeys,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the user. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* userName String <p>The name of the IAM user from which you want to remove tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* tagKeys List A list of key names as a simple array of strings. The tags with matching keys are removed from the specified user.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UntagUser = ({ userName, tagKeys, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        tagKeys,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow.</p> <p>If the <code>UserName</code> is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. If a temporary access key is used, then <code>UserName</code> is required. If a long-term key is assigned to the user, then <code>UserName</code> is not required. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p> <p>For information about rotating keys, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html\">Managing keys and certificates</a> in the <i>IAM User Guide</i>.</p>
*
* accessKeyId String <p>The access key ID of the secret access key you want to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* status String  The status you want to assign to the secret access key. <code>Active</code> means that the key can be used for programmatic calls to Amazon Web Services, while <code>Inactive</code> means that the key cannot be used.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the user whose key you want to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* no response value expected for this operation
* */
const gET_UpdateAccessKey = ({ accessKeyId, status, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accessKeyId,
        status,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the password policy settings for the Amazon Web Services account.</p> <note> <p>This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the <b>Request Parameters</b> section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.</p> </note> <p> For more information about using a password policy, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html\">Managing an IAM password policy</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* minimumPasswordLength Integer <p>The minimum number of characters allowed in an IAM user password.</p> <p>If you do not specify a value for this parameter, then the operation uses the default value of <code>6</code>.</p> (optional)
* requireSymbols Boolean <p>Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:</p> <p>! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '</p> <p>If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>. The result is that passwords do not require at least one symbol character.</p> (optional)
* requireNumbers Boolean <p>Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).</p> <p>If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>. The result is that passwords do not require at least one numeric character.</p> (optional)
* requireUppercaseCharacters Boolean <p>Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z).</p> <p>If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>. The result is that passwords do not require at least one uppercase character.</p> (optional)
* requireLowercaseCharacters Boolean <p>Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin alphabet (a to z).</p> <p>If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>. The result is that passwords do not require at least one lowercase character.</p> (optional)
* allowUsersToChangePassword Boolean <p> Allows all IAM users in your account to use the Amazon Web Services Management Console to change their own passwords. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_passwords_enable-user-change.html\">Permitting IAM users to change their own passwords</a> in the <i>IAM User Guide</i>.</p> <p>If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>. The result is that IAM users in the account do not automatically have permissions to change their own password.</p> (optional)
* maxPasswordAge Integer <p>The number of days that an IAM user password is valid.</p> <p>If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>. The result is that IAM user passwords never expire.</p> (optional)
* passwordReusePrevention Integer <p>Specifies the number of previous passwords that IAM users are prevented from reusing.</p> <p>If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>. The result is that IAM users are not prevented from reusing previous passwords.</p> (optional)
* hardExpiry Boolean <p> Prevents IAM users who are accessing the account via the Amazon Web Services Management Console from setting a new console password after their password has expired. The IAM user cannot access the console until an administrator resets the password.</p> <p>If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>. The result is that IAM users can change their passwords after they expire and continue to sign in as the user.</p> <note> <p> In the Amazon Web Services Management Console, the custom password policy option <b>Allow users to change their own password</b> gives IAM users permissions to <code>iam:ChangePassword</code> for only their user and to the <code>iam:GetAccountPasswordPolicy</code> action. This option does not attach a permissions policy to each user, rather the permissions are applied at the account-level for all users by IAM. IAM users with <code>iam:ChangePassword</code> permission and active access keys can reset their own expired console password using the CLI or API.</p> </note> (optional)
* no response value expected for this operation
* */
const gET_UpdateAccountPasswordPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, minimumPasswordLength, requireSymbols, requireNumbers, requireUppercaseCharacters, requireLowercaseCharacters, allowUsersToChangePassword, maxPasswordAge, passwordReusePrevention, hardExpiry }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        minimumPasswordLength,
        requireSymbols,
        requireNumbers,
        requireUppercaseCharacters,
        requireLowercaseCharacters,
        allowUsersToChangePassword,
        maxPasswordAge,
        passwordReusePrevention,
        hardExpiry,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the \"role trust policy\". For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html\">Using roles to delegate permissions and federate identities</a>.
*
* roleName String <p>The name of the role to update with the new policy.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* policyDocument String <p>The policy that grants an entity permission to assume the role.</p> <p>You must provide policies in JSON format in IAM. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UpdateAssumeRolePolicy = ({ roleName, policyDocument, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        policyDocument,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the name and/or the path of the specified IAM group.</p> <important> <p> You should understand the implications of changing a group's path or name. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html\">Renaming users and groups</a> in the <i>IAM User Guide</i>.</p> </important> <note> <p>The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named <code>Managers</code> to <code>MGRs</code>, the principal must have a policy that allows them to update both groups. If the principal has permission to update the <code>Managers</code> group, but not the <code>MGRs</code> group, then the update fails. For more information about permissions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\">Access management</a>. </p> </note>
*
* groupName String <p>Name of the IAM group to update. If you're changing the name of the group, this is the original name.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* newPath String <p>New path for the IAM group. Only include this if changing the group's path.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* newGroupName String <p>New name for the IAM group. Only include this if changing the group's name.</p> <p>IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \"MyResource\" and \"myresource\".</p> (optional)
* no response value expected for this operation
* */
const gET_UpdateGroup = ({ groupName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, newPath, newGroupName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        newPath,
        newGroupName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Changes the password for the specified IAM user. You can use the CLI, the Amazon Web Services API, or the <b>Users</b> page in the IAM console to change the password for any IAM user. Use <a>ChangePassword</a> to change your own password in the <b>My Security Credentials</b> page in the Amazon Web Services Management Console.</p> <p>For more information about modifying passwords, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\">Managing passwords</a> in the <i>IAM User Guide</i>.</p>
*
* userName String <p>The name of the user whose password you want to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* password String <p>The new password for the specified IAM user.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul> <p>However, the format can be further restricted by the account administrator by setting a password policy on the Amazon Web Services account. For more information, see <a>UpdateAccountPasswordPolicy</a>.</p> (optional)
* passwordResetRequired Boolean Allows this new password to be used only once by requiring the specified IAM user to set a new password on next sign-in. (optional)
* no response value expected for this operation
* */
const gET_UpdateLoginProfile = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, password, passwordResetRequired }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        password,
        passwordResetRequired,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints.</p> <p>The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.)</p> <p>Typically, you need to update a thumbprint only when the identity provider certificate changes, which occurs rarely. However, if the provider's certificate <i>does</i> change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.</p> <note> <p>Amazon Web Services secures communication with some OIDC identity providers (IdPs) through our library of trusted root certificate authorities (CAs) instead of using a certificate thumbprint to verify your IdP server certificate. These OIDC IdPs include Auth0, GitHub, Google, and those that use an Amazon S3 bucket to host a JSON Web Key Set (JWKS) endpoint. In these cases, your legacy thumbprint remains in your configuration, but is no longer used for validation.</p> </note> <note> <p>Trust for the OIDC provider is derived from the provider certificate and is validated by the thumbprint. Therefore, it is best to limit access to the <code>UpdateOpenIDConnectProviderThumbprint</code> operation to highly privileged users.</p> </note>
*
* openIDConnectProviderArn String <p>The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the thumbprint. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* thumbprintList List A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more information, see <a>CreateOpenIDConnectProvider</a>. 
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UpdateOpenIDConnectProviderThumbprint = ({ openIDConnectProviderArn, thumbprintList, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        openIDConnectProviderArn,
        thumbprintList,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Updates the description or maximum session duration setting of a role.
*
* roleName String The name of the role that you want to modify.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* description String The new description that you want to apply to the specified role. (optional)
* maxSessionDuration Integer <p>The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default value of one hour is applied. This setting can have a value from 1 hour to 12 hours.</p> <p>Anyone who assumes the role from the CLI or API can use the <code>DurationSeconds</code> API parameter or the <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code> setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter. If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console URL. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html\">Using IAM roles</a> in the <i>IAM User Guide</i>.</p> (optional)
* returns Object
* */
const gET_UpdateRole = ({ roleName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, description, maxSessionDuration }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        description,
        maxSessionDuration,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Use <a>UpdateRole</a> instead.</p> <p>Modifies only the description of a role. This operation performs the same function as the <code>Description</code> parameter in the <code>UpdateRole</code> operation.</p>
*
* roleName String The name of the role that you want to modify.
* description String The new description that you want to apply to the specified role.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns UpdateRoleDescriptionResponse
* */
const gET_UpdateRoleDescription = ({ roleName, description, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleName,
        description,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the metadata document for an existing SAML provider resource object.</p> <note> <p>This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note>
*
* sAMLMetadataDocument String An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization's IdP.
* sAMLProviderArn String <p>The Amazon Resource Name (ARN) of the SAML provider to update.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns UpdateSAMLProviderResponse
* */
const gET_UpdateSAMLProvider = ({ sAMLMetadataDocument, sAMLProviderArn, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sAMLMetadataDocument,
        sAMLProviderArn,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow.</p> <p>The SSH public key affected by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p>
*
* userName String <p>The name of the IAM user associated with the SSH public key.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* sSHPublicKeyId String <p>The unique identifier for the SSH public key.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* status String The status to assign to the SSH public key. <code>Active</code> means that the key can be used for authentication with an CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const gET_UpdateSSHPublicKey = ({ userName, sSHPublicKeyId, status, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        sSHPublicKeyId,
        status,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the name and/or the path of the specified server certificate stored in IAM.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <important> <p>You should understand the implications of changing a server certificate's path or name. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts\">Renaming a server certificate</a> in the <i>IAM User Guide</i>.</p> </important> <note> <p>The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named <code>ProductionCert</code> to <code>ProdCert</code>, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the <code>ProductionCert</code> group, but not the <code>ProdCert</code> certificate, then the update fails. For more information about permissions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\">Access management</a> in the <i>IAM User Guide</i>.</p> </note>
*
* serverCertificateName String <p>The name of the server certificate that you want to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* newPath String <p>The new path for the server certificate. Include this only if you are updating the server certificate's path.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* newServerCertificateName String <p>The new name for the server certificate. Include this only if you are updating the server certificate's name. The name of the certificate cannot contain any spaces.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* no response value expected for this operation
* */
const gET_UpdateServerCertificate = ({ serverCertificateName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, newPath, newServerCertificateName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverCertificateName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        newPath,
        newServerCertificateName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Sets the status of a service-specific credential to <code>Active</code> or <code>Inactive</code>. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
*
* serviceSpecificCredentialId String <p>The unique identifier of the service-specific credential.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* status String The status to be assigned to the service-specific credential.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the IAM user associated with the service-specific credential. If you do not specify this value, then the operation assumes the user whose credentials are used to call the operation.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* no response value expected for this operation
* */
const gET_UpdateServiceSpecificCredential = ({ serviceSpecificCredentialId, status, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serviceSpecificCredentialId,
        status,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow.</p> <p>If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p>
*
* certificateId String <p>The ID of the signing certificate you want to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters that can consist of any upper or lowercased letter or digit.</p>
* status String  The status you want to assign to the certificate. <code>Active</code> means that the certificate can be used for programmatic calls to Amazon Web Services <code>Inactive</code> means that the certificate cannot be used.
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the IAM user the signing certificate belongs to.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* no response value expected for this operation
* */
const gET_UpdateSigningCertificate = ({ certificateId, status, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        certificateId,
        status,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the name and/or the path of the specified IAM user.</p> <important> <p> You should understand the implications of changing an IAM user's path or name. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming\">Renaming an IAM user</a> and <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html\">Renaming an IAM group</a> in the <i>IAM User Guide</i>.</p> </important> <note> <p> To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html\">Permissions and policies</a>. </p> </note>
*
* userName String <p>Name of the user to update. If you're changing the name of the user, this is the original user name.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* newPath String <p>New path for the IAM user. Include this parameter only if you're changing the user's path.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> (optional)
* newUserName String <p>New name for the user. Include this parameter only if you're changing the user's name.</p> <p>IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both \"MyResource\" and \"myresource\".</p> (optional)
* no response value expected for this operation
* */
const gET_UpdateUser = ({ userName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, newPath, newUserName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        newPath,
        newUserName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Uploads an SSH public key and associates it with the specified IAM user.</p> <p>The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p>
*
* userName String <p>The name of the IAM user to associate the SSH public key with.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* sSHPublicKeyBody String <p>The SSH public key. The public key must be encoded in ssh-rsa format or PEM format. The minimum bit-length of the public key is 2048 bits. For example, you can generate a 2048-bit key, and the resulting PEM file is 1679 bytes long.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns UploadSSHPublicKeyResponse
* */
const gET_UploadSSHPublicKey = ({ userName, sSHPublicKeyBody, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userName,
        sSHPublicKeyBody,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Uploads a server certificate entity for the Amazon Web Services account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded.</p> <p>We recommend that you use <a href=\"https://docs.aws.amazon.com/acm/\">Certificate Manager</a> to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to Amazon Web Services resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the <a href=\"https://docs.aws.amazon.com/acm/latest/userguide/\">Certificate Manager User Guide</a>.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <p>For information about the number of server certificates you can upload, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <note> <p>Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling <code>UploadServerCertificate</code>. For information about setting up signatures and authorization through the API, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html\">Signing Amazon Web Services API requests</a> in the <i>Amazon Web Services General Reference</i>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html\">Calling the API by making HTTP query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* serverCertificateName String <p>The name for the server certificate. Do not include the path in this value. The name of the certificate cannot contain any spaces.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>
* certificateBody String <p>The contents of the public key certificate in PEM-encoded format.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* privateKey String <p>The contents of the private key in PEM-encoded format.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* path String <p>The path for the server certificate. For more information about paths, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html\">IAM identifiers</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p> <note> <p> If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you must specify a path using the <code>path</code> parameter. The path must begin with <code>/cloudfront</code> and must include a trailing slash (for example, <code>/cloudfront/test/</code>).</p> </note> (optional)
* certificateChain String <p>The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key certificates of the chain.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul> (optional)
* tags List <p>A list of tags that you want to attach to the new IAM server certificate resource. Each tag consists of a key name and an associated value. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.</p> </note> (optional)
* returns UploadServerCertificateResponse
* */
const gET_UploadServerCertificate = ({ serverCertificateName, certificateBody, privateKey, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, path, certificateChain, tags }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverCertificateName,
        certificateBody,
        privateKey,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        path,
        certificateChain,
        tags,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Uploads an X.509 signing certificate and associates it with the specified IAM user. Some Amazon Web Services services require you to use certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is <code>Active</code>.</p> <p>For information about when you would use an X.509 signing certificate, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Managing server certificates in IAM</a> in the <i>IAM User Guide</i>.</p> <p>If the <code>UserName</code> is not specified, the IAM user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p> <note> <p>Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling <code>UploadSigningCertificate</code>. For information about setting up signatures and authorization through the API, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html\">Signing Amazon Web Services API requests</a> in the <i>Amazon Web Services General Reference</i>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\">Making query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* certificateBody String <p>The contents of the signing certificate.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* userName String <p>The name of the user the signing certificate is for.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p> (optional)
* returns UploadSigningCertificateResponse
* */
const gET_UploadSigningCertificate = ({ certificateBody, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, userName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        certificateBody,
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        userName,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource.</p> <p>This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* addClientIDToOpenIDConnectProviderRequest AddClientIDToOpenIDConnectProviderRequest  (optional)
* no response value expected for this operation
* */
const pOST_AddClientIDToOpenIDConnectProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, addClientIDToOpenIDConnectProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        addClientIDToOpenIDConnectProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this quota cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of Amazon Web Services because of <a href=\"https://en.wikipedia.org/wiki/Eventual_consistency\">eventual consistency</a>. To force the change, you must <a href=\"https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateIamInstanceProfile.html\">disassociate the instance profile</a> and then <a href=\"https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateIamInstanceProfile.html\">associate the instance profile</a>, or you can stop your instance and then restart it.</p> <note> <p>The caller of this operation must be granted the <code>PassRole</code> permission on the IAM role by a permissions policy.</p> </note> <p> For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>. For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* addRoleToInstanceProfileRequest AddRoleToInstanceProfileRequest  (optional)
* no response value expected for this operation
* */
const pOST_AddRoleToInstanceProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, addRoleToInstanceProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        addRoleToInstanceProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Adds the specified user to the specified group.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* addUserToGroupRequest AddUserToGroupRequest  (optional)
* no response value expected for this operation
* */
const pOST_AddUserToGroup = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, addUserToGroupRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        addUserToGroupRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Attaches the specified managed policy to the specified IAM group.</p> <p>You use this operation to attach a managed policy to a group. To embed an inline policy in a group, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutGroupPolicy.html\"> <code>PutGroupPolicy</code> </a>.</p> <p>As a best practice, you can validate your IAM policies. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\">Validating IAM policies</a> in the <i>IAM User Guide</i>.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* attachGroupPolicyRequest AttachGroupPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_AttachGroupPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, attachGroupPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        attachGroupPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.</p> <note> <p>You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html\"> <code>CreateRole</code> </a>. You can update a role's trust policy using <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html\"> <code>UpdateAssumerolePolicy</code> </a>.</p> </note> <p>Use this operation to attach a <i>managed</i> policy to a role. To embed an inline policy in a role, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutRolePolicy.html\"> <code>PutRolePolicy</code> </a>. For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>As a best practice, you can validate your IAM policies. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\">Validating IAM policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* attachRolePolicyRequest AttachRolePolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_AttachRolePolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, attachRolePolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        attachRolePolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Attaches the specified managed policy to the specified user.</p> <p>You use this operation to attach a <i>managed</i> policy to a user. To embed an inline policy in a user, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_PutUserPolicy.html\"> <code>PutUserPolicy</code> </a>.</p> <p>As a best practice, you can validate your IAM policies. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\">Validating IAM policies</a> in the <i>IAM User Guide</i>.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* attachUserPolicyRequest AttachUserPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_AttachUserPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, attachUserPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        attachUserPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Changes the password of the IAM user who is calling this operation. This operation can be performed using the CLI, the Amazon Web Services API, or the <b>My Security Credentials</b> page in the Amazon Web Services Management Console. The Amazon Web Services account root user password is not affected by this operation.</p> <p>Use <a>UpdateLoginProfile</a> to use the CLI, the Amazon Web Services API, or the <b>Users</b> page in the IAM console to change the password for any IAM user. For more information about modifying passwords, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\">Managing passwords</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* changePasswordRequest ChangePasswordRequest  (optional)
* no response value expected for this operation
* */
const pOST_ChangePassword = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, changePasswordRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        changePasswordRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p> Creates a new Amazon Web Services secret access key and corresponding Amazon Web Services access key ID for the specified user. The default status for new keys is <code>Active</code>.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials. This is true even if the Amazon Web Services account has no associated users.</p> <p> For information about quotas on the number of keys you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <important> <p>To ensure the security of your Amazon Web Services account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys.</p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createAccessKeyRequest CreateAccessKeyRequest  (optional)
* returns CreateAccessKeyResponse
* */
const pOST_CreateAccessKey = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createAccessKeyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createAccessKeyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates an alias for your Amazon Web Services account. For information about using an Amazon Web Services account alias, see <a href=\"https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\">Creating, deleting, and listing an Amazon Web Services account alias</a> in the <i>Amazon Web Services Sign-In User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createAccountAliasRequest CreateAccountAliasRequest  (optional)
* no response value expected for this operation
* */
const pOST_CreateAccountAlias = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createAccountAliasRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createAccountAliasRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new group.</p> <p> For information about the number of groups you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createGroupRequest CreateGroupRequest  (optional)
* returns CreateGroupResponse
* */
const pOST_CreateGroup = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createGroupRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createGroupRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p> Creates a new instance profile. For information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html\">Using roles for applications on Amazon EC2</a> in the <i>IAM User Guide</i>, and <a href=\"https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/iam-roles-for-amazon-ec2.html#ec2-instance-profile\">Instance profiles</a> in the <i>Amazon EC2 User Guide</i>.</p> <p> For information about the number of instance profiles you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM object quotas</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createInstanceProfileRequest CreateInstanceProfileRequest  (optional)
* returns CreateInstanceProfileResponse
* */
const pOST_CreateInstanceProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createInstanceProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createInstanceProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a password for the specified IAM user. A password allows an IAM user to access Amazon Web Services services through the Amazon Web Services Management Console.</p> <p>You can use the CLI, the Amazon Web Services API, or the <b>Users</b> page in the IAM console to create a password for any IAM user. Use <a>ChangePassword</a> to update your own existing password in the <b>My Security Credentials</b> page in the Amazon Web Services Management Console.</p> <p>For more information about managing passwords, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\">Managing passwords</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createLoginProfileRequest CreateLoginProfileRequest  (optional)
* returns CreateLoginProfileResponse
* */
const pOST_CreateLoginProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createLoginProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createLoginProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates an IAM entity to describe an identity provider (IdP) that supports <a href=\"http://openid.net/connect/\">OpenID Connect (OIDC)</a>.</p> <p>The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between Amazon Web Services and the OIDC provider.</p> <p>If you are using an OIDC identity provider from Google, Facebook, or Amazon Cognito, you don't need to create a separate IAM identity provider. These OIDC identity providers are already built-in to Amazon Web Services and are available for your use. Instead, you can move directly to creating new roles using your identity provider. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_oidc.html\">Creating a role for web identity or OpenID connect federation</a> in the <i>IAM User Guide</i>.</p> <p>When you create the IAM OIDC provider, you specify the following:</p> <ul> <li> <p>The URL of the OIDC identity provider (IdP) to trust</p> </li> <li> <p>A list of client IDs (also known as audiences) that identify the application or applications allowed to authenticate using the OIDC provider</p> </li> <li> <p>A list of tags that are attached to the specified IAM OIDC provider</p> </li> <li> <p>A list of thumbprints of one or more server certificates that the IdP uses</p> </li> </ul> <p>You get all of this information from the OIDC IdP you want to use to access Amazon Web Services.</p> <note> <p>Amazon Web Services secures communication with some OIDC identity providers (IdPs) through our library of trusted root certificate authorities (CAs) instead of using a certificate thumbprint to verify your IdP server certificate. These OIDC IdPs include Auth0, GitHub, Google, and those that use an Amazon S3 bucket to host a JSON Web Key Set (JWKS) endpoint. In these cases, your legacy thumbprint remains in your configuration, but is no longer used for validation.</p> </note> <note> <p>The trust for the OIDC provider is derived from the IAM provider that this operation creates. Therefore, it is best to limit access to the <a>CreateOpenIDConnectProvider</a> operation to highly privileged users.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createOpenIDConnectProviderRequest CreateOpenIDConnectProviderRequest  (optional)
* returns CreateOpenIDConnectProviderResponse
* */
const pOST_CreateOpenIDConnectProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createOpenIDConnectProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createOpenIDConnectProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new managed policy for your Amazon Web Services account.</p> <p>This operation creates a policy version with a version identifier of <code>v1</code> and sets v1 as the policy's default version. For more information about policy versions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p> <p>As a best practice, you can validate your IAM policies. To learn more, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html\">Validating IAM policies</a> in the <i>IAM User Guide</i>.</p> <p>For more information about managed policies in general, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createPolicyRequest CreatePolicyRequest  (optional)
* returns CreatePolicyResponse
* */
const pOST_CreatePolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using <a>DeletePolicyVersion</a> before you create a new version.</p> <p>Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached.</p> <p>For more information about managed policy versions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createPolicyVersionRequest CreatePolicyVersionRequest  (optional)
* returns CreatePolicyVersionResponse
* */
const pOST_CreatePolicyVersion = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createPolicyVersionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createPolicyVersionRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new role for your Amazon Web Services account.</p> <p> For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>. For information about quotas for role names and the number of roles you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createRoleRequest CreateRoleRequest  (optional)
* returns CreateRoleResponse
* */
const pOST_CreateRole = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createRoleRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.</p> <p>The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the Amazon Web Services Management Console or one that supports API access to Amazon Web Services.</p> <p>When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.</p> <note> <p> This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note> <p> For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html\">Enabling SAML 2.0 federated users to access the Amazon Web Services Management Console</a> and <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createSAMLProviderRequest CreateSAMLProviderRequest  (optional)
* returns CreateSAMLProviderResponse
* */
const pOST_CreateSAMLProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createSAMLProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createSAMLProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates an IAM role that is linked to a specific Amazon Web Services service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your Amazon Web Services resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html\">Using service-linked roles</a> in the <i>IAM User Guide</i>. </p> <p>To attach a policy to this service-linked role, you must make the request using the Amazon Web Services service that depends on this role.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createServiceLinkedRoleRequest CreateServiceLinkedRoleRequest  (optional)
* returns CreateServiceLinkedRoleResponse
* */
const pOST_CreateServiceLinkedRole = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createServiceLinkedRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createServiceLinkedRoleRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service. </p> <p>You can have a maximum of two sets of service-specific credentials for each supported service per user.</p> <p>You can create service-specific credentials for CodeCommit and Amazon Keyspaces (for Apache Cassandra).</p> <p>You can reset the password to a new service-generated value by calling <a>ResetServiceSpecificCredential</a>.</p> <p>For more information about service-specific credentials, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_ssh-keys.html\">Using IAM with CodeCommit: Git credentials, SSH keys, and Amazon Web Services access keys</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createServiceSpecificCredentialRequest CreateServiceSpecificCredentialRequest  (optional)
* returns CreateServiceSpecificCredentialResponse
* */
const pOST_CreateServiceSpecificCredential = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createServiceSpecificCredentialRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createServiceSpecificCredentialRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new IAM user for your Amazon Web Services account.</p> <p> For information about quotas for the number of IAM users you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createUserRequest CreateUserRequest  (optional)
* returns CreateUserResponse
* */
const pOST_CreateUser = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createUserRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createUserRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Creates a new virtual MFA device for the Amazon Web Services account. After creating the virtual MFA, use <a>EnableMFADevice</a> to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\">Using a virtual MFA device</a> in the <i>IAM User Guide</i>.</p> <p>For information about the maximum number of MFA devices you can create, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <important> <p>The seed information contained in the QR code and the Base32 string should be treated like any other secret access information. In other words, protect the seed information as you would your Amazon Web Services access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures.</p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* createVirtualMFADeviceRequest CreateVirtualMFADeviceRequest  (optional)
* returns CreateVirtualMFADeviceResponse
* */
const pOST_CreateVirtualMFADevice = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, createVirtualMFADeviceRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        createVirtualMFADeviceRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.</p> <p>For more information about creating and working with virtual MFA devices, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\">Enabling a virtual multi-factor authentication (MFA) device</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deactivateMFADeviceRequest DeactivateMFADeviceRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeactivateMFADevice = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deactivateMFADeviceRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deactivateMFADeviceRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the access key pair associated with the specified IAM user.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteAccessKeyRequest DeleteAccessKeyRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteAccessKey = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteAccessKeyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteAccessKeyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Deletes the specified Amazon Web Services account alias. For information about using an Amazon Web Services account alias, see <a href=\"https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\">Creating, deleting, and listing an Amazon Web Services account alias</a> in the <i>Amazon Web Services Sign-In User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteAccountAliasRequest DeleteAccountAliasRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteAccountAlias = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteAccountAliasRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteAccountAliasRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Deletes the password policy for the Amazon Web Services account. There are no parameters.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* no response value expected for this operation
* */
const pOST_DeleteAccountPasswordPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Deletes the specified IAM group. The group must not contain any users or have any attached policies.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteGroupRequest DeleteGroupRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteGroup = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteGroupRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteGroupRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified inline policy that is embedded in the specified IAM group.</p> <p>A group can also have managed policies attached to it. To detach a managed policy from a group, use <a>DetachGroupPolicy</a>. For more information about policies, refer to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteGroupPolicyRequest DeleteGroupPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteGroupPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteGroupPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteGroupPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified instance profile. The instance profile must not have an associated role.</p> <important> <p>Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.</p> </important> <p>For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteInstanceProfileRequest DeleteInstanceProfileRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteInstanceProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteInstanceProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteInstanceProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the password for the specified IAM user, For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_passwords_admin-change-user.html\">Managing passwords for IAM users</a>.</p> <p>You can use the CLI, the Amazon Web Services API, or the <b>Users</b> page in the IAM console to delete a password for any IAM user. You can use <a>ChangePassword</a> to update, but not delete, your own password in the <b>My Security Credentials</b> page in the Amazon Web Services Management Console.</p> <important> <p>Deleting a user's password does not prevent a user from accessing Amazon Web Services through the command line interface or the API. To prevent all user access, you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see <a>UpdateAccessKey</a> and <a>DeleteAccessKey</a>.</p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteLoginProfileRequest DeleteLoginProfileRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteLoginProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteLoginProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteLoginProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes an OpenID Connect identity provider (IdP) resource object in IAM.</p> <p>Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails.</p> <p>This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteOpenIDConnectProviderRequest DeleteOpenIDConnectProviderRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteOpenIDConnectProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteOpenIDConnectProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteOpenIDConnectProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified managed policy.</p> <p>Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition, you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:</p> <ul> <li> <p>Detach the policy from all users, groups, and roles that the policy is attached to, using <a>DetachUserPolicy</a>, <a>DetachGroupPolicy</a>, or <a>DetachRolePolicy</a>. To list all the users, groups, and roles that a policy is attached to, use <a>ListEntitiesForPolicy</a>.</p> </li> <li> <p>Delete all versions of the policy using <a>DeletePolicyVersion</a>. To list the policy's versions, use <a>ListPolicyVersions</a>. You cannot use <a>DeletePolicyVersion</a> to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.</p> </li> <li> <p>Delete the policy (this automatically deletes the policy's default version) using this operation.</p> </li> </ul> <p>For information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deletePolicyRequest DeletePolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeletePolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deletePolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deletePolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified version from the specified managed policy.</p> <p>You cannot delete the default version from a policy using this operation. To delete the default version from a policy, use <a>DeletePolicy</a>. To find out which version of a policy is marked as the default version, use <a>ListPolicyVersions</a>.</p> <p>For information about versions for managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deletePolicyVersionRequest DeletePolicyVersionRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeletePolicyVersion = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deletePolicyVersionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deletePolicyVersionRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified role. Unlike the Amazon Web Services Management Console, when you delete a role programmatically, you must delete the items attached to the role manually, or the deletion fails. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_manage_delete.html#roles-managingrole-deleting-cli\">Deleting an IAM role</a>. Before attempting to delete a role, remove the following attached items: </p> <ul> <li> <p>Inline policies (<a>DeleteRolePolicy</a>)</p> </li> <li> <p>Attached managed policies (<a>DetachRolePolicy</a>)</p> </li> <li> <p>Instance profile (<a>RemoveRoleFromInstanceProfile</a>)</p> </li> <li> <p>Optional – Delete instance profile after detaching from role for resource clean up (<a>DeleteInstanceProfile</a>)</p> </li> </ul> <important> <p>Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.</p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteRoleRequest DeleteRoleRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteRole = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteRoleRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the permissions boundary for the specified IAM role. </p> <p>You cannot set the boundary for a service-linked role.</p> <important> <p>Deleting the permissions boundary for a role might increase its permissions. For example, it might allow anyone who assumes the role to perform all the actions granted in its permissions policies.</p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteRolePermissionsBoundaryRequest DeleteRolePermissionsBoundaryRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteRolePermissionsBoundary = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteRolePermissionsBoundaryRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteRolePermissionsBoundaryRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified inline policy that is embedded in the specified IAM role.</p> <p>A role can also have managed policies attached to it. To detach a managed policy from a role, use <a>DetachRolePolicy</a>. For more information about policies, refer to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteRolePolicyRequest DeleteRolePolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteRolePolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteRolePolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteRolePolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes a SAML provider resource in IAM.</p> <p>Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.</p> <note> <p> This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteSAMLProviderRequest DeleteSAMLProviderRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteSAMLProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteSAMLProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteSAMLProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified SSH public key.</p> <p>The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteSSHPublicKeyRequest DeleteSSHPublicKeyRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteSSHPublicKey = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteSSHPublicKeyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteSSHPublicKeyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified server certificate.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <important> <p> If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, see <a href=\"https://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html\">DeleteLoadBalancerListeners</a> in the <i>Elastic Load Balancing API Reference</i>.</p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteServerCertificateRequest DeleteServerCertificateRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteServerCertificate = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteServerCertificateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteServerCertificateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Submits a service-linked role deletion request and returns a <code>DeletionTaskId</code>, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the <code>DeletionTaskId</code> of the earlier request is returned.</p> <p>If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the <a>GetServiceLinkedRoleDeletionStatus</a> operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the <a href=\"http://docs.aws.amazon.com/\">Amazon Web Services documentation</a> for your service.</p> <p>For more information about service-linked roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role\">Roles terms and concepts: Amazon Web Services service-linked role</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteServiceLinkedRoleRequest DeleteServiceLinkedRoleRequest  (optional)
* returns DeleteServiceLinkedRoleResponse
* */
const pOST_DeleteServiceLinkedRole = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteServiceLinkedRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteServiceLinkedRoleRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Deletes the specified service-specific credential.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteServiceSpecificCredentialRequest DeleteServiceSpecificCredentialRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteServiceSpecificCredential = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteServiceSpecificCredentialRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteServiceSpecificCredentialRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes a signing certificate associated with the specified IAM user.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated IAM users.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteSigningCertificateRequest DeleteSigningCertificateRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteSigningCertificate = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteSigningCertificateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteSigningCertificateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified IAM user. Unlike the Amazon Web Services Management Console, when you delete a user programmatically, you must delete the items attached to the user manually, or the deletion fails. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_deleting_cli\">Deleting an IAM user</a>. Before attempting to delete a user, remove the following items:</p> <ul> <li> <p>Password (<a>DeleteLoginProfile</a>)</p> </li> <li> <p>Access keys (<a>DeleteAccessKey</a>)</p> </li> <li> <p>Signing certificate (<a>DeleteSigningCertificate</a>)</p> </li> <li> <p>SSH public key (<a>DeleteSSHPublicKey</a>)</p> </li> <li> <p>Git credentials (<a>DeleteServiceSpecificCredential</a>)</p> </li> <li> <p>Multi-factor authentication (MFA) device (<a>DeactivateMFADevice</a>, <a>DeleteVirtualMFADevice</a>)</p> </li> <li> <p>Inline policies (<a>DeleteUserPolicy</a>)</p> </li> <li> <p>Attached managed policies (<a>DetachUserPolicy</a>)</p> </li> <li> <p>Group memberships (<a>RemoveUserFromGroup</a>)</p> </li> </ul>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteUserRequest DeleteUserRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteUser = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteUserRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteUserRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the permissions boundary for the specified IAM user.</p> <important> <p>Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies. </p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteUserPermissionsBoundaryRequest DeleteUserPermissionsBoundaryRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteUserPermissionsBoundary = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteUserPermissionsBoundaryRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteUserPermissionsBoundaryRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes the specified inline policy that is embedded in the specified IAM user.</p> <p>A user can also have managed policies attached to it. To detach a managed policy from a user, use <a>DetachUserPolicy</a>. For more information about policies, refer to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteUserPolicyRequest DeleteUserPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteUserPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteUserPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteUserPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Deletes a virtual MFA device.</p> <note> <p> You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see <a>DeactivateMFADevice</a>. </p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* deleteVirtualMFADeviceRequest DeleteVirtualMFADeviceRequest  (optional)
* no response value expected for this operation
* */
const pOST_DeleteVirtualMFADevice = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, deleteVirtualMFADeviceRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        deleteVirtualMFADeviceRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified managed policy from the specified IAM group.</p> <p>A group can also have inline policies embedded with it. To delete an inline policy, use <a>DeleteGroupPolicy</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* detachGroupPolicyRequest DetachGroupPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_DetachGroupPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, detachGroupPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        detachGroupPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified managed policy from the specified role.</p> <p>A role can also have inline policies embedded with it. To delete an inline policy, use <a>DeleteRolePolicy</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* detachRolePolicyRequest DetachRolePolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_DetachRolePolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, detachRolePolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        detachRolePolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified managed policy from the specified user.</p> <p>A user can also have inline policies embedded with it. To delete an inline policy, use <a>DeleteUserPolicy</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* detachUserPolicyRequest DetachUserPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_DetachUserPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, detachUserPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        detachUserPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* enableMFADeviceRequest EnableMFADeviceRequest  (optional)
* no response value expected for this operation
* */
const pOST_EnableMFADevice = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, enableMFADeviceRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        enableMFADeviceRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Generates a credential report for the Amazon Web Services account. For more information about the credential report, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html\">Getting credential reports</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GenerateCredentialReportResponse
* */
const pOST_GenerateCredentialReport = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Generates a report for service last accessed data for Organizations. You can generate a report for any entities (organization root, organizational unit, or account) or policies in your organization.</p> <p>To call this operation, you must be signed in using your Organizations management account credentials. You can use your long-term IAM user or root user credentials, or temporary credentials from assuming an IAM role. SCPs must be enabled for your organization root. You must have the required IAM and Organizations permissions. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Refining permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p> <p>You can generate a service last accessed data report for entities by specifying only the entity's path. This data includes a list of services that are allowed by any service control policies (SCPs) that apply to the entity.</p> <p>You can generate a service last accessed data report for a policy by specifying an entity's path and an optional Organizations policy ID. This data includes a list of services that are allowed by the specified SCP.</p> <p>For each service in both report types, the data includes the most recent account activity that the policy allows to account principals in the entity or the entity's children. For important information about the data, reporting period, permissions required, troubleshooting, and supported Regions see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p> <important> <p>The data includes all attempts to access Amazon Web Services, not just the successful ones. This includes all attempts that were made using the Amazon Web Services Management Console, the Amazon Web Services API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that an account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\">Logging IAM events with CloudTrail</a> in the <i>IAM User Guide</i>.</p> </important> <p>This operation returns a <code>JobId</code>. Use this parameter in the <code> <a>GetOrganizationsAccessReport</a> </code> operation to check the status of the report generation. To check the status of this request, use the <code>JobId</code> parameter in the <code> <a>GetOrganizationsAccessReport</a> </code> operation and test the <code>JobStatus</code> response parameter. When the job is complete, you can retrieve the report.</p> <p>To generate a service last accessed data report for entities, specify an entity path without specifying the optional Organizations policy ID. The type of entity that you specify determines the data returned in the report.</p> <ul> <li> <p> <b>Root</b> – When you specify the organizations root as the entity, the resulting report lists all of the services allowed by SCPs that are attached to your root. For each service, the report includes data for all accounts in your organization except the management account, because the management account is not limited by SCPs.</p> </li> <li> <p> <b>OU</b> – When you specify an organizational unit (OU) as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the OU and its parents. For each service, the report includes data for all accounts in the OU or its children. This data excludes the management account, because the management account is not limited by SCPs.</p> </li> <li> <p> <b>management account</b> – When you specify the management account, the resulting report lists all Amazon Web Services services, because the management account is not limited by SCPs. For each service, the report includes data for only the management account.</p> </li> <li> <p> <b>Account</b> – When you specify another account as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the account and its parents. For each service, the report includes data for only the specified account.</p> </li> </ul> <p>To generate a service last accessed data report for policies, specify an entity path and the optional Organizations policy ID. The type of entity that you specify determines the data returned for each service.</p> <ul> <li> <p> <b>Root</b> – When you specify the root entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in your organization to which the SCP applies. This data excludes the management account, because the management account is not limited by SCPs. If the SCP is not attached to any entities in the organization, then the report will return a list of services with no data.</p> </li> <li> <p> <b>OU</b> – When you specify an OU entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in the OU or its children to which the SCP applies. This means that other accounts outside the OU that are affected by the SCP might not be included in the data. This data excludes the management account, because the management account is not limited by SCPs. If the SCP is not attached to the OU or one of its children, the report will return a list of services with no data.</p> </li> <li> <p> <b>management account</b> – When you specify the management account, the resulting report lists all Amazon Web Services services, because the management account is not limited by SCPs. If you specify a policy ID in the CLI or API, the policy is ignored. For each service, the report includes data for only the management account.</p> </li> <li> <p> <b>Account</b> – When you specify another account entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for only the specified account. This means that other accounts in the organization that are affected by the SCP might not be included in the data. If the SCP is not attached to the account, the report will return a list of services with no data.</p> </li> </ul> <note> <p>Service last accessed data does not use other policy types when determining whether a principal could access a service. These other policy types include identity-based policies, resource-based policies, access control lists, IAM permissions boundaries, and STS assume role policies. It only applies SCP logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>For more information about service last accessed data, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing policy scope by viewing user activity</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* generateOrganizationsAccessReportRequest GenerateOrganizationsAccessReportRequest  (optional)
* returns GenerateOrganizationsAccessReportResponse
* */
const pOST_GenerateOrganizationsAccessReport = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, generateOrganizationsAccessReportRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        generateOrganizationsAccessReportRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Generates a report that includes details about when an IAM resource (user, group, role, or policy) was last used in an attempt to access Amazon Web Services services. Recent activity usually appears within four hours. IAM reports activity for at least the last 400 days, or less if your Region began supporting this feature within the last year. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period\">Regions where data is tracked</a>.</p> <important> <p>The service last accessed data includes all attempts to access an Amazon Web Services API, not just the successful ones. This includes all attempts that were made using the Amazon Web Services Management Console, the Amazon Web Services API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that your account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\">Logging IAM events with CloudTrail</a> in the <i>IAM User Guide</i>.</p> </important> <p>The <code>GenerateServiceLastAccessedDetails</code> operation returns a <code>JobId</code>. Use this parameter in the following operations to retrieve the following details from your report: </p> <ul> <li> <p> <a>GetServiceLastAccessedDetails</a> – Use this operation for users, groups, roles, or policies to list every Amazon Web Services service that the resource could access using permissions policies. For each service, the response includes information about the most recent access attempt.</p> <p>The <code>JobId</code> returned by <code>GenerateServiceLastAccessedDetail</code> must be used by the same role within a session, or by the same user when used to call <code>GetServiceLastAccessedDetail</code>.</p> </li> <li> <p> <a>GetServiceLastAccessedDetailsWithEntities</a> – Use this operation for groups and policies to list information about the associated entities (users or roles) that attempted to access a specific Amazon Web Services service. </p> </li> </ul> <p>To check the status of the <code>GenerateServiceLastAccessedDetails</code> request, use the <code>JobId</code> parameter in the same operations and test the <code>JobStatus</code> response parameter.</p> <p>For additional information about the permissions policies that allow an identity (user, group, or role) to access specific services, use the <a>ListPoliciesGrantingServiceAccess</a> operation.</p> <note> <p>Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>For more information about service and action last accessed data, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* generateServiceLastAccessedDetailsRequest GenerateServiceLastAccessedDetailsRequest  (optional)
* returns GenerateServiceLastAccessedDetailsResponse
* */
const pOST_GenerateServiceLastAccessedDetails = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, generateServiceLastAccessedDetailsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        generateServiceLastAccessedDetailsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the Amazon Web Services service and Region that were specified in the last request made with that key.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getAccessKeyLastUsedRequest GetAccessKeyLastUsedRequest  (optional)
* returns GetAccessKeyLastUsedResponse
* */
const pOST_GetAccessKeyLastUsed = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getAccessKeyLastUsedRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getAccessKeyLastUsedRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about all IAM users, groups, roles, and policies in your Amazon Web Services account, including their relationships to one another. Use this operation to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>You can optionally filter the results using the <code>Filter</code> parameter. You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* getAccountAuthorizationDetailsRequest GetAccountAuthorizationDetailsRequest  (optional)
* returns GetAccountAuthorizationDetailsResponse
* */
const pOST_GetAccountAuthorizationDetails = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, getAccountAuthorizationDetailsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        getAccountAuthorizationDetailsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves the password policy for the Amazon Web Services account. This tells you the complexity requirements and mandatory rotation periods for the IAM user passwords in your account. For more information about using a password policy, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html\">Managing an IAM password policy</a>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetAccountPasswordPolicyResponse
* */
const pOST_GetAccountPasswordPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about IAM entity usage and IAM quotas in the Amazon Web Services account.</p> <p> For information about IAM quotas, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetAccountSummaryResponse
* */
const pOST_GetAccountSummary = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use <a>GetContextKeysForPrincipalPolicy</a>.</p> <p>Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use <code>GetContextKeysForCustomPolicy</code> to understand what key names and values you must supply when you call <a>SimulateCustomPolicy</a>. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getContextKeysForCustomPolicyRequest GetContextKeysForCustomPolicyRequest  (optional)
* returns GetContextKeysForPolicyResponse
* */
const pOST_GetContextKeysForCustomPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getContextKeysForCustomPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getContextKeysForCustomPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of.</p> <p>You can optionally include a list of one or more additional policies, specified as strings. If you want to include <i>only</i> a list of policies by string, use <a>GetContextKeysForCustomPolicy</a> instead.</p> <p> <b>Note:</b> This operation discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use <a>GetContextKeysForCustomPolicy</a> instead.</p> <p>Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use <a>GetContextKeysForPrincipalPolicy</a> to understand what key names and values you must supply when you call <a>SimulatePrincipalPolicy</a>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getContextKeysForPrincipalPolicyRequest GetContextKeysForPrincipalPolicyRequest  (optional)
* returns GetContextKeysForPolicyResponse
* */
const pOST_GetContextKeysForPrincipalPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getContextKeysForPrincipalPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getContextKeysForPrincipalPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Retrieves a credential report for the Amazon Web Services account. For more information about the credential report, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html\">Getting credential reports</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* returns GetCredentialReportResponse
* */
const pOST_GetCredentialReport = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* getGroupRequest GetGroupRequest  (optional)
* returns GetGroupResponse
* */
const pOST_GetGroup = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, getGroupRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        getGroupRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the specified inline policy document that is embedded in the specified IAM group.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use <a>GetPolicy</a> to determine the policy's default version, then use <a>GetPolicyVersion</a> to retrieve the policy document.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getGroupPolicyRequest GetGroupPolicyRequest  (optional)
* returns GetGroupPolicyResponse
* */
const pOST_GetGroupPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getGroupPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getGroupPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getInstanceProfileRequest GetInstanceProfileRequest  (optional)
* returns GetInstanceProfileResponse
* */
const pOST_GetInstanceProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getInstanceProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getInstanceProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the user name for the specified IAM user. A login profile is created when you create a password for the user to access the Amazon Web Services Management Console. If the user does not exist or does not have a password, the operation returns a 404 (<code>NoSuchEntity</code>) error.</p> <p>If you create an IAM user with access to the console, the <code>CreateDate</code> reflects the date you created the initial password for the user.</p> <p>If you create an IAM user with programmatic access, and then later add a password for the user to access the Amazon Web Services Management Console, the <code>CreateDate</code> reflects the initial password creation date. A user with programmatic access does not have a login profile unless you create a password for the user to access the Amazon Web Services Management Console.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getLoginProfileRequest GetLoginProfileRequest  (optional)
* returns GetLoginProfileResponse
* */
const pOST_GetLoginProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getLoginProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getLoginProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves information about an MFA device for a specified user.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getMFADeviceRequest GetMFADeviceRequest  (optional)
* returns GetMFADeviceResponse
* */
const pOST_GetMFADevice = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getMFADeviceRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getMFADeviceRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getOpenIDConnectProviderRequest GetOpenIDConnectProviderRequest  (optional)
* returns GetOpenIDConnectProviderResponse
* */
const pOST_GetOpenIDConnectProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getOpenIDConnectProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getOpenIDConnectProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the service last accessed data report for Organizations that was previously generated using the <code> <a>GenerateOrganizationsAccessReport</a> </code> operation. This operation retrieves the status of your report job and the report contents.</p> <p>Depending on the parameters that you passed when you generated the report, the data returned could include different information. For details, see <a>GenerateOrganizationsAccessReport</a>.</p> <p>To call this operation, you must be signed in to the management account in your organization. SCPs must be enabled for your organization root. You must have permissions to perform this operation. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Refining permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p> <p>For each service that principals in an account (root user, IAM users, or IAM roles) could access using SCPs, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, it returns the reason that it failed.</p> <p>By default, the list is sorted by service namespace.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getOrganizationsAccessReportRequest GetOrganizationsAccessReportRequest  (optional)
* returns GetOrganizationsAccessReportResponse
* */
const pOST_GetOrganizationsAccessReport = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getOrganizationsAccessReportRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getOrganizationsAccessReportRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use <a>ListEntitiesForPolicy</a>. This operation returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use <a>GetPolicyVersion</a>.</p> <p>This operation retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or <a>GetRolePolicy</a>.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getPolicyRequest GetPolicyRequest  (optional)
* returns GetPolicyResponse
* */
const pOST_GetPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified version of the specified managed policy, including the policy document.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>To list the available versions for a policy, use <a>ListPolicyVersions</a>.</p> <p>This operation retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or <a>GetRolePolicy</a>.</p> <p>For more information about the types of policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>For more information about managed policy versions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html\">Versioning for managed policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getPolicyVersionRequest GetPolicyVersionRequest  (optional)
* returns GetPolicyVersionResponse
* */
const pOST_GetPolicyVersion = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getPolicyVersionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getPolicyVersionRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getRoleRequest GetRoleRequest  (optional)
* returns GetRoleResponse
* */
const pOST_GetRole = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getRoleRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the specified inline policy document that is embedded with the specified IAM role.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use <a>GetPolicy</a> to determine the policy's default version, then use <a>GetPolicyVersion</a> to retrieve the policy document.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p> For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getRolePolicyRequest GetRolePolicyRequest  (optional)
* returns GetRolePolicyResponse
* */
const pOST_GetRolePolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getRolePolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getRolePolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.</p> <note> <p>This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getSAMLProviderRequest GetSAMLProviderRequest  (optional)
* returns GetSAMLProviderResponse
* */
const pOST_GetSAMLProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getSAMLProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getSAMLProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the specified SSH public key, including metadata about the key.</p> <p>The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getSSHPublicKeyRequest GetSSHPublicKeyRequest  (optional)
* returns GetSSHPublicKeyResponse
* */
const pOST_GetSSHPublicKey = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getSSHPublicKeyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getSSHPublicKeyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified server certificate stored in IAM.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getServerCertificateRequest GetServerCertificateRequest  (optional)
* returns GetServerCertificateResponse
* */
const pOST_GetServerCertificate = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getServerCertificateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getServerCertificateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves a service last accessed report that was created using the <code>GenerateServiceLastAccessedDetails</code> operation. You can use the <code>JobId</code> parameter in <code>GetServiceLastAccessedDetails</code> to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of Amazon Web Services services that the resource (user, group, role, or managed policy) can access.</p> <note> <p>Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the <code>GetServiceLastAccessedDetails</code> operation returns the reason that it failed.</p> <p>The <code>GetServiceLastAccessedDetails</code> operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:</p> <ul> <li> <p> <b>User</b> – Returns the user ARN that you used to generate the report</p> </li> <li> <p> <b>Group</b> – Returns the ARN of the group member (user) that last attempted to access the service</p> </li> <li> <p> <b>Role</b> – Returns the role ARN that you used to generate the report</p> </li> <li> <p> <b>Policy</b> – Returns the ARN of the user or role that last used the policy to attempt to access the service</p> </li> </ul> <p>By default, the list is sorted by service namespace.</p> <p>If you specified <code>ACTION_LEVEL</code> granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data.</p> <p>For more information about service and action last accessed data, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getServiceLastAccessedDetailsRequest GetServiceLastAccessedDetailsRequest  (optional)
* returns GetServiceLastAccessedDetailsResponse
* */
const pOST_GetServiceLastAccessedDetails = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getServiceLastAccessedDetailsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getServiceLastAccessedDetailsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>After you generate a group or policy report using the <code>GenerateServiceLastAccessedDetails</code> operation, you can use the <code>JobId</code> parameter in <code>GetServiceLastAccessedDetailsWithEntities</code>. This operation retrieves the status of your report job and a list of entities that could have used group or policy permissions to access the specified service.</p> <ul> <li> <p> <b>Group</b> – For a group report, this operation returns a list of users in the group that could have used the group’s policies in an attempt to access the service.</p> </li> <li> <p> <b>Policy</b> – For a policy report, this operation returns a list of entities (users or roles) that could have used the policy in an attempt to access the service.</p> </li> </ul> <p>You can also use this operation for user or role reports to retrieve details about those entities.</p> <p>If the operation fails, the <code>GetServiceLastAccessedDetailsWithEntities</code> operation returns the reason that it failed.</p> <p>By default, the list of associated entities is sorted by date, with the most recent access listed first.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getServiceLastAccessedDetailsWithEntitiesRequest GetServiceLastAccessedDetailsWithEntitiesRequest  (optional)
* returns GetServiceLastAccessedDetailsWithEntitiesResponse
* */
const pOST_GetServiceLastAccessedDetailsWithEntities = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getServiceLastAccessedDetailsWithEntitiesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getServiceLastAccessedDetailsWithEntitiesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves the status of your service-linked role deletion. After you use <a>DeleteServiceLinkedRole</a> to submit a service-linked role for deletion, you can use the <code>DeletionTaskId</code> parameter in <code>GetServiceLinkedRoleDeletionStatus</code> to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getServiceLinkedRoleDeletionStatusRequest GetServiceLinkedRoleDeletionStatusRequest  (optional)
* returns GetServiceLinkedRoleDeletionStatusResponse
* */
const pOST_GetServiceLinkedRoleDeletionStatus = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getServiceLinkedRoleDeletionStatusRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getServiceLinkedRoleDeletionStatusRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID used to sign the request to this operation.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getUserRequest GetUserRequest  (optional)
* returns GetUserResponse
* */
const pOST_GetUser = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getUserRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getUserRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves the specified inline policy document that is embedded in the specified IAM user.</p> <note> <p>Policies returned by this operation are URL-encoded compliant with <a href=\"https://tools.ietf.org/html/rfc3986\">RFC 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar functionality.</p> </note> <p>An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use <a>GetPolicy</a> to determine the policy's default version. Then use <a>GetPolicyVersion</a> to retrieve the policy document.</p> <p>For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* getUserPolicyRequest GetUserPolicyRequest  (optional)
* returns GetUserPolicyResponse
* */
const pOST_GetUserPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getUserPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        getUserPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Returns information about the access key IDs associated with the specified IAM user. If there is none, the operation returns an empty list.</p> <p>Although each user is limited to a small number of keys, you can still paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>If the <code>UserName</code> is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. If a temporary access key is used, then <code>UserName</code> is required. If a long-term key is assigned to the user, then <code>UserName</code> is not required. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p> <note> <p>To ensure the security of your Amazon Web Services account, the secret access key is accessible only during key and user creation.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listAccessKeysRequest ListAccessKeysRequest  (optional)
* returns ListAccessKeysResponse
* */
const pOST_ListAccessKeys = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listAccessKeysRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listAccessKeysRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the account alias associated with the Amazon Web Services account (Note: you can have only one). For information about using an Amazon Web Services account alias, see <a href=\"https://docs.aws.amazon.com/signin/latest/userguide/CreateAccountAlias.html\">Creating, deleting, and listing an Amazon Web Services account alias</a> in the <i>Amazon Web Services Sign-In User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listAccountAliasesRequest ListAccountAliasesRequest  (optional)
* returns ListAccountAliasesResponse
* */
const pOST_ListAccountAliases = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listAccountAliasesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listAccountAliasesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all managed policies that are attached to the specified IAM group.</p> <p>An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use <a>ListGroupPolicies</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listAttachedGroupPoliciesRequest ListAttachedGroupPoliciesRequest  (optional)
* returns ListAttachedGroupPoliciesResponse
* */
const pOST_ListAttachedGroupPolicies = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listAttachedGroupPoliciesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listAttachedGroupPoliciesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all managed policies that are attached to the specified IAM role.</p> <p>An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use <a>ListRolePolicies</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listAttachedRolePoliciesRequest ListAttachedRolePoliciesRequest  (optional)
* returns ListAttachedRolePoliciesResponse
* */
const pOST_ListAttachedRolePolicies = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listAttachedRolePoliciesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listAttachedRolePoliciesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all managed policies that are attached to the specified IAM user.</p> <p>An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use <a>ListUserPolicies</a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listAttachedUserPoliciesRequest ListAttachedUserPoliciesRequest  (optional)
* returns ListAttachedUserPoliciesResponse
* */
const pOST_ListAttachedUserPolicies = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listAttachedUserPoliciesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listAttachedUserPoliciesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all IAM users, groups, and roles that the specified managed policy is attached to.</p> <p>You can use the optional <code>EntityFilter</code> parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set <code>EntityFilter</code> to <code>Role</code>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listEntitiesForPolicyRequest ListEntitiesForPolicyRequest  (optional)
* returns ListEntitiesForPolicyResponse
* */
const pOST_ListEntitiesForPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listEntitiesForPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listEntitiesForPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the names of the inline policies that are embedded in the specified IAM group.</p> <p>An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use <a>ListAttachedGroupPolicies</a>. For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listGroupPoliciesRequest ListGroupPoliciesRequest  (optional)
* returns ListGroupPoliciesResponse
* */
const pOST_ListGroupPolicies = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listGroupPoliciesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listGroupPoliciesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the IAM groups that have the specified path prefix.</p> <p> You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listGroupsRequest ListGroupsRequest  (optional)
* returns ListGroupsResponse
* */
const pOST_ListGroups = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listGroupsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listGroupsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the IAM groups that the specified IAM user belongs to.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listGroupsForUserRequest ListGroupsForUserRequest  (optional)
* returns ListGroupsForUserResponse
* */
const pOST_ListGroupsForUser = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listGroupsForUserRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listGroupsForUserRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified IAM instance profile. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listInstanceProfileTagsRequest ListInstanceProfileTagsRequest  (optional)
* returns ListInstanceProfileTagsResponse
* */
const pOST_ListInstanceProfileTags = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listInstanceProfileTagsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listInstanceProfileTagsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for an instance profile, see <a>GetInstanceProfile</a>.</p> </note> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listInstanceProfilesRequest ListInstanceProfilesRequest  (optional)
* returns ListInstanceProfilesResponse
* */
const pOST_ListInstanceProfiles = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listInstanceProfilesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listInstanceProfilesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listInstanceProfilesForRoleRequest ListInstanceProfilesForRoleRequest  (optional)
* returns ListInstanceProfilesForRoleResponse
* */
const pOST_ListInstanceProfilesForRole = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listInstanceProfilesForRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listInstanceProfilesForRoleRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified IAM virtual multi-factor authentication (MFA) device. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listMFADeviceTagsRequest ListMFADeviceTagsRequest  (optional)
* returns ListMFADeviceTagsResponse
* */
const pOST_ListMFADeviceTags = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listMFADeviceTagsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listMFADeviceTagsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request for this operation.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listMFADevicesRequest ListMFADevicesRequest  (optional)
* returns ListMFADevicesResponse
* */
const pOST_ListMFADevices = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listMFADevicesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listMFADevicesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the tags that are attached to the specified OpenID Connect (OIDC)-compatible identity provider. The returned list of tags is sorted by tag key. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>.</p> <p>For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listOpenIDConnectProviderTagsRequest ListOpenIDConnectProviderTagsRequest  (optional)
* returns ListOpenIDConnectProviderTagsResponse
* */
const pOST_ListOpenIDConnectProviderTags = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listOpenIDConnectProviderTagsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listOpenIDConnectProviderTagsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the Amazon Web Services account.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for an OIDC provider, see <a>GetOpenIDConnectProvider</a>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* body Object  (optional)
* returns ListOpenIDConnectProvidersResponse
* */
const pOST_ListOpenIDConnectProviders = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        body,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists all the managed policies that are available in your Amazon Web Services account, including your own customer-defined managed policies and all Amazon Web Services managed policies.</p> <p>You can filter the list of policies that is returned using the optional <code>OnlyAttached</code>, <code>Scope</code>, and <code>PathPrefix</code> parameters. For example, to list only the customer managed policies in your Amazon Web Services account, set <code>Scope</code> to <code>Local</code>. To list only Amazon Web Services managed policies, set <code>Scope</code> to <code>AWS</code>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>For more information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a customer manged policy, see <a>GetPolicy</a>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listPoliciesRequest ListPoliciesRequest  (optional)
* returns ListPoliciesResponse
* */
const pOST_ListPolicies = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listPoliciesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listPoliciesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified service.</p> <note> <p>This operation does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>The list of policies returned by the operation depends on the ARN of the identity that you provide.</p> <ul> <li> <p> <b>User</b> – The list of policies includes the managed and inline policies that are attached to the user directly. The list also includes any additional managed and inline policies that are attached to the group to which the user belongs. </p> </li> <li> <p> <b>Group</b> – The list of policies includes only the managed and inline policies that are attached to the group directly. Policies that are attached to the group’s user are not included.</p> </li> <li> <p> <b>Role</b> – The list of policies includes only the managed and inline policies that are attached to the role.</p> </li> </ul> <p>For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information about these policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed policy is currently used to set the permissions boundary for a user or role, use the <a>GetUser</a> or <a>GetRole</a> operations.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* listPoliciesGrantingServiceAccessRequest ListPoliciesGrantingServiceAccessRequest  (optional)
* returns ListPoliciesGrantingServiceAccessResponse
* */
const pOST_ListPoliciesGrantingServiceAccess = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, listPoliciesGrantingServiceAccessRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        listPoliciesGrantingServiceAccessRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified IAM customer managed policy. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listPolicyTagsRequest ListPolicyTagsRequest  (optional)
* returns ListPolicyTagsResponse
* */
const pOST_ListPolicyTags = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listPolicyTagsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listPolicyTagsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version.</p> <p>For more information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listPolicyVersionsRequest ListPolicyVersionsRequest  (optional)
* returns ListPolicyVersionsResponse
* */
const pOST_ListPolicyVersions = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listPolicyVersionsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listPolicyVersionsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the names of the inline policies that are embedded in the specified IAM role.</p> <p>An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use <a>ListAttachedRolePolicies</a>. For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listRolePoliciesRequest ListRolePoliciesRequest  (optional)
* returns ListRolePoliciesResponse
* */
const pOST_ListRolePolicies = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listRolePoliciesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listRolePoliciesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listRoleTagsRequest ListRoleTagsRequest  (optional)
* returns ListRoleTagsResponse
* */
const pOST_ListRoleTags = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listRoleTagsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listRoleTagsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. This operation does not return the following attributes, even though they are an attribute of the returned object:</p> <ul> <li> <p>PermissionsBoundary</p> </li> <li> <p>RoleLastUsed</p> </li> <li> <p>Tags</p> </li> </ul> <p>To view all of the information for a role, see <a>GetRole</a>.</p> </note> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listRolesRequest ListRolesRequest  (optional)
* returns ListRolesResponse
* */
const pOST_ListRoles = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listRolesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listRolesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the tags that are attached to the specified Security Assertion Markup Language (SAML) identity provider. The returned list of tags is sorted by tag key. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation</a>.</p> <p>For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listSAMLProviderTagsRequest ListSAMLProviderTagsRequest  (optional)
* returns ListSAMLProviderTagsResponse
* */
const pOST_ListSAMLProviderTags = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listSAMLProviderTagsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listSAMLProviderTagsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the SAML provider resource objects defined in IAM in the account. IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a SAML provider, see <a>GetSAMLProvider</a>.</p> <important> <p> This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* body Object  (optional)
* returns ListSAMLProvidersResponse
* */
const pOST_ListSAMLProviders = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        body,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Returns information about the SSH public keys associated with the specified IAM user. If none exists, the operation returns an empty list.</p> <p>The SSH public keys returned by this operation are used only for authenticating the IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p> <p>Although each user is limited to a small number of keys, you can still paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listSSHPublicKeysRequest ListSSHPublicKeysRequest  (optional)
* returns ListSSHPublicKeysResponse
* */
const pOST_ListSSHPublicKeys = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listSSHPublicKeysRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listSSHPublicKeysRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the tags that are attached to the specified IAM server certificate. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don't use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listServerCertificateTagsRequest ListServerCertificateTagsRequest  (optional)
* returns ListServerCertificateTagsResponse
* */
const pOST_ListServerCertificateTags = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listServerCertificateTagsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listServerCertificateTagsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.</p> <p> You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a servercertificate, see <a>GetServerCertificate</a>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listServerCertificatesRequest ListServerCertificatesRequest  (optional)
* returns ListServerCertificatesResponse
* */
const pOST_ListServerCertificates = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listServerCertificatesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listServerCertificatesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns information about the service-specific credentials associated with the specified IAM user. If none exists, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an Amazon Web Services service, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-gc.html\">Set up service-specific credentials</a> in the CodeCommit User Guide.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* listServiceSpecificCredentialsRequest ListServiceSpecificCredentialsRequest  (optional)
* returns ListServiceSpecificCredentialsResponse
* */
const pOST_ListServiceSpecificCredentials = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, listServiceSpecificCredentialsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        listServiceSpecificCredentialsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Returns information about the signing certificates associated with the specified IAM user. If none exists, the operation returns an empty list.</p> <p>Although each user is limited to a small number of signing certificates, you can still paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request for this operation. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listSigningCertificatesRequest ListSigningCertificatesRequest  (optional)
* returns ListSigningCertificatesResponse
* */
const pOST_ListSigningCertificates = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listSigningCertificatesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listSigningCertificatesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the names of the inline policies embedded in the specified IAM user.</p> <p>An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use <a>ListAttachedUserPolicies</a>. For more information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listUserPoliciesRequest ListUserPoliciesRequest  (optional)
* returns ListUserPoliciesResponse
* */
const pOST_ListUserPolicies = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listUserPoliciesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listUserPoliciesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the tags that are attached to the specified IAM user. The returned list of tags is sorted by tag key. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listUserTagsRequest ListUserTagsRequest  (optional)
* returns ListUserTagsResponse
* */
const pOST_ListUserTags = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listUserTagsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listUserTagsRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the Amazon Web Services account. If there are none, the operation returns an empty list.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. This operation does not return the following attributes, even though they are an attribute of the returned object:</p> <ul> <li> <p>PermissionsBoundary</p> </li> <li> <p>Tags</p> </li> </ul> <p>To view all of the information for a user, see <a>GetUser</a>.</p> </note> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listUsersRequest ListUsersRequest  (optional)
* returns ListUsersResponse
* */
const pOST_ListUsers = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listUsersRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listUsersRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Lists the virtual MFA devices defined in the Amazon Web Services account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be <code>Assigned</code>, <code>Unassigned</code>, or <code>Any</code>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view tag information for a virtual MFA device, see <a>ListMFADeviceTags</a>.</p> </note> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* listVirtualMFADevicesRequest ListVirtualMFADevicesRequest  (optional)
* returns ListVirtualMFADevicesResponse
* */
const pOST_ListVirtualMFADevices = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, listVirtualMFADevicesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        listVirtualMFADevicesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates an inline policy document that is embedded in the specified IAM group.</p> <p>A user can also have managed policies attached to it. To attach a managed policy to a group, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachGroupPolicy.html\"> <code>AttachGroupPolicy</code> </a>. To create a new managed policy, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\"> <code>CreatePolicy</code> </a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>For information about the maximum number of inline policies that you can embed in a group, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <note> <p>Because policy documents can be large, you should use POST rather than GET when calling <code>PutGroupPolicy</code>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\">Making query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* putGroupPolicyRequest PutGroupPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_PutGroupPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, putGroupPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        putGroupPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an Amazon Web Services managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role.</p> <p>You cannot set the boundary for a service-linked role.</p> <important> <p>Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html\">IAM JSON policy evaluation logic</a> in the IAM User Guide. </p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* putRolePermissionsBoundaryRequest PutRolePermissionsBoundaryRequest  (optional)
* no response value expected for this operation
* */
const pOST_PutRolePermissionsBoundary = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, putRolePermissionsBoundaryRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        putRolePermissionsBoundaryRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates an inline policy document that is embedded in the specified IAM role.</p> <p>When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html\"> <code>CreateRole</code> </a>. You can update a role's trust policy using <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html\"> <code>UpdateAssumeRolePolicy</code> </a>. For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html\">IAM roles</a> in the <i>IAM User Guide</i>.</p> <p>A role can also have a managed policy attached to it. To attach a managed policy to a role, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachRolePolicy.html\"> <code>AttachRolePolicy</code> </a>. To create a new managed policy, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\"> <code>CreatePolicy</code> </a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>For information about the maximum number of inline policies that you can embed with a role, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <note> <p>Because policy documents can be large, you should use POST rather than GET when calling <code>PutRolePolicy</code>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\">Making query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* putRolePolicyRequest PutRolePolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_PutRolePolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, putRolePolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        putRolePolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an Amazon Web Services managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.</p> <important> <p>Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html\">IAM JSON policy evaluation logic</a> in the IAM User Guide. </p> </important>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* putUserPermissionsBoundaryRequest PutUserPermissionsBoundaryRequest  (optional)
* no response value expected for this operation
* */
const pOST_PutUserPermissionsBoundary = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, putUserPermissionsBoundaryRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        putUserPermissionsBoundaryRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds or updates an inline policy document that is embedded in the specified IAM user.</p> <p>An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachUserPolicy.html\"> <code>AttachUserPolicy</code> </a>. To create a new managed policy, use <a href=\"https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html\"> <code>CreatePolicy</code> </a>. For information about policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <p>For information about the maximum number of inline policies that you can embed in a user, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <note> <p>Because policy documents can be large, you should use POST rather than GET when calling <code>PutUserPolicy</code>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\">Making query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* putUserPolicyRequest PutUserPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_PutUserPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, putUserPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        putUserPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object.</p> <p>This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* removeClientIDFromOpenIDConnectProviderRequest RemoveClientIDFromOpenIDConnectProviderRequest  (optional)
* no response value expected for this operation
* */
const pOST_RemoveClientIDFromOpenIDConnectProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, removeClientIDFromOpenIDConnectProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        removeClientIDFromOpenIDConnectProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified IAM role from the specified EC2 instance profile.</p> <important> <p>Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.</p> </important> <p> For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html\">IAM roles</a> in the <i>IAM User Guide</i>. For more information about instance profiles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html\">Using instance profiles</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* removeRoleFromInstanceProfileRequest RemoveRoleFromInstanceProfileRequest  (optional)
* no response value expected for this operation
* */
const pOST_RemoveRoleFromInstanceProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, removeRoleFromInstanceProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        removeRoleFromInstanceProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified user from the specified group.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* removeUserFromGroupRequest RemoveUserFromGroupRequest  (optional)
* no response value expected for this operation
* */
const pOST_RemoveUserFromGroup = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, removeUserFromGroupRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        removeUserFromGroupRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Resets the password for a service-specific credential. The new password is Amazon Web Services generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* resetServiceSpecificCredentialRequest ResetServiceSpecificCredentialRequest  (optional)
* returns ResetServiceSpecificCredentialResponse
* */
const pOST_ResetServiceSpecificCredential = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, resetServiceSpecificCredentialRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        resetServiceSpecificCredentialRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Synchronizes the specified MFA device with its IAM resource object on the Amazon Web Services servers.</p> <p>For more information about creating and working with virtual MFA devices, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\">Using a virtual MFA device</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* resyncMFADeviceRequest ResyncMFADeviceRequest  (optional)
* no response value expected for this operation
* */
const pOST_ResyncMFADevice = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, resyncMFADeviceRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        resyncMFADeviceRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Sets the specified version of the specified policy as the policy's default (operative) version.</p> <p>This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use <a>ListEntitiesForPolicy</a>.</p> <p>For information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* setDefaultPolicyVersionRequest SetDefaultPolicyVersionRequest  (optional)
* no response value expected for this operation
* */
const pOST_SetDefaultPolicyVersion = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, setDefaultPolicyVersionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        setDefaultPolicyVersionRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Sets the specified version of the global endpoint token as the token version used for the Amazon Web Services account.</p> <p>By default, Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at <code>https://sts.amazonaws.com</code>. Amazon Web Services recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/sts.html\">Security Token Service endpoints and quotas</a> in the <i>Amazon Web Services General Reference</i>.</p> <p>If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\">Activating and deactivating STS in an Amazon Web Services Region</a> in the <i>IAM User Guide</i>.</p> <p>To view the current session token version, see the <code>GlobalEndpointTokenVersion</code> entry in the response of the <a>GetAccountSummary</a> operation.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* setSecurityTokenServicePreferencesRequest SetSecurityTokenServicePreferencesRequest  (optional)
* no response value expected for this operation
* */
const pOST_SetSecurityTokenServicePreferences = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, setSecurityTokenServicePreferencesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        setSecurityTokenServicePreferencesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and Amazon Web Services resources to determine the policies' effective permissions. The policies are provided as strings.</p> <p>The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. You can simulate resources that don't exist in your account.</p> <p>If you want to simulate existing policies that are attached to an IAM user, group, or role, use <a>SimulatePrincipalPolicy</a> instead.</p> <p>Context keys are variables that are maintained by Amazon Web Services and its services and which provide details about the context of an API query request. You can use the <code>Condition</code> element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use <a>GetContextKeysForCustomPolicy</a>.</p> <p>If the output is long, you can use <code>MaxItems</code> and <code>Marker</code> parameters to paginate the results.</p> <note> <p>The IAM policy simulator evaluates statements in the identity-based policy and the inputs that you provide during simulation. The policy simulator results can differ from your live Amazon Web Services environment. We recommend that you check your policies against your live Amazon Web Services environment after testing using the policy simulator to confirm that you have the desired results. For more information about using the policy simulator, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html\">Testing IAM policies with the IAM policy simulator </a>in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* simulateCustomPolicyRequest SimulateCustomPolicyRequest  (optional)
* returns SimulatePolicyResponse
* */
const pOST_SimulateCustomPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, simulateCustomPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        simulateCustomPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and Amazon Web Services resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can simulate resources that don't exist in your account.</p> <p>You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use <a>SimulateCustomPolicy</a> instead.</p> <p>You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation for IAM users only.</p> <p>The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations.</p> <p> <b>Note:</b> This operation discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use <a>SimulateCustomPolicy</a> instead.</p> <p>Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. You can use the <code>Condition</code> element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use <a>GetContextKeysForPrincipalPolicy</a>.</p> <p>If the output is long, you can use the <code>MaxItems</code> and <code>Marker</code> parameters to paginate the results.</p> <note> <p>The IAM policy simulator evaluates statements in the identity-based policy and the inputs that you provide during simulation. The policy simulator results can differ from your live Amazon Web Services environment. We recommend that you check your policies against your live Amazon Web Services environment after testing using the policy simulator to confirm that you have the desired results. For more information about using the policy simulator, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html\">Testing IAM policies with the IAM policy simulator </a>in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* maxItems String Pagination limit (optional)
* marker String Pagination token (optional)
* simulatePrincipalPolicyRequest SimulatePrincipalPolicyRequest  (optional)
* returns SimulatePolicyResponse
* */
const pOST_SimulatePrincipalPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxItems, marker, simulatePrincipalPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        maxItems,
        marker,
        simulatePrincipalPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM instance profile. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>Each tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM instance profile that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* tagInstanceProfileRequest TagInstanceProfileRequest  (optional)
* no response value expected for this operation
* */
const pOST_TagInstanceProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, tagInstanceProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        tagInstanceProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM virtual multi-factor authentication (MFA) device. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM virtual MFA device that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* tagMFADeviceRequest TagMFADeviceRequest  (optional)
* no response value expected for this operation
* */
const pOST_TagMFADevice = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, tagMFADeviceRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        tagMFADeviceRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an OpenID Connect (OIDC)-compatible identity provider. For more information about these providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an OIDC provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* tagOpenIDConnectProviderRequest TagOpenIDConnectProviderRequest  (optional)
* no response value expected for this operation
* */
const pOST_TagOpenIDConnectProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, tagOpenIDConnectProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        tagOpenIDConnectProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM customer managed policy. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM customer managed policy that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* tagPolicyRequest TagPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_TagPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, tagPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        tagPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p> <b>Cost allocation</b> - Use tags to help track which individuals and teams are using which Amazon Web Services resources.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note> <p>For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM identities</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* tagRoleRequest TagRoleRequest  (optional)
* no response value expected for this operation
* */
const pOST_TagRole = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, tagRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        tagRoleRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to a Security Assertion Markup Language (SAML) identity provider. For more information about these providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation </a>. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only a SAML identity provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* tagSAMLProviderRequest TagSAMLProviderRequest  (optional)
* no response value expected for this operation
* */
const pOST_TagSAMLProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, tagSAMLProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        tagSAMLProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM server certificate. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <note> <p>For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don't use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>.</p> </note> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM user-based and resource-based policies. You can use tags to restrict access to only a server certificate that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p> <b>Cost allocation</b> - Use tags to help track which individuals and teams are using which Amazon Web Services resources.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* tagServerCertificateRequest TagServerCertificateRequest  (optional)
* no response value expected for this operation
* */
const pOST_TagServerCertificate = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, tagServerCertificateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        tagServerCertificateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p> <b>Cost allocation</b> - Use tags to help track which individuals and teams are using which Amazon Web Services resources.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note> <p>For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM identities</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* tagUserRequest TagUserRequest  (optional)
* no response value expected for this operation
* */
const pOST_TagUser = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, tagUserRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        tagUserRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the IAM instance profile. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* untagInstanceProfileRequest UntagInstanceProfileRequest  (optional)
* no response value expected for this operation
* */
const pOST_UntagInstanceProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, untagInstanceProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        untagInstanceProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the IAM virtual multi-factor authentication (MFA) device. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* untagMFADeviceRequest UntagMFADeviceRequest  (optional)
* no response value expected for this operation
* */
const pOST_UntagMFADevice = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, untagMFADeviceRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        untagMFADeviceRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the specified OpenID Connect (OIDC)-compatible identity provider in IAM. For more information about OIDC providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* untagOpenIDConnectProviderRequest UntagOpenIDConnectProviderRequest  (optional)
* no response value expected for this operation
* */
const pOST_UntagOpenIDConnectProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, untagOpenIDConnectProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        untagOpenIDConnectProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the customer managed policy. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* untagPolicyRequest UntagPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_UntagPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, untagPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        untagPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the role. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* untagRoleRequest UntagRoleRequest  (optional)
* no response value expected for this operation
* */
const pOST_UntagRole = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, untagRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        untagRoleRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the specified Security Assertion Markup Language (SAML) identity provider in IAM. For more information about these providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* untagSAMLProviderRequest UntagSAMLProviderRequest  (optional)
* no response value expected for this operation
* */
const pOST_UntagSAMLProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, untagSAMLProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        untagSAMLProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Removes the specified tags from the IAM server certificate. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>For certificates in a Region supported by Certificate Manager (ACM), we recommend that you don't use IAM server certificates. Instead, use ACM to provision, manage, and deploy your server certificates. For more information about IAM server certificates, <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* untagServerCertificateRequest UntagServerCertificateRequest  (optional)
* no response value expected for this operation
* */
const pOST_UntagServerCertificate = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, untagServerCertificateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        untagServerCertificateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Removes the specified tags from the user. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* untagUserRequest UntagUserRequest  (optional)
* no response value expected for this operation
* */
const pOST_UntagUser = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, untagUserRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        untagUserRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow.</p> <p>If the <code>UserName</code> is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. If a temporary access key is used, then <code>UserName</code> is required. If a long-term key is assigned to the user, then <code>UserName</code> is not required. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p> <p>For information about rotating keys, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html\">Managing keys and certificates</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateAccessKeyRequest UpdateAccessKeyRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateAccessKey = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateAccessKeyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateAccessKeyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the password policy settings for the Amazon Web Services account.</p> <note> <p>This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the <b>Request Parameters</b> section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.</p> </note> <p> For more information about using a password policy, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html\">Managing an IAM password policy</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateAccountPasswordPolicyRequest UpdateAccountPasswordPolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateAccountPasswordPolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateAccountPasswordPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateAccountPasswordPolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the \"role trust policy\". For more information about roles, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html\">Using roles to delegate permissions and federate identities</a>.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateAssumeRolePolicyRequest UpdateAssumeRolePolicyRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateAssumeRolePolicy = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateAssumeRolePolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateAssumeRolePolicyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the name and/or the path of the specified IAM group.</p> <important> <p> You should understand the implications of changing a group's path or name. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html\">Renaming users and groups</a> in the <i>IAM User Guide</i>.</p> </important> <note> <p>The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named <code>Managers</code> to <code>MGRs</code>, the principal must have a policy that allows them to update both groups. If the principal has permission to update the <code>Managers</code> group, but not the <code>MGRs</code> group, then the update fails. For more information about permissions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\">Access management</a>. </p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateGroupRequest UpdateGroupRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateGroup = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateGroupRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateGroupRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Changes the password for the specified IAM user. You can use the CLI, the Amazon Web Services API, or the <b>Users</b> page in the IAM console to change the password for any IAM user. Use <a>ChangePassword</a> to change your own password in the <b>My Security Credentials</b> page in the Amazon Web Services Management Console.</p> <p>For more information about modifying passwords, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html\">Managing passwords</a> in the <i>IAM User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateLoginProfileRequest UpdateLoginProfileRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateLoginProfile = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateLoginProfileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateLoginProfileRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints.</p> <p>The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.)</p> <p>Typically, you need to update a thumbprint only when the identity provider certificate changes, which occurs rarely. However, if the provider's certificate <i>does</i> change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.</p> <note> <p>Amazon Web Services secures communication with some OIDC identity providers (IdPs) through our library of trusted root certificate authorities (CAs) instead of using a certificate thumbprint to verify your IdP server certificate. These OIDC IdPs include Auth0, GitHub, Google, and those that use an Amazon S3 bucket to host a JSON Web Key Set (JWKS) endpoint. In these cases, your legacy thumbprint remains in your configuration, but is no longer used for validation.</p> </note> <note> <p>Trust for the OIDC provider is derived from the provider certificate and is validated by the thumbprint. Therefore, it is best to limit access to the <code>UpdateOpenIDConnectProviderThumbprint</code> operation to highly privileged users.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateOpenIDConnectProviderThumbprintRequest UpdateOpenIDConnectProviderThumbprintRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateOpenIDConnectProviderThumbprint = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateOpenIDConnectProviderThumbprintRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateOpenIDConnectProviderThumbprintRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Updates the description or maximum session duration setting of a role.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateRoleRequest UpdateRoleRequest  (optional)
* returns Object
* */
const pOST_UpdateRole = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateRoleRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Use <a>UpdateRole</a> instead.</p> <p>Modifies only the description of a role. This operation performs the same function as the <code>Description</code> parameter in the <code>UpdateRole</code> operation.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateRoleDescriptionRequest UpdateRoleDescriptionRequest  (optional)
* returns UpdateRoleDescriptionResponse
* */
const pOST_UpdateRoleDescription = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateRoleDescriptionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateRoleDescriptionRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the metadata document for an existing SAML provider resource object.</p> <note> <p>This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateSAMLProviderRequest UpdateSAMLProviderRequest  (optional)
* returns UpdateSAMLProviderResponse
* */
const pOST_UpdateSAMLProvider = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateSAMLProviderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateSAMLProviderRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow.</p> <p>The SSH public key affected by this operation is used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateSSHPublicKeyRequest UpdateSSHPublicKeyRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateSSHPublicKey = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateSSHPublicKeyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateSSHPublicKeyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the name and/or the path of the specified server certificate stored in IAM.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <important> <p>You should understand the implications of changing a server certificate's path or name. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts\">Renaming a server certificate</a> in the <i>IAM User Guide</i>.</p> </important> <note> <p>The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named <code>ProductionCert</code> to <code>ProdCert</code>, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the <code>ProductionCert</code> group, but not the <code>ProdCert</code> certificate, then the update fails. For more information about permissions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\">Access management</a> in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateServerCertificateRequest UpdateServerCertificateRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateServerCertificate = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateServerCertificateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateServerCertificateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Sets the status of a service-specific credential to <code>Active</code> or <code>Inactive</code>. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateServiceSpecificCredentialRequest UpdateServiceSpecificCredentialRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateServiceSpecificCredential = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateServiceSpecificCredentialRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateServiceSpecificCredentialRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow.</p> <p>If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateSigningCertificateRequest UpdateSigningCertificateRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateSigningCertificate = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateSigningCertificateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateSigningCertificateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Updates the name and/or the path of the specified IAM user.</p> <important> <p> You should understand the implications of changing an IAM user's path or name. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming\">Renaming an IAM user</a> and <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html\">Renaming an IAM group</a> in the <i>IAM User Guide</i>.</p> </important> <note> <p> To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html\">Permissions and policies</a>. </p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* updateUserRequest UpdateUserRequest  (optional)
* no response value expected for this operation
* */
const pOST_UpdateUser = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, updateUserRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        updateUserRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Uploads an SSH public key and associates it with the specified IAM user.</p> <p>The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an CodeCommit repository. For more information about using SSH keys to authenticate to an CodeCommit repository, see <a href=\"https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html\">Set up CodeCommit for SSH connections</a> in the <i>CodeCommit User Guide</i>.</p>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* uploadSSHPublicKeyRequest UploadSSHPublicKeyRequest  (optional)
* returns UploadSSHPublicKeyResponse
* */
const pOST_UploadSSHPublicKey = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, uploadSSHPublicKeyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        uploadSSHPublicKeyRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Uploads a server certificate entity for the Amazon Web Services account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded.</p> <p>We recommend that you use <a href=\"https://docs.aws.amazon.com/acm/\">Certificate Manager</a> to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to Amazon Web Services resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the <a href=\"https://docs.aws.amazon.com/acm/latest/userguide/\">Certificate Manager User Guide</a>.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <p>For information about the number of server certificates you can upload, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html\">IAM and STS quotas</a> in the <i>IAM User Guide</i>.</p> <note> <p>Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling <code>UploadServerCertificate</code>. For information about setting up signatures and authorization through the API, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html\">Signing Amazon Web Services API requests</a> in the <i>Amazon Web Services General Reference</i>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html\">Calling the API by making HTTP query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* uploadServerCertificateRequest UploadServerCertificateRequest  (optional)
* returns UploadServerCertificateResponse
* */
const pOST_UploadServerCertificate = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, uploadServerCertificateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        uploadServerCertificateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* <p>Uploads an X.509 signing certificate and associates it with the specified IAM user. Some Amazon Web Services services require you to use certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is <code>Active</code>.</p> <p>For information about when you would use an X.509 signing certificate, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Managing server certificates in IAM</a> in the <i>IAM User Guide</i>.</p> <p>If the <code>UserName</code> is not specified, the IAM user name is determined implicitly based on the Amazon Web Services access key ID used to sign the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated users.</p> <note> <p>Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling <code>UploadSigningCertificate</code>. For information about setting up signatures and authorization through the API, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html\">Signing Amazon Web Services API requests</a> in the <i>Amazon Web Services General Reference</i>. For general information about using the Query API with IAM, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html\">Making query requests</a> in the <i>IAM User Guide</i>.</p> </note>
*
* action String 
* version String 
* xAmzContentSha256 String  (optional)
* xAmzDate String  (optional)
* xAmzAlgorithm String  (optional)
* xAmzCredential String  (optional)
* xAmzSecurityToken String  (optional)
* xAmzSignature String  (optional)
* xAmzSignedHeaders String  (optional)
* uploadSigningCertificateRequest UploadSigningCertificateRequest  (optional)
* returns UploadSigningCertificateResponse
* */
const pOST_UploadSigningCertificate = ({ action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, uploadSigningCertificateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        version,
        xAmzContentSha256,
        xAmzDate,
        xAmzAlgorithm,
        xAmzCredential,
        xAmzSecurityToken,
        xAmzSignature,
        xAmzSignedHeaders,
        uploadSigningCertificateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

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
