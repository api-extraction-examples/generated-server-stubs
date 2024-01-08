from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Feedback(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, email=None, message=None, name=None, subject=None):  # noqa: E501
        """Feedback - a model defined in OpenAPI

        :param email: The email of this Feedback.  # noqa: E501
        :type email: str
        :param message: The message of this Feedback.  # noqa: E501
        :type message: str
        :param name: The name of this Feedback.  # noqa: E501
        :type name: str
        :param subject: The subject of this Feedback.  # noqa: E501
        :type subject: str
        """
        self.openapi_types = {
            'email': str,
            'message': str,
            'name': str,
            'subject': str
        }

        self.attribute_map = {
            'email': 'email',
            'message': 'message',
            'name': 'name',
            'subject': 'subject'
        }

        self._email = email
        self._message = message
        self._name = name
        self._subject = subject

    @classmethod
    def from_dict(cls, dikt) -> 'Feedback':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The feedback of this Feedback.  # noqa: E501
        :rtype: Feedback
        """
        return util.deserialize_model(dikt, cls)

    @property
    def email(self) -> str:
        """Gets the email of this Feedback.


        :return: The email of this Feedback.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this Feedback.


        :param email: The email of this Feedback.
        :type email: str
        """
        if email is None:
            raise ValueError("Invalid value for `email`, must not be `None`")  # noqa: E501

        self._email = email

    @property
    def message(self) -> str:
        """Gets the message of this Feedback.


        :return: The message of this Feedback.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this Feedback.


        :param message: The message of this Feedback.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")  # noqa: E501

        self._message = message

    @property
    def name(self) -> str:
        """Gets the name of this Feedback.


        :return: The name of this Feedback.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Feedback.


        :param name: The name of this Feedback.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def subject(self) -> str:
        """Gets the subject of this Feedback.


        :return: The subject of this Feedback.
        :rtype: str
        """
        return self._subject

    @subject.setter
    def subject(self, subject: str):
        """Sets the subject of this Feedback.


        :param subject: The subject of this Feedback.
        :type subject: str
        """
        if subject is None:
            raise ValueError("Invalid value for `subject`, must not be `None`")  # noqa: E501

        self._subject = subject
