from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.bundle_id_capability_create_request_data_relationships_bundle_id_data import BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.bundle_id_capability_create_request_data_relationships_bundle_id_data import BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData  # noqa: E501

class ProfileRelationshipsBundleId(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """ProfileRelationshipsBundleId - a model defined in OpenAPI

        :param data: The data of this ProfileRelationshipsBundleId.  # noqa: E501
        :type data: BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
        :param links: The links of this ProfileRelationshipsBundleId.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        """
        self.openapi_types = {
            'data': BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData,
            'links': AppRelationshipsAppInfosLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'ProfileRelationshipsBundleId':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Profile_relationships_bundleId of this ProfileRelationshipsBundleId.  # noqa: E501
        :rtype: ProfileRelationshipsBundleId
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData:
        """Gets the data of this ProfileRelationshipsBundleId.


        :return: The data of this ProfileRelationshipsBundleId.
        :rtype: BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
        """
        return self._data

    @data.setter
    def data(self, data: BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData):
        """Sets the data of this ProfileRelationshipsBundleId.


        :param data: The data of this ProfileRelationshipsBundleId.
        :type data: BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this ProfileRelationshipsBundleId.


        :return: The links of this ProfileRelationshipsBundleId.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this ProfileRelationshipsBundleId.


        :param links: The links of this ProfileRelationshipsBundleId.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links