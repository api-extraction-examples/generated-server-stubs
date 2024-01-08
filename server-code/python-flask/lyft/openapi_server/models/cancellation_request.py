from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CancellationRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cancel_confirmation_token=None):  # noqa: E501
        """CancellationRequest - a model defined in OpenAPI

        :param cancel_confirmation_token: The cancel_confirmation_token of this CancellationRequest.  # noqa: E501
        :type cancel_confirmation_token: str
        """
        self.openapi_types = {
            'cancel_confirmation_token': str
        }

        self.attribute_map = {
            'cancel_confirmation_token': 'cancel_confirmation_token'
        }

        self._cancel_confirmation_token = cancel_confirmation_token

    @classmethod
    def from_dict(cls, dikt) -> 'CancellationRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CancellationRequest of this CancellationRequest.  # noqa: E501
        :rtype: CancellationRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cancel_confirmation_token(self) -> str:
        """Gets the cancel_confirmation_token of this CancellationRequest.

        Token affirming the user accepts the cancellation fee. Required if a cancellation fee is in effect.  # noqa: E501

        :return: The cancel_confirmation_token of this CancellationRequest.
        :rtype: str
        """
        return self._cancel_confirmation_token

    @cancel_confirmation_token.setter
    def cancel_confirmation_token(self, cancel_confirmation_token: str):
        """Sets the cancel_confirmation_token of this CancellationRequest.

        Token affirming the user accepts the cancellation fee. Required if a cancellation fee is in effect.  # noqa: E501

        :param cancel_confirmation_token: The cancel_confirmation_token of this CancellationRequest.
        :type cancel_confirmation_token: str
        """

        self._cancel_confirmation_token = cancel_confirmation_token