from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DetachGroupPolicyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group_name=None, policy_arn=None):  # noqa: E501
        """DetachGroupPolicyRequest - a model defined in OpenAPI

        :param group_name: The group_name of this DetachGroupPolicyRequest.  # noqa: E501
        :type group_name: str
        :param policy_arn: The policy_arn of this DetachGroupPolicyRequest.  # noqa: E501
        :type policy_arn: str
        """
        self.openapi_types = {
            'group_name': str,
            'policy_arn': str
        }

        self.attribute_map = {
            'group_name': 'GroupName',
            'policy_arn': 'PolicyArn'
        }

        self._group_name = group_name
        self._policy_arn = policy_arn

    @classmethod
    def from_dict(cls, dikt) -> 'DetachGroupPolicyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DetachGroupPolicyRequest of this DetachGroupPolicyRequest.  # noqa: E501
        :rtype: DetachGroupPolicyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_name(self) -> str:
        """Gets the group_name of this DetachGroupPolicyRequest.


        :return: The group_name of this DetachGroupPolicyRequest.
        :rtype: str
        """
        return self._group_name

    @group_name.setter
    def group_name(self, group_name: str):
        """Sets the group_name of this DetachGroupPolicyRequest.


        :param group_name: The group_name of this DetachGroupPolicyRequest.
        :type group_name: str
        """
        if group_name is None:
            raise ValueError("Invalid value for `group_name`, must not be `None`")  # noqa: E501

        self._group_name = group_name

    @property
    def policy_arn(self) -> str:
        """Gets the policy_arn of this DetachGroupPolicyRequest.


        :return: The policy_arn of this DetachGroupPolicyRequest.
        :rtype: str
        """
        return self._policy_arn

    @policy_arn.setter
    def policy_arn(self, policy_arn: str):
        """Sets the policy_arn of this DetachGroupPolicyRequest.


        :param policy_arn: The policy_arn of this DetachGroupPolicyRequest.
        :type policy_arn: str
        """
        if policy_arn is None:
            raise ValueError("Invalid value for `policy_arn`, must not be `None`")  # noqa: E501

        self._policy_arn = policy_arn
