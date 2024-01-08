from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PolicyResetInput(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, policy_id=None, template_policy_id=None):  # noqa: E501
        """PolicyResetInput - a model defined in OpenAPI

        :param policy_id: The policy_id of this PolicyResetInput.  # noqa: E501
        :type policy_id: str
        :param template_policy_id: The template_policy_id of this PolicyResetInput.  # noqa: E501
        :type template_policy_id: str
        """
        self.openapi_types = {
            'policy_id': str,
            'template_policy_id': str
        }

        self.attribute_map = {
            'policy_id': 'PolicyID',
            'template_policy_id': 'TemplatePolicyID'
        }

        self._policy_id = policy_id
        self._template_policy_id = template_policy_id

    @classmethod
    def from_dict(cls, dikt) -> 'PolicyResetInput':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The policy-reset-input of this PolicyResetInput.  # noqa: E501
        :rtype: PolicyResetInput
        """
        return util.deserialize_model(dikt, cls)

    @property
    def policy_id(self) -> str:
        """Gets the policy_id of this PolicyResetInput.

        Unique ID of the policy to reset  # noqa: E501

        :return: The policy_id of this PolicyResetInput.
        :rtype: str
        """
        return self._policy_id

    @policy_id.setter
    def policy_id(self, policy_id: str):
        """Sets the policy_id of this PolicyResetInput.

        Unique ID of the policy to reset  # noqa: E501

        :param policy_id: The policy_id of this PolicyResetInput.
        :type policy_id: str
        """
        if policy_id is None:
            raise ValueError("Invalid value for `policy_id`, must not be `None`")  # noqa: E501

        self._policy_id = policy_id

    @property
    def template_policy_id(self) -> str:
        """Gets the template_policy_id of this PolicyResetInput.

        Unique ID of the template policy to copy from  # noqa: E501

        :return: The template_policy_id of this PolicyResetInput.
        :rtype: str
        """
        return self._template_policy_id

    @template_policy_id.setter
    def template_policy_id(self, template_policy_id: str):
        """Sets the template_policy_id of this PolicyResetInput.

        Unique ID of the template policy to copy from  # noqa: E501

        :param template_policy_id: The template_policy_id of this PolicyResetInput.
        :type template_policy_id: str
        """

        self._template_policy_id = template_policy_id