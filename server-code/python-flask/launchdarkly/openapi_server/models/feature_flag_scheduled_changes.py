from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.feature_flag_scheduled_change import FeatureFlagScheduledChange
from openapi_server.models.links import Links
from openapi_server import util

from openapi_server.models.feature_flag_scheduled_change import FeatureFlagScheduledChange  # noqa: E501
from openapi_server.models.links import Links  # noqa: E501

class FeatureFlagScheduledChanges(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, items=None):  # noqa: E501
        """FeatureFlagScheduledChanges - a model defined in OpenAPI

        :param links: The links of this FeatureFlagScheduledChanges.  # noqa: E501
        :type links: Links
        :param items: The items of this FeatureFlagScheduledChanges.  # noqa: E501
        :type items: List[FeatureFlagScheduledChange]
        """
        self.openapi_types = {
            'links': Links,
            'items': List[FeatureFlagScheduledChange]
        }

        self.attribute_map = {
            'links': '_links',
            'items': 'items'
        }

        self._links = links
        self._items = items

    @classmethod
    def from_dict(cls, dikt) -> 'FeatureFlagScheduledChanges':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeatureFlagScheduledChanges of this FeatureFlagScheduledChanges.  # noqa: E501
        :rtype: FeatureFlagScheduledChanges
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> Links:
        """Gets the links of this FeatureFlagScheduledChanges.


        :return: The links of this FeatureFlagScheduledChanges.
        :rtype: Links
        """
        return self._links

    @links.setter
    def links(self, links: Links):
        """Sets the links of this FeatureFlagScheduledChanges.


        :param links: The links of this FeatureFlagScheduledChanges.
        :type links: Links
        """

        self._links = links

    @property
    def items(self) -> List[FeatureFlagScheduledChange]:
        """Gets the items of this FeatureFlagScheduledChanges.


        :return: The items of this FeatureFlagScheduledChanges.
        :rtype: List[FeatureFlagScheduledChange]
        """
        return self._items

    @items.setter
    def items(self, items: List[FeatureFlagScheduledChange]):
        """Sets the items of this FeatureFlagScheduledChanges.


        :param items: The items of this FeatureFlagScheduledChanges.
        :type items: List[FeatureFlagScheduledChange]
        """

        self._items = items