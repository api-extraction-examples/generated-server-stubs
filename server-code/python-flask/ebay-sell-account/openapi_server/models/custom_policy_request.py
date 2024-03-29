from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CustomPolicyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, label=None, name=None):  # noqa: E501
        """CustomPolicyRequest - a model defined in OpenAPI

        :param description: The description of this CustomPolicyRequest.  # noqa: E501
        :type description: str
        :param label: The label of this CustomPolicyRequest.  # noqa: E501
        :type label: str
        :param name: The name of this CustomPolicyRequest.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'description': str,
            'label': str,
            'name': str
        }

        self.attribute_map = {
            'description': 'description',
            'label': 'label',
            'name': 'name'
        }

        self._description = description
        self._label = label
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'CustomPolicyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomPolicyRequest of this CustomPolicyRequest.  # noqa: E501
        :rtype: CustomPolicyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this CustomPolicyRequest.

        Details of the seller's specific policy and terms for this policy.<br/><br/><b>Max length:</b> 15,000  # noqa: E501

        :return: The description of this CustomPolicyRequest.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this CustomPolicyRequest.

        Details of the seller's specific policy and terms for this policy.<br/><br/><b>Max length:</b> 15,000  # noqa: E501

        :param description: The description of this CustomPolicyRequest.
        :type description: str
        """

        self._description = description

    @property
    def label(self) -> str:
        """Gets the label of this CustomPolicyRequest.

        Customer-facing label shown on View Item pages for items to which the policy applies. This seller-defined string is displayed as a system-generated hyperlink pointing to detailed policy information.<br/><br/><b>Max length:</b> 65  # noqa: E501

        :return: The label of this CustomPolicyRequest.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label: str):
        """Sets the label of this CustomPolicyRequest.

        Customer-facing label shown on View Item pages for items to which the policy applies. This seller-defined string is displayed as a system-generated hyperlink pointing to detailed policy information.<br/><br/><b>Max length:</b> 65  # noqa: E501

        :param label: The label of this CustomPolicyRequest.
        :type label: str
        """

        self._label = label

    @property
    def name(self) -> str:
        """Gets the name of this CustomPolicyRequest.

        The seller-defined name for the custom policy. Names must be unique for policies assigned to the same seller, policy type, and eBay marketplace.<br /><span class=\"tablenote\"><strong>Note:</strong> This field is visible only to the seller. </span><br/><br/><b>Max length:</b> 65  # noqa: E501

        :return: The name of this CustomPolicyRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CustomPolicyRequest.

        The seller-defined name for the custom policy. Names must be unique for policies assigned to the same seller, policy type, and eBay marketplace.<br /><span class=\"tablenote\"><strong>Note:</strong> This field is visible only to the seller. </span><br/><br/><b>Max length:</b> 65  # noqa: E501

        :param name: The name of this CustomPolicyRequest.
        :type name: str
        """

        self._name = name
