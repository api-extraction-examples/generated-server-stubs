from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.field_configuration_to_issue_type_mapping import FieldConfigurationToIssueTypeMapping
from openapi_server import util

from openapi_server.models.field_configuration_to_issue_type_mapping import FieldConfigurationToIssueTypeMapping  # noqa: E501

class AssociateFieldConfigurationsWithIssueTypesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, mappings=None):  # noqa: E501
        """AssociateFieldConfigurationsWithIssueTypesRequest - a model defined in OpenAPI

        :param mappings: The mappings of this AssociateFieldConfigurationsWithIssueTypesRequest.  # noqa: E501
        :type mappings: list[FieldConfigurationToIssueTypeMapping]
        """
        self.openapi_types = {
            'mappings': list[FieldConfigurationToIssueTypeMapping]
        }

        self.attribute_map = {
            'mappings': 'mappings'
        }

        self._mappings = mappings

    @classmethod
    def from_dict(cls, dikt) -> 'AssociateFieldConfigurationsWithIssueTypesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AssociateFieldConfigurationsWithIssueTypesRequest of this AssociateFieldConfigurationsWithIssueTypesRequest.  # noqa: E501
        :rtype: AssociateFieldConfigurationsWithIssueTypesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def mappings(self) -> list[FieldConfigurationToIssueTypeMapping]:
        """Gets the mappings of this AssociateFieldConfigurationsWithIssueTypesRequest.

        Field configuration to issue type mappings.  # noqa: E501

        :return: The mappings of this AssociateFieldConfigurationsWithIssueTypesRequest.
        :rtype: list[FieldConfigurationToIssueTypeMapping]
        """
        return self._mappings

    @mappings.setter
    def mappings(self, mappings: list[FieldConfigurationToIssueTypeMapping]):
        """Sets the mappings of this AssociateFieldConfigurationsWithIssueTypesRequest.

        Field configuration to issue type mappings.  # noqa: E501

        :param mappings: The mappings of this AssociateFieldConfigurationsWithIssueTypesRequest.
        :type mappings: list[FieldConfigurationToIssueTypeMapping]
        """
        if mappings is None:
            raise ValueError("Invalid value for `mappings`, must not be `None`")  # noqa: E501

        self._mappings = mappings
