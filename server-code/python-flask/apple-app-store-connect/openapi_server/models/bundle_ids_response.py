from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bundle_id import BundleId
from openapi_server.models.bundle_id_response_included_inner import BundleIdResponseIncludedInner
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.bundle_id import BundleId  # noqa: E501
from openapi_server.models.bundle_id_response_included_inner import BundleIdResponseIncludedInner  # noqa: E501
from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class BundleIdsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None, meta=None):  # noqa: E501
        """BundleIdsResponse - a model defined in OpenAPI

        :param data: The data of this BundleIdsResponse.  # noqa: E501
        :type data: List[BundleId]
        :param included: The included of this BundleIdsResponse.  # noqa: E501
        :type included: List[BundleIdResponseIncludedInner]
        :param links: The links of this BundleIdsResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this BundleIdsResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[BundleId],
            'included': List[BundleIdResponseIncludedInner],
            'links': PagedDocumentLinks,
            'meta': PagingInformation
        }

        self.attribute_map = {
            'data': 'data',
            'included': 'included',
            'links': 'links',
            'meta': 'meta'
        }

        self._data = data
        self._included = included
        self._links = links
        self._meta = meta

    @classmethod
    def from_dict(cls, dikt) -> 'BundleIdsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdsResponse of this BundleIdsResponse.  # noqa: E501
        :rtype: BundleIdsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[BundleId]:
        """Gets the data of this BundleIdsResponse.


        :return: The data of this BundleIdsResponse.
        :rtype: List[BundleId]
        """
        return self._data

    @data.setter
    def data(self, data: List[BundleId]):
        """Sets the data of this BundleIdsResponse.


        :param data: The data of this BundleIdsResponse.
        :type data: List[BundleId]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[BundleIdResponseIncludedInner]:
        """Gets the included of this BundleIdsResponse.


        :return: The included of this BundleIdsResponse.
        :rtype: List[BundleIdResponseIncludedInner]
        """
        return self._included

    @included.setter
    def included(self, included: List[BundleIdResponseIncludedInner]):
        """Sets the included of this BundleIdsResponse.


        :param included: The included of this BundleIdsResponse.
        :type included: List[BundleIdResponseIncludedInner]
        """

        self._included = included

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this BundleIdsResponse.


        :return: The links of this BundleIdsResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this BundleIdsResponse.


        :param links: The links of this BundleIdsResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this BundleIdsResponse.


        :return: The meta of this BundleIdsResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this BundleIdsResponse.


        :param meta: The meta of this BundleIdsResponse.
        :type meta: PagingInformation
        """

        self._meta = meta
