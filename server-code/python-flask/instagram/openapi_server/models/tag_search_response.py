from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.meta_data import MetaData
from openapi_server.models.tag_info import TagInfo
from openapi_server import util

from openapi_server.models.meta_data import MetaData  # noqa: E501
from openapi_server.models.tag_info import TagInfo  # noqa: E501

class TagSearchResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, meta=None):  # noqa: E501
        """TagSearchResponse - a model defined in OpenAPI

        :param data: The data of this TagSearchResponse.  # noqa: E501
        :type data: List[TagInfo]
        :param meta: The meta of this TagSearchResponse.  # noqa: E501
        :type meta: MetaData
        """
        self.openapi_types = {
            'data': List[TagInfo],
            'meta': MetaData
        }

        self.attribute_map = {
            'data': 'data',
            'meta': 'meta'
        }

        self._data = data
        self._meta = meta

    @classmethod
    def from_dict(cls, dikt) -> 'TagSearchResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TagSearchResponse of this TagSearchResponse.  # noqa: E501
        :rtype: TagSearchResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[TagInfo]:
        """Gets the data of this TagSearchResponse.

        List of found tags with brief statistics  # noqa: E501

        :return: The data of this TagSearchResponse.
        :rtype: List[TagInfo]
        """
        return self._data

    @data.setter
    def data(self, data: List[TagInfo]):
        """Sets the data of this TagSearchResponse.

        List of found tags with brief statistics  # noqa: E501

        :param data: The data of this TagSearchResponse.
        :type data: List[TagInfo]
        """

        self._data = data

    @property
    def meta(self) -> MetaData:
        """Gets the meta of this TagSearchResponse.


        :return: The meta of this TagSearchResponse.
        :rtype: MetaData
        """
        return self._meta

    @meta.setter
    def meta(self, meta: MetaData):
        """Sets the meta of this TagSearchResponse.


        :param meta: The meta of this TagSearchResponse.
        :type meta: MetaData
        """

        self._meta = meta