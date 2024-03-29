from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_pre_order_create_request_data_relationships_app import AppPreOrderCreateRequestDataRelationshipsApp
from openapi_server.models.end_user_license_agreement_create_request_data_relationships_territories import EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories
from openapi_server import util

from openapi_server.models.app_pre_order_create_request_data_relationships_app import AppPreOrderCreateRequestDataRelationshipsApp  # noqa: E501
from openapi_server.models.end_user_license_agreement_create_request_data_relationships_territories import EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories  # noqa: E501

class EndUserLicenseAgreementCreateRequestDataRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, app=None, territories=None):  # noqa: E501
        """EndUserLicenseAgreementCreateRequestDataRelationships - a model defined in OpenAPI

        :param app: The app of this EndUserLicenseAgreementCreateRequestDataRelationships.  # noqa: E501
        :type app: AppPreOrderCreateRequestDataRelationshipsApp
        :param territories: The territories of this EndUserLicenseAgreementCreateRequestDataRelationships.  # noqa: E501
        :type territories: EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories
        """
        self.openapi_types = {
            'app': AppPreOrderCreateRequestDataRelationshipsApp,
            'territories': EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories
        }

        self.attribute_map = {
            'app': 'app',
            'territories': 'territories'
        }

        self._app = app
        self._territories = territories

    @classmethod
    def from_dict(cls, dikt) -> 'EndUserLicenseAgreementCreateRequestDataRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EndUserLicenseAgreementCreateRequest_data_relationships of this EndUserLicenseAgreementCreateRequestDataRelationships.  # noqa: E501
        :rtype: EndUserLicenseAgreementCreateRequestDataRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def app(self) -> AppPreOrderCreateRequestDataRelationshipsApp:
        """Gets the app of this EndUserLicenseAgreementCreateRequestDataRelationships.


        :return: The app of this EndUserLicenseAgreementCreateRequestDataRelationships.
        :rtype: AppPreOrderCreateRequestDataRelationshipsApp
        """
        return self._app

    @app.setter
    def app(self, app: AppPreOrderCreateRequestDataRelationshipsApp):
        """Sets the app of this EndUserLicenseAgreementCreateRequestDataRelationships.


        :param app: The app of this EndUserLicenseAgreementCreateRequestDataRelationships.
        :type app: AppPreOrderCreateRequestDataRelationshipsApp
        """
        if app is None:
            raise ValueError("Invalid value for `app`, must not be `None`")  # noqa: E501

        self._app = app

    @property
    def territories(self) -> EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories:
        """Gets the territories of this EndUserLicenseAgreementCreateRequestDataRelationships.


        :return: The territories of this EndUserLicenseAgreementCreateRequestDataRelationships.
        :rtype: EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories
        """
        return self._territories

    @territories.setter
    def territories(self, territories: EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories):
        """Sets the territories of this EndUserLicenseAgreementCreateRequestDataRelationships.


        :param territories: The territories of this EndUserLicenseAgreementCreateRequestDataRelationships.
        :type territories: EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories
        """
        if territories is None:
            raise ValueError("Invalid value for `territories`, must not be `None`")  # noqa: E501

        self._territories = territories
