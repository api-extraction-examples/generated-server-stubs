from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class JsonPointer(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pointer=None):  # noqa: E501
        """JsonPointer - a model defined in OpenAPI

        :param pointer: The pointer of this JsonPointer.  # noqa: E501
        :type pointer: str
        """
        self.openapi_types = {
            'pointer': str
        }

        self.attribute_map = {
            'pointer': 'pointer'
        }

        self._pointer = pointer

    @classmethod
    def from_dict(cls, dikt) -> 'JsonPointer':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JsonPointer of this JsonPointer.  # noqa: E501
        :rtype: JsonPointer
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pointer(self) -> str:
        """Gets the pointer of this JsonPointer.


        :return: The pointer of this JsonPointer.
        :rtype: str
        """
        return self._pointer

    @pointer.setter
    def pointer(self, pointer: str):
        """Sets the pointer of this JsonPointer.


        :param pointer: The pointer of this JsonPointer.
        :type pointer: str
        """

        self._pointer = pointer
