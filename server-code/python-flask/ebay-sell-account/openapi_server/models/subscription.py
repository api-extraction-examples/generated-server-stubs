from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.time_duration import TimeDuration
from openapi_server import util

from openapi_server.models.time_duration import TimeDuration  # noqa: E501

class Subscription(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, marketplace_id=None, subscription_id=None, subscription_level=None, subscription_type=None, term=None):  # noqa: E501
        """Subscription - a model defined in OpenAPI

        :param marketplace_id: The marketplace_id of this Subscription.  # noqa: E501
        :type marketplace_id: str
        :param subscription_id: The subscription_id of this Subscription.  # noqa: E501
        :type subscription_id: str
        :param subscription_level: The subscription_level of this Subscription.  # noqa: E501
        :type subscription_level: str
        :param subscription_type: The subscription_type of this Subscription.  # noqa: E501
        :type subscription_type: str
        :param term: The term of this Subscription.  # noqa: E501
        :type term: TimeDuration
        """
        self.openapi_types = {
            'marketplace_id': str,
            'subscription_id': str,
            'subscription_level': str,
            'subscription_type': str,
            'term': TimeDuration
        }

        self.attribute_map = {
            'marketplace_id': 'marketplaceId',
            'subscription_id': 'subscriptionId',
            'subscription_level': 'subscriptionLevel',
            'subscription_type': 'subscriptionType',
            'term': 'term'
        }

        self._marketplace_id = marketplace_id
        self._subscription_id = subscription_id
        self._subscription_level = subscription_level
        self._subscription_type = subscription_type
        self._term = term

    @classmethod
    def from_dict(cls, dikt) -> 'Subscription':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Subscription of this Subscription.  # noqa: E501
        :rtype: Subscription
        """
        return util.deserialize_model(dikt, cls)

    @property
    def marketplace_id(self) -> str:
        """Gets the marketplace_id of this Subscription.

        The marketplace with which the subscription is associated. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>  # noqa: E501

        :return: The marketplace_id of this Subscription.
        :rtype: str
        """
        return self._marketplace_id

    @marketplace_id.setter
    def marketplace_id(self, marketplace_id: str):
        """Sets the marketplace_id of this Subscription.

        The marketplace with which the subscription is associated. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>  # noqa: E501

        :param marketplace_id: The marketplace_id of this Subscription.
        :type marketplace_id: str
        """

        self._marketplace_id = marketplace_id

    @property
    def subscription_id(self) -> str:
        """Gets the subscription_id of this Subscription.

        The subscription ID.  # noqa: E501

        :return: The subscription_id of this Subscription.
        :rtype: str
        """
        return self._subscription_id

    @subscription_id.setter
    def subscription_id(self, subscription_id: str):
        """Sets the subscription_id of this Subscription.

        The subscription ID.  # noqa: E501

        :param subscription_id: The subscription_id of this Subscription.
        :type subscription_id: str
        """

        self._subscription_id = subscription_id

    @property
    def subscription_level(self) -> str:
        """Gets the subscription_level of this Subscription.

        The subscription level. For example, subscription levels for an eBay store include Starter, Basic, Featured, Anchor, and Enterprise levels.  # noqa: E501

        :return: The subscription_level of this Subscription.
        :rtype: str
        """
        return self._subscription_level

    @subscription_level.setter
    def subscription_level(self, subscription_level: str):
        """Sets the subscription_level of this Subscription.

        The subscription level. For example, subscription levels for an eBay store include Starter, Basic, Featured, Anchor, and Enterprise levels.  # noqa: E501

        :param subscription_level: The subscription_level of this Subscription.
        :type subscription_level: str
        """

        self._subscription_level = subscription_level

    @property
    def subscription_type(self) -> str:
        """Gets the subscription_type of this Subscription.

        The kind of entity with which the subscription is associated, such as an eBay store. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:SubscriptionTypeEnum'>eBay API documentation</a>  # noqa: E501

        :return: The subscription_type of this Subscription.
        :rtype: str
        """
        return self._subscription_type

    @subscription_type.setter
    def subscription_type(self, subscription_type: str):
        """Sets the subscription_type of this Subscription.

        The kind of entity with which the subscription is associated, such as an eBay store. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:SubscriptionTypeEnum'>eBay API documentation</a>  # noqa: E501

        :param subscription_type: The subscription_type of this Subscription.
        :type subscription_type: str
        """

        self._subscription_type = subscription_type

    @property
    def term(self) -> TimeDuration:
        """Gets the term of this Subscription.


        :return: The term of this Subscription.
        :rtype: TimeDuration
        """
        return self._term

    @term.setter
    def term(self, term: TimeDuration):
        """Sets the term of this Subscription.


        :param term: The term of this Subscription.
        :type term: TimeDuration
        """

        self._term = term
