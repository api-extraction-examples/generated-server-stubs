from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.entity_type import EntityType
from openapi_server.models.policy_usage_type import PolicyUsageType
from openapi_server import util

from openapi_server.models.entity_type import EntityType  # noqa: E501
from openapi_server.models.policy_usage_type import PolicyUsageType  # noqa: E501

class ListEntitiesForPolicyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, policy_arn=None, entity_filter=None, path_prefix=None, policy_usage_filter=None, marker=None, max_items=None):  # noqa: E501
        """ListEntitiesForPolicyRequest - a model defined in OpenAPI

        :param policy_arn: The policy_arn of this ListEntitiesForPolicyRequest.  # noqa: E501
        :type policy_arn: str
        :param entity_filter: The entity_filter of this ListEntitiesForPolicyRequest.  # noqa: E501
        :type entity_filter: EntityType
        :param path_prefix: The path_prefix of this ListEntitiesForPolicyRequest.  # noqa: E501
        :type path_prefix: str
        :param policy_usage_filter: The policy_usage_filter of this ListEntitiesForPolicyRequest.  # noqa: E501
        :type policy_usage_filter: PolicyUsageType
        :param marker: The marker of this ListEntitiesForPolicyRequest.  # noqa: E501
        :type marker: str
        :param max_items: The max_items of this ListEntitiesForPolicyRequest.  # noqa: E501
        :type max_items: int
        """
        self.openapi_types = {
            'policy_arn': str,
            'entity_filter': EntityType,
            'path_prefix': str,
            'policy_usage_filter': PolicyUsageType,
            'marker': str,
            'max_items': int
        }

        self.attribute_map = {
            'policy_arn': 'PolicyArn',
            'entity_filter': 'EntityFilter',
            'path_prefix': 'PathPrefix',
            'policy_usage_filter': 'PolicyUsageFilter',
            'marker': 'Marker',
            'max_items': 'MaxItems'
        }

        self._policy_arn = policy_arn
        self._entity_filter = entity_filter
        self._path_prefix = path_prefix
        self._policy_usage_filter = policy_usage_filter
        self._marker = marker
        self._max_items = max_items

    @classmethod
    def from_dict(cls, dikt) -> 'ListEntitiesForPolicyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListEntitiesForPolicyRequest of this ListEntitiesForPolicyRequest.  # noqa: E501
        :rtype: ListEntitiesForPolicyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def policy_arn(self) -> str:
        """Gets the policy_arn of this ListEntitiesForPolicyRequest.


        :return: The policy_arn of this ListEntitiesForPolicyRequest.
        :rtype: str
        """
        return self._policy_arn

    @policy_arn.setter
    def policy_arn(self, policy_arn: str):
        """Sets the policy_arn of this ListEntitiesForPolicyRequest.


        :param policy_arn: The policy_arn of this ListEntitiesForPolicyRequest.
        :type policy_arn: str
        """
        if policy_arn is None:
            raise ValueError("Invalid value for `policy_arn`, must not be `None`")  # noqa: E501

        self._policy_arn = policy_arn

    @property
    def entity_filter(self) -> EntityType:
        """Gets the entity_filter of this ListEntitiesForPolicyRequest.


        :return: The entity_filter of this ListEntitiesForPolicyRequest.
        :rtype: EntityType
        """
        return self._entity_filter

    @entity_filter.setter
    def entity_filter(self, entity_filter: EntityType):
        """Sets the entity_filter of this ListEntitiesForPolicyRequest.


        :param entity_filter: The entity_filter of this ListEntitiesForPolicyRequest.
        :type entity_filter: EntityType
        """

        self._entity_filter = entity_filter

    @property
    def path_prefix(self) -> str:
        """Gets the path_prefix of this ListEntitiesForPolicyRequest.


        :return: The path_prefix of this ListEntitiesForPolicyRequest.
        :rtype: str
        """
        return self._path_prefix

    @path_prefix.setter
    def path_prefix(self, path_prefix: str):
        """Sets the path_prefix of this ListEntitiesForPolicyRequest.


        :param path_prefix: The path_prefix of this ListEntitiesForPolicyRequest.
        :type path_prefix: str
        """

        self._path_prefix = path_prefix

    @property
    def policy_usage_filter(self) -> PolicyUsageType:
        """Gets the policy_usage_filter of this ListEntitiesForPolicyRequest.


        :return: The policy_usage_filter of this ListEntitiesForPolicyRequest.
        :rtype: PolicyUsageType
        """
        return self._policy_usage_filter

    @policy_usage_filter.setter
    def policy_usage_filter(self, policy_usage_filter: PolicyUsageType):
        """Sets the policy_usage_filter of this ListEntitiesForPolicyRequest.


        :param policy_usage_filter: The policy_usage_filter of this ListEntitiesForPolicyRequest.
        :type policy_usage_filter: PolicyUsageType
        """

        self._policy_usage_filter = policy_usage_filter

    @property
    def marker(self) -> str:
        """Gets the marker of this ListEntitiesForPolicyRequest.


        :return: The marker of this ListEntitiesForPolicyRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListEntitiesForPolicyRequest.


        :param marker: The marker of this ListEntitiesForPolicyRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def max_items(self) -> int:
        """Gets the max_items of this ListEntitiesForPolicyRequest.


        :return: The max_items of this ListEntitiesForPolicyRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this ListEntitiesForPolicyRequest.


        :param max_items: The max_items of this ListEntitiesForPolicyRequest.
        :type max_items: int
        """

        self._max_items = max_items
