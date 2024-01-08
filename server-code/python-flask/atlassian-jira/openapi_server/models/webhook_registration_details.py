from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.webhook_details import WebhookDetails
from openapi_server import util

from openapi_server.models.webhook_details import WebhookDetails  # noqa: E501

class WebhookRegistrationDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, url=None, webhooks=None):  # noqa: E501
        """WebhookRegistrationDetails - a model defined in OpenAPI

        :param url: The url of this WebhookRegistrationDetails.  # noqa: E501
        :type url: str
        :param webhooks: The webhooks of this WebhookRegistrationDetails.  # noqa: E501
        :type webhooks: List[WebhookDetails]
        """
        self.openapi_types = {
            'url': str,
            'webhooks': List[WebhookDetails]
        }

        self.attribute_map = {
            'url': 'url',
            'webhooks': 'webhooks'
        }

        self._url = url
        self._webhooks = webhooks

    @classmethod
    def from_dict(cls, dikt) -> 'WebhookRegistrationDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WebhookRegistrationDetails of this WebhookRegistrationDetails.  # noqa: E501
        :rtype: WebhookRegistrationDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def url(self) -> str:
        """Gets the url of this WebhookRegistrationDetails.

        The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app. Only a single URL per app is allowed to be registered.  # noqa: E501

        :return: The url of this WebhookRegistrationDetails.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this WebhookRegistrationDetails.

        The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app. Only a single URL per app is allowed to be registered.  # noqa: E501

        :param url: The url of this WebhookRegistrationDetails.
        :type url: str
        """
        if url is None:
            raise ValueError("Invalid value for `url`, must not be `None`")  # noqa: E501

        self._url = url

    @property
    def webhooks(self) -> List[WebhookDetails]:
        """Gets the webhooks of this WebhookRegistrationDetails.

        A list of webhooks.  # noqa: E501

        :return: The webhooks of this WebhookRegistrationDetails.
        :rtype: List[WebhookDetails]
        """
        return self._webhooks

    @webhooks.setter
    def webhooks(self, webhooks: List[WebhookDetails]):
        """Sets the webhooks of this WebhookRegistrationDetails.

        A list of webhooks.  # noqa: E501

        :param webhooks: The webhooks of this WebhookRegistrationDetails.
        :type webhooks: List[WebhookDetails]
        """
        if webhooks is None:
            raise ValueError("Invalid value for `webhooks`, must not be `None`")  # noqa: E501

        self._webhooks = webhooks
