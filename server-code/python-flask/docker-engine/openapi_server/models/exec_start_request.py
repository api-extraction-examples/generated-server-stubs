from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ExecStartRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, detach=None, tty=None):  # noqa: E501
        """ExecStartRequest - a model defined in OpenAPI

        :param detach: The detach of this ExecStartRequest.  # noqa: E501
        :type detach: bool
        :param tty: The tty of this ExecStartRequest.  # noqa: E501
        :type tty: bool
        """
        self.openapi_types = {
            'detach': bool,
            'tty': bool
        }

        self.attribute_map = {
            'detach': 'Detach',
            'tty': 'Tty'
        }

        self._detach = detach
        self._tty = tty

    @classmethod
    def from_dict(cls, dikt) -> 'ExecStartRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ExecStart_request of this ExecStartRequest.  # noqa: E501
        :rtype: ExecStartRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def detach(self) -> bool:
        """Gets the detach of this ExecStartRequest.

        Detach from the command.  # noqa: E501

        :return: The detach of this ExecStartRequest.
        :rtype: bool
        """
        return self._detach

    @detach.setter
    def detach(self, detach: bool):
        """Sets the detach of this ExecStartRequest.

        Detach from the command.  # noqa: E501

        :param detach: The detach of this ExecStartRequest.
        :type detach: bool
        """

        self._detach = detach

    @property
    def tty(self) -> bool:
        """Gets the tty of this ExecStartRequest.

        Allocate a pseudo-TTY.  # noqa: E501

        :return: The tty of this ExecStartRequest.
        :rtype: bool
        """
        return self._tty

    @tty.setter
    def tty(self, tty: bool):
        """Sets the tty of this ExecStartRequest.

        Allocate a pseudo-TTY.  # noqa: E501

        :param tty: The tty of this ExecStartRequest.
        :type tty: bool
        """

        self._tty = tty