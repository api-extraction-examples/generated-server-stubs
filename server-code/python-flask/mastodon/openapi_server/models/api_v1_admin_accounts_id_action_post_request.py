from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ApiV1AdminAccountsIdActionPostRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, report_id=None, send_email_notification=None, text=None, type=None, warning_preset_id=None):  # noqa: E501
        """ApiV1AdminAccountsIdActionPostRequest - a model defined in OpenAPI

        :param report_id: The report_id of this ApiV1AdminAccountsIdActionPostRequest.  # noqa: E501
        :type report_id: str
        :param send_email_notification: The send_email_notification of this ApiV1AdminAccountsIdActionPostRequest.  # noqa: E501
        :type send_email_notification: bool
        :param text: The text of this ApiV1AdminAccountsIdActionPostRequest.  # noqa: E501
        :type text: str
        :param type: The type of this ApiV1AdminAccountsIdActionPostRequest.  # noqa: E501
        :type type: str
        :param warning_preset_id: The warning_preset_id of this ApiV1AdminAccountsIdActionPostRequest.  # noqa: E501
        :type warning_preset_id: str
        """
        self.openapi_types = {
            'report_id': str,
            'send_email_notification': bool,
            'text': str,
            'type': str,
            'warning_preset_id': str
        }

        self.attribute_map = {
            'report_id': 'report_id',
            'send_email_notification': 'send_email_notification',
            'text': 'text',
            'type': 'type',
            'warning_preset_id': 'warning_preset_id'
        }

        self._report_id = report_id
        self._send_email_notification = send_email_notification
        self._text = text
        self._type = type
        self._warning_preset_id = warning_preset_id

    @classmethod
    def from_dict(cls, dikt) -> 'ApiV1AdminAccountsIdActionPostRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _api_v1_admin_accounts__id__action_post_request of this ApiV1AdminAccountsIdActionPostRequest.  # noqa: E501
        :rtype: ApiV1AdminAccountsIdActionPostRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def report_id(self) -> str:
        """Gets the report_id of this ApiV1AdminAccountsIdActionPostRequest.

        ID of an associated report that caused this action to be taken  # noqa: E501

        :return: The report_id of this ApiV1AdminAccountsIdActionPostRequest.
        :rtype: str
        """
        return self._report_id

    @report_id.setter
    def report_id(self, report_id: str):
        """Sets the report_id of this ApiV1AdminAccountsIdActionPostRequest.

        ID of an associated report that caused this action to be taken  # noqa: E501

        :param report_id: The report_id of this ApiV1AdminAccountsIdActionPostRequest.
        :type report_id: str
        """

        self._report_id = report_id

    @property
    def send_email_notification(self) -> bool:
        """Gets the send_email_notification of this ApiV1AdminAccountsIdActionPostRequest.

        Whether an email should be sent to the user with the above information.  # noqa: E501

        :return: The send_email_notification of this ApiV1AdminAccountsIdActionPostRequest.
        :rtype: bool
        """
        return self._send_email_notification

    @send_email_notification.setter
    def send_email_notification(self, send_email_notification: bool):
        """Sets the send_email_notification of this ApiV1AdminAccountsIdActionPostRequest.

        Whether an email should be sent to the user with the above information.  # noqa: E501

        :param send_email_notification: The send_email_notification of this ApiV1AdminAccountsIdActionPostRequest.
        :type send_email_notification: bool
        """

        self._send_email_notification = send_email_notification

    @property
    def text(self) -> str:
        """Gets the text of this ApiV1AdminAccountsIdActionPostRequest.

        Additional text for clarification of why this action was taken  # noqa: E501

        :return: The text of this ApiV1AdminAccountsIdActionPostRequest.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this ApiV1AdminAccountsIdActionPostRequest.

        Additional text for clarification of why this action was taken  # noqa: E501

        :param text: The text of this ApiV1AdminAccountsIdActionPostRequest.
        :type text: str
        """

        self._text = text

    @property
    def type(self) -> str:
        """Gets the type of this ApiV1AdminAccountsIdActionPostRequest.

        Type of action to be taken. Enumerable oneOf: none disable silence suspend  # noqa: E501

        :return: The type of this ApiV1AdminAccountsIdActionPostRequest.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this ApiV1AdminAccountsIdActionPostRequest.

        Type of action to be taken. Enumerable oneOf: none disable silence suspend  # noqa: E501

        :param type: The type of this ApiV1AdminAccountsIdActionPostRequest.
        :type type: str
        """
        allowed_values = ["none", "disable", "silence", "suspend"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def warning_preset_id(self) -> str:
        """Gets the warning_preset_id of this ApiV1AdminAccountsIdActionPostRequest.

        ID of a preset warning  # noqa: E501

        :return: The warning_preset_id of this ApiV1AdminAccountsIdActionPostRequest.
        :rtype: str
        """
        return self._warning_preset_id

    @warning_preset_id.setter
    def warning_preset_id(self, warning_preset_id: str):
        """Sets the warning_preset_id of this ApiV1AdminAccountsIdActionPostRequest.

        ID of a preset warning  # noqa: E501

        :param warning_preset_id: The warning_preset_id of this ApiV1AdminAccountsIdActionPostRequest.
        :type warning_preset_id: str
        """

        self._warning_preset_id = warning_preset_id
