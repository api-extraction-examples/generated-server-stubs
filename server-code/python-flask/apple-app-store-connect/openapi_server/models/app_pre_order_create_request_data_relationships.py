from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_pre_order_create_request_data_relationships_app import AppPreOrderCreateRequestDataRelationshipsApp
from openapi_server import util

from openapi_server.models.app_pre_order_create_request_data_relationships_app import AppPreOrderCreateRequestDataRelationshipsApp  # noqa: E501

class AppPreOrderCreateRequestDataRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, app=None):  # noqa: E501
        """AppPreOrderCreateRequestDataRelationships - a model defined in OpenAPI

        :param app: The app of this AppPreOrderCreateRequestDataRelationships.  # noqa: E501
        :type app: AppPreOrderCreateRequestDataRelationshipsApp
        """
        self.openapi_types = {
            'app': AppPreOrderCreateRequestDataRelationshipsApp
        }

        self.attribute_map = {
            'app': 'app'
        }

        self._app = app

    @classmethod
    def from_dict(cls, dikt) -> 'AppPreOrderCreateRequestDataRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppPreOrderCreateRequest_data_relationships of this AppPreOrderCreateRequestDataRelationships.  # noqa: E501
        :rtype: AppPreOrderCreateRequestDataRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def app(self) -> AppPreOrderCreateRequestDataRelationshipsApp:
        """Gets the app of this AppPreOrderCreateRequestDataRelationships.


        :return: The app of this AppPreOrderCreateRequestDataRelationships.
        :rtype: AppPreOrderCreateRequestDataRelationshipsApp
        """
        return self._app

    @app.setter
    def app(self, app: AppPreOrderCreateRequestDataRelationshipsApp):
        """Sets the app of this AppPreOrderCreateRequestDataRelationships.


        :param app: The app of this AppPreOrderCreateRequestDataRelationships.
        :type app: AppPreOrderCreateRequestDataRelationshipsApp
        """
        if app is None:
            raise ValueError("Invalid value for `app`, must not be `None`")  # noqa: E501

        self._app = app
