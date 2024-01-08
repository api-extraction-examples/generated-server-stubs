from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.app_relationships_beta_groups_data_inner import AppRelationshipsBetaGroupsDataInner
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.app_relationships_beta_groups_data_inner import AppRelationshipsBetaGroupsDataInner  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppRelationshipsBetaGroups(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None, meta=None):  # noqa: E501
        """AppRelationshipsBetaGroups - a model defined in OpenAPI

        :param data: The data of this AppRelationshipsBetaGroups.  # noqa: E501
        :type data: List[AppRelationshipsBetaGroupsDataInner]
        :param links: The links of this AppRelationshipsBetaGroups.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        :param meta: The meta of this AppRelationshipsBetaGroups.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppRelationshipsBetaGroupsDataInner],
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
    def from_dict(cls, dikt) -> 'AppRelationshipsBetaGroups':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The App_relationships_betaGroups of this AppRelationshipsBetaGroups.  # noqa: E501
        :rtype: AppRelationshipsBetaGroups
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppRelationshipsBetaGroupsDataInner]:
        """Gets the data of this AppRelationshipsBetaGroups.


        :return: The data of this AppRelationshipsBetaGroups.
        :rtype: List[AppRelationshipsBetaGroupsDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppRelationshipsBetaGroupsDataInner]):
        """Sets the data of this AppRelationshipsBetaGroups.


        :param data: The data of this AppRelationshipsBetaGroups.
        :type data: List[AppRelationshipsBetaGroupsDataInner]
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppRelationshipsBetaGroups.


        :return: The links of this AppRelationshipsBetaGroups.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppRelationshipsBetaGroups.


        :param links: The links of this AppRelationshipsBetaGroups.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppRelationshipsBetaGroups.


        :return: The meta of this AppRelationshipsBetaGroups.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppRelationshipsBetaGroups.


        :param meta: The meta of this AppRelationshipsBetaGroups.
        :type meta: PagingInformation
        """

        self._meta = meta
