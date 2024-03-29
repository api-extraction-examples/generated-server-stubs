from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UntagPolicyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, policy_arn=None, tag_keys=None):  # noqa: E501
        """UntagPolicyRequest - a model defined in OpenAPI

        :param policy_arn: The policy_arn of this UntagPolicyRequest.  # noqa: E501
        :type policy_arn: str
        :param tag_keys: The tag_keys of this UntagPolicyRequest.  # noqa: E501
        :type tag_keys: List
        """
        self.openapi_types = {
            'policy_arn': str,
            'tag_keys': List
        }

        self.attribute_map = {
            'policy_arn': 'PolicyArn',
            'tag_keys': 'TagKeys'
        }

        self._policy_arn = policy_arn
        self._tag_keys = tag_keys

    @classmethod
    def from_dict(cls, dikt) -> 'UntagPolicyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UntagPolicyRequest of this UntagPolicyRequest.  # noqa: E501
        :rtype: UntagPolicyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def policy_arn(self) -> str:
        """Gets the policy_arn of this UntagPolicyRequest.


        :return: The policy_arn of this UntagPolicyRequest.
        :rtype: str
        """
        return self._policy_arn

    @policy_arn.setter
    def policy_arn(self, policy_arn: str):
        """Sets the policy_arn of this UntagPolicyRequest.


        :param policy_arn: The policy_arn of this UntagPolicyRequest.
        :type policy_arn: str
        """
        if policy_arn is None:
            raise ValueError("Invalid value for `policy_arn`, must not be `None`")  # noqa: E501

        self._policy_arn = policy_arn

    @property
    def tag_keys(self) -> List:
        """Gets the tag_keys of this UntagPolicyRequest.


        :return: The tag_keys of this UntagPolicyRequest.
        :rtype: List
        """
        return self._tag_keys

    @tag_keys.setter
    def tag_keys(self, tag_keys: List):
        """Sets the tag_keys of this UntagPolicyRequest.


        :param tag_keys: The tag_keys of this UntagPolicyRequest.
        :type tag_keys: List
        """
        if tag_keys is None:
            raise ValueError("Invalid value for `tag_keys`, must not be `None`")  # noqa: E501

        self._tag_keys = tag_keys
