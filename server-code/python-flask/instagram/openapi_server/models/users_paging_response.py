from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.cursor_pagination_info import CursorPaginationInfo
from openapi_server.models.meta_data import MetaData
from openapi_server.models.user_short_info import UserShortInfo
from openapi_server import util

from openapi_server.models.cursor_pagination_info import CursorPaginationInfo  # noqa: E501
from openapi_server.models.meta_data import MetaData  # noqa: E501
from openapi_server.models.user_short_info import UserShortInfo  # noqa: E501

class UsersPagingResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, meta=None, pagination=None):  # noqa: E501
        """UsersPagingResponse - a model defined in OpenAPI

        :param data: The data of this UsersPagingResponse.  # noqa: E501
        :type data: List[UserShortInfo]
        :param meta: The meta of this UsersPagingResponse.  # noqa: E501
        :type meta: MetaData
        :param pagination: The pagination of this UsersPagingResponse.  # noqa: E501
        :type pagination: CursorPaginationInfo
        """
        self.openapi_types = {
            'data': List[UserShortInfo],
            'meta': MetaData,
            'pagination': CursorPaginationInfo
        }

        self.attribute_map = {
            'data': 'data',
            'meta': 'meta',
            'pagination': 'pagination'
        }

        self._data = data
        self._meta = meta
        self._pagination = pagination

    @classmethod
    def from_dict(cls, dikt) -> 'UsersPagingResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UsersPagingResponse of this UsersPagingResponse.  # noqa: E501
        :rtype: UsersPagingResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[UserShortInfo]:
        """Gets the data of this UsersPagingResponse.

        List of user short information entries  # noqa: E501

        :return: The data of this UsersPagingResponse.
        :rtype: List[UserShortInfo]
        """
        return self._data

    @data.setter
    def data(self, data: List[UserShortInfo]):
        """Sets the data of this UsersPagingResponse.

        List of user short information entries  # noqa: E501

        :param data: The data of this UsersPagingResponse.
        :type data: List[UserShortInfo]
        """

        self._data = data

    @property
    def meta(self) -> MetaData:
        """Gets the meta of this UsersPagingResponse.


        :return: The meta of this UsersPagingResponse.
        :rtype: MetaData
        """
        return self._meta

    @meta.setter
    def meta(self, meta: MetaData):
        """Sets the meta of this UsersPagingResponse.


        :param meta: The meta of this UsersPagingResponse.
        :type meta: MetaData
        """

        self._meta = meta

    @property
    def pagination(self) -> CursorPaginationInfo:
        """Gets the pagination of this UsersPagingResponse.


        :return: The pagination of this UsersPagingResponse.
        :rtype: CursorPaginationInfo
        """
        return self._pagination

    @pagination.setter
    def pagination(self, pagination: CursorPaginationInfo):
        """Sets the pagination of this UsersPagingResponse.


        :param pagination: The pagination of this UsersPagingResponse.
        :type pagination: CursorPaginationInfo
        """

        self._pagination = pagination
