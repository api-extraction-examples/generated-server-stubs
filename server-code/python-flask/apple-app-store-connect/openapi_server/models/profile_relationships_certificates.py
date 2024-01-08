from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server.models.profile_relationships_certificates_data_inner import ProfileRelationshipsCertificatesDataInner
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501
from openapi_server.models.profile_relationships_certificates_data_inner import ProfileRelationshipsCertificatesDataInner  # noqa: E501

class ProfileRelationshipsCertificates(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None, meta=None):  # noqa: E501
        """ProfileRelationshipsCertificates - a model defined in OpenAPI

        :param data: The data of this ProfileRelationshipsCertificates.  # noqa: E501
        :type data: List[ProfileRelationshipsCertificatesDataInner]
        :param links: The links of this ProfileRelationshipsCertificates.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        :param meta: The meta of this ProfileRelationshipsCertificates.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[ProfileRelationshipsCertificatesDataInner],
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
    def from_dict(cls, dikt) -> 'ProfileRelationshipsCertificates':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Profile_relationships_certificates of this ProfileRelationshipsCertificates.  # noqa: E501
        :rtype: ProfileRelationshipsCertificates
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[ProfileRelationshipsCertificatesDataInner]:
        """Gets the data of this ProfileRelationshipsCertificates.


        :return: The data of this ProfileRelationshipsCertificates.
        :rtype: List[ProfileRelationshipsCertificatesDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[ProfileRelationshipsCertificatesDataInner]):
        """Sets the data of this ProfileRelationshipsCertificates.


        :param data: The data of this ProfileRelationshipsCertificates.
        :type data: List[ProfileRelationshipsCertificatesDataInner]
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this ProfileRelationshipsCertificates.


        :return: The links of this ProfileRelationshipsCertificates.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this ProfileRelationshipsCertificates.


        :param links: The links of this ProfileRelationshipsCertificates.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this ProfileRelationshipsCertificates.


        :return: The meta of this ProfileRelationshipsCertificates.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this ProfileRelationshipsCertificates.


        :param meta: The meta of this ProfileRelationshipsCertificates.
        :type meta: PagingInformation
        """

        self._meta = meta