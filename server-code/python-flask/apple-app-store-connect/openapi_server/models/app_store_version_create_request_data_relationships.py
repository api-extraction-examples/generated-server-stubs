from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_pre_order_create_request_data_relationships_app import AppPreOrderCreateRequestDataRelationshipsApp
from openapi_server.models.app_store_version_create_request_data_relationships_build import AppStoreVersionCreateRequestDataRelationshipsBuild
from openapi_server import util

from openapi_server.models.app_pre_order_create_request_data_relationships_app import AppPreOrderCreateRequestDataRelationshipsApp  # noqa: E501
from openapi_server.models.app_store_version_create_request_data_relationships_build import AppStoreVersionCreateRequestDataRelationshipsBuild  # noqa: E501

class AppStoreVersionCreateRequestDataRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, app=None, build=None):  # noqa: E501
        """AppStoreVersionCreateRequestDataRelationships - a model defined in OpenAPI

        :param app: The app of this AppStoreVersionCreateRequestDataRelationships.  # noqa: E501
        :type app: AppPreOrderCreateRequestDataRelationshipsApp
        :param build: The build of this AppStoreVersionCreateRequestDataRelationships.  # noqa: E501
        :type build: AppStoreVersionCreateRequestDataRelationshipsBuild
        """
        self.openapi_types = {
            'app': AppPreOrderCreateRequestDataRelationshipsApp,
            'build': AppStoreVersionCreateRequestDataRelationshipsBuild
        }

        self.attribute_map = {
            'app': 'app',
            'build': 'build'
        }

        self._app = app
        self._build = build

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionCreateRequestDataRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionCreateRequest_data_relationships of this AppStoreVersionCreateRequestDataRelationships.  # noqa: E501
        :rtype: AppStoreVersionCreateRequestDataRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def app(self) -> AppPreOrderCreateRequestDataRelationshipsApp:
        """Gets the app of this AppStoreVersionCreateRequestDataRelationships.


        :return: The app of this AppStoreVersionCreateRequestDataRelationships.
        :rtype: AppPreOrderCreateRequestDataRelationshipsApp
        """
        return self._app

    @app.setter
    def app(self, app: AppPreOrderCreateRequestDataRelationshipsApp):
        """Sets the app of this AppStoreVersionCreateRequestDataRelationships.


        :param app: The app of this AppStoreVersionCreateRequestDataRelationships.
        :type app: AppPreOrderCreateRequestDataRelationshipsApp
        """
        if app is None:
            raise ValueError("Invalid value for `app`, must not be `None`")  # noqa: E501

        self._app = app

    @property
    def build(self) -> AppStoreVersionCreateRequestDataRelationshipsBuild:
        """Gets the build of this AppStoreVersionCreateRequestDataRelationships.


        :return: The build of this AppStoreVersionCreateRequestDataRelationships.
        :rtype: AppStoreVersionCreateRequestDataRelationshipsBuild
        """
        return self._build

    @build.setter
    def build(self, build: AppStoreVersionCreateRequestDataRelationshipsBuild):
        """Sets the build of this AppStoreVersionCreateRequestDataRelationships.


        :param build: The build of this AppStoreVersionCreateRequestDataRelationships.
        :type build: AppStoreVersionCreateRequestDataRelationshipsBuild
        """

        self._build = build