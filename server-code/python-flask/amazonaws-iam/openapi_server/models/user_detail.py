from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_detail_permissions_boundary import UserDetailPermissionsBoundary
from openapi_server import util

from openapi_server.models.user_detail_permissions_boundary import UserDetailPermissionsBoundary  # noqa: E501

class UserDetail(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, path=None, user_name=None, user_id=None, arn=None, create_date=None, user_policy_list=None, group_list=None, attached_managed_policies=None, permissions_boundary=None, tags=None):  # noqa: E501
        """UserDetail - a model defined in OpenAPI

        :param path: The path of this UserDetail.  # noqa: E501
        :type path: str
        :param user_name: The user_name of this UserDetail.  # noqa: E501
        :type user_name: str
        :param user_id: The user_id of this UserDetail.  # noqa: E501
        :type user_id: str
        :param arn: The arn of this UserDetail.  # noqa: E501
        :type arn: str
        :param create_date: The create_date of this UserDetail.  # noqa: E501
        :type create_date: datetime
        :param user_policy_list: The user_policy_list of this UserDetail.  # noqa: E501
        :type user_policy_list: List
        :param group_list: The group_list of this UserDetail.  # noqa: E501
        :type group_list: List
        :param attached_managed_policies: The attached_managed_policies of this UserDetail.  # noqa: E501
        :type attached_managed_policies: List
        :param permissions_boundary: The permissions_boundary of this UserDetail.  # noqa: E501
        :type permissions_boundary: UserDetailPermissionsBoundary
        :param tags: The tags of this UserDetail.  # noqa: E501
        :type tags: List
        """
        self.openapi_types = {
            'path': str,
            'user_name': str,
            'user_id': str,
            'arn': str,
            'create_date': datetime,
            'user_policy_list': List,
            'group_list': List,
            'attached_managed_policies': List,
            'permissions_boundary': UserDetailPermissionsBoundary,
            'tags': List
        }

        self.attribute_map = {
            'path': 'Path',
            'user_name': 'UserName',
            'user_id': 'UserId',
            'arn': 'Arn',
            'create_date': 'CreateDate',
            'user_policy_list': 'UserPolicyList',
            'group_list': 'GroupList',
            'attached_managed_policies': 'AttachedManagedPolicies',
            'permissions_boundary': 'PermissionsBoundary',
            'tags': 'Tags'
        }

        self._path = path
        self._user_name = user_name
        self._user_id = user_id
        self._arn = arn
        self._create_date = create_date
        self._user_policy_list = user_policy_list
        self._group_list = group_list
        self._attached_managed_policies = attached_managed_policies
        self._permissions_boundary = permissions_boundary
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'UserDetail':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserDetail of this UserDetail.  # noqa: E501
        :rtype: UserDetail
        """
        return util.deserialize_model(dikt, cls)

    @property
    def path(self) -> str:
        """Gets the path of this UserDetail.


        :return: The path of this UserDetail.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path: str):
        """Sets the path of this UserDetail.


        :param path: The path of this UserDetail.
        :type path: str
        """

        self._path = path

    @property
    def user_name(self) -> str:
        """Gets the user_name of this UserDetail.


        :return: The user_name of this UserDetail.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this UserDetail.


        :param user_name: The user_name of this UserDetail.
        :type user_name: str
        """

        self._user_name = user_name

    @property
    def user_id(self) -> str:
        """Gets the user_id of this UserDetail.


        :return: The user_id of this UserDetail.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: str):
        """Sets the user_id of this UserDetail.


        :param user_id: The user_id of this UserDetail.
        :type user_id: str
        """

        self._user_id = user_id

    @property
    def arn(self) -> str:
        """Gets the arn of this UserDetail.

        <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>  # noqa: E501

        :return: The arn of this UserDetail.
        :rtype: str
        """
        return self._arn

    @arn.setter
    def arn(self, arn: str):
        """Sets the arn of this UserDetail.

        <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>  # noqa: E501

        :param arn: The arn of this UserDetail.
        :type arn: str
        """
        if arn is not None and len(arn) > 2048:
            raise ValueError("Invalid value for `arn`, length must be less than or equal to `2048`")  # noqa: E501
        if arn is not None and len(arn) < 20:
            raise ValueError("Invalid value for `arn`, length must be greater than or equal to `20`")  # noqa: E501

        self._arn = arn

    @property
    def create_date(self) -> datetime:
        """Gets the create_date of this UserDetail.


        :return: The create_date of this UserDetail.
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date: datetime):
        """Sets the create_date of this UserDetail.


        :param create_date: The create_date of this UserDetail.
        :type create_date: datetime
        """

        self._create_date = create_date

    @property
    def user_policy_list(self) -> List:
        """Gets the user_policy_list of this UserDetail.


        :return: The user_policy_list of this UserDetail.
        :rtype: List
        """
        return self._user_policy_list

    @user_policy_list.setter
    def user_policy_list(self, user_policy_list: List):
        """Sets the user_policy_list of this UserDetail.


        :param user_policy_list: The user_policy_list of this UserDetail.
        :type user_policy_list: List
        """

        self._user_policy_list = user_policy_list

    @property
    def group_list(self) -> List:
        """Gets the group_list of this UserDetail.


        :return: The group_list of this UserDetail.
        :rtype: List
        """
        return self._group_list

    @group_list.setter
    def group_list(self, group_list: List):
        """Sets the group_list of this UserDetail.


        :param group_list: The group_list of this UserDetail.
        :type group_list: List
        """

        self._group_list = group_list

    @property
    def attached_managed_policies(self) -> List:
        """Gets the attached_managed_policies of this UserDetail.


        :return: The attached_managed_policies of this UserDetail.
        :rtype: List
        """
        return self._attached_managed_policies

    @attached_managed_policies.setter
    def attached_managed_policies(self, attached_managed_policies: List):
        """Sets the attached_managed_policies of this UserDetail.


        :param attached_managed_policies: The attached_managed_policies of this UserDetail.
        :type attached_managed_policies: List
        """

        self._attached_managed_policies = attached_managed_policies

    @property
    def permissions_boundary(self) -> UserDetailPermissionsBoundary:
        """Gets the permissions_boundary of this UserDetail.


        :return: The permissions_boundary of this UserDetail.
        :rtype: UserDetailPermissionsBoundary
        """
        return self._permissions_boundary

    @permissions_boundary.setter
    def permissions_boundary(self, permissions_boundary: UserDetailPermissionsBoundary):
        """Sets the permissions_boundary of this UserDetail.


        :param permissions_boundary: The permissions_boundary of this UserDetail.
        :type permissions_boundary: UserDetailPermissionsBoundary
        """

        self._permissions_boundary = permissions_boundary

    @property
    def tags(self) -> List:
        """Gets the tags of this UserDetail.


        :return: The tags of this UserDetail.
        :rtype: List
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List):
        """Sets the tags of this UserDetail.


        :param tags: The tags of this UserDetail.
        :type tags: List
        """

        self._tags = tags
