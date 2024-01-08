from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetContextKeysForCustomPolicyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, policy_input_list=None):  # noqa: E501
        """GetContextKeysForCustomPolicyRequest - a model defined in OpenAPI

        :param policy_input_list: The policy_input_list of this GetContextKeysForCustomPolicyRequest.  # noqa: E501
        :type policy_input_list: List
        """
        self.openapi_types = {
            'policy_input_list': List
        }

        self.attribute_map = {
            'policy_input_list': 'PolicyInputList'
        }

        self._policy_input_list = policy_input_list

    @classmethod
    def from_dict(cls, dikt) -> 'GetContextKeysForCustomPolicyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetContextKeysForCustomPolicyRequest of this GetContextKeysForCustomPolicyRequest.  # noqa: E501
        :rtype: GetContextKeysForCustomPolicyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def policy_input_list(self) -> List:
        """Gets the policy_input_list of this GetContextKeysForCustomPolicyRequest.


        :return: The policy_input_list of this GetContextKeysForCustomPolicyRequest.
        :rtype: List
        """
        return self._policy_input_list

    @policy_input_list.setter
    def policy_input_list(self, policy_input_list: List):
        """Sets the policy_input_list of this GetContextKeysForCustomPolicyRequest.


        :param policy_input_list: The policy_input_list of this GetContextKeysForCustomPolicyRequest.
        :type policy_input_list: List
        """
        if policy_input_list is None:
            raise ValueError("Invalid value for `policy_input_list`, must not be `None`")  # noqa: E501

        self._policy_input_list = policy_input_list
