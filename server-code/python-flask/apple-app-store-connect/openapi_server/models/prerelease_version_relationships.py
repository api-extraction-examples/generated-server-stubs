from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_encryption_declaration_relationships_app import AppEncryptionDeclarationRelationshipsApp
from openapi_server.models.app_relationships_builds import AppRelationshipsBuilds
from openapi_server import util

from openapi_server.models.app_encryption_declaration_relationships_app import AppEncryptionDeclarationRelationshipsApp  # noqa: E501
from openapi_server.models.app_relationships_builds import AppRelationshipsBuilds  # noqa: E501

class PrereleaseVersionRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, app=None, builds=None):  # noqa: E501
        """PrereleaseVersionRelationships - a model defined in OpenAPI

        :param app: The app of this PrereleaseVersionRelationships.  # noqa: E501
        :type app: AppEncryptionDeclarationRelationshipsApp
        :param builds: The builds of this PrereleaseVersionRelationships.  # noqa: E501
        :type builds: AppRelationshipsBuilds
        """
        self.openapi_types = {
            'app': AppEncryptionDeclarationRelationshipsApp,
            'builds': AppRelationshipsBuilds
        }

        self.attribute_map = {
            'app': 'app',
            'builds': 'builds'
        }

        self._app = app
        self._builds = builds

    @classmethod
    def from_dict(cls, dikt) -> 'PrereleaseVersionRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PrereleaseVersion_relationships of this PrereleaseVersionRelationships.  # noqa: E501
        :rtype: PrereleaseVersionRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def app(self) -> AppEncryptionDeclarationRelationshipsApp:
        """Gets the app of this PrereleaseVersionRelationships.


        :return: The app of this PrereleaseVersionRelationships.
        :rtype: AppEncryptionDeclarationRelationshipsApp
        """
        return self._app

    @app.setter
    def app(self, app: AppEncryptionDeclarationRelationshipsApp):
        """Sets the app of this PrereleaseVersionRelationships.


        :param app: The app of this PrereleaseVersionRelationships.
        :type app: AppEncryptionDeclarationRelationshipsApp
        """

        self._app = app

    @property
    def builds(self) -> AppRelationshipsBuilds:
        """Gets the builds of this PrereleaseVersionRelationships.


        :return: The builds of this PrereleaseVersionRelationships.
        :rtype: AppRelationshipsBuilds
        """
        return self._builds

    @builds.setter
    def builds(self, builds: AppRelationshipsBuilds):
        """Sets the builds of this PrereleaseVersionRelationships.


        :param builds: The builds of this PrereleaseVersionRelationships.
        :type builds: AppRelationshipsBuilds
        """

        self._builds = builds