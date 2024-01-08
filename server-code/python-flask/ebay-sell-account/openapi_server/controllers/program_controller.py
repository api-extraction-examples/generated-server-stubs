import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.program import Program  # noqa: E501
from openapi_server.models.programs import Programs  # noqa: E501
from openapi_server import util


def get_opted_in_programs():  # noqa: E501
    """get_opted_in_programs

    This method gets a list of the seller programs that the seller has opted-in to. # noqa: E501


    :rtype: Union[Programs, Tuple[Programs, int], Tuple[Programs, int, Dict[str, str]]
    """
    return 'do some magic!'


def opt_in_to_program(program):  # noqa: E501
    """opt_in_to_program

    This method opts the seller in to an eBay seller program. Refer to the &lt;a href&#x3D;\&quot;/api-docs/sell/account/overview.html#opt-in\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Account API overview&lt;/a&gt; for information about available eBay seller programs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; It can take up to 24-hours for eBay to process your request to opt-in to a Seller Program. Use the &lt;a href&#x3D;\&quot;/api-docs/sell/account/resources/program/methods/getOptedInPrograms\&quot; target&#x3D;\&quot;_blank\&quot;&gt;getOptedInPrograms&lt;/a&gt; call to check the status of your request after the processing period has passed.&lt;/span&gt; # noqa: E501

    :param program: Program being opted-in to.
    :type program: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        program = Program.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def opt_out_of_program(program):  # noqa: E501
    """opt_out_of_program

    This method opts the seller out of a seller program to which you have previously opted-in to. Get a list of the seller programs you have opted-in to using the &lt;b&gt;getOptedInPrograms&lt;/b&gt; call. # noqa: E501

    :param program: Program being opted-out of.
    :type program: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        program = Program.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
