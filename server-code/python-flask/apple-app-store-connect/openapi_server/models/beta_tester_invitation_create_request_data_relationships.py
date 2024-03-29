from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_pre_order_create_request_data_relationships_app import AppPreOrderCreateRequestDataRelationshipsApp
from openapi_server.models.beta_tester_invitation_create_request_data_relationships_beta_tester import BetaTesterInvitationCreateRequestDataRelationshipsBetaTester
from openapi_server import util

from openapi_server.models.app_pre_order_create_request_data_relationships_app import AppPreOrderCreateRequestDataRelationshipsApp  # noqa: E501
from openapi_server.models.beta_tester_invitation_create_request_data_relationships_beta_tester import BetaTesterInvitationCreateRequestDataRelationshipsBetaTester  # noqa: E501

class BetaTesterInvitationCreateRequestDataRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, app=None, beta_tester=None):  # noqa: E501
        """BetaTesterInvitationCreateRequestDataRelationships - a model defined in OpenAPI

        :param app: The app of this BetaTesterInvitationCreateRequestDataRelationships.  # noqa: E501
        :type app: AppPreOrderCreateRequestDataRelationshipsApp
        :param beta_tester: The beta_tester of this BetaTesterInvitationCreateRequestDataRelationships.  # noqa: E501
        :type beta_tester: BetaTesterInvitationCreateRequestDataRelationshipsBetaTester
        """
        self.openapi_types = {
            'app': AppPreOrderCreateRequestDataRelationshipsApp,
            'beta_tester': BetaTesterInvitationCreateRequestDataRelationshipsBetaTester
        }

        self.attribute_map = {
            'app': 'app',
            'beta_tester': 'betaTester'
        }

        self._app = app
        self._beta_tester = beta_tester

    @classmethod
    def from_dict(cls, dikt) -> 'BetaTesterInvitationCreateRequestDataRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaTesterInvitationCreateRequest_data_relationships of this BetaTesterInvitationCreateRequestDataRelationships.  # noqa: E501
        :rtype: BetaTesterInvitationCreateRequestDataRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def app(self) -> AppPreOrderCreateRequestDataRelationshipsApp:
        """Gets the app of this BetaTesterInvitationCreateRequestDataRelationships.


        :return: The app of this BetaTesterInvitationCreateRequestDataRelationships.
        :rtype: AppPreOrderCreateRequestDataRelationshipsApp
        """
        return self._app

    @app.setter
    def app(self, app: AppPreOrderCreateRequestDataRelationshipsApp):
        """Sets the app of this BetaTesterInvitationCreateRequestDataRelationships.


        :param app: The app of this BetaTesterInvitationCreateRequestDataRelationships.
        :type app: AppPreOrderCreateRequestDataRelationshipsApp
        """
        if app is None:
            raise ValueError("Invalid value for `app`, must not be `None`")  # noqa: E501

        self._app = app

    @property
    def beta_tester(self) -> BetaTesterInvitationCreateRequestDataRelationshipsBetaTester:
        """Gets the beta_tester of this BetaTesterInvitationCreateRequestDataRelationships.


        :return: The beta_tester of this BetaTesterInvitationCreateRequestDataRelationships.
        :rtype: BetaTesterInvitationCreateRequestDataRelationshipsBetaTester
        """
        return self._beta_tester

    @beta_tester.setter
    def beta_tester(self, beta_tester: BetaTesterInvitationCreateRequestDataRelationshipsBetaTester):
        """Sets the beta_tester of this BetaTesterInvitationCreateRequestDataRelationships.


        :param beta_tester: The beta_tester of this BetaTesterInvitationCreateRequestDataRelationships.
        :type beta_tester: BetaTesterInvitationCreateRequestDataRelationshipsBetaTester
        """
        if beta_tester is None:
            raise ValueError("Invalid value for `beta_tester`, must not be `None`")  # noqa: E501

        self._beta_tester = beta_tester
