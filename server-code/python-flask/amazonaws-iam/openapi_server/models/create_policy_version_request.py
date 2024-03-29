from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreatePolicyVersionRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, policy_arn=None, policy_document=None, set_as_default=None):  # noqa: E501
        """CreatePolicyVersionRequest - a model defined in OpenAPI

        :param policy_arn: The policy_arn of this CreatePolicyVersionRequest.  # noqa: E501
        :type policy_arn: str
        :param policy_document: The policy_document of this CreatePolicyVersionRequest.  # noqa: E501
        :type policy_document: str
        :param set_as_default: The set_as_default of this CreatePolicyVersionRequest.  # noqa: E501
        :type set_as_default: bool
        """
        self.openapi_types = {
            'policy_arn': str,
            'policy_document': str,
            'set_as_default': bool
        }

        self.attribute_map = {
            'policy_arn': 'PolicyArn',
            'policy_document': 'PolicyDocument',
            'set_as_default': 'SetAsDefault'
        }

        self._policy_arn = policy_arn
        self._policy_document = policy_document
        self._set_as_default = set_as_default

    @classmethod
    def from_dict(cls, dikt) -> 'CreatePolicyVersionRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreatePolicyVersionRequest of this CreatePolicyVersionRequest.  # noqa: E501
        :rtype: CreatePolicyVersionRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def policy_arn(self) -> str:
        """Gets the policy_arn of this CreatePolicyVersionRequest.


        :return: The policy_arn of this CreatePolicyVersionRequest.
        :rtype: str
        """
        return self._policy_arn

    @policy_arn.setter
    def policy_arn(self, policy_arn: str):
        """Sets the policy_arn of this CreatePolicyVersionRequest.


        :param policy_arn: The policy_arn of this CreatePolicyVersionRequest.
        :type policy_arn: str
        """
        if policy_arn is None:
            raise ValueError("Invalid value for `policy_arn`, must not be `None`")  # noqa: E501

        self._policy_arn = policy_arn

    @property
    def policy_document(self) -> str:
        """Gets the policy_document of this CreatePolicyVersionRequest.


        :return: The policy_document of this CreatePolicyVersionRequest.
        :rtype: str
        """
        return self._policy_document

    @policy_document.setter
    def policy_document(self, policy_document: str):
        """Sets the policy_document of this CreatePolicyVersionRequest.


        :param policy_document: The policy_document of this CreatePolicyVersionRequest.
        :type policy_document: str
        """
        if policy_document is None:
            raise ValueError("Invalid value for `policy_document`, must not be `None`")  # noqa: E501

        self._policy_document = policy_document

    @property
    def set_as_default(self) -> bool:
        """Gets the set_as_default of this CreatePolicyVersionRequest.


        :return: The set_as_default of this CreatePolicyVersionRequest.
        :rtype: bool
        """
        return self._set_as_default

    @set_as_default.setter
    def set_as_default(self, set_as_default: bool):
        """Sets the set_as_default of this CreatePolicyVersionRequest.


        :param set_as_default: The set_as_default of this CreatePolicyVersionRequest.
        :type set_as_default: bool
        """

        self._set_as_default = set_as_default
