from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.hierarchical_links import HierarchicalLinks
from openapi_server.models.integration_subscription_status import IntegrationSubscriptionStatus
from openapi_server.models.statement import Statement
from openapi_server import util

from openapi_server.models.hierarchical_links import HierarchicalLinks  # noqa: E501
from openapi_server.models.integration_subscription_status import IntegrationSubscriptionStatus  # noqa: E501
from openapi_server.models.statement import Statement  # noqa: E501

class IntegrationSubscription(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, links=None, status=None, config=None, kind=None, name=None, _true=None, statements=None, tags=None):  # noqa: E501
        """IntegrationSubscription - a model defined in OpenAPI

        :param id: The id of this IntegrationSubscription.  # noqa: E501
        :type id: str
        :param links: The links of this IntegrationSubscription.  # noqa: E501
        :type links: HierarchicalLinks
        :param status: The status of this IntegrationSubscription.  # noqa: E501
        :type status: IntegrationSubscriptionStatus
        :param config: The config of this IntegrationSubscription.  # noqa: E501
        :type config: object
        :param kind: The kind of this IntegrationSubscription.  # noqa: E501
        :type kind: str
        :param name: The name of this IntegrationSubscription.  # noqa: E501
        :type name: str
        :param _true: The _true of this IntegrationSubscription.  # noqa: E501
        :type _true: bool
        :param statements: The statements of this IntegrationSubscription.  # noqa: E501
        :type statements: List[Statement]
        :param tags: The tags of this IntegrationSubscription.  # noqa: E501
        :type tags: List[str]
        """
        self.openapi_types = {
            'id': str,
            'links': HierarchicalLinks,
            'status': IntegrationSubscriptionStatus,
            'config': object,
            'kind': str,
            'name': str,
            '_true': bool,
            'statements': List[Statement],
            'tags': List[str]
        }

        self.attribute_map = {
            'id': '_id',
            'links': '_links',
            'status': '_status',
            'config': 'config',
            'kind': 'kind',
            'name': 'name',
            '_true': 'true',
            'statements': 'statements',
            'tags': 'tags'
        }

        self._id = id
        self._links = links
        self._status = status
        self._config = config
        self._kind = kind
        self._name = name
        self.__true = _true
        self._statements = statements
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'IntegrationSubscription':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IntegrationSubscription of this IntegrationSubscription.  # noqa: E501
        :rtype: IntegrationSubscription
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this IntegrationSubscription.

        The unique resource id.  # noqa: E501

        :return: The id of this IntegrationSubscription.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this IntegrationSubscription.

        The unique resource id.  # noqa: E501

        :param id: The id of this IntegrationSubscription.
        :type id: str
        """

        self._id = id

    @property
    def links(self) -> HierarchicalLinks:
        """Gets the links of this IntegrationSubscription.


        :return: The links of this IntegrationSubscription.
        :rtype: HierarchicalLinks
        """
        return self._links

    @links.setter
    def links(self, links: HierarchicalLinks):
        """Sets the links of this IntegrationSubscription.


        :param links: The links of this IntegrationSubscription.
        :type links: HierarchicalLinks
        """

        self._links = links

    @property
    def status(self) -> IntegrationSubscriptionStatus:
        """Gets the status of this IntegrationSubscription.


        :return: The status of this IntegrationSubscription.
        :rtype: IntegrationSubscriptionStatus
        """
        return self._status

    @status.setter
    def status(self, status: IntegrationSubscriptionStatus):
        """Sets the status of this IntegrationSubscription.


        :param status: The status of this IntegrationSubscription.
        :type status: IntegrationSubscriptionStatus
        """

        self._status = status

    @property
    def config(self) -> object:
        """Gets the config of this IntegrationSubscription.

        A key-value mapping of configuration fields.  # noqa: E501

        :return: The config of this IntegrationSubscription.
        :rtype: object
        """
        return self._config

    @config.setter
    def config(self, config: object):
        """Sets the config of this IntegrationSubscription.

        A key-value mapping of configuration fields.  # noqa: E501

        :param config: The config of this IntegrationSubscription.
        :type config: object
        """

        self._config = config

    @property
    def kind(self) -> str:
        """Gets the kind of this IntegrationSubscription.

        The type of integration associated with this configuration.  # noqa: E501

        :return: The kind of this IntegrationSubscription.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind: str):
        """Sets the kind of this IntegrationSubscription.

        The type of integration associated with this configuration.  # noqa: E501

        :param kind: The kind of this IntegrationSubscription.
        :type kind: str
        """

        self._kind = kind

    @property
    def name(self) -> str:
        """Gets the name of this IntegrationSubscription.

        The user-defined name associated with this configuration.  # noqa: E501

        :return: The name of this IntegrationSubscription.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this IntegrationSubscription.

        The user-defined name associated with this configuration.  # noqa: E501

        :param name: The name of this IntegrationSubscription.
        :type name: str
        """

        self._name = name

    @property
    def _true(self) -> bool:
        """Gets the _true of this IntegrationSubscription.

        Whether or not the integration is currently active.  # noqa: E501

        :return: The _true of this IntegrationSubscription.
        :rtype: bool
        """
        return self.__true

    @_true.setter
    def _true(self, _true: bool):
        """Sets the _true of this IntegrationSubscription.

        Whether or not the integration is currently active.  # noqa: E501

        :param _true: The _true of this IntegrationSubscription.
        :type _true: bool
        """

        self.__true = _true

    @property
    def statements(self) -> List[Statement]:
        """Gets the statements of this IntegrationSubscription.


        :return: The statements of this IntegrationSubscription.
        :rtype: List[Statement]
        """
        return self._statements

    @statements.setter
    def statements(self, statements: List[Statement]):
        """Sets the statements of this IntegrationSubscription.


        :param statements: The statements of this IntegrationSubscription.
        :type statements: List[Statement]
        """

        self._statements = statements

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this IntegrationSubscription.

        An array of tags for this integration configuration.  # noqa: E501

        :return: The tags of this IntegrationSubscription.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this IntegrationSubscription.

        An array of tags for this integration configuration.  # noqa: E501

        :param tags: The tags of this IntegrationSubscription.
        :type tags: List[str]
        """

        self._tags = tags
