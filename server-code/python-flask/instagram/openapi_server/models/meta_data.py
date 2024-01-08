from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class MetaData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, code=None):  # noqa: E501
        """MetaData - a model defined in OpenAPI

        :param code: The code of this MetaData.  # noqa: E501
        :type code: int
        """
        self.openapi_types = {
            'code': int
        }

        self.attribute_map = {
            'code': 'code'
        }

        self._code = code

    @classmethod
    def from_dict(cls, dikt) -> 'MetaData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MetaData of this MetaData.  # noqa: E501
        :rtype: MetaData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def code(self) -> int:
        """Gets the code of this MetaData.

        HTTP result code  # noqa: E501

        :return: The code of this MetaData.
        :rtype: int
        """
        return self._code

    @code.setter
    def code(self, code: int):
        """Sets the code of this MetaData.

        HTTP result code  # noqa: E501

        :param code: The code of this MetaData.
        :type code: int
        """

        self._code = code