from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_tester_relationships_apps import BetaTesterRelationshipsApps
from openapi_server import util

from openapi_server.models.beta_tester_relationships_apps import BetaTesterRelationshipsApps  # noqa: E501

class UserRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, visible_apps=None):  # noqa: E501
        """UserRelationships - a model defined in OpenAPI

        :param visible_apps: The visible_apps of this UserRelationships.  # noqa: E501
        :type visible_apps: BetaTesterRelationshipsApps
        """
        self.openapi_types = {
            'visible_apps': BetaTesterRelationshipsApps
        }

        self.attribute_map = {
            'visible_apps': 'visibleApps'
        }

        self._visible_apps = visible_apps

    @classmethod
    def from_dict(cls, dikt) -> 'UserRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The User_relationships of this UserRelationships.  # noqa: E501
        :rtype: UserRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def visible_apps(self) -> BetaTesterRelationshipsApps:
        """Gets the visible_apps of this UserRelationships.


        :return: The visible_apps of this UserRelationships.
        :rtype: BetaTesterRelationshipsApps
        """
        return self._visible_apps

    @visible_apps.setter
    def visible_apps(self, visible_apps: BetaTesterRelationshipsApps):
        """Sets the visible_apps of this UserRelationships.


        :param visible_apps: The visible_apps of this UserRelationships.
        :type visible_apps: BetaTesterRelationshipsApps
        """

        self._visible_apps = visible_apps