import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def metadata_get():  # noqa: E501
    """This endpoint returns metadata for the most recent data loads of SAM and FPDS data

    &lt;p&gt;This endpoint returns metadata for the most recent data loads of SAM and FPDS data. It takes no parameters.&lt;/p&gt; # noqa: E501


    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'
