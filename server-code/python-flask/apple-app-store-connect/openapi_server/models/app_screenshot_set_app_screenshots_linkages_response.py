from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_screenshot_set_relationships_app_screenshots_data_inner import AppScreenshotSetRelationshipsAppScreenshotsDataInner
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_screenshot_set_relationships_app_screenshots_data_inner import AppScreenshotSetRelationshipsAppScreenshotsDataInner  # noqa: E501
from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppScreenshotSetAppScreenshotsLinkagesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None, meta=None):  # noqa: E501
        """AppScreenshotSetAppScreenshotsLinkagesResponse - a model defined in OpenAPI

        :param data: The data of this AppScreenshotSetAppScreenshotsLinkagesResponse.  # noqa: E501
        :type data: List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]
        :param links: The links of this AppScreenshotSetAppScreenshotsLinkagesResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this AppScreenshotSetAppScreenshotsLinkagesResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppScreenshotSetRelationshipsAppScreenshotsDataInner],
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
    def from_dict(cls, dikt) -> 'AppScreenshotSetAppScreenshotsLinkagesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppScreenshotSetAppScreenshotsLinkagesResponse of this AppScreenshotSetAppScreenshotsLinkagesResponse.  # noqa: E501
        :rtype: AppScreenshotSetAppScreenshotsLinkagesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]:
        """Gets the data of this AppScreenshotSetAppScreenshotsLinkagesResponse.


        :return: The data of this AppScreenshotSetAppScreenshotsLinkagesResponse.
        :rtype: List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]):
        """Sets the data of this AppScreenshotSetAppScreenshotsLinkagesResponse.


        :param data: The data of this AppScreenshotSetAppScreenshotsLinkagesResponse.
        :type data: List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this AppScreenshotSetAppScreenshotsLinkagesResponse.


        :return: The links of this AppScreenshotSetAppScreenshotsLinkagesResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this AppScreenshotSetAppScreenshotsLinkagesResponse.


        :param links: The links of this AppScreenshotSetAppScreenshotsLinkagesResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppScreenshotSetAppScreenshotsLinkagesResponse.


        :return: The meta of this AppScreenshotSetAppScreenshotsLinkagesResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppScreenshotSetAppScreenshotsLinkagesResponse.


        :param meta: The meta of this AppScreenshotSetAppScreenshotsLinkagesResponse.
        :type meta: PagingInformation
        """

        self._meta = meta