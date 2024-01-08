from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_screenshot import AppScreenshot
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_screenshot import AppScreenshot  # noqa: E501
from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppScreenshotsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None, meta=None):  # noqa: E501
        """AppScreenshotsResponse - a model defined in OpenAPI

        :param data: The data of this AppScreenshotsResponse.  # noqa: E501
        :type data: List[AppScreenshot]
        :param links: The links of this AppScreenshotsResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this AppScreenshotsResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppScreenshot],
            'links': PagedDocumentLinks,
            'meta': PagingInformation
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links',
            'meta': 'meta'
        }

        self._data = data
        self._links = links
        self._meta = meta

    @classmethod
    def from_dict(cls, dikt) -> 'AppScreenshotsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppScreenshotsResponse of this AppScreenshotsResponse.  # noqa: E501
        :rtype: AppScreenshotsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppScreenshot]:
        """Gets the data of this AppScreenshotsResponse.


        :return: The data of this AppScreenshotsResponse.
        :rtype: List[AppScreenshot]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppScreenshot]):
        """Sets the data of this AppScreenshotsResponse.


        :param data: The data of this AppScreenshotsResponse.
        :type data: List[AppScreenshot]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this AppScreenshotsResponse.


        :return: The links of this AppScreenshotsResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this AppScreenshotsResponse.


        :param links: The links of this AppScreenshotsResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppScreenshotsResponse.


        :return: The meta of this AppScreenshotsResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppScreenshotsResponse.


        :param meta: The meta of this AppScreenshotsResponse.
        :type meta: PagingInformation
        """

        self._meta = meta
