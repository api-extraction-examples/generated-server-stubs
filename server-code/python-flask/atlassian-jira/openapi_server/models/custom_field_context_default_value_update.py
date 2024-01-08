from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.custom_field_context_default_value import CustomFieldContextDefaultValue
from openapi_server import util

from openapi_server.models.custom_field_context_default_value import CustomFieldContextDefaultValue  # noqa: E501

class CustomFieldContextDefaultValueUpdate(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, default_values=None):  # noqa: E501
        """CustomFieldContextDefaultValueUpdate - a model defined in OpenAPI

        :param default_values: The default_values of this CustomFieldContextDefaultValueUpdate.  # noqa: E501
        :type default_values: List[CustomFieldContextDefaultValue]
        """
        self.openapi_types = {
            'default_values': List[CustomFieldContextDefaultValue]
        }

        self.attribute_map = {
            'default_values': 'defaultValues'
        }

        self._default_values = default_values

    @classmethod
    def from_dict(cls, dikt) -> 'CustomFieldContextDefaultValueUpdate':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomFieldContextDefaultValueUpdate of this CustomFieldContextDefaultValueUpdate.  # noqa: E501
        :rtype: CustomFieldContextDefaultValueUpdate
        """
        return util.deserialize_model(dikt, cls)

    @property
    def default_values(self) -> List[CustomFieldContextDefaultValue]:
        """Gets the default_values of this CustomFieldContextDefaultValueUpdate.


        :return: The default_values of this CustomFieldContextDefaultValueUpdate.
        :rtype: List[CustomFieldContextDefaultValue]
        """
        return self._default_values

    @default_values.setter
    def default_values(self, default_values: List[CustomFieldContextDefaultValue]):
        """Sets the default_values of this CustomFieldContextDefaultValueUpdate.


        :param default_values: The default_values of this CustomFieldContextDefaultValueUpdate.
        :type default_values: List[CustomFieldContextDefaultValue]
        """

        self._default_values = default_values
