from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.field_configuration_item import FieldConfigurationItem
from openapi_server import util

from openapi_server.models.field_configuration_item import FieldConfigurationItem  # noqa: E501

class FieldConfigurationItemsDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, field_configuration_items=None):  # noqa: E501
        """FieldConfigurationItemsDetails - a model defined in OpenAPI

        :param field_configuration_items: The field_configuration_items of this FieldConfigurationItemsDetails.  # noqa: E501
        :type field_configuration_items: List[FieldConfigurationItem]
        """
        self.openapi_types = {
            'field_configuration_items': List[FieldConfigurationItem]
        }

        self.attribute_map = {
            'field_configuration_items': 'fieldConfigurationItems'
        }

        self._field_configuration_items = field_configuration_items

    @classmethod
    def from_dict(cls, dikt) -> 'FieldConfigurationItemsDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FieldConfigurationItemsDetails of this FieldConfigurationItemsDetails.  # noqa: E501
        :rtype: FieldConfigurationItemsDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def field_configuration_items(self) -> List[FieldConfigurationItem]:
        """Gets the field_configuration_items of this FieldConfigurationItemsDetails.

        Details of fields in a field configuration.  # noqa: E501

        :return: The field_configuration_items of this FieldConfigurationItemsDetails.
        :rtype: List[FieldConfigurationItem]
        """
        return self._field_configuration_items

    @field_configuration_items.setter
    def field_configuration_items(self, field_configuration_items: List[FieldConfigurationItem]):
        """Sets the field_configuration_items of this FieldConfigurationItemsDetails.

        Details of fields in a field configuration.  # noqa: E501

        :param field_configuration_items: The field_configuration_items of this FieldConfigurationItemsDetails.
        :type field_configuration_items: List[FieldConfigurationItem]
        """
        if field_configuration_items is None:
            raise ValueError("Invalid value for `field_configuration_items`, must not be `None`")  # noqa: E501

        self._field_configuration_items = field_configuration_items
