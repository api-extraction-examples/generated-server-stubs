from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.statement import Statement
from openapi_server import util

from openapi_server.models.statement import Statement  # noqa: E501

class PostWebhookRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, _true=None, secret=None, sign=None, statements=None, tags=None, url=None):  # noqa: E501
        """PostWebhookRequest - a model defined in OpenAPI

        :param name: The name of this PostWebhookRequest.  # noqa: E501
        :type name: str
        :param _true: The _true of this PostWebhookRequest.  # noqa: E501
        :type _true: bool
        :param secret: The secret of this PostWebhookRequest.  # noqa: E501
        :type secret: str
        :param sign: The sign of this PostWebhookRequest.  # noqa: E501
        :type sign: bool
        :param statements: The statements of this PostWebhookRequest.  # noqa: E501
        :type statements: List[Statement]
        :param tags: The tags of this PostWebhookRequest.  # noqa: E501
        :type tags: List[str]
        :param url: The url of this PostWebhookRequest.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'name': str,
            '_true': bool,
            'secret': str,
            'sign': bool,
            'statements': List[Statement],
            'tags': List[str],
            'url': str
        }

        self.attribute_map = {
            'name': 'name',
            '_true': 'true',
            'secret': 'secret',
            'sign': 'sign',
            'statements': 'statements',
            'tags': 'tags',
            'url': 'url'
        }

        self._name = name
        self.__true = _true
        self._secret = secret
        self._sign = sign
        self._statements = statements
        self._tags = tags
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'PostWebhookRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postWebhook_request of this PostWebhookRequest.  # noqa: E501
        :rtype: PostWebhookRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this PostWebhookRequest.

        The name of the webhook.  # noqa: E501

        :return: The name of this PostWebhookRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this PostWebhookRequest.

        The name of the webhook.  # noqa: E501

        :param name: The name of this PostWebhookRequest.
        :type name: str
        """

        self._name = name

    @property
    def _true(self) -> bool:
        """Gets the _true of this PostWebhookRequest.

        Whether this webhook is enabled or not.  # noqa: E501

        :return: The _true of this PostWebhookRequest.
        :rtype: bool
        """
        return self.__true

    @_true.setter
    def _true(self, _true: bool):
        """Sets the _true of this PostWebhookRequest.

        Whether this webhook is enabled or not.  # noqa: E501

        :param _true: The _true of this PostWebhookRequest.
        :type _true: bool
        """

        self.__true = _true

    @property
    def secret(self) -> str:
        """Gets the secret of this PostWebhookRequest.

        If sign is true, and the secret attribute is omitted, LaunchDarkly will automatically generate a secret for you.  # noqa: E501

        :return: The secret of this PostWebhookRequest.
        :rtype: str
        """
        return self._secret

    @secret.setter
    def secret(self, secret: str):
        """Sets the secret of this PostWebhookRequest.

        If sign is true, and the secret attribute is omitted, LaunchDarkly will automatically generate a secret for you.  # noqa: E501

        :param secret: The secret of this PostWebhookRequest.
        :type secret: str
        """

        self._secret = secret

    @property
    def sign(self) -> bool:
        """Gets the sign of this PostWebhookRequest.

        If sign is false, the webhook will not include a signature header, and the secret can be omitted.  # noqa: E501

        :return: The sign of this PostWebhookRequest.
        :rtype: bool
        """
        return self._sign

    @sign.setter
    def sign(self, sign: bool):
        """Sets the sign of this PostWebhookRequest.

        If sign is false, the webhook will not include a signature header, and the secret can be omitted.  # noqa: E501

        :param sign: The sign of this PostWebhookRequest.
        :type sign: bool
        """
        if sign is None:
            raise ValueError("Invalid value for `sign`, must not be `None`")  # noqa: E501

        self._sign = sign

    @property
    def statements(self) -> List[Statement]:
        """Gets the statements of this PostWebhookRequest.


        :return: The statements of this PostWebhookRequest.
        :rtype: List[Statement]
        """
        return self._statements

    @statements.setter
    def statements(self, statements: List[Statement]):
        """Sets the statements of this PostWebhookRequest.


        :param statements: The statements of this PostWebhookRequest.
        :type statements: List[Statement]
        """

        self._statements = statements

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this PostWebhookRequest.

        Tags for the webhook.  # noqa: E501

        :return: The tags of this PostWebhookRequest.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this PostWebhookRequest.

        Tags for the webhook.  # noqa: E501

        :param tags: The tags of this PostWebhookRequest.
        :type tags: List[str]
        """

        self._tags = tags

    @property
    def url(self) -> str:
        """Gets the url of this PostWebhookRequest.

        The URL of the remote webhook.  # noqa: E501

        :return: The url of this PostWebhookRequest.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this PostWebhookRequest.

        The URL of the remote webhook.  # noqa: E501

        :param url: The url of this PostWebhookRequest.
        :type url: str
        """
        if url is None:
            raise ValueError("Invalid value for `url`, must not be `None`")  # noqa: E501

        self._url = url