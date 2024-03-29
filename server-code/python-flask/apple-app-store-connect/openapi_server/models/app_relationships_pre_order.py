from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.app_relationships_pre_order_data import AppRelationshipsPreOrderData
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.app_relationships_pre_order_data import AppRelationshipsPreOrderData  # noqa: E501

class AppRelationshipsPreOrder(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """AppRelationshipsPreOrder - a model defined in OpenAPI

        :param data: The data of this AppRelationshipsPreOrder.  # noqa: E501
        :type data: AppRelationshipsPreOrderData
        :param links: The links of this AppRelationshipsPreOrder.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        """
        self.openapi_types = {
            'data': AppRelationshipsPreOrderData,
            'links': AppRelationshipsAppInfosLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppRelationshipsPreOrder':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The App_relationships_preOrder of this AppRelationshipsPreOrder.  # noqa: E501
        :rtype: AppRelationshipsPreOrder
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppRelationshipsPreOrderData:
        """Gets the data of this AppRelationshipsPreOrder.


        :return: The data of this AppRelationshipsPreOrder.
        :rtype: AppRelationshipsPreOrderData
        """
        return self._data

    @data.setter
    def data(self, data: AppRelationshipsPreOrderData):
        """Sets the data of this AppRelationshipsPreOrder.


        :param data: The data of this AppRelationshipsPreOrder.
        :type data: AppRelationshipsPreOrderData
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppRelationshipsPreOrder.


        :return: The links of this AppRelationshipsPreOrder.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppRelationshipsPreOrder.


        :param links: The links of this AppRelationshipsPreOrder.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links
