from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.app_relationships_pre_release_versions_data_inner import AppRelationshipsPreReleaseVersionsDataInner
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.app_relationships_pre_release_versions_data_inner import AppRelationshipsPreReleaseVersionsDataInner  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppRelationshipsPreReleaseVersions(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None, meta=None):  # noqa: E501
        """AppRelationshipsPreReleaseVersions - a model defined in OpenAPI

        :param data: The data of this AppRelationshipsPreReleaseVersions.  # noqa: E501
        :type data: List[AppRelationshipsPreReleaseVersionsDataInner]
        :param links: The links of this AppRelationshipsPreReleaseVersions.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        :param meta: The meta of this AppRelationshipsPreReleaseVersions.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppRelationshipsPreReleaseVersionsDataInner],
            'links': AppRelationshipsAppInfosLinks,
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
    def from_dict(cls, dikt) -> 'AppRelationshipsPreReleaseVersions':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The App_relationships_preReleaseVersions of this AppRelationshipsPreReleaseVersions.  # noqa: E501
        :rtype: AppRelationshipsPreReleaseVersions
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppRelationshipsPreReleaseVersionsDataInner]:
        """Gets the data of this AppRelationshipsPreReleaseVersions.


        :return: The data of this AppRelationshipsPreReleaseVersions.
        :rtype: List[AppRelationshipsPreReleaseVersionsDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppRelationshipsPreReleaseVersionsDataInner]):
        """Sets the data of this AppRelationshipsPreReleaseVersions.


        :param data: The data of this AppRelationshipsPreReleaseVersions.
        :type data: List[AppRelationshipsPreReleaseVersionsDataInner]
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppRelationshipsPreReleaseVersions.


        :return: The links of this AppRelationshipsPreReleaseVersions.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppRelationshipsPreReleaseVersions.


        :param links: The links of this AppRelationshipsPreReleaseVersions.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppRelationshipsPreReleaseVersions.


        :return: The meta of this AppRelationshipsPreReleaseVersions.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppRelationshipsPreReleaseVersions.


        :param meta: The meta of this AppRelationshipsPreReleaseVersions.
        :type meta: PagingInformation
        """

        self._meta = meta
