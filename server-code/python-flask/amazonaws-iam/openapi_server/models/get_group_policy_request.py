from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetGroupPolicyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group_name=None, policy_name=None):  # noqa: E501
        """GetGroupPolicyRequest - a model defined in OpenAPI

        :param group_name: The group_name of this GetGroupPolicyRequest.  # noqa: E501
        :type group_name: str
        :param policy_name: The policy_name of this GetGroupPolicyRequest.  # noqa: E501
        :type policy_name: str
        """
        self.openapi_types = {
            'group_name': str,
            'policy_name': str
        }

        self.attribute_map = {
            'group_name': 'GroupName',
            'policy_name': 'PolicyName'
        }

        self._group_name = group_name
        self._policy_name = policy_name

    @classmethod
    def from_dict(cls, dikt) -> 'GetGroupPolicyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetGroupPolicyRequest of this GetGroupPolicyRequest.  # noqa: E501
        :rtype: GetGroupPolicyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_name(self) -> str:
        """Gets the group_name of this GetGroupPolicyRequest.


        :return: The group_name of this GetGroupPolicyRequest.
        :rtype: str
        """
        return self._group_name

    @group_name.setter
    def group_name(self, group_name: str):
        """Sets the group_name of this GetGroupPolicyRequest.


        :param group_name: The group_name of this GetGroupPolicyRequest.
        :type group_name: str
        """
        if group_name is None:
            raise ValueError("Invalid value for `group_name`, must not be `None`")  # noqa: E501

        self._group_name = group_name

    @property
    def policy_name(self) -> str:
        """Gets the policy_name of this GetGroupPolicyRequest.


        :return: The policy_name of this GetGroupPolicyRequest.
        :rtype: str
        """
        return self._policy_name

    @policy_name.setter
    def policy_name(self, policy_name: str):
        """Sets the policy_name of this GetGroupPolicyRequest.


        :param policy_name: The policy_name of this GetGroupPolicyRequest.
        :type policy_name: str
        """
        if policy_name is None:
            raise ValueError("Invalid value for `policy_name`, must not be `None`")  # noqa: E501

        self._policy_name = policy_name