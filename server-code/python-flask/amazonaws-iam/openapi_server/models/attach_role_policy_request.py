from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AttachRolePolicyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, role_name=None, policy_arn=None):  # noqa: E501
        """AttachRolePolicyRequest - a model defined in OpenAPI

        :param role_name: The role_name of this AttachRolePolicyRequest.  # noqa: E501
        :type role_name: str
        :param policy_arn: The policy_arn of this AttachRolePolicyRequest.  # noqa: E501
        :type policy_arn: str
        """
        self.openapi_types = {
            'role_name': str,
            'policy_arn': str
        }

        self.attribute_map = {
            'role_name': 'RoleName',
            'policy_arn': 'PolicyArn'
        }

        self._role_name = role_name
        self._policy_arn = policy_arn

    @classmethod
    def from_dict(cls, dikt) -> 'AttachRolePolicyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AttachRolePolicyRequest of this AttachRolePolicyRequest.  # noqa: E501
        :rtype: AttachRolePolicyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def role_name(self) -> str:
        """Gets the role_name of this AttachRolePolicyRequest.


        :return: The role_name of this AttachRolePolicyRequest.
        :rtype: str
        """
        return self._role_name

    @role_name.setter
    def role_name(self, role_name: str):
        """Sets the role_name of this AttachRolePolicyRequest.


        :param role_name: The role_name of this AttachRolePolicyRequest.
        :type role_name: str
        """
        if role_name is None:
            raise ValueError("Invalid value for `role_name`, must not be `None`")  # noqa: E501

        self._role_name = role_name

    @property
    def policy_arn(self) -> str:
        """Gets the policy_arn of this AttachRolePolicyRequest.


        :return: The policy_arn of this AttachRolePolicyRequest.
        :rtype: str
        """
        return self._policy_arn

    @policy_arn.setter
    def policy_arn(self, policy_arn: str):
        """Sets the policy_arn of this AttachRolePolicyRequest.


        :param policy_arn: The policy_arn of this AttachRolePolicyRequest.
        :type policy_arn: str
        """
        if policy_arn is None:
            raise ValueError("Invalid value for `policy_arn`, must not be `None`")  # noqa: E501

        self._policy_arn = policy_arn
