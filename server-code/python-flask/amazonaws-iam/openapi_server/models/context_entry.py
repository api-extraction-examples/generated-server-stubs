from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.context_key_type_enum import ContextKeyTypeEnum
from openapi_server import util

from openapi_server.models.context_key_type_enum import ContextKeyTypeEnum  # noqa: E501

class ContextEntry(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, context_key_name=None, context_key_values=None, context_key_type=None):  # noqa: E501
        """ContextEntry - a model defined in OpenAPI

        :param context_key_name: The context_key_name of this ContextEntry.  # noqa: E501
        :type context_key_name: str
        :param context_key_values: The context_key_values of this ContextEntry.  # noqa: E501
        :type context_key_values: List
        :param context_key_type: The context_key_type of this ContextEntry.  # noqa: E501
        :type context_key_type: ContextKeyTypeEnum
        """
        self.openapi_types = {
            'context_key_name': str,
            'context_key_values': List,
            'context_key_type': ContextKeyTypeEnum
        }

        self.attribute_map = {
            'context_key_name': 'ContextKeyName',
            'context_key_values': 'ContextKeyValues',
            'context_key_type': 'ContextKeyType'
        }

        self._context_key_name = context_key_name
        self._context_key_values = context_key_values
        self._context_key_type = context_key_type

    @classmethod
    def from_dict(cls, dikt) -> 'ContextEntry':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ContextEntry of this ContextEntry.  # noqa: E501
        :rtype: ContextEntry
        """
        return util.deserialize_model(dikt, cls)

    @property
    def context_key_name(self) -> str:
        """Gets the context_key_name of this ContextEntry.


        :return: The context_key_name of this ContextEntry.
        :rtype: str
        """
        return self._context_key_name

    @context_key_name.setter
    def context_key_name(self, context_key_name: str):
        """Sets the context_key_name of this ContextEntry.


        :param context_key_name: The context_key_name of this ContextEntry.
        :type context_key_name: str
        """

        self._context_key_name = context_key_name

    @property
    def context_key_values(self) -> List:
        """Gets the context_key_values of this ContextEntry.


        :return: The context_key_values of this ContextEntry.
        :rtype: List
        """
        return self._context_key_values

    @context_key_values.setter
    def context_key_values(self, context_key_values: List):
        """Sets the context_key_values of this ContextEntry.


        :param context_key_values: The context_key_values of this ContextEntry.
        :type context_key_values: List
        """

        self._context_key_values = context_key_values

    @property
    def context_key_type(self) -> ContextKeyTypeEnum:
        """Gets the context_key_type of this ContextEntry.


        :return: The context_key_type of this ContextEntry.
        :rtype: ContextKeyTypeEnum
        """
        return self._context_key_type

    @context_key_type.setter
    def context_key_type(self, context_key_type: ContextKeyTypeEnum):
        """Sets the context_key_type of this ContextEntry.


        :param context_key_type: The context_key_type of this ContextEntry.
        :type context_key_type: ContextKeyTypeEnum
        """

        self._context_key_type = context_key_type