from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class RemoveCustomFieldSettingRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, custom_field=None):  # noqa: E501
        """RemoveCustomFieldSettingRequest - a model defined in OpenAPI

        :param custom_field: The custom_field of this RemoveCustomFieldSettingRequest.  # noqa: E501
        :type custom_field: str
        """
        self.openapi_types = {
            'custom_field': str
        }

        self.attribute_map = {
            'custom_field': 'custom_field'
        }

        self._custom_field = custom_field

    @classmethod
    def from_dict(cls, dikt) -> 'RemoveCustomFieldSettingRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RemoveCustomFieldSettingRequest of this RemoveCustomFieldSettingRequest.  # noqa: E501
        :rtype: RemoveCustomFieldSettingRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def custom_field(self) -> str:
        """Gets the custom_field of this RemoveCustomFieldSettingRequest.

        The custom field to remove from this portfolio.  # noqa: E501

        :return: The custom_field of this RemoveCustomFieldSettingRequest.
        :rtype: str
        """
        return self._custom_field

    @custom_field.setter
    def custom_field(self, custom_field: str):
        """Sets the custom_field of this RemoveCustomFieldSettingRequest.

        The custom field to remove from this portfolio.  # noqa: E501

        :param custom_field: The custom_field of this RemoveCustomFieldSettingRequest.
        :type custom_field: str
        """
        if custom_field is None:
            raise ValueError("Invalid value for `custom_field`, must not be `None`")  # noqa: E501

        self._custom_field = custom_field
