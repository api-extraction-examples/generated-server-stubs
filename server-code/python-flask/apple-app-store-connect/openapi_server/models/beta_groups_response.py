from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_group import BetaGroup
from openapi_server.models.beta_group_response_included_inner import BetaGroupResponseIncludedInner
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.beta_group import BetaGroup  # noqa: E501
from openapi_server.models.beta_group_response_included_inner import BetaGroupResponseIncludedInner  # noqa: E501
from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class BetaGroupsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None, meta=None):  # noqa: E501
        """BetaGroupsResponse - a model defined in OpenAPI

        :param data: The data of this BetaGroupsResponse.  # noqa: E501
        :type data: List[BetaGroup]
        :param included: The included of this BetaGroupsResponse.  # noqa: E501
        :type included: List[BetaGroupResponseIncludedInner]
        :param links: The links of this BetaGroupsResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this BetaGroupsResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[BetaGroup],
            'included': List[BetaGroupResponseIncludedInner],
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
    def from_dict(cls, dikt) -> 'BetaGroupsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaGroupsResponse of this BetaGroupsResponse.  # noqa: E501
        :rtype: BetaGroupsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[BetaGroup]:
        """Gets the data of this BetaGroupsResponse.


        :return: The data of this BetaGroupsResponse.
        :rtype: List[BetaGroup]
        """
        return self._data

    @data.setter
    def data(self, data: List[BetaGroup]):
        """Sets the data of this BetaGroupsResponse.


        :param data: The data of this BetaGroupsResponse.
        :type data: List[BetaGroup]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[BetaGroupResponseIncludedInner]:
        """Gets the included of this BetaGroupsResponse.


        :return: The included of this BetaGroupsResponse.
        :rtype: List[BetaGroupResponseIncludedInner]
        """
        return self._included

    @included.setter
    def included(self, included: List[BetaGroupResponseIncludedInner]):
        """Sets the included of this BetaGroupsResponse.


        :param included: The included of this BetaGroupsResponse.
        :type included: List[BetaGroupResponseIncludedInner]
        """

        self._included = included

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this BetaGroupsResponse.


        :return: The links of this BetaGroupsResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this BetaGroupsResponse.


        :param links: The links of this BetaGroupsResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this BetaGroupsResponse.


        :return: The meta of this BetaGroupsResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this BetaGroupsResponse.


        :param meta: The meta of this BetaGroupsResponse.
        :type meta: PagingInformation
        """

        self._meta = meta
