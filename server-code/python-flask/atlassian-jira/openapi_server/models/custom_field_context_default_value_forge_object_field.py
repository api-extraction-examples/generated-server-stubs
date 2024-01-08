from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CustomFieldContextDefaultValueForgeObjectField(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, object=None, type=None):  # noqa: E501
        """CustomFieldContextDefaultValueForgeObjectField - a model defined in OpenAPI

        :param object: The object of this CustomFieldContextDefaultValueForgeObjectField.  # noqa: E501
        :type object: object
        :param type: The type of this CustomFieldContextDefaultValueForgeObjectField.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'object': object,
            'type': str
        }

        self.attribute_map = {
            'object': 'object',
            'type': 'type'
        }

        self._object = object
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'CustomFieldContextDefaultValueForgeObjectField':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomFieldContextDefaultValueForgeObjectField of this CustomFieldContextDefaultValueForgeObjectField.  # noqa: E501
        :rtype: CustomFieldContextDefaultValueForgeObjectField
        """
        return util.deserialize_model(dikt, cls)

    @property
    def object(self) -> object:
        """Gets the object of this CustomFieldContextDefaultValueForgeObjectField.

        The default JSON object.  # noqa: E501

        :return: The object of this CustomFieldContextDefaultValueForgeObjectField.
        :rtype: object
        """
        return self._object

    @object.setter
    def object(self, object: object):
        """Sets the object of this CustomFieldContextDefaultValueForgeObjectField.

        The default JSON object.  # noqa: E501

        :param object: The object of this CustomFieldContextDefaultValueForgeObjectField.
        :type object: object
        """

        self._object = object

    @property
    def type(self) -> str:
        """Gets the type of this CustomFieldContextDefaultValueForgeObjectField.


        :return: The type of this CustomFieldContextDefaultValueForgeObjectField.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this CustomFieldContextDefaultValueForgeObjectField.


        :param type: The type of this CustomFieldContextDefaultValueForgeObjectField.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
